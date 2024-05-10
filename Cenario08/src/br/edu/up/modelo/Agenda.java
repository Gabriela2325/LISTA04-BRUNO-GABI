// ./Agenda.java

package br.edu.up.modelo;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Icontato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }

    public void adicionarContato(Icontato contato) {
        contatos.add(contato);
    }

    public Icontato getContato(int codigo) {
        for (Icontato contato : contatos) {
            if (contato.getCodigo() == codigo) {
                return contato;
            }
        }
        return null; 
    }

    public void excluirContato(int codigo) {
        int index = -1;
        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).getCodigo() == codigo) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            contatos.remove(index);
        }
    }

    public List<Icontato> listarContatos() {
        return contatos;
    }
}
