package br.edu.up;

import br.edu.up.modelos.*;
import br.edu.up.util.Prompt;

public class Programa {
    public static void main(String[] args) throws Exception {
    
    Prompt.linhaEmBranco();

    Prompt.imprimir("Digite as coordenadas para o ponto 1----------");
    Prompt.imprimir("Digite a coordenada x:");
    double x1 = Prompt.lerDecimal();
    Prompt.imprimir("Digite a coordenada y:");
    double y1 = Prompt.lerDecimal();
    Ponto p1 = new Ponto(x1, y1);
    Prompt.imprimir("Ponto 1 : " + p1);

    Prompt.linhaEmBranco();

    Prompt.imprimir("Criando um objeto ponto2 na posição (2,5)--------");
    Ponto p2 = new Ponto(2, 5);
    Prompt.imprimir("Ponto 2 : " + p2);

    Prompt.linhaEmBranco();

    Prompt.imprimir("Calculando a distância do ponto1 ao ponto2---------");
    double dP12 = p1.calcularDistancia(p2);
    Prompt.imprimir("Distância : " + dP12);

    Prompt.linhaEmBranco();

    Prompt.imprimir("Calculando a distância do ponto2 às coordenadas (7,2)---------");
    Ponto p3 = new Ponto(7, 2);
    double dP23 = p2.calcularDistancia(p3);
    Prompt.imprimir("Distância: " + dP23);

    Prompt.linhaEmBranco();

    Prompt.imprimir("Atribuindo valor de X como 10---------");
    p1.setX(10);
    Prompt.imprimir("Novo ponto1: " + p1);

    Prompt.linhaEmBranco();

    Prompt.imprimir("Alterando o valor de y para 3 no ponto1--------");
    p1.setY( 3);
    Prompt.imprimir("Novo ponto1: " + p1);

    Prompt.pressionarEnter();
    }
}
