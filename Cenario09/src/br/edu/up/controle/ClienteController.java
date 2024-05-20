//ClienteController.java

package br.edu.up.controle;

import java.util.ArrayList;
import java.util.List;
import br.edu.up.modelos.*;

public class ClienteController {
    private List<Cliente> clientes;

    public ClienteController() {
        clientes = new ArrayList<>();
    }

    public void incluirCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public Cliente localizarCliente(String nome) {
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equals(nome)) {
                return cliente;
            }
        }
        return null;
    }

    public List<ClientePessoa> listarClientesPessoa() {
        List<ClientePessoa> clientesPessoa = new ArrayList<>();
        for (Cliente cliente : clientes) {
            if (cliente instanceof ClientePessoa) {
                clientesPessoa.add((ClientePessoa) cliente);
            }
        }
        return clientesPessoa;
    }

    public List<ClienteEmpresa> listarClientesEmpresa() {
        List<ClienteEmpresa> clientesEmpresa = new ArrayList<>();
        for (Cliente cliente : clientes) {
            if (cliente instanceof ClienteEmpresa) {
                clientesEmpresa.add((ClienteEmpresa) cliente);
            }
        }
        return clientesEmpresa;
    }

    public void emprestarParaCliente(String nome, double valor) throws IllegalArgumentException {
        Cliente cliente = localizarCliente(nome);
        if (cliente != null) {
            cliente.emprestar(valor);
        } else {
            throw new IllegalArgumentException("Cliente não encontrado.");
        }
    }

    public void devolverParaCliente(String nome, double valor) throws IllegalArgumentException {
        Cliente cliente = localizarCliente(nome);
        if (cliente != null) {
            cliente.devolver(valor);
        } else {
            throw new IllegalArgumentException("Cliente não encontrado.");
        }
    }
}