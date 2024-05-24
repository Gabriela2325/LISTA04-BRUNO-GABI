package br.edu.up.controles;

import br.edu.up.modelos.Evento;
import br.edu.up.modelos.Reserva;
import br.edu.up.util.Prompt;

public class ControleReserva {

    private static Reserva[] reservas = new Reserva[5];
    private static int reservaCount = 0;

    public static void incluirReserva() {
        if (reservaCount < reservas.length) {
            ControleEvento.listarEventos();
            int eventoId = Prompt.lerInteiro("Selecione o evento para a reserva (ID): ");
            Evento evento = ControleEvento.getEvento(eventoId);
            if (evento != null) {
                if (evento.getIngressosDisponiveis() > 0) {
                    Reserva reserva = new Reserva();
                    reserva.setNomeResponsavel(Prompt.lerLinha("Digite o nome do responsável pela reserva: "));
                    int qtdPessoas = Prompt.lerInteiro("Quantidade de pessoas: ");
                    if (qtdPessoas <= evento.getIngressosDisponiveis()) {
                        reserva.setQuantidadePessoas(qtdPessoas);
                        reserva.setData(evento.getData());
                        reserva.setValorTotal(qtdPessoas * evento.getPrecoIngresso());
                        reservas[reservaCount] = reserva;
                        reservaCount++;
                        evento.setIngressosVendidos(evento.getIngressosVendidos() + qtdPessoas);
                        Prompt.imprimir("Reserva incluída com sucesso!");
                    } else {
                        Prompt.imprimir("Quantidade de ingressos indisponível.");
                    }
                } else {
                    Prompt.imprimir("Ingressos esgotados.");
                }
            } else {
                Prompt.imprimir("Evento não encontrado.");
            }
        } else {
            Prompt.imprimir("Limite de reservas atingido!");
        }
    }

    public static void alterarReserva() {
        listarReservas();
        int id = Prompt.lerInteiro("Digite o número da reserva a ser alterada: ");
        if (id > 0 && id <= reservaCount) {
            Reserva reserva = reservas[id - 1];
            ControleEvento.listarEventos();
            int eventoId = Prompt.lerInteiro("Selecione o novo evento para a reserva (ID): ");
            Evento evento = ControleEvento.getEvento(eventoId);
            if (evento != null) {
                int novaQtdPessoas = Prompt.lerInteiro("Nova quantidade de pessoas: ");
                if (novaQtdPessoas <= evento.getIngressosDisponiveis()) {
                    evento.setIngressosVendidos(evento.getIngressosVendidos() - reserva.getQuantidadePessoas());
                    reserva.setNomeResponsavel(Prompt.lerLinha("Digite o novo nome do responsável pela reserva: "));
                    reserva.setQuantidadePessoas(novaQtdPessoas);
                    reserva.setData(evento.getData());
                    reserva.setValorTotal(novaQtdPessoas * evento.getPrecoIngresso());
                    evento.setIngressosVendidos(evento.getIngressosVendidos() + novaQtdPessoas);
                    Prompt.imprimir("Reserva alterada com sucesso!");
                } else {
                    Prompt.imprimir("Quantidade de ingressos indisponível.");
                }
            } else {
                Prompt.imprimir("Evento não encontrado.");
            }
        } else {
            Prompt.imprimir("Reserva não encontrada!");
        }
    }

    public static void listarReservas() {
        Prompt.separador();
        for (int i = 0; i < reservaCount; i++) {
            Prompt.imprimir((i + 1) + ". " + reservas[i].toString());
        }
        Prompt.separador();
    }

    public static void excluirReserva() {
        listarReservas();
        int id = Prompt.lerInteiro("Digite o número da reserva a ser excluída: ");
        if (id > 0 && id <= reservaCount) {
            Evento evento = ControleEvento.getEventoPorReserva(reservas[id - 1]);
            evento.setIngressosVendidos(evento.getIngressosVendidos() - reservas[id - 1].getQuantidadePessoas());
            for (int i = id - 1; i < reservaCount - 1; i++) {
                reservas[i] = reservas[i + 1];
            }
            reservas[reservaCount - 1] = null;
            reservaCount--;
            Prompt.imprimir("Reserva excluída com sucesso!");
        } else {
            Prompt.imprimir("Reserva não encontrada!");
        }
    }
}
