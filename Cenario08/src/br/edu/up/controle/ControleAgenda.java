// ./ControleAgenda.java

package br.edu.up.controle;

import br.edu.up.modelo.IagendaContatos;
import br.edu.up.modelo.Icontato;
import br.edu.up.modelo.ContatoComercial;
import br.edu.up.modelo.ContatoPessoal;
import br.edu.up.view.ViewContatos;

public class ControleAgenda {
    private IagendaContatos agenda;
    private ViewContatos view;

    public ControleAgenda(IagendaContatos agenda, ViewContatos view) {
        this.agenda = agenda;
        this.view = view;
    }

    public void iniciar() {
        int opcao;
        do {
            opcao = view.exibirMenu();
            switch (opcao) {
                case 1:
                    adicionarContatoPessoal();
                    break;
                case 2:
                    adicionarContatoComercial();
                    break;
                case 3:
                    excluirContato();
                    break;
                case 4:
                    consultarContato();
                    break;
                case 5:
                    listarContatos();
                    break;
                case 6:
                    view.encerrarPrograma();
                    break;
                default:
                    view.opcaoInvalida();
            }
        } while (opcao != 6);
    }

    private void adicionarContatoPessoal() {
        ContatoPessoal contatoPessoal = view.lerContatoPessoal();
        agenda.adicionarContato(contatoPessoal);
    }

    private void adicionarContatoComercial() {
        ContatoComercial contatoComercial = view.lerContatoComercial();
        agenda.adicionarContato(contatoComercial);
    }

    private void excluirContato() {
        int codigo = view.lerCodigoContato();
        Icontato contato = agenda.buscarContato(codigo);
        if (contato != null) {
            agenda.excluirContato(codigo);
            view.contatoExcluido();
        } else {
            view.contatoNaoEncontrado();
        }
    }

    private void consultarContato() {
        int codigo = view.lerCodigoContato();
        Icontato contato = agenda.buscarContato(codigo);
        view.exibirContato(contato);
    }

    private void listarContatos() {
        view.exibirListaContatos(agenda.listarContatos());
    }
}
