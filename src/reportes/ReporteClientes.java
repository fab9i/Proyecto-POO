package reportes;

import Vendedor_Clientes_Cotizacion_Pagos_Ventas.Venta;
import Vendedor_Clientes_Cotizacion_Pagos_Ventas.Cliente;

public class ReporteClientes extends reporte {
    private Venta[] ventas;
    private int cantVentas;
    
    // ✅ Constructor simplificado
    public ReporteClientes(Venta[] ventas) {
        this.ventas = ventas;
        this.cantVentas = totalVentas();
    }
    
    // ✅ Método para contar ventas NO nulas
    private int totalVentas() {
        int count = 0;
        for (int i = 0; i < ventas.length; i++) {
            if (ventas[i] != null) {
                count++;
            }
        }
        return count;
    }
    

    @Override
    public void generarRepote() {
        String[] dnis = new String[cantVentas];
        String[] nombres = new String[cantVentas];
        int[] compras = new int[cantVentas];
        double[] montos = new double[cantVentas];
        int clientesUnicos = 0;
        
        for (int i = 0; i < ventas.length; i++) { //extraer cliente y dni
            if (ventas[i] != null) {
                Cliente cliente = ventas[i].getCliente();
                String dni = cliente.getDni(); 
                
                // Buscar si el cliente ya existe
                int indice = -1;
                for (int j = 0; j < clientesUnicos; j++) {
                    if (dnis[j].equals(dni)) {
                        indice = j;
                        break;
                    }
                }
                
                if (indice != -1) {
                    // Cliente existente
                    compras[indice]++;
                    montos[indice] += ventas[i].getMontoFinal();
                }
            }
        }
        
        for (int i = 0; i < clientesUnicos - 1; i++) {
            for (int j = 0; j < clientesUnicos - i - 1; j++) {
                if (compras[j] < compras[j + 1]) {
                    // Intercambiar
                    int tempCompras = compras[j];
                    compras[j] = compras[j + 1];
                    compras[j + 1] = tempCompras;
                    
                    String tempDni = dnis[j];
                    dnis[j] = dnis[j + 1];
                    dnis[j + 1] = tempDni;
                    
                    String tempNombre = nombres[j];
                    nombres[j] = nombres[j + 1];
                    nombres[j + 1] = tempNombre;
                    
                    double tempMonto = montos[j];
                    montos[j] = montos[j + 1];
                    montos[j + 1] = tempMonto;
                }
            }
        }
        System.out.println("\n═══════════ TOP CLIENTES ═══════════");
        
        int topMostrar = Math.min(10, clientesUnicos); // Mostrar top 10
        
        for (int i = 0; i < topMostrar; i++) {
            System.out.println("───────────────────────────────────────");
            System.out.println("Top #" + (i + 1));
            System.out.println("DNI:            " + dnis[i]);
            System.out.println("Cliente:        " + nombres[i]);
            System.out.println("Compras:        " + compras[i]);
            System.out.println("Total gastado:  S/ " + String.format("%.2f", montos[i]));
            System.out.println("Promedio:       S/ " + String.format("%.2f", montos[i] / compras[i]));
        }
        
    }
}