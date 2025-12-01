
package pagos;

import Vendedor_Clientes_Cotizacion_Pagos_Ventas.Pago;
import Vendedor_Clientes_Cotizacion_Pagos_Ventas.Venta;


public class PagoEnCuotas extends Pago {
    private int numCuotas;
    private double montoPorCuota;
    private int cuotasPagadas;

    public PagoEnCuotas(String codPago, String metodoPago, Venta venta, int numCuotas) {
        super(codPago, metodoPago, 0, venta);
        this.numCuotas = numCuotas;
        this.montoPorCuota = venta.getMontoFinal()/numCuotas;
        this.cuotasPagadas = 0;
    }

    public int getNumCuotas() {
        return numCuotas;
    }

    public void setNumCuotas(int numCuotas) {
        this.numCuotas = numCuotas;
    }

    public double getMontoPorCuota() {
        return montoPorCuota;
    }

    public void setMontoPorCuota(double montoPorCuota) {
        this.montoPorCuota = montoPorCuota;
    }

    public int getCuotasPagadas() {
        return cuotasPagadas;
    }

    public void setCuotasPagadas(int cuotasPagadas) {
        this.cuotasPagadas = cuotasPagadas;
    }
    
    
    
    
    public boolean pagarCuota(double monto){
        if(monto >= montoPorCuota){
            System.out.println("***Cuota pagada exitosamente***");
            cuotasPagadas++;
            montoAbonado += monto; 
            return true;
        }
        else{
            System.out.println("¡Monto insuficiente!");
            return false;
        }
    }

    @Override
    public boolean registarPago() {
        if(cuotasPagadas > 0){
            System.out.println("Pago en cuotas registrado");
            return true;
        }
        else{
            System.out.println("Debe pagar al menos la primera cuota");
            return false;
        }
    }
    
    public double calcularSaldoPendiente(){
        int cuotasFaltantes = numCuotas - cuotasPagadas;
        return cuotasFaltantes*montoPorCuota;
    }

    

    @Override
    public void datosDelPago() {
        System.out.println("=====DATOS DEL PAGO=====");
        System.out.println("Codigo de pago: " + codPago);
        System.out.println("Metodo de pago: " + metodoPago);
        System.out.println("Número de cuotas:" + numCuotas);
        System.out.println("Monto por cuota: " + montoPorCuota);
        System.out.println("Cuotas pagadas: " + cuotasPagadas + "/" + numCuotas);
        System.out.println("Total pagado: " + montoAbonado);
        System.out.println("Saldo pendiente: " + calcularSaldoPendiente());
    }

    @Override
    public double calcularVuelto() {
        return 0.0;
    }
    
}
