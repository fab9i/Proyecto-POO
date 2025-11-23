
package proyecto;


public class Cliente {
    
    // ATRIBUTOS
    
    private String dni, nombre, apellidoPaterno, apellidoMaterno, direccion, celular,
                   correoElectronico;
    
    // CONSTRUCTOR

    public Cliente(String dni, String nombre, String apellidoPaterno, String apellidoMaterno, String direccion, String celular, String correoElectronico) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
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

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
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

    public String obtenerInformacion() {
        return "Dni: " + dni +
                "\nNombre: " + nombre +
                "\nApellido: " + apellidoPaterno + " " + apellidoMaterno;
                
    }            
}
