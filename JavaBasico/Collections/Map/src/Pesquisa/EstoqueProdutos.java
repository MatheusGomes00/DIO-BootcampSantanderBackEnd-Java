package Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProdutos(long cod, String nome, double preco, int quantidade){
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if(p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.exibirProdutos();

        estoque.adicionarProdutos(1l, "Produto X", 5.5, 20);
        estoque.adicionarProdutos(2l, "Produto Y", 7.5, 10);
        estoque.adicionarProdutos(3l, "Produto Z", 11.5, 8);
        estoque.adicionarProdutos(4l, "Produto A", 15.5, 3);

        estoque.exibirProdutos();

        System.out.println("Valor total do estoque: R$ " + estoque.calcularValorTotalEstoque());

        System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());

    }
}
