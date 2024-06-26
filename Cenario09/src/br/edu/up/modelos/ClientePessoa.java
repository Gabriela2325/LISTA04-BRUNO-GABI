//ClientePessoa.java
package br.edu.up.modelos;

public class ClientePessoa extends Cliente {
    private String CPF;
    private double peso;
    private double altura;

    public ClientePessoa(String nome, String telefone, String email, Endereco endereco, String CPF, double peso, double altura) {
        super(nome, telefone, email, endereco, 10000);
        this.CPF = CPF;
        this.peso = peso;
        this.altura = altura;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String getDados() {
        return "Cliente Pessoa: Nome: " + getNome() + ", CPF: " + CPF + ", Telefone: " + getTelefone() + ", Email: " + getEmail() + ", Peso: " + peso + ", Altura: " + altura;
    }

    @Override
    public String toString() {
        return getDados() + ", Endereço: " + getEndereco();
    }
}