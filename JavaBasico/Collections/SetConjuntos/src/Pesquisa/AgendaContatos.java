package Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatosSet;

    public AgendaContatos() {
        this.contatosSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatosSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        if(!contatosSet.isEmpty()){
            System.out.println(contatosSet);
        }else{
            System.out.println("O conjunto está vazio!");
        }
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        if(!contatosSet.isEmpty()){
            for(Contato c : contatosSet){
                if(c.getNome().startsWith(nome)){
                    contatosPorNome.add(c);
                }
            }
            return contatosPorNome;
        }else{
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c : contatosSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Matheus", 1111122222);
        agendaContatos.adicionarContato("Matheus", 1336665558);
        agendaContatos.adicionarContato("Pedro Antunes", 777888666);
        agendaContatos.adicionarContato("Matheus Gomes", 1111122222);
        agendaContatos.adicionarContato("Pedro Seabra", 1111122222);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Matheus"));

        agendaContatos.atualizarNumeroContato("Pedro Seabra", 333333355);
        agendaContatos.exibirContatos();
    }
}
