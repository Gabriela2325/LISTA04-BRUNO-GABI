package br.edu.up.modelos;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nome;
    private String identificador;
    private String curriculo;
    private List<Competencia> competencias;
    private Professor professor;
    private List<Aluno> alunos;

    public Disciplina(String nome, String identificador, String curriculo, Professor professor) {
        this.nome = nome;
        this.identificador = identificador;
        this.curriculo = curriculo;
        this.professor = professor;
        this.competencias = new ArrayList<>();
        this.alunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getCurriculo() {
        return curriculo;
    }

    public void setCurriculo(String curriculo) {
        this.curriculo = curriculo;
    }

    public List<Competencia> getCompetencias() {
        return competencias;
    }

    public void addCompetencia(Competencia competencia) {
        this.competencias.add(competencia);
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void addAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public String avaliarAluno(Aluno aluno) {
        int totalNecessarias = 0;
        int atingidasNecessarias = 0;
        int totalComplementares = 0;
        int atingidasComplementares = 0;

        for (Competencia comp : competencias) {
            if (comp.getTipo() == Competencia.Tipo.NECESSARIA) {
                totalNecessarias++;
                if (comp.getSituacao() == Competencia.Situacao.ATINGIDA) {
                    atingidasNecessarias++;
                }
            } else {
                totalComplementares++;
                if (comp.getSituacao() == Competencia.Situacao.ATINGIDA) {
                    atingidasComplementares++;
                }
            }
        }

        if (atingidasNecessarias == totalNecessarias && atingidasComplementares >= totalComplementares / 2) {
            return "Aprovado";
        } else if (atingidasNecessarias < totalNecessarias / 2 || atingidasComplementares < totalComplementares / 2) {
            return "Reprovado";
        } else {
            return "Pendente";
        }
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Identificador: " + identificador +
                ", Currículo: " + curriculo + ", Professor: " + professor.getNome();
    }
}