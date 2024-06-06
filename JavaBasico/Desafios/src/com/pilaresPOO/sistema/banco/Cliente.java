package com.pilaresPOO.sistema.banco;

import java.util.ArrayList;

public class Cliente {
    private String nome, cpf;
    private ArrayList<Integer> emails;

    public Cliente(String nome, String cpf, ArrayList<Integer> emails) {
        this.nome = nome;
        this.cpf = cpf;
        this.emails = emails;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ArrayList<Integer> getEmails() {
        return emails;
    }

    public void setEmails(ArrayList<Integer> emails) {
        this.emails = emails;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", emails=" + emails +
                '}';
    }
}
