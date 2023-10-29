package set.convite;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void adiocionarConvidado(String nome, int codigoConvite){
        convidadosSet.add(new Convidado(nome,codigoConvite));

    }
    public void removerConvidadoPeloCodigo(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado convidado: convidadosSet){
            if (convidado.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = convidado;
                break;
            }else {
                System.out.println("Código não existe na lista!");
            }
        }
        convidadosSet.remove(convidadoParaRemover);
    }
    public int contarConvidados(){
        return convidadosSet.size();

    }
    public void exibirConvidados() {
        if (!convidadosSet.isEmpty()) {
            System.out.println(convidadosSet);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }


}
