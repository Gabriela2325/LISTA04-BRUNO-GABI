// programa.java

package br.edu.up;

import br.edu.up.controle.ClienteController;
import br.edu.up.view.ViewClientes;

public class Programa {
    public static void main(String[] args) {
        ClienteController controller = new ClienteController();
        ViewClientes view = new ViewClientes(controller);
        view.iniciar();
    }
}