// ./Programa.java
package br.edu.up;

import br.edu.up.controle.*;
import br.edu.up.view.*;

public class Programa {
    public static void main(String[] args) {
        SeguroController controller = new SeguroController();
        ViewSeguros view = new ViewSeguros(controller);
        view.exibirMenu();
    }
}