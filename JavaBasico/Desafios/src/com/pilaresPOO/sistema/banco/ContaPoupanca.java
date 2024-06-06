package com.pilaresPOO.sistema.banco;

public class ContaPoupanca extends Conta{
    // private static String limiteSaqueDiario
    // private static String limiteTransferencia

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public static Conta criarConta(Cliente cliente){
        Conta nova_conta = new ContaPoupanca(cliente);
        Banco.addConta(nova_conta);
        return nova_conta;
    }

    @Override
    public void exibirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirMovimentacoes();
        System.out.println("==============================\n");
    }
}
