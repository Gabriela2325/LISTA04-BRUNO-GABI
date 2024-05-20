package br.edu.up.controles;

import br.edu.up.modelos.*;
import br.edu.up.telas.*;
import br.edu.up.util.Prompt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ControleEvento {

    private static Evento[] eventos = new Evento[5];


    public static void CriarEvento() {

        Evento evento = new Evento();

        String nome = Prompt.lerLinha("Nome do Evento: ");
        evento.setNome(nome);

        String data = Prompt.lerLinha("Data do Evento: ");
        evento.setData(data);

        String local = Prompt.lerLinha("Local do Evento: ");
        evento.setLocal(local);

        double precoIngresso = Prompt.lerDecimal("Preço do ingresso: ");
        evento.setPrecoIngresso(precoIngresso);

        int lotacaoMax = Prompt.lerInteiro("Lotação máxima do Evento: ");
        evento.setLotacaoMaxima(lotacaoMax);

        int ingressosVendidos = Prompt.lerInteiro("Ingressos vendidos: ");
        evento.setIngressosVendidos(ingressosVendidos);

    }

    public static void AlterarEvento() {

    }

    public static void ListarEventos() {
        for (Evento evento : eventos) {
            Prompt.imprimir(evento.toString());
        }
    }

    public static void ExcluirEvento() {

    }

}
