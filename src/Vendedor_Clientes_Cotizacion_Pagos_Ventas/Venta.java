
package Vendedor_Clientes_Cotizacion_Pagos_Ventas;
import java.time.LocalDate;
import Administrador_Promocion_Vehiculos.Vehiculo;

public class Venta {
    
    // ATRIBUTOS
    private String codigo;      
    private Cotizacion cotizacion;
    private Cliente cliente;
    private Vendedor vendedor;
    private Vehiculo vehiculo;
    private double montoFinal;
    private LocalDate fechaVenta;
    
    // CONSTRUCTOR
    public Venta(String codigo, Cotizacion cotizacion, LocalDate fechaVenta) {
        this.codigo = codigo;
        this.cotizacion = cotizacion;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.vehiculo = vehiculo;
        this.montoFinal = montoFinal;
        this.fechaVenta = fechaVenta;
    }
    
    // GETTER AND SETTER

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Cotizacion getCotizacion() {
        return cotizacion;
    }

    public void setCotizacion(Cotizacion cotizacion) {
        this.cotizacion = cotizacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public double getMontoFinal() {
        return montoFinal;
    }

    public void setMontoFinal(double montoFinal) {
        this.montoFinal = montoFinal;
    }

    public LocalDate getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(LocalDate fechaVenta) {
        this.fechaVenta = fechaVenta;
    }
    
    // METODO
    public String obtenerVenta (){
        return """
                ===== VENTA REALIZA ======
               Codigo: """ + codigo +
                "\nCliente: " + cliente.getNombre() +
                "\nVehiculo: " + vehiculo.getModelo() + 
                "\nMonto Final: " +montoFinal ;
        
    }
    
}
