//Cliente.java
package br.edu.up.modelos;

public abstract class Cliente {
    private String nome;
    private String telefone;
    private String email;
    private Endereco endereco;
    private double vlrMaxCredito;
    private double vlrEmprestado;

    public Cliente(String nome, String telefone, String email, Endereco endereco, double vlrMaxCredito) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.vlrMaxCredito = vlrMaxCredito;
        this.vlrEmprestado = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public double getVlrMaxCredito() {
        return vlrMaxCredito;
    }

    public double getVlrEmprestado() {
        return vlrEmprestado;
    }

    public void emprestar(double valor) throws IllegalArgumentException {
        if (vlrEmprestado + valor <= vlrMaxCredito) {
            vlrEmprestado += valor;
        } else {
            throw new IllegalArgumentException("Valor excede o limite de crédito.");
        }
    }

    public void devolver(double valor) throws IllegalArgumentException {
        if (vlrEmprestado - valor >= 0) {
            vlrEmprestado -= valor;
        } else {
            throw new IllegalArgumentException("Valor de devolução excede o valor emprestado.");
        }
    }

    public double getSaldo() {
        return vlrMaxCredito - vlrEmprestado;
    }

    public abstract String getDados();
}