package br.edu.up.modelos;

public class Evento {
    private String nome;
    private String Local;
    private String Data;
    private int LotacaoMaxima;
    private int IngressosVendidos;
    private double PrecoIngresso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return Local;
    }

    public void setLocal(String local) {
        Local = local;
    }

    public String getData() {
        return Data;
    }

    public void setData(String data) {
        Data = data;
    }

    public int getLotacaoMaxima() {
        return LotacaoMaxima;
    }

    public void setLotacaoMaxima(int lotacaoMaxima) {
        LotacaoMaxima = lotacaoMaxima;
    }

    public int getIngressosVendidos() {
        return IngressosVendidos;
    }

    public void setIngressosVendidos(int ingressosVendidos) {
        IngressosVendidos = ingressosVendidos;
    }

    public double getPrecoIngresso() {
        return PrecoIngresso;
    }

    public void setPrecoIngresso(double precoIngresso) {
        PrecoIngresso = precoIngresso;
    }

    @Override
    public String toString() {
        return "Evento \nnome=" + nome + "\nLocal=" + Local + "\nData=" + Data + "\nLotacaoMaxima=" + LotacaoMaxima
                + "\nIngressosVendidos=" + IngressosVendidos + "\nPrecoIngresso=" + PrecoIngresso;
    }

}
