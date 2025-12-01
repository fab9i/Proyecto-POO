
package Gestion_APV;

import Administrador_Promocion_Vehiculos.Vehiculo;

public class GestionVehiculos {
    private Vehiculo[] vehiculos;
    private int totalVehiculos;

    public GestionVehiculos() {
        vehiculos = new Vehiculo[100];
        totalVehiculos = 0;
        
        //lista vehiculos
        registar(new Vehiculo("V001", "Toyota", "Corolla", "Blanco", 2024, "Sedán", 25000.0, "Disponible"));
    registar(new Vehiculo("V002", "Honda", "Civic", "Negro", 2023, "Sedán", 27000.0, "Disponible"));
    registar(new Vehiculo("V003", "Ford", "Mustang", "Rojo", 2024, "Deportivo", 45000.0, "Disponible"));
    registar(new Vehiculo("V004", "Chevrolet", "Camaro", "Amarillo", 2023, "Deportivo", 42000.0, "Vendido"));
    registar(new Vehiculo("V005", "Nissan", "Sentra", "Gris", 2024, "Sedán", 23000.0, "Disponible"));
    registar(new Vehiculo("V006", "Mazda", "CX-5", "Azul", 2023, "SUV", 32000.0, "Disponible"));
    registar(new Vehiculo("V007", "Hyundai", "Tucson", "Verde", 2024, "SUV", 30000.0, "Reservado"));
    registar(new Vehiculo("V008", "Kia", "Sportage", "Plata", 2023, "SUV", 29000.0, "Disponible"));
    registar(new Vehiculo("V009", "Volkswagen", "Jetta", "Blanco", 2024, "Sedán", 26000.0, "Disponible"));
    registar(new Vehiculo("V010", "BMW", "X5", "Negro", 2024, "SUV", 65000.0, "Disponible"));
    registar(new Vehiculo("V011", "Mercedes-Benz", "Clase C", "Plata", 2023, "Sedán", 55000.0, "Vendido"));
    registar(new Vehiculo("V012", "Audi", "A4", "Gris", 2024, "Sedán", 48000.0, "Disponible"));
    registar(new Vehiculo("V013", "Tesla", "Model 3", "Rojo", 2024, "Eléctrico", 52000.0, "Disponible"));
    registar(new Vehiculo("V014", "Porsche", "Cayenne", "Negro", 2023, "SUV", 85000.0, "Disponible"));
    registar(new Vehiculo("V015", "Jeep", "Wrangler", "Verde", 2024, "SUV", 38000.0, "Disponible"));
    registar(new Vehiculo("V016", "RAM", "1500", "Rojo", 2023, "Pick-up", 42000.0, "Disponible"));
    registar(new Vehiculo("V017", "GMC", "Sierra", "Blanco", 2024, "Pick-up", 45000.0, "Reservado"));
    registar(new Vehiculo("V018", "Subaru", "Outback", "Azul", 2023, "SUV", 34000.0, "Disponible"));
    registar(new Vehiculo("V019", "Mitsubishi", "Outlander", "Gris", 2024, "SUV", 31000.0, "Disponible"));
    registar(new Vehiculo("V020", "Lexus", "RX350", "Negro", 2024, "SUV", 58000.0, "Disponible"));
    registar(new Vehiculo("V021", "Acura", "MDX", "Plata", 2023, "SUV", 52000.0, "Vendido"));
    registar(new Vehiculo("V022", "Infiniti", "Q50", "Blanco", 2024, "Sedán", 46000.0, "Disponible"));
    registar(new Vehiculo("V023", "Cadillac", "Escalade", "Negro", 2023, "SUV", 78000.0, "Disponible"));
    registar(new Vehiculo("V024", "Lincoln", "Navigator", "Gris", 2024, "SUV", 75000.0, "Disponible"));
    registar(new Vehiculo("V025", "Volvo", "XC90", "Azul", 2023, "SUV", 62000.0, "Disponible"));
    registar(new Vehiculo("V026", "Land Rover", "Discovery", "Verde", 2024, "SUV", 68000.0, "Reservado"));
    registar(new Vehiculo("V027", "Jaguar", "F-PACE", "Rojo", 2023, "SUV", 64000.0, "Disponible"));
    registar(new Vehiculo("V028", "Alfa Romeo", "Giulia", "Blanco", 2024, "Sedán", 49000.0, "Disponible"));
    registar(new Vehiculo("V029", "Genesis", "G80", "Negro", 2023, "Sedán", 56000.0, "Disponible"));
    registar(new Vehiculo("V030", "Buick", "Enclave", "Plata", 2024, "SUV", 44000.0, "Disponible"));
    registar(new Vehiculo("V031", "Chrysler", "Pacifica", "Gris", 2023, "Minivan", 38000.0, "Disponible"));
    registar(new Vehiculo("V032", "Dodge", "Durango", "Rojo", 2024, "SUV", 41000.0, "Vendido"));
    registar(new Vehiculo("V033", "Fiat", "500", "Amarillo", 2023, "Compacto", 18000.0, "Disponible"));
    registar(new Vehiculo("V034", "Mini", "Cooper", "Azul", 2024, "Compacto", 32000.0, "Disponible"));
    registar(new Vehiculo("V035", "Smart", "Fortwo", "Blanco", 2023, "Compacto", 22000.0, "Disponible"));
    registar(new Vehiculo("V036", "Peugeot", "3008", "Negro", 2024, "SUV", 35000.0, "Disponible"));
    registar(new Vehiculo("V037", "Renault", "Koleos", "Gris", 2023, "SUV", 33000.0, "Disponible"));
    registar(new Vehiculo("V038", "Citroën", "C5", "Plata", 2024, "SUV", 34000.0, "Reservado"));
    registar(new Vehiculo("V039", "Seat", "Ateca", "Rojo", 2023, "SUV", 31000.0, "Disponible"));
    registar(new Vehiculo("V040", "Skoda", "Karoq", "Verde", 2024, "SUV", 30000.0, "Disponible"));
    registar(new Vehiculo("V041", "Suzuki", "Vitara", "Azul", 2023, "SUV", 26000.0, "Disponible"));
    registar(new Vehiculo("V042", "Isuzu", "D-Max", "Blanco", 2024, "Pick-up", 36000.0, "Disponible"));
    registar(new Vehiculo("V043", "Great Wall", "Wingle", "Negro", 2023, "Pick-up", 28000.0, "Disponible"));
    registar(new Vehiculo("V044", "Haval", "H6", "Gris", 2024, "SUV", 32000.0, "Vendido"));
    registar(new Vehiculo("V045", "Chery", "Tiggo 8", "Plata", 2023, "SUV", 29000.0, "Disponible"));
    registar(new Vehiculo("V046", "JAC", "S7", "Rojo", 2024, "SUV", 27000.0, "Disponible"));
    registar(new Vehiculo("V047", "MG", "HS", "Blanco", 2023, "SUV", 30000.0, "Disponible"));
    registar(new Vehiculo("V048", "BYD", "Tang", "Azul", 2024, "Eléctrico", 54000.0, "Disponible"));
    registar(new Vehiculo("V049", "Rivian", "R1T", "Verde", 2023, "Pick-up Eléctrico", 72000.0, "Reservado"));
    registar(new Vehiculo("V050", "Lucid", "Air", "Negro", 2024, "Eléctrico", 95000.0, "Disponible"));
    }
    
    
    
    
    
    
    
