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
public class ClienteService {
    private ClienteRepositorio repo;

    public ClienteService(ClienteRepositorio repo) {
        this.repo = repo;
    }

    public String crearCliente(String dni, String nombres, String apellidoPaterno,
                               String apellidoMaterno, String direccion,
                               String telefono, String correo) {

        if (repo.buscarPorDni(dni) != null) {
            return "Error: Ya existe un cliente con ese DNI.";
        }

        if (dni.isEmpty() || nombres.isEmpty()) {
            return "Error: DNI y nombre son obligatorios.";
        }

        Cliente nuevo = new Cliente(dni, nombres, apellidoPaterno, apellidoMaterno,
                                    direccion, telefono, correo);

        boolean ok = repo.agregar(nuevo);
        return ok ? "Cliente registrado correctamente."
                  : "Error: repositorio lleno.";
    }

    public Cliente buscarCliente(String dni) {
        return repo.buscarPorDni(dni);
    }

    public String modificarCliente(String dni, String nuevosNombres,
                                   String nuevoApellidoPaterno, String nuevoApellidoMaterno,
                                   String nuevaDireccion, String nuevoTelefono, String nuevoCorreo) {

        Cliente cliente = repo.buscarPorDni(dni);

        if (cliente == null) {
            return "Error: Cliente no encontrado.";
        }

        Cliente actualizado = new Cliente(
                dni, nuevosNombres, nuevoApellidoPaterno, nuevoApellidoMaterno,
                nuevaDireccion, nuevoTelefono, nuevoCorreo
        );

        repo.modificar(dni, actualizado);
        return "Cliente actualizado correctamente.";
    }

    public String eliminarCliente(String dni) {
        boolean eliminado = repo.eliminar(dni);
        return eliminado ? "Cliente eliminado."
                         : "Error: no existe un cliente con ese DNI.";
    }

    public Cliente[] listarClientes() {
        return repo.listar();
    }
}
