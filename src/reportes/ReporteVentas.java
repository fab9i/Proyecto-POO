
package reportes;

import java.time.LocalDate;
import Vendedor_Clientes_Cotizacion_Pagos_Ventas.Venta;


public class ReporteVentas extends reporte{
    private Venta[] ventas;
    private int cantVentas;

    public ReporteVentas(Venta[] ventas, int cantVentas) {
        this.ventas = ventas;
        this.cantVentas = totalVentas();
    }
    
    public int totalVentas(){
        int contador = 0;
        for (int i = 0; i < ventas.length; i++) {
            if (ventas[i] != null) {
                contador++;
            }
        }
        return contador;
    
    }

    @Override
    public void generarRepote() {
        for (int i = 0; i < ventas.length; i++) {
            if (ventas[i] != null) {
                Venta v =ventas[i];
                
                
                
                System.out.println("==========REPORTE VENTAS=========");
                System.out.println("Total de ventas: " + cantVentas);
            }
                
            }
        }
    
    public void reportePorVendedor(String nombreVendedor){
        System.out.println("=========VENTAS POR VENDEDOR==========");
        System.out.println("vendedor: " + nombreVendedor);
        
        int totalVentasVendedor = 0;
        double montoTotalVendedor = 0;
        for (int i = 0; i<ventas.length; i++){
            if(ventas[i] != null){
                Venta v = ventas[i];
                String nombre = v.getVendedor().getNombre();
                if(nombre.contains(nombreVendedor)){ //verificar que el nombre del vendedor exista
                    System.out.println("Código: " + v.getCodigo());
                    System.out.println("Fecha: " + v.getFechaVenta());
                    System.out.println("Cliente: " + v.getCliente().getNombre());
                    System.out.println("Vehículo: " + v.getVehiculo().getMarca() + " " + v.getVehiculo().getModelo());
                    System.out.println("Monto: S/ " + String.format("%.2f", v.getMontoFinal()));
                    
                    totalVentasVendedor++;
                    montoTotalVendedor += v.getMontoFinal();
                }
            
            }
        }
        System.out.println("********Resumen********");
        System.out.println("Ventas realizadas: "+ totalVentasVendedor);
        System.out.println("Total vendido: " + montoTotalVendedor);
    }
    
    public void reportePorFechas(LocalDate fechaInicio, LocalDate fechaFin){
        System.out.println("==========REPORTE DE VENTAS POR FECHA===========");
        System.out.println("Desde: " + fechaInicio);
        System.out.println("Hasta: " + fechaFin);
        
        int totalVentasFecha = 0;
        double montoTotalFecha = 0;
        for( int i = 0; i<ventas.length; i++){
            if(ventas[i] != null){
                Venta v = ventas[i];
                LocalDate fechaVenta = v.getFechaVenta();
                
                if((fechaVenta.equals(fechaInicio) || fechaVenta.isAfter(fechaInicio)) && (fechaVenta.equals(fechaFin) || fechaVenta.isBefore(fechaFin))){
                    System.out.println("Código: " + v.getCodigo());
                    System.out.println("Fecha: " + v.getFechaVenta());
                    System.out.println("Cliente: " + v.getCliente().getNombre());
                    System.out.println("Vehículo: " + v.getVehiculo().getMarca() + " " + v.getVehiculo().getModelo());
                    System.out.println("Vendedor: " +  v.getVendedor().getNombre() + " " + v.getVendedor().getApellido());
                    System.out.println("Monto: S/ " + String.format("%.2f", v.getMontoFinal()));
                    
                    
                    totalVentasFecha++;
                    montoTotalFecha += v.getMontoFinal();
                    
                }
            }
        
        }
        System.out.println("********Resumen********");
        System.out.println("Ventas: "+ totalVentasFecha);
        System.out.println("Total vendido: " + montoTotalFecha);
    
    }
    
    
    
    
    
}
