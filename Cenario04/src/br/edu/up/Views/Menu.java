package br.edu.up.Views;

import br.edu.up.Controle.ControladorEstacionamento;
import br.edu.up.modelos.*;
import br.edu.up.util.Prompt;

public class Menu {
    private Estacionamento estacionamento;
    private ControladorEstacionamento controlador;

    public Menu() {
        this.estacionamento = new Estacionamento();
    }

    public void setControlador(ControladorEstacionamento controlador) {
        this.controlador = controlador;
    }

    public void exibirMenu() {
        int opcao;

        do {
            Prompt.separador();
            Prompt.imprimir("1. Entrada de veículo");
            Prompt.imprimir("2. Saída de veículo");
            Prompt.imprimir("3. Gerar relatório");
            Prompt.imprimir("4. Sair");
            opcao = Prompt.lerInteiro("Escolha uma opção: "); 

            switch (opcao) {
                case 1:
                    entradaVeiculo();
                    break;

                case 2:
                    saidaVeiculo();
                    break;

                case 3:
                    gerarRelatorio();
                    break;

                case 4:
                    Prompt.imprimir("Saindo...");
                    break;

                default:
                    Prompt.imprimir("Opção inválida.");
            }

        } while (opcao != 4);
    }

    private void entradaVeiculo() {

        String modelo = Prompt.lerLinha("Modelo do veículo: ");

        String placa = Prompt.lerLinha("Placa do veículo: ");

        String cor = Prompt.lerLinha("Cor do veículo: ");

        if (controlador != null) {

            controlador.processarEntradaVeiculo(modelo, placa, cor);

        }
    }

    private void saidaVeiculo() {

        String placa = Prompt.lerLinha("Placa do veículo a ser retirado: ");

        if (controlador != null) {

            controlador.processarSaidaVeiculo(placa);
        }
    }

    private void gerarRelatorio() {

        if (controlador != null) {

            controlador.gerarRelatorio();

        }
    }

    public void mostrarMensagem(String mensagem) {

        Prompt.imprimir(mensagem);

    }

    public void mostrarRelatorio(int totalVeiculos, double valorTotal) {

        Prompt.imprimir("Total de veículos estacionados: " + totalVeiculos);
        
        Prompt.imprimir("Valor total a ser pago: R$ " + valorTotal);
    }
}