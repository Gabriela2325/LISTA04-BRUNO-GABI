package br.edu.up.Controle;

import br.edu.up.Views.Menu; 
import br.edu.up.modelos.Estacionamento;
import br.edu.up.modelos.Veiculo;

public class ControladorEstacionamento {

    private Estacionamento estacionamento;

    private Menu menu;

    public ControladorEstacionamento(Estacionamento estacionamento, Menu menu) {
        this.estacionamento = estacionamento;
        this.menu = menu;
    }

    public void processarEntradaVeiculo(String modelo, String placa, String cor) {
        Veiculo veiculo = new Veiculo(modelo, placa, cor);

        if (estacionamento.entrada(veiculo)) {

            menu.mostrarMensagem("Veículo estacionado com sucesso.");

        } else {

            menu.mostrarMensagem("Estacionamento lotado. Não foi possível estacionar.");

        }
    }

    public void processarSaidaVeiculo(String placa) {
        Veiculo veiculo = estacionamento.saida(placa);

        if (veiculo != null) {

            menu.mostrarMensagem("Veículo de placa " + placa + " retirado com sucesso.");

        } else {

            menu.mostrarMensagem("Veículo não encontrado no estacionamento.");

        }
    }

    public void gerarRelatorio() {
        int totalEntradas = estacionamento.getTotalVeiculos();

        double valorTotal = estacionamento.calcularPagamento();

        menu.mostrarRelatorio(totalEntradas, valorTotal);
    }
}