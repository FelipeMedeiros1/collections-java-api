package set.convite;

public class Teste {

    public static void main(String[] args) {

        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

        conjuntoConvidados.adiocionarConvidado("Alice", 1234);
        conjuntoConvidados.adiocionarConvidado("Bob", 1235);
        conjuntoConvidados.adiocionarConvidado("Charlie", 1235);
        conjuntoConvidados.adiocionarConvidado("David", 1236);

        System.out.println("Convidados no conjunto:");
        conjuntoConvidados.exibirConvidados();

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

        conjuntoConvidados.removerConvidadoPeloCodigo(1236);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados após a remoção");

        System.out.println("Convidados no conjunto após a remoção:");
        conjuntoConvidados.exibirConvidados();

    }
}
