package br.edu.up.view;

import br.edu.up.controle.ControleAcademico;
import br.edu.up.modelos.*;
import br.edu.up.util.Prompt;

public class ViewControleAcademico {
    private ControleAcademico Controle;

    public ViewControleAcademico(ControleAcademico Controle) {
        this.Controle = Controle;
    }

    public void exibirMenu() {
        int opcao;
        do {
            Prompt.separador(); 
            Prompt.imprimir("MENU");
            Prompt.imprimir("1. Adicionar Aluno");
            Prompt.imprimir("2. Adicionar Disciplina");
            Prompt.imprimir("3. Matricular Aluno em Disciplina");
            Prompt.imprimir("4. Avaliar Aluno em Disciplina");
            Prompt.imprimir("5. Verificar Situação do Aluno");
            Prompt.imprimir("0. Sair");
            opcao = Prompt.lerInteiro("Escolha uma opção: ");

            switch (opcao) {
                case 1:
                    adicionarAluno();
                    break;
                case 2:
                    adicionarDisciplina();
                    break;
                case 3:
                    matricularAluno();
                    break;
                case 4:
                    avaliarAluno();
                    break;
                case 5:
                    verificarSituacaoAluno();
                    break;
                case 0:
                    Prompt.imprimir("Encerrando o programa...");
                    break;
                default:
                    Prompt.imprimir("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);
    }

    private void adicionarAluno() {
        String nome = Prompt.lerLinha("Nome do Aluno: "); 
        Aluno aluno = new Aluno(nome, nome, nome, 0, nome, nome);
        Controle.adicionarAluno(aluno);
        Prompt.imprimir("Aluno adicionado com sucesso.");
    }

    private void adicionarDisciplina() {
        String nome = Prompt.lerLinha("Nome da Disciplina: "); 
  
        Disciplina disciplina = new Disciplina(nome);
        Controle.adicionarDisciplina(disciplina);
        Prompt.imprimir("Disciplina adicionada com sucesso.");
    }

    private void matricularAluno() {
        String nomeAluno = Prompt.lerLinha("Nome do Aluno: "); 

        Aluno aluno = buscarAlunoPorNome(nomeAluno);
        if (aluno == null) {
            Prompt.imprimir("Aluno não encontrado.");
            return;
        }

        String nomeDisciplina = Prompt.lerLinha("Nome da Disciplina: "); 
    
        Disciplina disciplina = buscarDisciplinaPorNome(nomeDisciplina);
        if (disciplina == null) {
            Prompt.imprimir("Disciplina não encontrada.");
            return;
        }

        boolean sucesso = Controle.matricularAluno(aluno, disciplina);
        if (sucesso) {
            Prompt.imprimir(String.format("Aluno %s matriculado na disciplina %s", aluno.getNome(), disciplina.getNome()));
        } else {
            Prompt.imprimir("Erro ao matricular aluno na disciplina.");
        }
    }

    private void avaliarAluno() {
        String nomeAluno = Prompt.lerLinha("Nome do Aluno: ");
       
        Aluno aluno = buscarAlunoPorNome(nomeAluno);
        if (aluno == null) {
            Prompt.imprimir("Aluno não encontrado.");
            return;
        }
    
        String nomeDisciplina = Prompt.lerLinha("Nome da Disciplina: ");
    
        Disciplina disciplina = buscarDisciplinaPorNome(nomeDisciplina);
        if (disciplina == null) {
            Prompt.imprimir("Disciplina não encontrada.");
            return;
        }
    
        boolean[] competencias = obterCompetenciasDoAluno(aluno, disciplina);
    
        boolean sucesso = Controle.avaliarAluno(aluno, disciplina, competencias);
        if (sucesso) {
            Prompt.imprimir("Aluno avaliado com sucesso.");
        } else {
            Prompt.imprimir("Erro ao avaliar aluno.");
        }
    }

    private void verificarSituacaoAluno() {
        String nomeAluno = Prompt.lerLinha("Nome do Aluno: ");

        Aluno aluno = buscarAlunoPorNome(nomeAluno);
        if (aluno == null) {
            Prompt.imprimir("Aluno não encontrado.");
            return;
        }
    
        String situacao = Controle.verificarSituacaoAluno(aluno);
        Prompt.imprimir(String.format("Situação do Aluno: %s", situacao));
    }
    
    private Aluno buscarAlunoPorNome(String nomeAluno) {
        for (Aluno aluno : Controle.getAlunos()) {
            if (aluno.getNome().equalsIgnoreCase(nomeAluno)) {
                return aluno;
            }
        }
        return null; 
    }
}