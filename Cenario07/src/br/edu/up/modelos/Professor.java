package br.edu.up.modelos;

public class Professor extends Pessoa {
    private String numeroCurriculoLattes;
    private String nomeInstituicao;
    private int anoConclusao;
    private String nomeTituloObtido;
    private String tituloTrabalhoConclusao;

    public Professor(String nome, String rg, String matricula, String numeroCurriculoLattes,
            String nomeInstituicao, int anoConclusao, String nomeTituloObtido, String tituloTrabalhoConclusao) {
        super(nome, rg, matricula);
        this.numeroCurriculoLattes = numeroCurriculoLattes;
        this.nomeInstituicao = nomeInstituicao;
        this.anoConclusao = anoConclusao;
        this.nomeTituloObtido = nomeTituloObtido;
        this.tituloTrabalhoConclusao = tituloTrabalhoConclusao;
    }

    public String getNumeroCurriculoLattes() {
        return numeroCurriculoLattes;
    }

    public void setNumeroCurriculoLattes(String numeroCurriculoLattes) {
        this.numeroCurriculoLattes = numeroCurriculoLattes;
    }

    public String getNomeInstituicao() {
        return nomeInstituicao;
    }

    public void setNomeInstituicao(String nomeInstituicao) {
        this.nomeInstituicao = nomeInstituicao;
    }

    public int getAnoConclusao() {
        return anoConclusao;
    }

    public void setAnoConclusao(int anoConclusao) {
        this.anoConclusao = anoConclusao;
    }

    public String getNomeTituloObtido() {
        return nomeTituloObtido;
    }

    public void setNomeTituloObtido(String nomeTituloObtido) {
        this.nomeTituloObtido = nomeTituloObtido;
    }

    public String getTituloTrabalhoConclusao() {
        return tituloTrabalhoConclusao;
    }

    public void setTituloTrabalhoConclusao(String tituloTrabalhoConclusao) {
        this.tituloTrabalhoConclusao = tituloTrabalhoConclusao;
    }

    @Override
    public String toString() {
        return super.toString() + ", Currículo Lattes: " + numeroCurriculoLattes +
                ", Instituição: " + nomeInstituicao + ", Ano Conclusão: " + anoConclusao +
                ", Título Obtido: " + nomeTituloObtido + ", TCC: " + tituloTrabalhoConclusao;
    }
}