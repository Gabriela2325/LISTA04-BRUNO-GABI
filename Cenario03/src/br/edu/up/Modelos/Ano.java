package br.edu.up.Modelos;

import br.edu.up.Modelos.*;

public class Ano {
    private int ano;
    private boolean bissexto;
    private Mes[] meses;

    public Ano(int ano, boolean bissexto, Mes[] meses) {
        this.ano = ano;
        this.bissexto = bissexto;
        this.meses = meses;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isBissexto() {
        return bissexto;
    }

    public void setBissexto(boolean bissexto) {
        this.bissexto = bissexto;
    }

    public Mes[] getMeses() {
        return meses;
    }

    public void setMeses(Mes[] meses) {
        this.meses = meses;
    }

    public void adicionarMes() {
        this.meses = new Mes[12];

        Dia[] dias = new Dia[31];

        for (int i = 0; i < dias.length; i++) {

            dias[i] = new Dia(i + 1);
        }

        Mes m1 = new Mes(12, 31, dias);

        this.meses[1] = m1;
    }

    public void excluirCompromisso(int mes, int dia, String hora) {
        // Lógica para excluir um compromisso em um determinado dia do mês
    }

    public void listarCompromissos(int mes, int dia) {
        // Lógica para listar os compromissos de um determinado dia do mês
    }
}
