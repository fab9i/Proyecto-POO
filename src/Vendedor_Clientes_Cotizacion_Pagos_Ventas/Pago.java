package Vendedor_Clientes_Cotizacion_Pagos_Ventas;

import Vendedor_Clientes_Cotizacion_Pagos_Ventas.Venta;


public abstract class Pago {
    protected String codPago;
    protected String metodoPago;
    protected double montoAbonado;
    protected Venta venta; 
   

  
    
    public Pago(String codPago, String metodoPago, double montoAbonado, Venta venta) {
        this.codPago = codPago;
        this.metodoPago = metodoPago;
        this.montoAbonado = montoAbonado;
        this.venta = venta;

    }
    
    
    
    
    
    

    public String getCodPago() {
        return codPago;
    }

    public void setCodPago(String codPago) {
        this.codPago = codPago;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public double getMontoAbonado() {
        return montoAbonado;
    }

    public void setMontoAbonado(double montoAbonado) {
        this.montoAbonado = montoAbonado;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

   
    

   
    

    
    public abstract boolean registarPago();
    public abstract double calcularVuelto();
    public abstract void datosDelPago();
    
}
