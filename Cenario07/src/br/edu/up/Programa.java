package br.edu.up;

import br.edu.up.controle.ControleAcademico;
import br.edu.up.view.ViewControleAcademico;

public class Programa {
    public static void main(String[] args) {
        ControleAcademico controller = new ControleAcademico();
        ViewControleAcademico view = new ViewControleAcademico(controller);
        view.exibirMenu();
    }
}