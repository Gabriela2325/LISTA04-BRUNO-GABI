package br.edu.up.controles;

import br.edu.up.modelos.Evento;
import br.edu.up.modelos.Reserva;
import br.edu.up.util.Prompt;

public class ControleEvento {

    private static Evento[] eventos = new Evento[5];
    private static int eventoCount = 0;

    public static void criarEvento() {
        if (eventoCount < eventos.length) {
            Evento evento = new Evento();
            evento.setNome(Prompt.lerLinha("Nome do Evento: "));
            evento.setData(Prompt.lerLinha("Data do Evento: "));
            evento.setLocal(Prompt.lerLinha("Local do Evento: "));
            evento.setPrecoIngresso(Prompt.lerDecimal("Preço do ingresso: "));
            evento.setLotacaoMaxima(Prompt.lerInteiro("Lotação máxima do Evento: "));
            evento.setIngressosVendidos(Prompt.lerInteiro("Ingressos vendidos: "));
            eventos[eventoCount] = evento;
            eventoCount++;
            Prompt.imprimir("Evento criado com sucesso!");
        } else {
            Prompt.imprimir("Limite de eventos atingido!");
        }
    }

    public static void alterarEvento() {
        listarEventos();
        int id = Prompt.lerInteiro("Digite o número do evento a ser alterado: ");
        if (id > 0 && id <= eventoCount) {
            Evento evento = eventos[id - 1];
            evento.setNome(Prompt.lerLinha("Nome do Evento: "));
            evento.setData(Prompt.lerLinha("Data do Evento: "));
            evento.setLocal(Prompt.lerLinha("Local do Evento: "));
            evento.setPrecoIngresso(Prompt.lerDecimal("Preço do ingresso: "));
            evento.setLotacaoMaxima(Prompt.lerInteiro("Lotação máxima do Evento: "));
            evento.setIngressosVendidos(Prompt.lerInteiro("Ingressos vendidos: "));
            Prompt.imprimir("Evento alterado com sucesso!");
        } else {
            Prompt.imprimir("Evento não encontrado!");
        }
    }

    public static void listarEventos() {
        Prompt.separador();
        for (int i = 0; i < eventoCount; i++) {
            Prompt.imprimir((i + 1) + ". " + eventos[i].toString());
        }
        Prompt.separador();
    }

    public static void excluirEvento() {
        listarEventos();
        int id = Prompt.lerInteiro("Digite o número do evento a ser excluído: ");
        if (id > 0 && id <= eventoCount) {
            for (int i = id - 1; i < eventoCount - 1; i++) {
                eventos[i] = eventos[i + 1];
            }
            eventos[eventoCount - 1] = null;
            eventoCount--;
            Prompt.imprimir("Evento excluído com sucesso!");
        } else {
            Prompt.imprimir("Evento não encontrado!");
        }
    }

    public static Evento getEvento(int id) {
        if (id > 0 && id <= eventoCount) {
            return eventos[id - 1];
        }
        return null;
    }

    public static Evento getEventoPorReserva(Reserva reserva) {
        for (Evento evento : eventos) {
            if (evento != null && evento.getData().equals(reserva.getData())) {
                return evento;
            }
        }
        return null;
    }
}

