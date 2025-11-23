
package pagos;

import proyecto.Venta;


public class PagoDeUna extends Pago {

    public PagoDeUna(String codPago, String metodoPago, double montoAbonado, Venta venta) {
        super(codPago, metodoPago, montoAbonado, venta);
    }

    @Override
    public boolean registarPago() {
        if(montoAbonado < venta.getMontoFinal()){
            System.out.println("¡Monto insuficiente!");
            return false;
        }
        else{
            System.out.println("***Pago procesado exitosamente***");
            return true;
        }
    }

    
    
    @Override
    public double calcularVuelto() {
        double vuelto = montoAbonado - venta.getMontoFinal();
        return vuelto;
    }
    
    @Override
    public void datosDelPago() {
        System.out.println("=====DATOS DEL PAGO=====");
        System.out.println("Codigo de pago: " + codPago);
        System.out.println("Metodo de pago: " + metodoPago);
        System.out.println("Monto abonado: " + montoAbonado);
        System.out.println("Vuelto: " + calcularVuelto());
    }



  
    
}
