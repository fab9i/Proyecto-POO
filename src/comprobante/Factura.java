
package comprobante;

import java.time.LocalDateTime;
import Vendedor_Clientes_Cotizacion_Pagos_Ventas.Cliente;
import Vendedor_Clientes_Cotizacion_Pagos_Ventas.Cotizacion;
import Administrador_Promocion_Vehiculos.Empleado;
import Administrador_Promocion_Vehiculos.Vehiculo;


public class Factura extends Comprobante {
    private double subTotal;
    private double IGV;
    private double totalConIGV;
    private String RUC;

    public Factura(Cliente cliente, Vehiculo vehiculo, Cotizacion cotizacion, Empleado vendedor, LocalDateTime fechaHora, String RUC) {
        super(cliente, vehiculo, cotizacion, vendedor, fechaHora);
        this.subTotal = cotizacion.getPrecioFinal()/1.18;
        this.IGV = subTotal*0.18;
        this.totalConIGV = subTotal + IGV;
        this.RUC = RUC;
    }
    
    
    @Override
    public void generarComprobanteDePago(){
        System.out.println("==========FACTURA==========");
        System.out.println("========Datos del cliente========");
        System.out.println("RUC: " + RUC);
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Apellido paterno: " + cliente.getApellido());
        System.out.println("Direccion: " + cliente.getDireccion());
        System.out.println("Celular: " + cliente.getCelular());
        System.out.println("Correo electronico: " + cliente.getCorreoElectronico());
        System.out.println("");
        System.out.println("========Detalles del vehiculo vendido=======");
        System.out.println("Codigo del vehiculo: " + vehiculo.getCodigo());
        System.out.println("Marca: " + vehiculo.getMarca());
        System.out.println("Modelo: " + vehiculo.getModelo());
        System.out.println("Color: " + vehiculo.getColor());
        System.out.println("Año de fabricación: " + vehiculo.getAnioFabricacion());
        System.out.println("");
        System.out.println("========Detalles monetarios========");
        System.out.println("Precio base: " + vehiculo.getPrecio());
        System.out.println("Descuento: " + cotizacion.getDescuento());
        System.out.println("SubTotal: " + subTotal);
        System.out.println("IGV: " + IGV );
        System.out.println("Total pagado: " + totalConIGV);
        System.out.println("");
        System.out.println("========Detalles del vendedor=======");
        System.out.println("DNI: " + vendedor.getDni());
        System.out.println("Nombre: " + vendedor.getNombre());
        System.out.println("Apellidos: " + vendedor.getApellido());
        System.out.println("");
        System.out.println("========Fecha y hora=======");
        System.out.println("Fecha y hora: " + fechaHora);
    }
    
}
