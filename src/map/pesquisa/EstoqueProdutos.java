package map.pesquisa;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long,Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome,double preco, int quantidade) {
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0.0;
        if (!estoqueProdutosMap.isEmpty()){
            for (Produto produto : estoqueProdutosMap.values()){
                valorTotalEstoque += produto.getPreco() * produto.getQuantidade() ;
            }
        }
        return valorTotalEstoque;
    }
    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        for (Produto produto : estoqueProdutosMap.values()) {
            if (produto.getPreco() > maiorPreco) {
                produtoMaisCaro = produto;
                maiorPreco = produto.getPreco();
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        // Exibe o estoque vazio
        estoque.exibirProdutos();

        // Adiciona produtos ao estoque
        estoque.adicionarProduto(1L, "Notebook", 1500.0, 1);
        estoque.adicionarProduto(2L, "Mouse", 25.0, 5);
        estoque.adicionarProduto(3L, "Monitor", 400.0, 10);
        estoque.adicionarProduto(4L, "Teclado", 40.0, 2);

        // Exibe os produtos no estoque
        estoque.exibirProdutos();

        // Calcula e exibe o valor total do estoque
        System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());

        // Obtém e exibe o produto mais caro
        Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
        System.out.println("Produto mais caro: " + produtoMaisCaro);

//        // Obtém e exibe o produto mais barato
//        Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
//        System.out.println("Produto mais barato: " + produtoMaisBarato);
//
//        // Obtém e exibe o produto com a maior quantidade em valor no estoque
//        Produto produtoMaiorQuantidadeValorTotal = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
//        System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValorTotal);



}}
