package br.edu.up.modelos;

public class Reserva {
    private String NomeResponsavel;
    private int QuantidadePessoas;
    private double ValorTotal;
    private String Data;

    public String getNomeResponsavel() {
        return NomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        NomeResponsavel = nomeResponsavel;
    }

    public int getQuantidadePessoas() {
        return QuantidadePessoas;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        QuantidadePessoas = quantidadePessoas;
    }

    public double getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(double valorTotal) {
        ValorTotal = valorTotal;
    }

    public String getData() {
        return Data;
    }

    public void setData(String data) {
        Data = data;
    }

    @Override
    public String toString() {
        return "Reserva\nNomeResponsavel: " + NomeResponsavel + "\nQuantidadePessoas: " + QuantidadePessoas
                + "\nValorTotal: " + ValorTotal + "\nData: " + Data;
    }

}
