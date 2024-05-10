// ./ContatoPessoal.java

package br.edu.up.modelo;

public class ContatoPessoal implements Icontato {
    private int codigo;
    private String nome;
    private String telefone;
    private String aniversario;

    public ContatoPessoal(int codigo, String nome, String telefone, String aniversario) {
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
        this.aniversario = aniversario;
    }

    @Override
    public int getCodigo() {
        return codigo;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getTelefone() {
        return telefone;
    }

    public String getAniversario() {
        return aniversario;
    }

    public void setAniversario(String aniversario) {
        this.aniversario = aniversario;
    }

}
