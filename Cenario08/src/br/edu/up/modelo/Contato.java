// ./Contato.java

package br.edu.up.modelo;

public class Contato {
    protected int codigo;
    protected String nome;
    protected String telefone;

    public Contato(int codigo, String nome, String telefone) {
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }
}