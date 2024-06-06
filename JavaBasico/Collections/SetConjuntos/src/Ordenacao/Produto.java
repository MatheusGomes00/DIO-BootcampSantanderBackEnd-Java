package Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto>{
    private String nome;
    private long codigo;
    private double preco;
    private int quantidade;

    public Produto(String nome, long codigo, double preco, int quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override  // informa que a ordem natural de comparação/exibição é por nome
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    @Override  // não premite inserção/adição de produto com mesmo código
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Produto produto = (Produto) object;
        return getCodigo() == produto.getCodigo();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getCodigo());
    }

    @Override
    public String toString() {
        return "Produto{" + nome + '\'' + codigo + '\'' + preco + '\'' + quantidade + '}';
    }

    public String getNome() {
        return nome;
    }

    public long getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
class ComparatorPorPreco implements Comparator <Produto>{
    @Override  // comparar e listar por preço
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}