package com.pilaresPOO.SistemaBancario.banco;

import static com.pilaresPOO.SistemaBancario.banco.Banco.NOME_BANCO;

public class Conta implements IConta{
    // definição da constante para o número da agencia e o
    // sequencial contador para número da conta
    // acesso restrito a classe, não recebe  alteração
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;


    // definição dos atributos da classe compartilhado
    // com as filhas, os valores são dinâmicos
    protected int agencia, numero;
    protected  double saldo;
    protected Cliente cliente;
    protected String nomeBanco;

    public Conta(Cliente cliente) {
        this.nomeBanco = NOME_BANCO;
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;  // inclementa no número de toda nova conta criada
        this.cliente = cliente;
    }



    // valor fixo, não altera, não precisa de setter
    public int getAgencia() {return this.agencia;}
    // valor predefinido com implementação fixa, não recebe alteração, não precisa de setter
    public int getNumero() {return this.numero;}
    // o saldo não pode ser modificado sem ser pela própria inst
    public double getSaldo() {return this.saldo;}

    @Override
    public String toString() {
        return cliente +
                ", numeroConta=" + numero +
                ", agencia=" + agencia +
                ", saldo=" + saldo +
                ", nomeBanco='" + nomeBanco + '\'' +
                '}';
    }

    // implementar histórico de transações realizadas
    @Override
    public void exibirExtrato() {}

    protected void imprimirMovimentacoes(){
        System.out.println("===      Movimentações     ===");
        System.out.printf("""
                          \s
                           Titular: %s
                           Agencia %S       Conta: %s


                           Saldo: R$%.2f%n\
                       \s""",
                this.cliente.getNome(), this.agencia, this.numero, this.getSaldo());
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
