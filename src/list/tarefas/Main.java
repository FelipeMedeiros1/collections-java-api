package list.tarefas;

public class Main {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        System.out.println("O total de elemento na lista é :"+listaTarefas.obterTotalDeTarefas());

        listaTarefas.adicionarTarefa("Começar trabalhar 7:30");
        listaTarefas.adicionarTarefa("Almoçar 12:30");
        listaTarefas.adicionarTarefa("Terminar de trabalhar 17:00");

        System.out.println("O total de elemento na lista é :"+listaTarefas.obterTotalDeTarefas());

        listaTarefas.removerTarefa("Almoçar 12:30");
        System.out.println("O total de elemento na lista é :"+listaTarefas.obterTotalDeTarefas());

        listaTarefas.obterDescricoes();
    }
}