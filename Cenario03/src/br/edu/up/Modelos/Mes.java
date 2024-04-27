package br.edu.up.Modelos;

public class Mes {

    private int nome;
    private int qtdDias;
    private Dia[] dias;

    public Mes(int nome, int qtdDias, Dia[] dias) {
        this.nome = nome;
        this.qtdDias = qtdDias;
        this.dias = dias;
    }

    public int getNome() {
        return nome;
    }

    public void setNome(int nome) {
        this.nome = nome;
    }

    public int getQtdDias() {
        return qtdDias;
    }

    public void setQtdDias(int qtdDias) {
        this.qtdDias = qtdDias;
    }

    public Dia[] getDias() {
        return dias;
    }

    public void setDias(Dia[] dias) {
        this.dias = dias;
    }

    public void adicionarCompromisso(Compromisso compromisso, int diaMes) {

    }

    public void adicionarCompromisso(String pessoa, String assunto, int hora, int diaMes) {

    }

    public void excluirCompromisso(int diaMes, int hora) {

    }

    public String listarCompromissos(int diaMes) {
        return "";
    }

    public String listarCompromissos() {
        return "";
    }

}
