// ./Programa.java

package br.edu.up;
import br.edu.up.controle.ControleAgenda;
import br.edu.up.modelo.Agenda;
import br.edu.up.view.ViewContatos;

public class Programa {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        ViewContatos view = new ViewContatos();
        ControleAgenda controle = new ControleAgenda(agenda, view);
        controle.iniciar();
    }
}