
package proyecto;
import java.time.LocalDate;
import proyecto_01_02_06_10.Vehiculo;
import proyecto_01_02_06_10.Vendedor;

public class Cotizacion {
    
    // ATRIBUTOS
    private String codigo;
    private Cliente cliente;
    private Vendedor vendedor;
    private Vehiculo vehiculo;
    private double precioBase;
    private double descuento;
    private double precioFinal;
    
    // CONSTRUCTOR

    public Cotizacion(String codigo, Cliente cliente, Vendedor vendedor, Vehiculo vehiculo, double precioBase, double descuento, double precioFinal, LocalDate now) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.vehiculo = vehiculo;
        this.precioBase = precioBase;
        this.descuento = descuento;
        this.precioFinal = precioFinal;
    }
    
    // GETTER AND SETTER

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }
    
    // METODOS
    public String obtenerDatos () {
        return """
               ====== COTIZACION ======
               \nCodigo: """ + codigo + 
                "\nliente" + cliente.getNombre() +
                "\nVehciulo: " + vehiculo.getModelo() +
                "\nPrecio Base: " + precioBase +
                "\nDescuento: " + descuento +       
                "\nPrecio Final: " + precioFinal; 
    }
    
    
}
