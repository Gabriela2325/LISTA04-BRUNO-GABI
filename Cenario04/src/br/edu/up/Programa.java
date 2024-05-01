package br.edu.up;

import br.edu.up.modelos.*;
import br.edu.up.Views.*;
import br.edu.up.Controle.*;

public class Programa {
    public static void main(String[] args) {
        
        Estacionamento estacionamento = new Estacionamento();

        Menu menu = new Menu();

        ControladorEstacionamento controlador = new ControladorEstacionamento(estacionamento, menu);

        menu.setControlador(controlador);

        menu.exibirMenu();

    }
}