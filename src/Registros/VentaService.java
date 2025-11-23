
package Registros;

import java.time.LocalDate;
import proyecto.Cotizacion;
import proyecto.Venta;
import proyecto_01_02_06_10.Vehiculo;


public class VentaService {
    
    private VentaRepositorio repoVenta;
    private CotizacionRepositorio repoCot;
    private int contadorCodigo = 1;

    public VentaService(VentaRepositorio repoVenta, CotizacionRepositorio repoCot) {
        this.repoVenta = repoVenta;
        this.repoCot = repoCot;
    }

    private String generarCodigo() {
        return "VEN-" + String.format("%03d", contadorCodigo++);
    }

    public String registrarVenta(String codigoCotizacion) {

        Cotizacion cot = repoCot.buscarPorCodigo(codigoCotizacion);
        if (cot == null) {
            return "Error: la cotización no existe.";
        }

        Vehiculo vehiculo = cot.getVehiculo();

        if (!vehiculo.getEstado().equalsIgnoreCase("DISPONIBLE")) {
            return "Error: el vehículo ya no está disponible.";
        }

        String codigoVenta = generarCodigo();
        Venta venta = new Venta(codigoVenta, cot, LocalDate.now());

        boolean ok = repoVenta.agregar(venta);
        if (!ok) return "Error: no se pudo registrar la venta.";

        vehiculo.setEstado("VENDIDO");
        return "Venta registrada con código: " + codigoVenta;
    }

    public Venta buscarPorCodigo(String codigo) {
        return repoVenta.buscarPorCodigo(codigo);
    }

    public Venta[] listar() {
        return repoVenta.listar();
    }
}
