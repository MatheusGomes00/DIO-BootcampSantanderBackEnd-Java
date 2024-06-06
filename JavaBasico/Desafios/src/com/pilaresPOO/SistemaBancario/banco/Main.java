package com.pilaresPOO.SistemaBancario.banco;

public class Main {
    public static void main(String[] args) {
        Banco banco1 = new Banco();
        Cliente cliente1 = new Cliente("Matheus", "123456");

        Conta conta1 = ContaPoupanca.criarConta(cliente1);
        Conta conta2 = ContaCorrente.criarConta(cliente1);

        System.out.println(conta1.toString());

        System.out.println(conta2.toString());


        conta1.depositar(100);
        conta1.exibirExtrato();

        banco1.showContas();

        conta1.transferir(50, conta2);

        conta1.exibirExtrato();

        conta2.exibirExtrato();

        conta2.sacar(25);
        conta2.exibirExtrato();

    }
}
