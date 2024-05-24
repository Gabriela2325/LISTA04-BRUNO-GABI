package br.edu.up.telas;

import br.edu.up.controles.ControleEvento;
import br.edu.up.controles.ControleReserva;
import br.edu.up.util.Prompt;

public class MenuInicial {

    public void mostrarMenu() {
        int op;
        do {
            System.out.println("-----------------");
            System.out.println("  MENU INICIAL");
            System.out.println("-----------------");
            System.out.println();

            System.out.println("1. Menu de eventos");
            System.out.println("2. Menu de reservas");
            System.out.println("3. Encerrar");

            op = Prompt.lerInteiro("Selecione uma opção: ");

            switch (op) {
                case 1:
                    menuEventos();
                    break;
                case 2:
                    menuReservas();
                    break;
                case 3:
                    System.out.println("Sessão encerrada.");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (op != 3);
    }

    public void menuReservas() {
        int op;
        do {
            System.out.println("-----------------");
            System.out.println("  MENU RESERVAS");
            System.out.println("-----------------");
            System.out.println();

            System.out.println("1. Incluir reserva");
            System.out.println("2. Alterar reserva");
            System.out.println("3. Listar reserva");
            System.out.println("4. Excluir reserva");
            System.out.println("5. Voltar ao menu inicial");

            op = Prompt.lerInteiro("Selecione uma opção: ");

            switch (op) {
                case 1:
                    ControleReserva.incluirReserva();
                    break;
                case 2:
                    ControleReserva.alterarReserva();
                    break;
                case 3:
                    ControleReserva.listarReservas();
                    break;
                case 4:
                    ControleReserva.excluirReserva();
                    break;
                case 5:
                    mostrarMenu();
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (op != 5);
    }

    public void menuEventos() {
        int op;
        do {
            System.out.println("-----------------");
            System.out.println("  MENU EVENTOS   ");
            System.out.println("-----------------");
            System.out.println();

            System.out.println("1. Criar Evento");
            System.out.println("2. Alterar Evento");
            System.out.println("3. Listar Evento");
            System.out.println("4. Excluir Evento");
            System.out.println("5. Voltar ao menu inicial");

            op = Prompt.lerInteiro("Selecione uma opção: ");

            switch (op) {
                case 1:
                    ControleEvento.criarEvento();
                    break;
                case 2:
                    ControleEvento.alterarEvento();
                    break;
                case 3:
                    ControleEvento.listarEventos();
                    break;
                case 4:
                    ControleEvento.excluirEvento();
                    break;
                case 5:
                    mostrarMenu();
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (op != 5);
    }
}
