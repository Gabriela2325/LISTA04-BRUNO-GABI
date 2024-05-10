// ./ContatoComercial.java

package br.edu.up.modelo;

public class ContatoComercial implements Icontato {
    private int codigo;
    private String nome;
    private String telefone;
    private String cnpj;

    public ContatoComercial(int codigo, String nome, String telefone, String cnpj) {
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
        this.cnpj = cnpj;
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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

}