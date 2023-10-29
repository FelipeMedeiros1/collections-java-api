package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }
     public void adicionarContatos(String nome, String numero){
        contatoSet.add(new Contato(nome,numero));
     }

     public void exibirContatos(){
         System.out.println("Exibindo todos os contattos: " + contatoSet);
     }

     public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato>contatosPorNome = new HashSet<>();
        for (Contato contato: contatoSet){
            if (contato.getNome().startsWith(nome)){
                contatosPorNome.add(contato);
            }
        }
        return contatosPorNome;
     }

     public Contato atualizarContato(String nome, String novoNumero){
        Contato contatoAtualizado = null;
        for (Contato contato: contatoSet){
            if (contato.getNome().equalsIgnoreCase(nome)){
                contato.setNumero(novoNumero) ;
                contatoAtualizado = contato;
                break;
            }
        }
        return contatoAtualizado;
     }



}
