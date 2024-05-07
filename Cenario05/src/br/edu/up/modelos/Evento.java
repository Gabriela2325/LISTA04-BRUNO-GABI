package br.edu.up.modelos;

public class Evento {
    private String nome;
    private String Local;
    private String Data;
    private String LotacaoMaxima;
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

    public String getLotacaoMaxima() {
        return LotacaoMaxima;
    }

    public void setLotacaoMaxima(String lotacaoMaxima) {
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

}
