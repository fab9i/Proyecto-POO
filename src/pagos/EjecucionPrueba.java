
package pagos;

import proyecto.*;
import proyecto_01_02_06_10.*;
import Registros.*;
import comprobante.Comprobante;
import comprobante.Factura;
import pagos.*;
import java.time.LocalDate;  
import java.time.LocalDateTime;

public class EjecucionPrueba {

    public static void main(String[] args) {



        
        
       
        // 1. Crear Vendedor
        Vendedor vendedor = new Vendedor(
            "87654321",           // DNI
            "María",              // Nombre
            "López",              // Apellido
            "mlopez",             // Usuario
            "pass123",            // Contraseña
            "Vendedor"            // Rol
        );
        
        // 2. Crear Cliente
        Cliente cliente = new Cliente(
            "12345678",           // DNI
            "Juan",               // Nombre
            "Pérez",              // Apellido Paterno
            "García",             // Apellido Materno
            "Av. Lima 123",       // Dirección
            "987654321",          // Celular
            "juan@email.com"      // Email
        );
        
        // 3. Crear Vehículo
        Vehiculo vehiculo = new Vehiculo(
            "VEH-001",            // Código
            "Toyota",             // Marca
            "Corolla",            // Modelo
            "Blanco",             // Color
            2024,                 // Año fabricación
            "Sedán",              // Tipo
            80000.0,              // Precio
            "DISPONIBLE"          // Estado
        );
        
        // 4. Crear Cotización
        Cotizacion cotizacion = new Cotizacion(
            "COT-001",            // Código
            cliente,              // Cliente
            vendedor,             // Vendedor
            vehiculo,             // Vehículo
            80000.0,              // Precio base
            5000.0,               // Descuento
            75000.0,              // Precio final
            LocalDate.now()       // Fecha
        );
        
        // 5. Crear Venta
        Venta venta = new Venta(
            "VEN-001",            // Código
            cotizacion,           // Cotización
            LocalDate.now()       // Fecha
        );
        
        System.out.println("✓ Datos base creados exitosamente\n");
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Vehículo: " + vehiculo.getMarca() + " " + vehiculo.getModelo());
        System.out.println("Precio final: S/ " + venta.getMontoFinal());
        System.out.println();
        
        // ========================================
        // PRUEBA 1: PAGO AL CONTADO
        // ========================================
        System.out.println("\n╔═══════════════════════════════════════╗");
        System.out.println("║   PRUEBA 1: PAGO AL CONTADO           ║");
        System.out.println("╚═══════════════════════════════════════╝\n");
        
        System.out.println("Creando pago al contado...");
        System.out.println("Cliente paga: S/ 80,000 (hay vuelto)\n");
        
        PagoDeUna pagoContado = new PagoDeUna(
            "PAG-001",            // Código pago
            "EFECTIVO",           // Método
            80000.0,              // Monto (paga de más)
            venta                 // Venta
        );
        
        if (pagoContado.registarPago()) {
            System.out.println();
            pagoContado.datosDelPago();
            System.out.println("\nVUELTO A ENTREGAR: S/ " + pagoContado.calcularVuelto());
        }
        
        // ========================================
        // PRUEBA 2: PAGO EN CUOTAS
        // ========================================
        System.out.println("\n\n╔═══════════════════════════════════════╗");
        System.out.println("║   PRUEBA 2: PAGO EN CUOTAS            ║");
        System.out.println("╚═══════════════════════════════════════╝\n");
        
        System.out.println("Creando pago en 12 cuotas...");
        System.out.println("Monto total: S/ 75,000");
        System.out.println("Cada cuota: S/ 6,250\n");
        
        PagoEnCuotas pagoCuotas = new PagoEnCuotas(
            "PAG-002",            // Código pago
            "TARJETA",            // Método
            venta,                // Venta
            12                    // Número de cuotas
        );
        
        // Intentar registrar sin pagar ninguna cuota (debe fallar)
        System.out.println("--- Intentando registrar sin pagar cuotas ---");
        pagoCuotas.registarPago();
        
        // Pagar primera cuota
        System.out.println("\n--- Pagando primera cuota de S/ 6,250 ---");
        pagoCuotas.pagarCuota(6250.0);
        
        // Pagar segunda cuota
        System.out.println("\n--- Pagando segunda cuota de S/ 6,250 ---");
        pagoCuotas.pagarCuota(6250.0);
        
        // Intentar pagar con monto insuficiente
        System.out.println("\n--- Intentando pagar cuota con S/ 3,000 (insuficiente) ---");
        pagoCuotas.pagarCuota(3000.0);
        
        // Mostrar datos del pago
        System.out.println("\n--- ESTADO ACTUAL DEL PAGO EN CUOTAS ---");
        pagoCuotas.datosDelPago();
        
        // Ahora sí registrar el pago
        System.out.println("\n--- Registrando el pago ---");
        pagoCuotas.registarPago();
        
        Factura factura1 = new Factura(cliente, vehiculo, cotizacion, vendedor,LocalDateTime.now(), "123645" );
        factura1.generarComprobanteDePago();
        
        
    }
    }
        
      
     
        
    


         
    

        



