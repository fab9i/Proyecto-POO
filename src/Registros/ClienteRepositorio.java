/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Registros;

import proyecto.Cliente;

/**
 *
 * @author thiag
 */
public class ClienteRepositorio {
     private Cliente[] clientes;
    private int size;

    public ClienteRepositorio(int capacidad) {
        clientes = new Cliente[capacidad];
        size = 0;
    }

    public boolean agregar(Cliente cliente) {
        if (size >= clientes.length) {
            return false;
        }
        clientes[size] = cliente;
        size++;
        return true;
    }

    public Cliente buscarPorDni(String dni) {
        for (int i = 0; i < size; i++) {
            if (clientes[i].getDni().equals(dni)) {
                return clientes[i];
            }
        }
        return null;
    }

    public boolean modificar(String dni, Cliente nuevoCliente) {
        for (int i = 0; i < size; i++) {
            if (clientes[i].getDni().equals(dni)) {
                clientes[i] = nuevoCliente;
                return true;
            }
        }
        return false;
    }

    public boolean eliminar(String dni) {
        for (int i = 0; i < size; i++) {
            if (clientes[i].getDni().equals(dni)) {

                for (int j = i; j < size - 1; j++) {
                    clientes[j] = clientes[j + 1];
                }

                clientes[size - 1] = null;
                size--;
                return true;
            }
        }
        return false;
    }

    public Cliente[] listar() {
        Cliente[] lista = new Cliente[size];

        for (int i = 0; i < size; i++) {
            lista[i] = clientes[i];
        }

        return lista;
    }
}
