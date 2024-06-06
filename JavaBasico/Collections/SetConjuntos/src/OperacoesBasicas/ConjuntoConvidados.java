package OperacoesBasicas;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codConvite){
        convidadosSet.add(new Convidado(nome, codConvite));
    }

    public void removerConvidadoPorCodConvite(int codConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadosSet){
            if(c.getCodConvite() == codConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadosSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadosSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadosSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Conjunto de Convidados");

        conjuntoConvidados.adicionarConvidado("Matheus", 1234);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Conjunto de Convidados");

        conjuntoConvidados.adicionarConvidado("Maria", 1235);
        conjuntoConvidados.adicionarConvidado("Joana", 1235);
        conjuntoConvidados.adicionarConvidado("Marta", 1236);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Conjunto de Convidados");
        conjuntoConvidados.exibirConvidados();


    }
}
