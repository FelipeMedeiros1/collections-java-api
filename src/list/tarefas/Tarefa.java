package list.tarefas;

public class Tarefa {

    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String obterDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
