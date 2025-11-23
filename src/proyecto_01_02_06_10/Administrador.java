/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_01_02_06_10;

/**
 *
 * @author admin
 */
public class Administrador extends Empleado{
    
    public Administrador(String dni, String nombre, String apellido, String usuario, String contrasena, String rol) {
        super(dni, nombre, apellido, usuario, contrasena, "Admin");
    }
    
    Empleado[] empleados = new Empleado[50];
    int cantEmpleados = 0;

    Vehiculo[] vehiculos = new Vehiculo[50];
    int cantVehiculos = 0;

    Promocion[] promociones = new Promocion[50];
    int cantPromociones = 0;

 //EMPLEADO

    public void agregarEmpleado(Empleado agregarEmp) {
        
        
        if (!esAdmin()) { 
            System.out.println("No tienes permisos para agregar empleados.");
            return;
    }

    if (cantEmpleados < empleados.length) {
        empleados[cantEmpleados] = agregarEmp;
        cantEmpleados++;
    }
}


    public void eliminarEmpleado(String dni) {
        
        if (!esAdmin()) { 
            System.out.println("No tienes permisos para eliminar empleados.");
            return;
    }
        
        for (int i = 0; i < cantEmpleados; i++) {
            if (empleados[i].getDni().equals(dni)) {
                empleados[i] = empleados[cantEmpleados - 1]; // mover el último
                empleados[cantEmpleados - 1] = null;
                cantEmpleados--;
                break;
            }
        }
    }

    public void modificarEmpleado(String dni, String nuevoNombre) {
        
        if (!esAdmin()) { 
            System.out.println("No tienes permisos para modificar empleados.");
            return;
    }
        
        for (int i = 0; i < cantEmpleados; i++) {
            if (empleados[i].getDni().equals(dni)) {
                empleados[i].setNombre(nuevoNombre);
                break;
            }
        }
    }

//VEHICULO

    public void agregarVehiculo(Vehiculo v) {
        
        if (!esAdmin()) { 
            System.out.println("No tienes permisos para agregar vehiculo.");
            return;
    }
        
        if (cantVehiculos < vehiculos.length) {
            vehiculos[cantVehiculos] = v;
            cantVehiculos++;
        }
    }

    public void eliminarVehiculo(String cod) {
        
        if (!esAdmin()) { 
            System.out.println("No tienes permisos para eliminar vehiculo.");
            return;
    }
        
        for (int i = 0; i < cantVehiculos; i++) {
            if (vehiculos[i].getCodigo().equals(cod)) {
                vehiculos[i] = vehiculos[cantVehiculos - 1];
                vehiculos[cantVehiculos - 1] = null;
                cantVehiculos--;
                break;
            }
        }
    }

    public void modificarVehiculo(String cod, String nuevoModelo) {
        
        if (!esAdmin()) { 
            System.out.println("No tienes permisos para modificar vehiculo.");
            return;
    }
        
        for (int i = 0; i < cantVehiculos; i++) {
            if (vehiculos[i].getCodigo().equals(cod)) {
                vehiculos[i].setModelo(nuevoModelo);
                break;
            }
        }
    }

//PROMOCION

    public void agregarPromocion(Promocion p) {
        
        if (!esAdmin()) { 
            System.out.println("No tienes permisos para agregar promocion.");
            return;
    }
        
        if (cantPromociones < promociones.length) {
            promociones[cantPromociones] = p;
            cantPromociones++;
        }
    }

    public void eliminarPromocion(String nombre) {
        
        if (!esAdmin()) { 
            System.out.println("No tienes permisos para eliminar promocion.");
            return;
    }
        
        for (int i = 0; i < cantPromociones; i++) {
            if (promociones[i].getNombre().equals(nombre)) {
                promociones[i] = promociones[cantPromociones - 1];
                promociones[cantPromociones - 1] = null;
                cantPromociones--;
                break;
            }
        }
    }

    public void modificarPromocion(String nombre, double nuevoValor) {
        
        if (!esAdmin()) { 
            System.out.println("No tienes permisos para modificar promocion.");
            return;
    }
        
        for (int i = 0; i < cantPromociones; i++) {
            if (promociones[i].getNombre().equals(nombre)) {
                promociones[i].setValor(nuevoValor);
                break;
            }
        }
    }
    
  

  
    
    
    
}


