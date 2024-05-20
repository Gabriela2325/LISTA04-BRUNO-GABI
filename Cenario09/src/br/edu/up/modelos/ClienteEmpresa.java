//ClienteEmpresa.java
package br.edu.up.modelos;

public class ClienteEmpresa extends Cliente {
    private String cnpj;
    private String incsEstadual;
    private int anoFundacao;

    public ClienteEmpresa(String nome, String telefone, String email, Endereco endereco, String cnpj, String incsEstadual, int anoFundacao) {
        super(nome, telefone, email, endereco, 25000);
        this.cnpj = cnpj;
        this.incsEstadual = incsEstadual;
        this.anoFundacao = anoFundacao;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getIncsEstadual() {
        return incsEstadual;
    }

    public void setIncsEstadual(String incsEstadual) {
        this.incsEstadual = incsEstadual;
    }

    public int getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }

    @Override
    public String getDados() {
        return "Cliente Empresa: Nome: " + getNome() + ", CNPJ: " + cnpj + ", Insc. Estadual: " + incsEstadual + ", Telefone: " + getTelefone() + ", Email: " + getEmail() + ", Ano de Fundação: " + anoFundacao;
    }

    @Override
    public String toString() {
        return getDados() + ", Endereço: " + getEndereco();
    }
}