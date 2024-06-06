package com.pilaresPOO.sistema.banco;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void exibirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.exibirExtrato();
        System.out.println("==============================");
    }
}
