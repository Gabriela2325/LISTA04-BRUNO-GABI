// ./ViewContatos.java

package br.edu.up.view;

import br.edu.up.modelo.Icontato;
import br.edu.up.modelo.ContatoComercial;
import br.edu.up.modelo.ContatoPessoal;
import br.edu.up.util.Prompt;

public class ViewContatos {

    public int exibirMenu() {
        Prompt.linhaEmBranco();
        Prompt.imprimir("Menu:");
        Prompt.imprimir("1. Incluir um contato pessoal");
        Prompt.imprimir("2. Incluir um contato comercial");
        Prompt.imprimir("3. Excluir um contato pelo código");
        Prompt.imprimir("4. Consultar um contato pelo código");
        Prompt.imprimir("5. Listar todos os contatos");
        Prompt.imprimir("6. Sair do programa");
        Prompt.separador();
        return Prompt.lerInteiro("Escolha uma opção:");
    }

    public ContatoPessoal lerContatoPessoal() {
        Prompt.linhaEmBranco();
        Prompt.imprimir("Incluir um contato pessoal:");
        int codigo = Prompt.lerInteiro("Código:");
        String nome = Prompt.lerLinha("Nome:");
        String telefone = Prompt.lerLinha("Telefone:");
        String aniversario = Prompt.lerLinha("Aniversário:");
        return new ContatoPessoal(codigo, nome, telefone, aniversario);
    }

    public ContatoComercial lerContatoComercial() {
        Prompt.linhaEmBranco();
        Prompt.imprimir("Incluir um contato comercial:");
        int codigo = Prompt.lerInteiro("Código:");
        String nome = Prompt.lerLinha("Nome:");
        String telefone = Prompt.lerLinha("Telefone:");
        String cnpj = Prompt.lerLinha("CNPJ:");
        return new ContatoComercial(codigo, nome, telefone, cnpj);
    }

    public int lerCodigoContato() {
        return Prompt.lerInteiro("Digite o código do contato:");
    }

    public void exibirContato(Icontato contato) {
        if (contato != null) {
            Prompt.linhaEmBranco();
            Prompt.imprimir("Detalhes do Contato:");
            Prompt.imprimir(contato.toString());
        } else {
            Prompt.linhaEmBranco();
            Prompt.imprimir("Contato não encontrado.");
        }
    }

    public void exibirListaContatos(Iterable<Icontato> contatos) {
        Prompt.linhaEmBranco();
        Prompt.imprimir("Lista de Contatos:");
        for (Icontato contato : contatos) {
            Prompt.imprimir(contato.toString());
        }
    }

    public void contatoExcluido() {
        Prompt.linhaEmBranco();
        Prompt.imprimir("Contato excluído com sucesso.");
    }

    public void contatoNaoEncontrado() {
        Prompt.linhaEmBranco();
        Prompt.imprimir("Contato não encontrado.");
    }

    public void opcaoInvalida() {
        Prompt.linhaEmBranco();
        Prompt.imprimir("Opção inválida, tente novamente.");
    }

    public void encerrarPrograma() {
        Prompt.linhaEmBranco();
        Prompt.imprimir("Programa encerrado.");
    }
}