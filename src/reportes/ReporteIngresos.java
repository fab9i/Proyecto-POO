
package reportes;

import proyecto.Cotizacion;
import proyecto.Venta;

public class ReporteIngresos extends reporte {
    private Venta[] ventas;
    private int cantVentas;
    

    public ReporteIngresos(Venta[] ventas, int cantVendidas) {
        this.ventas = ventas;
        this.cantVentas = cantVentas; 
    }
    
     public int totalVentas(){
        int contador = 0;
        for (int i = 0; i < ventas.length; i++) {
            if (ventas[i] != null) {
                contador++;
            }
        }
        return contador;
    }//no va
    
    

    @Override
    public void generarRepote() {
        double totalIngresos = 0;
        double totalDescuentos = 0;
        
        int contador = 0;//no va
        for (int i = 0; i < ventas.length; i++) {
            if (ventas[i] != null) {
                Venta v = ventas[i];
                Cotizacion cot = v.getCotizacion();
                
                double precioBase = cot.getPrecioBase();
                double descuento = cot.getDescuento();
                double precioFinal = cot.getPrecioFinal();
                
                totalIngresos += precioFinal;
                totalDescuentos += descuento;
                contador++;//no va
                
            }
        }
        System.out.println("=========REPORTE DE INGRESOS Y DESCUENTOS=========");
        System.out.println("Ventas totales: " + cantVentas);
        System.out.println("Ingresos totales " + totalIngresos);
        System.out.println("Descuentos aplicados: " + totalDescuentos);

        
       
    }
    
}
