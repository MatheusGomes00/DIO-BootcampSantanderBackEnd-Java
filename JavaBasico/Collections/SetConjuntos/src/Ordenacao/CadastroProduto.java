package Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
    private Set<Produto> produtoSet;

    public CadastroProduto() {
        this.produtoSet = new HashSet<>();
    }
    public void adicionarPriduto( String nome, long cod, double preco, int quantidade){
        produtoSet.add(new Produto(nome, cod, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();
        System.out.println(cadastroProduto.produtoSet);

        cadastroProduto.adicionarPriduto("Laranja", 10001, 5.8, 10);
        cadastroProduto.adicionarPriduto("Maçã", 10002, 9.6, 10);
        cadastroProduto.adicionarPriduto("Goiaba", 10003, 2.8, 10);
        cadastroProduto.adicionarPriduto("Banana", 10003, 10.8, 10);

        System.out.println(cadastroProduto.produtoSet);

        System.out.println(cadastroProduto.exibirProdutosPorNome());

        System.out.println(cadastroProduto.exibirPorPreco());

    }
}

