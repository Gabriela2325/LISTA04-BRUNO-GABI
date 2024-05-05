// ViewPassageiros.java
package br.edu.up.view;

import br.edu.up.controle.*;
import br.edu.up.modelo.*;
import br.edu.up.util.Prompt;

public class ViewPassageiros {

    private ControlePassageiros controlePassageiros;

    public ViewPassageiros(ControlePassageiros controlePassageiros) {
        this.controlePassageiros = controlePassageiros;
    }

    public void exibirMenu() {
        int opcao;

        do {

        Prompt.separador();

        Prompt.imprimir("Menu de Passageiros:");

        Prompt.imprimir("1. Adicionar Passageiro");

        Prompt.imprimir("2. Listar Passageiros");

        Prompt.imprimir("3. Voltar ao Menu Principal");

        opcao = Prompt.lerInteiro("Escolha uma opção:");
        
        switch (opcao) {
            case 1:
                controlePassageiros.adicionarPassageiro();
                break;

            case 2:
                listarPassageiros();
                break;

            case 3:
                Prompt.linhaEmBranco();
                Prompt.imprimir("Voltando ao Menu Principal...");
                break;

            default:
                Prompt.imprimir("Opção inválida. Tente novamente.");

        }

        } while (opcao != 3);
    }

    private void listarPassageiros() {

        Prompt.separador();

        Prompt.imprimir("Lista de Passageiros:");

        for (int i = 0; i < controlePassageiros.getTamanhoAtual(); i++) {

            Passageiro passageiro = controlePassageiros.getPassageiros()[i];

            if (passageiro != null) {

                Prompt.imprimir(passageiro);
            }
        }
    }
}