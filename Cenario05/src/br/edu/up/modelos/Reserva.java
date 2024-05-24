package br.edu.up.modelos;

public class Reserva {
    private String nomeResponsavel;
    private int quantidadePessoas;
    private double valorTotal;
    private String data;

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Reserva\nNomeResponsavel: " + nomeResponsavel + "\nQuantidadePessoas: " + quantidadePessoas
                + "\nValorTotal: " + valorTotal + "\nData: " + data;
    }
}
