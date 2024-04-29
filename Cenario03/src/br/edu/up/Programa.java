package br.edu.up;
import br.edu.up.util.*;
import br.edu.up.Modelos.Ano;
import br.edu.up.Modelos.Compromisso;

public class Programa {
    public static void main(String[] args) throws Exception {




///////////////////////////criar compromisso funcionando///////////////////////////////
        Compromisso[] compromisso = new Compromisso[24];

        compromisso[10] = new Compromisso("Bruno", "Parque", "Passear", 10);
        compromisso[12] = new Compromisso("Gabi", "Faculdade", "Passear", 18);

        for (Compromisso compr : compromisso) {
            if (compr != null) {

                Prompt.separador();
                Prompt.imprimir(compr.toString());
                Prompt.separador();
            }
        }
    }
}