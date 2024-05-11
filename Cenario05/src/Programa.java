
import br.edu.up.telas.*;
import br.edu.up.controles.*;

public class Programa {
    public static void main(String[] args) throws Exception {
        ControleReserva cReserva = new ControleReserva();
        ControleEvento cEvento = new ControleEvento();
        MenuInicial menuInicial = new MenuInicial();
        menuInicial.mostrarMenu();
    }
}
