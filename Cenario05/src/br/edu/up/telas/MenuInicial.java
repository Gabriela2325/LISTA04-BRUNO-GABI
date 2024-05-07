package br.edu.up.telas;

import br.edu.up.controles.Control;
import java.util.Scanner;

public class MenuInicial {

    private Scanner scan = new Scanner(System.in);

   
        System.out.println("-----------------");
        System.out.println("  MENU INICIAL");
        System.out.println("-----------------");
        System.out.println();
        System.out.println("Digite o número da opção:");
        System.out.println();

        System.out.println("1. Incluir reserva");
        System.out.println("2. Alterar reserva");
        System.out.println("3. Listar reserva");
        System.out.println("4. Excluir reserva");

    int op = scan.nextInt();

    switch(op){
            case 1:
                System.out.println("Incluir reserva");
                Control.IncluirReserva();
                break;

            case 2:
                System.out.println("Alterar reserva");
                break;

            case 3:
                System.out.println("Listar reserva");
                break;

            case 4:
                System.out.println("Excluir reserva");
                break;


            case 5:
            default:
            System.out.println("Opção inválida");    
            break;
    }
}