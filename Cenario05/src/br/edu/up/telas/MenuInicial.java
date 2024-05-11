package br.edu.up.telas;

import br.edu.up.controles.*;
import br.edu.up.util.Prompt;
import java.util.Scanner;

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
                case 1: {
                    MenuEventos();
                    break;
                }
                case 2: {
                    MenuReservas();
                    break;
                }
                case 3: {
                    System.out.println("Sessão encerrada.");
                    break;
                }
                default: {
                    System.out.println("Opção inválida");
                    break;
                }
            }
        } while (op != 9);

    }

    public void MenuReservas() {
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
            System.out.println("9. Encerrar sessão");

            op = Prompt.lerInteiro("Selecione uma opção: ");

            switch (op) {
                case 1: {
                    ControleReserva.IncluirReserva();
                    break;
                }
                case 2: {
                    ControleReserva.AlterarReserva();
                    break;
                }
                case 3: {
                    ControleReserva.ListarReserva();
                    break;
                }
                case 4: {
                    ControleReserva.ExcluirReserva();
                    break;
                }
                case 5: {
                    mostrarMenu();
                    break;
                }
                case 9: {
                    System.out.println("Sessão encerrada.");
                    break;
                }
                default: {
                    System.out.println("Opção inválida");
                    break;
                }
            }
        } while (op != 9);
    }

    public void MenuEventos() {
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
            System.out.println("9. Encerrar sessão");

            op = Prompt.lerInteiro("Selecione uma opção: ");

            switch (op) {
                case 1: {
                    ControleEvento.CriarEvento();
                    break;
                }
                case 2: {
                    ControleEvento.AlterarEvento();
                    break;
                }
                case 3: {
                    ControleEvento.ListarEventos();
                    break;
                }
                case 4: {
                    ControleEvento.ExcluirEvento();
                    break;
                }
                case 5: {
                    mostrarMenu();
                    break;
                }
                case 9: {
                    System.out.println("Sessão encerrada.");
                    break;
                }
                default: {
                    System.out.println("Opção inválida");
                    break;
                }
            }
        } while (op != 9);

    }
}