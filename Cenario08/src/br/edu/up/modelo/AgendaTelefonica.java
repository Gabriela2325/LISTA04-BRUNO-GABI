// ./AgendaTelefonica.java

package br.edu.up.modelo;

import java.util.ArrayList;
import java.util.List;

public class AgendaTelefonica implements IagendaContatos {
    private List<Icontato> contatos;

    public AgendaTelefonica() {
        contatos = new ArrayList<>();
    }

    @Override
    public void adicionarContato(Icontato contato) {
        contatos.add(contato);
    }

    @Override
    public Icontato buscarContato(int codigo) {
        for (Icontato contato : contatos) {
            if (contato.getCodigo() == codigo) {
                return contato;
            }
        }
        return null; 
    }

    @Override
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

    @Override
    public List<Icontato> listarContatos() {
        return contatos;
    }
}