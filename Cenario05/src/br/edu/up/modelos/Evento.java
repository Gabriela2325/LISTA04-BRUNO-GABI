package br.edu.up.modelos;

public class Evento {
    private String nome;
    private String local;
    private String data;
    private int lotacaoMaxima;
    private int ingressosVendidos;
    private double precoIngresso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getLotacaoMaxima() {
        return lotacaoMaxima;
    }

    public void setLotacaoMaxima(int lotacaoMaxima) {
        this.lotacaoMaxima = lotacaoMaxima;
    }

    public int getIngressosVendidos() {
        return ingressosVendidos;
    }

    public void setIngressosVendidos(int ingressosVendidos) {
        this.ingressosVendidos = ingressosVendidos;
    }

    public double getPrecoIngresso() {
        return precoIngresso;
    }

    public void setPrecoIngresso(double precoIngresso) {
        this.precoIngresso = precoIngresso;
    }

    public int getIngressosDisponiveis() {
        return lotacaoMaxima - ingressosVendidos;
    }

    @Override
    public String toString() {
        return "Evento \nNome=" + nome + "\nLocal=" + local + "\nData=" + data + "\nLotacaoMaxima=" + lotacaoMaxima
                + "\nIngressosVendidos=" + ingressosVendidos + "\nPrecoIngresso=" + precoIngresso;
    }
}
