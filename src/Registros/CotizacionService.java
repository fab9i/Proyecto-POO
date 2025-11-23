/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Registros;

import proyecto.Cliente;
import proyecto.Cotizacion;
import proyecto_01_02_06_10.Vehiculo;
import proyecto_01_02_06_10.Vendedor;

import java.time.LocalDate;

/**
 *
 * @author thiag
 */
public class CotizacionService {
    private CotizacionRepositorio repo;
    private int contadorCodigo = 1;

    public CotizacionService(CotizacionRepositorio repo) {
        this.repo = repo;
    }

    private String generarCodigo() {
        return "COT-" + String.format("%03d", contadorCodigo++);
    }

    public String crearCotizacion(Cliente cliente, Vendedor vendedor,
                                  Vehiculo vehiculo, double descuento) {

        if (cliente == null) return "Error: cliente no existe.";
        if (vehiculo == null) return "Error: vehículo no existe.";

        if (!vehiculo.getEstado().equalsIgnoreCase("DISPONIBLE")) {
            return "Error: el vehículo no está disponible.";
        }

        double precioBase = vehiculo.getPrecio();
        double precioFinal = Math.max(precioBase - descuento, 0);

        String codigo = generarCodigo();

        Cotizacion cot = new Cotizacion(
                codigo, cliente, vendedor, vehiculo,
                precioBase, descuento, precioFinal, LocalDate.now()
        );

        boolean ok = repo.agregar(cot);
        return ok ? "Cotización creada con código: " + codigo
                  : "Error: no se pudo guardar la cotización.";
    }

    public Cotizacion buscarPorCodigo(String codigo) {
        return repo.buscarPorCodigo(codigo);
    }

    public Cotizacion[] listar() {
        return repo.listar();
    }
}
