package br.edu.up.modelos;

public class Aluno extends Pessoa {
    private int anoIngresso;
    private String nomeCurso;
    private String turno;

    public Aluno(String nome, String rg, String matricula, int anoIngresso, String nomeCurso, String turno) {
        super(nome, rg, matricula);
        this.anoIngresso = anoIngresso;
        this.nomeCurso = nomeCurso;
        this.turno = turno;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return super.toString() + ", Ano de Ingresso: " + anoIngresso +
                ", Curso: " + nomeCurso + ", Turno: " + turno;
    }
}