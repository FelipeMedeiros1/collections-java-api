package list.pesquisa.livros;

public class Teste {
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
        catalogoLivros.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
        catalogoLivros.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
        catalogoLivros.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);

        System.out.println("Exibindo livros pelo mesmo autor");
        System.out.println(catalogoLivros.pesquisarPorAutor("Robert C. Martin"));
        System.out.println("*---------------------------------------------------------------------------*");

        System.out.println("Exibindo livros pelo mesmo autor (caso em que não há livros de um autor específico");
        System.out.println(catalogoLivros.pesquisarPorAutor("Autor Inexistente"));
        System.out.println("*---------------------------------------------------------------------------*");

        System.out.println("Exibindo livros dentro de um intervalo de anos");
        System.out.println(catalogoLivros.pesquisarPorIntervaloDeAnos(2009, 2021));
        System.out.println("*---------------------------------------------------------------------------*");

        System.out.println("Exibindo livros dentro de um intervalo de anos (caso em que não há livros no intervalo");
        System.out.println(catalogoLivros.pesquisarPorIntervaloDeAnos(2025, 2030));

        System.out.println("Exibindo livros por título");
        System.out.println(catalogoLivros.pesquisarPorTitulo("Java Guia do Programador"));
        System.out.println("*---------------------------------------------------------------------------*");

        System.out.println("Exibindo livros por título (caso em que não há livros com o título especificado");
        System.out.println(catalogoLivros.pesquisarPorTitulo("Título Inexistente"));
        System.out.println("*---------------------------------------------------------------------------*");
    }
}
