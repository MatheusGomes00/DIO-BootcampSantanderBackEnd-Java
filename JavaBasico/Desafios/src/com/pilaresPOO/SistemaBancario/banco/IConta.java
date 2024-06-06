package com.pilaresPOO.SistemaBancario.banco;

public interface IConta {
    void exibirExtrato();
    void depositar(double valor);
    void sacar(double valor);
    void transferir(double valor, Conta contaDestino);

}
