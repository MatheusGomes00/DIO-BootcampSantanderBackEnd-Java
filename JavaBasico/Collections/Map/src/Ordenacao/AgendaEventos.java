package Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }
    public void adicionarEvento(LocalDate data, String nome, String atracao){
        // Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){  // TreeMap<> ordena as datas em ordem crescente
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " + proximoEvento + " acontecerá na data " + proximaData);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.exibirAgenda();

        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.MAY, 29), "Evento A", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JUNE, 4), "Evento D", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.MAY, 31), "Evento C", "Atração 3");
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.MAY, 30), "Evento B", "Atração 2");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();

    }
}
