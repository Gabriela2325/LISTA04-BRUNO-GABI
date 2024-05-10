// IagendaContatos.java (Interface)

package br.edu.up.modelo;

import java.util.List;

public interface IagendaContatos {
    void adicionarContato(Icontato contato);

    Icontato buscarContato(int codigo);

    void excluirContato(int codigo);

    List<Icontato> listarContatos();
}


