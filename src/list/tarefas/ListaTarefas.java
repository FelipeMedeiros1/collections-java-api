package list.tarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private List<Tarefa> listaDetarefas;

    public ListaTarefas() {
        this.listaDetarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        listaDetarefas.add(new Tarefa(descricao));

    }
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        if (!listaDetarefas.isEmpty()){
        for (Tarefa tarefa:listaDetarefas) {
            if (tarefa.obterDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(tarefa);
            }
        }
            listaDetarefas.removeAll(tarefasParaRemover);
    }else {
            System.out.println("A lista está vazia");
        }
    }

    public int obterTotalDeTarefas(){
        return listaDetarefas.size();
    }

    public void obterDescricoes(){
        System.out.println(listaDetarefas);
    }

}
