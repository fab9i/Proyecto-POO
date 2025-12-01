
package Vendedor_Clientes_Cotizacion_Pagos_Ventas;


public class Cliente {
    
    // ATRIBUTOS
    
    private String dni, nombre, apellido, direccion, celular,
                   correoElectronico;
    
    // CONSTRUCTOR

    public Cliente(String dni, String nombre, String apellido, String direccion, String celular, String correoElectronico) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido= apellido;
        this.direccion = direccion;
        this.celular = celular;
        this.correoElectronico = correoElectronico;
    }
    
    // GETTER AND SETTER

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    
    // METODOS           
}
