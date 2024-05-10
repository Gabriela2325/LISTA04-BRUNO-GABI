// ./Programa.java

package br.edu.up;
import br.edu.up.controle.ControleAgenda;
import br.edu.up.modelo.AgendaTelefonica;
import br.edu.up.view.ViewContatos;

public class Programa {
    public static void main(String[] args) {
        AgendaTelefonica agenda = new AgendaTelefonica();
        ViewContatos view = new ViewContatos();
        ControleAgenda controle = new ControleAgenda(agenda, view);
        controle.iniciar();
    }
}