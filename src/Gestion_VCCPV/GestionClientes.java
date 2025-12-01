/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestion_VCCPV;


import Vendedor_Clientes_Cotizacion_Pagos_Ventas.Cliente;

/**
 *
 * @author thiag
 */
public class GestionClientes {
    private Cliente[] clientes;
    private int totalClientes;

    public GestionClientes() {
        clientes = new Cliente[50];
        totalClientes = 0;
        
        clientes[totalClientes++] = new Cliente("7581479", "Carlos Garry", "Prates Machado", "Av. Pedro Miotta", "936904164", "prates@gmail.com");
        clientes[totalClientes++] = new Cliente("7581480", "Luis Alberto", "Ramírez Soto", "Av. Los Héroes", "945321789", "lramirez@gmail.com");
        clientes[totalClientes++] = new Cliente("7581481", "María Fernanda", "Lopez Rivas", "Jr. Cuzco 123", "987654321", "mfernanda@gmail.com");
        clientes[totalClientes++] = new Cliente("7581482", "Juan Carlos", "Guevara Torres", "Calle Las Flores 450", "912345678", "jcguevara@gmail.com");
        clientes[totalClientes++] = new Cliente("7581483", "Ana Lucía", "Santos Cabrera", "Av. Los Incas 880", "934567812", "analucia@gmail.com");
        clientes[totalClientes++] = new Cliente("7581484", "Pedro Miguel", "Castañeda Ruiz", "Jr. Puno 234", "976543210", "pmcastaneda@gmail.com");
        clientes[totalClientes++] = new Cliente("7581485", "Daniela Sofía", "Navarro Silva", "Calle Grau 102", "913579246", "daniela.ns@gmail.com");
        clientes[totalClientes++] = new Cliente("7581486", "Ricardo Andrés", "Vargas León", "Av. Lima 980", "947258369", "ricardo.v@gmail.com");
        clientes[totalClientes++] = new Cliente("7581487", "Lucero Natalia", "Campos Dueñas", "Av. Revolución 301", "952147863", "lucerocampos@gmail.com");
        clientes[totalClientes++] = new Cliente("7581488", "Diego Armando", "Moreno Castro", "Jr. Carabaya 150", "987123654", "diego.mc@gmail.com");
        clientes[totalClientes++] = new Cliente("7581489", "Valeria", "Fernández Peña", "Av. Primavera 900", "921345987", "valeriafp@gmail.com");
        clientes[totalClientes++] = new Cliente("7581490", "Jorge Luis", "Quispe Huamán", "Calle Mercaderes 77", "956874123", "jquispe@gmail.com");
        clientes[totalClientes++] = new Cliente("7581491", "Andrea", "Sánchez Bravo", "Av. San Borja Sur 540", "987412365", "andreab@gmail.com");
        clientes[totalClientes++] = new Cliente("7581492", "Sergio", "Gómez Llerena", "Jr. Manco Cápac 333", "922467891", "sergiogl@gmail.com");
        clientes[totalClientes++] = new Cliente("7581493", "Carolina", "Reategui Muñoz", "Calle Bolognesi 400", "974512368", "caroreategui@gmail.com");
        clientes[totalClientes++] = new Cliente("7581494", "Alex", "Ramos Córdova", "Av. España 510", "964785321", "alexramos@gmail.com");
        clientes[totalClientes++] = new Cliente("7581495", "Natalia", "Pizarro Vera", "Calle Libertad 222", "987965412", "natpizarro@gmail.com");
        clientes[totalClientes++] = new Cliente("7581496", "Renato", "Salazar Prado", "Av. México 1150", "952369874", "renatos@gmail.com");
        clientes[totalClientes++] = new Cliente("7581497", "Camila", "Ugarte Villanueva", "Av. Arequipa 700", "986321457", "camila.u@gmail.com");
        
        
    }    
        
        
    public Cliente buscarPorDNI(String dni){
        for (int i = 0; i < totalClientes; i++) {
            if(clientes[i].getDni().equalsIgnoreCase(dni)){
                return clientes[i];
            }
            
        }
        return null;
    }
    
    public boolean registar(Cliente cliente){
        //verificar si esta lleno el arreglo
        if(totalClientes == clientes.length){
            return false;
        }
        //evitar duplicados
        if(buscarPorDNI(cliente.getDni()) != null){
            return false;
            
        }
        //registar
        clientes[totalClientes] = cliente;
        totalClientes++;
        return true;
    }
    
    public boolean modificar(Cliente cliente){
        for (int i = 0; i < totalClientes; i++) {
            if(clientes[i].getDni().equalsIgnoreCase(cliente.getDni())){
                clientes[i].setDni(cliente.getDni());
                clientes[i].setNombre(cliente.getNombre());
                clientes[i].setApellido(cliente.getApellido());
                clientes[i].setDireccion(cliente.getDireccion());
                clientes[i].setCelular(cliente.getCelular());
                clientes[i].setCorreoElectronico(cliente.getCorreoElectronico());
                return true;           
            }
            
        }
        return false;
    }
    
    public boolean eliminar(String dni){
        for (int i = 0; i < totalClientes; i++) {
            if(clientes[i].getDni().equalsIgnoreCase(dni)){
                //correr los elementos una posicion a la izquierda
                for (int j = i; j < totalClientes-1; j++) {
                    clientes[j] = clientes[j+1];    
                }
                //limpiamos el ultimo casillero
                clientes[totalClientes-1] = null;
                totalClientes--;
                
                return true;
            
            }
            
        }
        return false;
    }
    
    public Cliente[] obtenerClientes(){
        return clientes;
    
    }
    
    public int obtenerTotalClientes(){
        return totalClientes;
    
    }    
}
