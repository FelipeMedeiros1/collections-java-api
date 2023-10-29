package set.pesquisa;

public class Teste {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContatos("João", "123456789");
        agendaContatos.adicionarContatos("Maria", "987654321");
        agendaContatos.adicionarContatos("Maria Fernandes", "55555555");
        agendaContatos.adicionarContatos("Ana", "88889999");
        agendaContatos.adicionarContatos("Fernando", "77778888");
        agendaContatos.adicionarContatos("Carolina", "55555555");


        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Maria"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarContato("Carolina", "44443333"));

        System.out.println("Contatos na agenda após atualização: ");
        agendaContatos.exibirContatos();
    }
}
