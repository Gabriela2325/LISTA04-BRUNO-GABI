package br.edu.up.modelos;

public class Estacionamento {
    
    private Veiculo[] vagas;

    private int quantidadeVeiculos; 

    public Estacionamento() {

        this.vagas = new Veiculo[10]; 
        this.quantidadeVeiculos = 0; 
    }

    public boolean entrada(Veiculo veiculo) {
        if (quantidadeVeiculos < 10) { 

            vagas[quantidadeVeiculos] = veiculo; 

            quantidadeVeiculos++; 

            return true;
        }
        return false;
    }

    public Veiculo saida(String placa) {
        for (int i = 0; i < quantidadeVeiculos; i++) { 
            if (vagas[i].getPlaca().equals(placa)) {

            Veiculo veiculoSaida = vagas[i]; 
    
            for (int j = i; j < quantidadeVeiculos - 1; j++) {

                vagas[j] = vagas[j + 1];

            }

            vagas[quantidadeVeiculos - 1] = null; 

            quantidadeVeiculos--; 
                
            return veiculoSaida;
        }
    }
        return null;
    }

    public int getTotalVeiculos() {

        return quantidadeVeiculos; 
        
    }

    public double calcularPagamento() {

        return quantidadeVeiculos * 5.0; 

    }
}