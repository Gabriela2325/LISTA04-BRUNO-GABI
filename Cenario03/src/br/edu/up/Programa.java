package br.edu.up;
import br.edu.up.Modelos.*;

public class Programa {
    public static void main(String[] args) throws Exception {

        Ano ano2024 = new Ano(2024, true);

        Compromisso compromisso1 = new Compromisso("João", "Sala de Reuniões", "Reunião de Projeto", 14);
        
        ano2024.adicionarCompromisso(compromisso1, 6, 18); 

        String compromissosDeJun18 = ano2024.listarCompromissos(6, 18);
        System.out.println("Compromissos para 18 de Junho: \n" + compromissosDeJun18);
    }
}