// ./viewSeguros.java

package br.edu.up.view;

import br.edu.up.util.*;
import br.edu.up.controle.*;
import br.edu.up.modelos.*;
import java.util.List;

public class ViewSeguros {
    private SeguroController controller;

    public ViewSeguros(SeguroController controller) {
        this.controller = controller;
    }

    public void exibirMenu() {
        int opcao = 0;
        while (opcao != 7) {
            Prompt.separador();
            Prompt.imprimir("MENU");
            Prompt.imprimir("1. Incluir seguro");
            Prompt.imprimir("2. Localizar seguro");
            Prompt.imprimir("3. Excluir seguro");
            Prompt.imprimir("4. Excluir todos os seguros");
            Prompt.imprimir("5. Listar todos os seguros");
            Prompt.imprimir("6. Ver quantidade de seguros");
            Prompt.imprimir("7. Sair");
            Prompt.linhaEmBranco();
            opcao = Prompt.lerInteiro("Escolha uma opção: ");

            switch (opcao) {
                case 1:
                    incluirSeguro();
                    break;
                case 2:
                    localizarSeguro();
                    break;
                case 3:
                    excluirSeguro();
                    break;
                case 4:
                    excluirTodosSeguros();
                    break;
                case 5:
                    listarTodosSeguros();
                    break;
                case 6:
                    verQuantidadeSeguros();
                    break;
                case 7:
                    Prompt.imprimir("Encerrando o programa.");
                    break;
                default:
                    Prompt.imprimir("Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }
        }
    }

    private void incluirSeguro() {

        String tipoSeguro = Prompt.lerLinha("Digite o tipo de seguro (Vida/Veiculo): ");

        if (tipoSeguro.equalsIgnoreCase("Vida")) {
            Seguro seguro = criarSeguroVida();
            controller.incluirSeguro(seguro);
            Prompt.imprimir("Seguro de vida incluído com sucesso.");
        } else if (tipoSeguro.equalsIgnoreCase("Veiculo")) {
            Seguro seguro = criarSeguroVeiculo();
            controller.incluirSeguro(seguro);
            Prompt.imprimir("Seguro de veículo incluído com sucesso.");
        } else {
            Prompt.imprimir("Tipo de seguro inválido.");
        }
    }

    public SeguroVida criarSeguroVida() {
        Prompt.linhaEmBranco();
        Prompt.imprimir("Criando novo Seguro de Vida...");
        
        Prompt.imprimir("Informe o número da apólice:");
        String apolice = Prompt.lerLinha("Número da apólice: ");
        
        if (apolice.isEmpty()) {
            Prompt.imprimir("Número de apólice inválido. Tente novamente.");
            return null;
        }
        
        Prompt.imprimir("Informe o nome do segurado:");
        String nomeSegurado = Prompt.lerLinha("Nome do segurado: ");
        
        Segurado segurado = new Segurado(nomeSegurado, null, null, null, null, null, null, null);
        SeguroVida seguroVida = new SeguroVida(apolice, segurado, 0.0, null, null, false, false); // Ajuste os parâmetros conforme necessário
        
        controller.incluirSeguro(seguroVida);
        
        Prompt.linhaEmBranco();
        Prompt.imprimir("Seguro de Vida criado com sucesso!");
        
        return seguroVida;
    }
    public SeguroVeiculo criarSeguroVeiculo() {
        Prompt.linhaEmBranco();
        Prompt.imprimir("Criando novo Seguro de Veículo...");
        
        Prompt.imprimir("Informe o número da apólice:");
        String apolice = Prompt.lerLinha("Número da apólice: ");
        
        if (apolice.isEmpty()) {
            Prompt.imprimir("Número de apólice inválido. Tente novamente.");
            return null;
        }
        
        Prompt.imprimir("Informe o valor da apólice:");
        double valorApolice = Prompt.lerDecimal("Valor da apólice: ");
        
        Segurado segurado = new Segurado(null, null, null, null, null, null, null, null);
        SeguroVeiculo seguroVeiculo = new SeguroVeiculo(apolice, segurado, valorApolice, null, null, 0.0, false, false); // Ajuste os parâmetros conforme necessário
        
        controller.incluirSeguro(seguroVeiculo);
        
        Prompt.linhaEmBranco();
        Prompt.imprimir("Seguro de Veículo criado com sucesso!");
        
        return seguroVeiculo;
    }

    private void localizarSeguro() {
        String apolice = Prompt.lerLinha("Digite o número da apólice: ");
        Seguro seguro = controller.localizarSeguro(apolice);
        if (seguro != null) {
            Prompt.imprimir("Seguro encontrado:");
            Prompt.imprimir(seguro.getDados());
        } else {
            Prompt.imprimir("Seguro não encontrado.");
        }
    }

    private void excluirSeguro() {
        String apolice = Prompt.lerLinha("Digite o número da apólice do seguro a ser excluído: ");
        controller.excluirSeguro(apolice);
        Prompt.imprimir("Seguro excluído com sucesso.");
    }

    private void excluirTodosSeguros() {
        Prompt.imprimir("Tem certeza que deseja excluir todos os seguros? (S/N)");
        String resposta = Prompt.lerLinha();
        if (resposta.equalsIgnoreCase("S")) {
            controller.excluirTodosSeguros();
            Prompt.imprimir("Todos os seguros foram excluídos.");
        } else {
            Prompt.imprimir("Operação de exclusão cancelada.");
        }
    }

    private void listarTodosSeguros() {
        List<Seguro> seguros = controller.listarTodosSeguros();
        for (Seguro seguro : seguros) {
            Prompt.imprimir(seguro.getDados());
        }
    }

    private void verQuantidadeSeguros() {
        int quantidade = controller.quantidadeSeguros();
        Prompt.imprimir("Quantidade de seguros: " + quantidade);
    }
}