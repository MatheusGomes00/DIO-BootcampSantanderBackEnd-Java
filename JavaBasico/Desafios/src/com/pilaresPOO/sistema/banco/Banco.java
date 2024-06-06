package com.pilaresPOO.sistema.banco;

import java.util.ArrayList;
import java.util.List;

class Banco {
    public static List<Conta> contas;
    public static final String NOME_BANCO = "WordshinigaMBank";

    public Banco() {
        contas = new ArrayList<Conta>();
    }

    public static void addConta(Conta conta){
        contas.add(conta);
    }

    public void showContas(){
        for(Conta conta : contas){
            System.out.println(conta);
        }
    }
}