    public Vehiculo buscarPorCodigo(String codigo){
        for (int i = 0; i < totalVehiculos; i++) {
            if(vehiculos[i].getCodigo().equalsIgnoreCase(codigo)){
                return vehiculos[i];
            }
            
        }
        return null;
    }
    
    public boolean registar(Vehiculo vehiculo){
        //verificar si esta lleno el arreglo
        if(totalVehiculos == vehiculos.length){
            return false;
        }
        //evitar duplicados
        if(buscarPorCodigo(vehiculo.getCodigo()) != null){
            return false;
            
        }
        //registar
        vehiculos[totalVehiculos] = vehiculo;
        totalVehiculos++;
        return true;
    }
    
    public boolean modificar(Vehiculo vehiculo){
        for (int i = 0; i < totalVehiculos; i++) {
            if(vehiculos[i].getCodigo().equalsIgnoreCase(vehiculo.getCodigo())){
                vehiculos[i].setCodigo(vehiculo.getCodigo());
                vehiculos[i].setMarca(vehiculo.getMarca());
                vehiculos[i].setModelo(vehiculo.getMarca());
                vehiculos[i].setColor(vehiculo.getColor());
                vehiculos[i].setAnioFabricacion(vehiculo.getAnioFabricacion());
                vehiculos[i].setTipo(vehiculo.getTipo());
                vehiculos[i].setPrecio(vehiculo.getPrecio());
                vehiculos[i].setEstado(vehiculo.getEstado());
                return true;           
            }
            
        }
        return false;
    }
    
    public boolean eliminar(String codigo){
        for (int i = 0; i < totalVehiculos; i++) {
            if(vehiculos[i].getCodigo().equalsIgnoreCase(codigo)){
                //correr los elementos una posicion a la izquierda
                for (int j = i; j < totalVehiculos-1; j++) {
                    vehiculos[j] = vehiculos[j+1];    
                }
                //limpiamos el ultimo casillero
                vehiculos[totalVehiculos-1] = null;
                totalVehiculos--;
                
                return true;
            
            }
            
        }
        return false;
    }
    
    public Vehiculo[] obtenerVehiculos(){
        return vehiculos;
    
    }
    
    public int obtenerTotalVehiculos(){
        return totalVehiculos;
    
    }
    
    

}