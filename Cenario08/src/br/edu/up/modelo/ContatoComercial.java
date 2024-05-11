// ./ContatoComercial.java

package br.edu.up.modelo;

public class ContatoComercial extends Contato {
    private String cnpj;

    public ContatoComercial(int codigo, String nome, String telefone, String cnpj) {
        super(codigo, nome, telefone);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}