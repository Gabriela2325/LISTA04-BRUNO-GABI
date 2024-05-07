//Programa.java

package br.edu.up;

import br.edu.up.controle.*;
import br.edu.up.view.*;
import br.edu.up.util.Prompt;

public class Programa {
    public static void main(String[] args) {

        ControlePassageiros controlePassageiros = new ControlePassageiros();

        ViewPassageiros viewPassageiros = new ViewPassageiros(controlePassageiros);

        exibirMenuPrincipal(viewPassageiros);

        Prompt.linhaEmBranco();

        Prompt.imprimir("Encerrando o programa...");

    }

    private static void exibirMenuPrincipal(ViewPassageiros viewPassageiros) {
        int opcao;

        do {

            Prompt.separador();

            Prompt.imprimir("Menu Principal:");
            Prompt.imprimir("1. Gerenciar Passageiros");
            Prompt.imprimir("2. Sair");

            opcao = Prompt.lerInteiro("Escolha uma opção:");

            switch (opcao) {
                case 1:

                    viewPassageiros.exibirMenu();

                    break;

                case 2:

                    Prompt.linhaEmBranco();

                    Prompt.imprimir("Encerrando o programa...");

                    break;
                default:

                    Prompt.imprimir("Opção inválida. Tente novamente.");

            }
        } while (opcao != 2);
    }
}