//ViewPassageiros.java

package br.edu.up.view;

import br.edu.up.util.*;
import br.edu.up.controle.*;
import br.edu.up.modelo.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
                    adicionarPassageiro();
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

    private void adicionarPassageiro() {

        if (controlePassageiros.getTamanhoAtual() < controlePassageiros.getTamMax()) {

            Passageiro passageiro = new Passageiro();

            passageiro.setNome(Prompt.lerLinha("Nome do passageiro:"));
            passageiro.setRg(Prompt.lerLinha("RG do passageiro:"));
            passageiro.setIdentificadorBagagem(Prompt.lerLinha("Identificador da bagagem:"));
            passageiro.setPassagem(criarPassagem());

            controlePassageiros.getPassageiros()[controlePassageiros.getTamanhoAtual()] = passageiro;

            controlePassageiros.incrementarTamAtual();

            Prompt.imprimir("Passageiro adicionado com sucesso!");

        } else {

            Prompt.imprimir("Limite máximo de passageiros atingido.");

        }
    }

    private Passagem criarPassagem() {

        Passagem passagem = new Passagem();

        passagem.setNumeroAssento(Prompt.lerInteiro("Número do assento:"));
        passagem.setClasseAssento(Prompt.lerLinha("Classe do assento:"));
        passagem.setDataVoo(lerDataHora("Data e hora do voo:"));

        return passagem;
    }

    private LocalDateTime lerDataHora(String mensagem) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        String dataHoraString = Prompt.lerLinha(mensagem + " (no formato dd/MM/yyyy HH:mm):");

        return LocalDateTime.parse(dataHoraString, formatter);
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