
package reportes;

import proyecto_01_02_06_10.Vehiculo;


public class ReporteVehiculos extends reporte {
    private Vehiculo[] vehiculos;
    private int cantVehiculos;

    public ReporteVehiculos(Vehiculo[] vehiculos) {
        this.vehiculos = vehiculos;
        this.cantVehiculos = totalVehiculos();
    }
    
    
    //contar cuantos vehiculos hay realmente
     public int totalVehiculos(){
        int contador = 0;
        for (int i = 0; i < vehiculos.length; i++) {
            if (vehiculos[i] != null) {
                contador++;
            }    
        } 
        return contador;
    }
     
   
     
    @Override
    public void generarRepote() {
        int disponibles = 0;
        int vendidos = 0;
        
        //estado del vehiculo
        for (int i = 0; i < vehiculos.length; i++) {
            if (vehiculos[i] != null) {  
                String estado = vehiculos[i].getEstado();
                if (estado.equalsIgnoreCase("DISPONIBLE")) {
                    disponibles++;
                } 
                else if (estado.equalsIgnoreCase("VENDIDO")) {
                    vendidos++;  
                }
            }
           
        }
        
        System.out.println("==========REPORTE VEHICULOS=========");
        System.out.println("Total de vehiculos: " + totalVehiculos());
        System.out.println("Vehiculos disponibles: " + disponibles);
        System.out.println("Vehiculos vendidos: " + vendidos);
    
    }
    
}
    

    
