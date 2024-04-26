package br.edu.up.Modelos;

public class Ano {
    private int ano;
    private boolean bisexto;
    private Mes[] meses;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isBisexto() {
        return bisexto;
    }

    public void setBisexto(boolean bisexto) {
        this.bisexto = bisexto;
    }

    public Mes[] getMeses() {
        return meses;
    }

    public void setMeses(Mes[] meses) {
        this.meses = meses;
    }

}
