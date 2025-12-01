package Vendedor_Clientes_Cotizacion_Pagos_Ventas;

import Administrador_Promocion_Vehiculos.Empleado;

public class Vendedor extends Empleado {

    public Vendedor(String dni, String nombre, String apellido, String usuario, String contrasena, String rol) {
        super(dni, nombre, apellido, usuario, contrasena, "Vendedor");
    }
}

    