
package comprobante;
import java.time.LocalDateTime;
import Vendedor_Clientes_Cotizacion_Pagos_Ventas.Cliente;
import Vendedor_Clientes_Cotizacion_Pagos_Ventas.Cotizacion;
import Administrador_Promocion_Vehiculos.Empleado;
import Administrador_Promocion_Vehiculos.Vehiculo;




public abstract class Comprobante{
    protected Cliente cliente;
    protected Vehiculo vehiculo;
    protected Cotizacion cotizacion;
    protected Empleado vendedor;
    protected LocalDateTime fechaHora;

    public Comprobante(Cliente cliente, Vehiculo vehiculo, Cotizacion cotizacion, Empleado vendedor, LocalDateTime fechaHora) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.cotizacion = cotizacion;
        this.vendedor = vendedor;
        this.fechaHora = fechaHora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

   

    public Cotizacion getCotizacion() {
        return cotizacion;
    }

    public void setCotizacion(Cotizacion cotizacion) {
        this.cotizacion = cotizacion;
    }

    public Empleado getVendedor() {
        return vendedor;
    }

    public void setVendedor(Empleado vendedor) {
        this.vendedor = vendedor;
    }

    

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }
    
    public abstract void generarComprobanteDePago();
        
    
    
    
    
}
