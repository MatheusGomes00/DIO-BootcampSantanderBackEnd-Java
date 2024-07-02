package one.dio.gof.service;

import java.util.Optional;

import one.dio.gof.model.Cliente;
import one.dio.gof.model.ClienteRepository;
import one.dio.gof.model.Endereco;
import one.dio.gof.model.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

/**
 * Implementação da <b>Strategy</b> {@link ClienteService}, a qual pode ser
 * injetada pelo Spring (via {@link Autowired}). Com isso, como essa classe é um
 * {@link Service}, ela será tratada como um <b>Singleton</b>.
 *
 */
@Service
public class ClienteServiceImpl implements ClienteService {

    // Singleton: Injetar os componentes do Spring com @Autowired.
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private ViaCepService viaCepService;

    // Strategy: Implementar os métodos definidos na interface.
    // Facade: Abstrair integrações com subsistemas, provendo uma interface simples.

    @Override
    public Iterable<Cliente> buscarTodos() {
        // Buscar todos os Clientes.
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        // Buscar Cliente por ID.
        Optional<Cliente> cliente = clienteRepository.findById(id);
        if(cliente.isPresent()){
            return cliente.get();
        }else{
            throw new EntityNotFoundException("Cliente não localizado com o ID: " + id);
        }
    }

    @Override
    public void inserir(Cliente cliente) {
        // a ideia é que o cliente passe apenas o nome, email, cep e numero da casa para o front
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = verificarCep(cep);
        String numero = cliente.getEndereco().getNumero();
        endereco.setNumero(numero);
        enderecoRepository.save(endereco);
        cliente.setEndereco(endereco);
        clienteRepository.save(cliente);
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
        // Buscar Cliente por ID, caso exista:
        Optional<Cliente> clienteBd = clienteRepository.findById(id);
        if (clienteBd.isPresent()) {
            clienteRepository.save(cliente);
        }
    }

    @Override
    public void deletar(Long id) {
        // Deletar Cliente por ID.
        clienteRepository.deleteById(id);
    }

    private Endereco verificarCep(String cep){
        return enderecoRepository.findById(cep).orElseGet(() -> {
            // Caso não exista, integrar com o ViaCEP e persistir o retorno.
            Endereco novoEndereco = viaCepService.consultarCep(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        });
    }

//    private void salvarClienteComCep(Cliente cliente) {
//        // Verificar se o Endereco do Cliente já existe (pelo CEP).
//        String cep = cliente.getEndereco().getCep();
//        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
//            // Caso não exista, integrar com o ViaCEP e persistir o retorno.
//            Endereco novoEndereco = viaCepService.consultarCep(cep);
//            enderecoRepository.save(novoEndereco);
//            return novoEndereco;
//        });
//        cliente.setEndereco(endereco);
//        // Inserir Cliente, vinculando o Endereco (novo ou existente).
//        clienteRepository.save(cliente);
//    }
}