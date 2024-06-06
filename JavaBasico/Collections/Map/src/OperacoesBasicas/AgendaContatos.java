package OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);  // adiciona ou atualiza existente
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibiContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.exibiContatos();

        agendaContatos.adicionarContato("Matheus", 123456);
        agendaContatos.adicionarContato("Gomes", 123456);
        agendaContatos.adicionarContato("Laila", 789456);
        agendaContatos.adicionarContato("Pedro", 123456);
        agendaContatos.adicionarContato("Matheus", 5555666);

        agendaContatos.exibiContatos();

        agendaContatos.removerContato("Pedro");
        agendaContatos.exibiContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Matheus"));
    }
}
