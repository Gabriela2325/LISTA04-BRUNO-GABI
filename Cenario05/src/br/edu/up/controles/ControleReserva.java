package br.edu.up.controles;

import br.edu.up.modelos.*;
import br.edu.up.telas.*;
import br.edu.up.util.Prompt;

import java.util.Scanner;

public class ControleReserva {

    private static Reserva reserva = new Reserva();

    public static void IncluirReserva() {
        String nome = Prompt.lerLinha("Digite o nome do responsável pela reserva: ");
        reserva.setNomeResponsavel(nome);

        int qdtpessoas = Prompt.lerInteiro("Quantidade de pessoas: ");
        reserva.setQuantidadePessoas(qdtpessoas);

        String data = Prompt.lerLinha("Data da reserva: ");
        reserva.setData(data);

        // reserva.setValorTotal(unitPassagem * qdtpessoas);

    }

    public static void AlterarReserva() {

    }

    public static void ListarReserva() {
        Prompt.imprimir(reserva.toString());
    }

    public static void ExcluirReserva() {

    }

}
