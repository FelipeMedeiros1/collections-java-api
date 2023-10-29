package set.ordenacao;

public class Teste {
    public static void main(String[] args) {

        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarUmProduto(1L, "Smartphone", 1000d, 10);
        cadastroProdutos.adicionarUmProduto(2L, "Notebook", 1500d, 5);
        cadastroProdutos.adicionarUmProduto(1L, "Mouse", 30d, 20);
        cadastroProdutos.adicionarUmProduto(4L, "Teclado", 50d, 15);

        // Exibindo todos os produtos no cadastro
        System.out.println(cadastroProdutos.exibirTodosOsProdutos());

//        // Exibindo produtos ordenados por nome
//        System.out.println(cadastroProdutos.exibirProdutosPorNome());
//
//        // Exibindo produtos ordenados por preço
//        System.out.println(cadastroProdutos.exibirPorPreco());

    }
}
