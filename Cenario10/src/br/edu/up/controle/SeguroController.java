// ./Controle.java
package br.edu.up.controle;

import java.util.ArrayList;
import java.util.List;
import br.edu.up.modelos.*;

public class SeguroController {
    private List<Seguro> seguros;

    public SeguroController() {
        seguros = new ArrayList<>();
    }

    public void incluirSeguro(Seguro seguro) {
        if (!seguros.contains(seguro)) {
            seguros.add(seguro);
        }
    }

    public Seguro localizarSeguro(String apolice) {
        for (Seguro seguro : seguros) {
            if (seguro.getApolice().equals(apolice)) {
                return seguro;
            }
        }
        return null;
    }

    public void excluirSeguro(String apolice) {
        Seguro seguro = localizarSeguro(apolice);
        if (seguro != null) {
            seguros.remove(seguro);
        }
    }

    public void excluirTodosSeguros() {
        seguros.clear();
    }

    public List<Seguro> listarTodosSeguros() {
        return new ArrayList<>(seguros);
    }

    public int quantidadeSeguros() {
        return seguros.size();
    }
}