package com.pilaresPOO.SistemaBancario.banco;

public class ContaCorrente extends Conta{
    // private static String limiteSaqueDiario
    // private static String limiteTransferencia


    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public static Conta criarConta(Cliente cliente){
        Conta nova_conta = new ContaCorrente(cliente);
        Banco.addConta(nova_conta);
        return nova_conta;
    }

    @Override
    public void exibirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirMovimentacoes();
        System.out.println("==============================\n");
    }
}
