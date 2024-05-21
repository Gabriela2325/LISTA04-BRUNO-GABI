package br.edu.up.modelos;

public class Competencia {
    public enum Tipo {
        NECESSARIA, COMPLEMENTAR
    }

    public enum Situacao {
        ATINGIDA, NAO_ATINGIDA
    }

    private String descricao;
    private Tipo tipo;
    private Situacao situacao;

    public Competencia(String descricao, Tipo tipo, Situacao situacao) {
        this.descricao = descricao;
        this.tipo = tipo;
        this.situacao = situacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        return "Descrição: " + descricao + ", Tipo: " + tipo + ", Situação: " + situacao;
    }
}