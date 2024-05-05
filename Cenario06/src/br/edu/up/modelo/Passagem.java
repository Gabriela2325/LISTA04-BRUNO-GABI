// Passagem.java
package br.edu.up.modelo;

import java.time.LocalDateTime;

public class Passagem {

    private int numAssento;

    private String classeAssento;

    private LocalDateTime dataVoo;

    public int getNumeroAssento() {
        return numAssento;
    }

    public void setNumeroAssento(int numAssento) {
        this.numAssento = numAssento;
    }

    public String getClasseAssento() {
        return classeAssento;
    }

    public void setClasseAssento(String classeAssento) {
        this.classeAssento = classeAssento;
    }

    public LocalDateTime getDataVoo() {
        return dataVoo;
    }

    public void setDataVoo(LocalDateTime dataVoo) {
        this.dataVoo = dataVoo;
    }
}
