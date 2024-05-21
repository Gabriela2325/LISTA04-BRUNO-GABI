package br.edu.up.controle;

import java.util.HashSet;
import java.util.Set;

import br.edu.up.modelos.Aluno;
import br.edu.up.modelos.Disciplina;
import br.edu.up.util.Prompt;

public class ControleAcademico {
    private Set<Aluno> alunos;
    private Set<Disciplina> disciplinas;

    public ControleAcademico() {
        alunos = new HashSet<>();
        disciplinas = new HashSet<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public boolean matricularAluno(Aluno aluno, Disciplina disciplina) {
        if (!disciplinas.contains(disciplina) || !alunos.contains(aluno)) {
            return false;
        }
        disciplina.getAlunos().add(aluno);
        return true;
    }

    public void avaliarAluno() {
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

        boolean sucesso = avaliarAluno(aluno, disciplina, competencias);
        if (sucesso) {
            Prompt.imprimir("Aluno avaliado com sucesso.");
        } else {
            Prompt.imprimir("Erro ao avaliar aluno.");
        }
    }

    public void verificarSituacaoAluno() {
        String nomeAluno = Prompt.lerLinha("Nome do Aluno: ");
        Aluno aluno = buscarAlunoPorNome(nomeAluno);
        if (aluno == null) {
            Prompt.imprimir("Aluno não encontrado.");
            return;
        }

        String situacao = verificarSituacaoAluno(aluno);
        Prompt.imprimir(String.format("Situação do Aluno: %s", situacao));
    }

    // Métodos auxiliares para buscar aluno por nome e verificar situação do aluno
    private Aluno buscarAlunoPorNome(String nome) {
        // Implementação para buscar o aluno por nome
        return null; // A implementação real depende da sua lógica de busca
    }

    private Disciplina buscarDisciplinaPorNome(String nome) {
        // Implementação para buscar a disciplina por nome
        return null; // A implementação real depende da sua lógica de busca
    }

    private boolean[] obterCompetenciasDoAluno(Aluno aluno, Disciplina disciplina) {
        // Implementação para obter competências do aluno em uma disciplina
        return null; // A implementação real depende da sua lógica de avaliação
    }

    private boolean avaliarAluno(Aluno aluno, Disciplina disciplina, boolean[] competencias) {
        // Implementação para avaliar o aluno em uma disciplina com base em suas competências
        return true; // A implementação real depende da sua lógica de avaliação
    }

    private String verificarSituacaoAluno(Aluno aluno) {
        // Implementação para verificar a situação do aluno
        return ""; // A implementação real depende da sua lógica de verificação de situação
    }
}