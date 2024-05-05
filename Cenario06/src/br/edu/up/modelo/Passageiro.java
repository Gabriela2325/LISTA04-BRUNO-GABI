// Passageiro.java
package br.edu.up.modelo;

public class Passageiro extends Pessoa {

    private String identBagagem;

    private Passagem passagem;

    public String getidentBagagem() {
        return identBagagem;
    }

    public void setIdentificadorBagagem(String identBagagem) {
        this.identBagagem = identBagagem;
    }

    public Passagem getPassagem() {
        return passagem;
    }

    public void setPassagem(Passagem passagem) {
        this.passagem = passagem;
    }
}
