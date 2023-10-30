package map.ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {

    private Map<LocalDate,Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        eventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        LocalDate dataAtual = LocalDate.now();
        for (Map.Entry<LocalDate, Evento> evento : eventosTreeMap.entrySet()) {
            if (evento.getKey().equals(dataAtual)|| evento.getKey().isAfter(dataAtual)){
                System.out.println("Próximo Evento: " +evento.getKey() + " - Data: " + evento.getValue());
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.OCTOBER,31),"Evento-1","Atração-1");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 10,30),"Evento-2","Atração-2");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.JULY,14),"Evento-3","Atração-3");
        agendaEventos.adicionarEvento(LocalDate.now(),"Hoje","Agora");

        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();


    }

}
