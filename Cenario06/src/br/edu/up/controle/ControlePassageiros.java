//ControlePassageiros.java
package br.edu.up.controle;

import br.edu.up.modelo.*;

public class ControlePassageiros {

    private int TamMax = 100;

    private Passageiro[] passageiros;

    private int tamAtual;

    public ControlePassageiros() {
        this.passageiros = new Passageiro[TamMax];
        this.tamAtual = 0;
    }

    public Passageiro[] getPassageiros() {
        return passageiros;
    }

    public int getTamanhoAtual() {
        return tamAtual;
    }

    public int getTamMax() {
        return TamMax;
    }

    public void incrementarTamAtual() {
        tamAtual++;
    }
}