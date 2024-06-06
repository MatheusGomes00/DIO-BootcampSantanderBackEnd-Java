package com.pilaresPOO.sistema.banco;

public class Conta implements IConta{
    // definição das constante para o número da agencia e
    // sequencial contador para número da conta
    // acesso restrito a classe, não recebe interação ou alteração
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    // definição dos atributos da classe compartilhado
    // com as filhas, os valores são dinâmicos
    protected int agencia, numero;
    protected  double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;  // inclementa no número de toda nova conta criada
        this.cliente = cliente;
    }

    // valor fixo, não altera, não precisa de setter
    public int getAgencia() {return agencia;}
    // valor predefinido com implementação fixa, não recebe alteração, não precisa de setter
    public int getNumero() {return numero;}
    // o saldo não pode ser modificado sem ser pela própria inst
    public double getSaldo() {return saldo;}

    @Override
    public void exibirExtrato() {
        System.out.printf("Titular: %s\nAgencia: %d\nNumero: %d\nSaldo: %.2f%n",
                this.cliente.getNome(),
                this.agencia,
                this.numero,
                this.saldo);
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
}
