package br.edu.up.Modelos;

public class Dia {

    private int diaMes;
    private Compromisso[] compromissos;

    public Dia(int diaMes, Compromisso[] compromissos) {
        this.diaMes = diaMes;
        this.compromissos = compromissos;
    }

    public int getdiaMes() {
        return diaMes;
    }

    public void setdiaMes(int diaMes) {
        this.diaMes = diaMes;
    }

    public Compromisso[] getCompromissos() {
        return compromissos;
    }

    public void setCompromissos(Compromisso[] compromissos) {
        this.compromissos = compromissos;
    }

    public void adicionarCompromisso(Compromisso compromisso) {

    }

    public String consultarCompromisso(int hora) {
        return "";

    }

    public void excluirCompromisso(int hora) {
    }

    public String listarCompromissos() {
        return "";
    }

}
