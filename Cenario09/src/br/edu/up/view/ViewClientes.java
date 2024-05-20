//ViewClientes.java

package br.edu.up.view;

import java.util.List;
import java.util.Scanner;

import br.edu.up.controle.ClienteController;
import br.edu.up.modelos.*;

public class ViewClientes {
    private ClienteController controller;
    private Scanner scanner;

    public ViewClientes(ClienteController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        while (true) {
            exibirMenu();
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    incluirClientePessoa();
                    break;
                case 2:
                    incluirClienteEmpresa();
                    break;
                case 3:
                    listarClientesPessoa();
                    break;
                case 4:
                    listarClientesEmpresa();
                    break;
                case 5:
                    realizarEmprestimo();
                    break;
                case 6:
                    realizarDevolucao();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private void exibirMenu() {
        System.out.println("1. Incluir Cliente Pessoa");
        System.out.println("2. Incluir Cliente Empresa");
        System.out.println("3. Listar Clientes Pessoa");
        System.out.println("4. Listar Clientes Empresa");
        System.out.println("5. Realizar Empréstimo");
        System.out.println("6. Realizar Devolução");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private void incluirClientePessoa() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Rua: ");
        String rua = scanner.nextLine();
        System.out.print("Número: ");
        String numero = scanner.nextLine();
        System.out.print("Bairro: ");
        String bairro = scanner.nextLine();
        System.out.print("CEP: ");
        String cep = scanner.nextLine();
        System.out.print("Cidade: ");
        String cidadeNome = scanner.nextLine();
        System.out.print("Estado: ");
        String estado = scanner.nextLine();
        System.out.print("CPF: ");
        String CPF = scanner.nextLine();
        System.out.print("Peso: ");
        double peso = scanner.nextDouble();
        System.out.print("Altura: ");
        double altura = scanner.nextDouble();
        scanner.nextLine(); // Consumir a nova linha

        Cidade cidade = new Cidade(cidadeNome, estado);
        Endereco endereco = new Endereco(rua, numero, bairro, cep, cidade);
        ClientePessoa cliente = new ClientePessoa(nome, telefone, email, endereco, CPF, peso, altura);
        controller.incluirCliente(cliente);

        System.out.println("Cliente pessoa incluído com sucesso.");
    }

    private void incluirClienteEmpresa() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Rua: ");
        String rua = scanner.nextLine();
        System.out.print("Número: ");
        String numero = scanner.nextLine();
        System.out.print("Bairro: ");
        String bairro = scanner.nextLine();
        System.out.print("CEP: ");
        String cep = scanner.nextLine();
        System.out.print("Cidade: ");
        String cidadeNome = scanner.nextLine();
        System.out.print("Estado: ");
        String estado = scanner.nextLine();
        System.out.print("CNPJ: ");
        String cnpj = scanner.nextLine();
        System.out.print("Inscrição Estadual: ");
        String incsEstadual = scanner.nextLine();
        System.out.print("Ano de Fundação: ");
        int anoFundacao = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha

        Cidade cidade = new Cidade(cidadeNome, estado);
        Endereco endereco = new Endereco(rua, numero, bairro, cep, cidade);
        ClienteEmpresa cliente = new ClienteEmpresa(nome, telefone, email, endereco, cnpj, incsEstadual, anoFundacao);
        controller.incluirCliente(cliente);

        System.out.println("Cliente empresa incluído com sucesso.");
    }

    private void listarClientesPessoa() {
        List<ClientePessoa> clientes = controller.listarClientesPessoa();
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente pessoa cadastrado.");
        } else {
            for (ClientePessoa cliente : clientes) {
                System.out.println(cliente);
            }
        }
    }

    private void listarClientesEmpresa() {
        List<ClienteEmpresa> clientes = controller.listarClientesEmpresa();
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente empresa cadastrado.");
        } else {
            for (ClienteEmpresa cliente : clientes) {
                System.out.println(cliente);
            }
        }
    }

    private void realizarEmprestimo() {
        try {
            System.out.print("Nome do Cliente: ");
            String nome = scanner.nextLine();
            System.out.print("Valor do Empréstimo: ");
            double valor = scanner.nextDouble();
            scanner.nextLine(); // Consumir a nova linha
            controller.emprestarParaCliente(nome, valor);
            System.out.println("Empréstimo realizado com sucesso.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private void realizarDevolucao() {
        try {
            System.out.print("Nome do Cliente: ");
            String nome = scanner.nextLine();
            System.out.print("Valor da Devolução: ");
            double valor = scanner.nextDouble();
            scanner.nextLine(); // Consumir a nova linha
            controller.devolverParaCliente(nome, valor);
            System.out.println("Devolução realizada com sucesso.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}