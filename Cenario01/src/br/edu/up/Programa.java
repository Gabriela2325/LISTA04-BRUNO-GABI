package br.edu.up;

import br.edu.up.modelos.Livro;

public class Programa {
    public static void main(String[] args) throws Exception {

        Livro livro = new Livro();

        livro.setCodigo("1598FHK");
        livro.setTitulo("Core Java 2");
        livro.setAutores(new String[] { " Cay S. Horstmann ", " Gary Cornell " });
        livro.setIsbn("0130819336");
        livro.setAno(2005);

        ////////////////////////////////////////

        System.out.println("Código: " + livro.getCodigo());
        System.out.println("Título: " + livro.getTitulo());

        System.out.printf("Autores do livro: ");
        for (String autor : livro.getAutores()) {
            System.out.printf("%s ", autor);
        }

        System.out.println("\nISBN: " + livro.getIsbn());
        System.out.println("Ano: " + livro.getAno());

        ////////////////////////////////////////

        livro = new Livro();

        livro.setCodigo("9865PLO");
        livro.setTitulo("Java, Como programar");
        livro.setAutores(new String[] { "Harvey Deitel" });
        livro.setIsbn("0130341517");
        livro.setAno(2015);

        ////////////////////////////////////////

        System.out.println("\n#################################\n");

        System.out.println("Código: " + livro.getCodigo());
        System.out.println("Título: " + livro.getTitulo());

        System.out.printf("Autores do livro: ");
        for (String autor : livro.getAutores()) {
            System.out.printf("%s ", autor);
        }

        System.out.println("\nISBN: " + livro.getIsbn());
        System.out.println("Ano: " + livro.getAno());

    }
}
