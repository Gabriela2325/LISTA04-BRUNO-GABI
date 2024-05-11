// ./Agenda.java

package br.edu.up.modelo;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public Contato buscarContato(int codigo) {
        for (Contato contato : contatos) {
            if (contato.getCodigo() == codigo) {
                return contato;
            }
        }
        return null; 
    }

    public void excluirContato(int codigo) {
        int a = -1;
        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).getCodigo() == codigo) {
                a = i;
                break;
            }
        }
        if (a != -1) {
            contatos.remove(a);
        }
    }

    public List<Contato> listarContatos() {
        return contatos;
    }
}
