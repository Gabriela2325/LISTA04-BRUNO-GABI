package br.edu.up.controle;

import br.edu.up.modelo.*;
import br.edu.up.util.Prompt;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ControlePassageiros {

    private int TamMax = 100;

    private Passageiro[] passageiros;

    private int tamAtual;

    public ControlePassageiros() {
        this.passageiros = new Passageiro[TamMax];
        this.tamAtual = 0;
    }
    
    public Passageiro[] getPassageiros() {
        return passageiros;
    }

    public int getTamanhoAtual() {
        return tamAtual;
    }

    public void adicionarPassageiro() {
        if (tamAtual < TamMax) {
            Passageiro passageiro = new Passageiro();

            passageiro.setNome(Prompt.lerLinha("Nome do passageiro:"));

            passageiro.setRg(Prompt.lerLinha("RG do passageiro:"));

            passageiro.setIdentificadorBagagem(Prompt.lerLinha("Identificador da bagagem:"));

            passageiro.setPassagem(criarPassagem());

            passageiros[tamAtual++] = passageiro;

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
}