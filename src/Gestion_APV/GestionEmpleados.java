
package Gestion_APV;

import Administrador_Promocion_Vehiculos.Empleado;


public class GestionEmpleados {
    private Empleado[] empleados;
    private int totalEmpleados;

    public GestionEmpleados() {
        empleados = new Empleado[100];
        totalEmpleados = 0;
        
        //lista empleados
        registar(new Empleado("12345678", "Carlos", "Rodríguez García", "crodriguez", "123456", "Administrador"));
        registar(new Empleado("87654321", "María", "López Martínez", "mlopez", "123456", "Administrador"));
        registar(new Empleado("11111111", "Juan", "Pérez Sánchez", "jperez", "123456", "Vendedor"));
        registar(new Empleado("22222222", "Ana", "García Torres", "agarcia", "123456", "Vendedor"));
        registar(new Empleado("33333333", "Luis", "Martínez Flores", "lmartinez", "123456", "Vendedor"));
        registar(new Empleado("44444444", "Carmen", "Fernández Ruiz", "cfernandez", "123456", "Administrador"));
        registar(new Empleado("55555555", "Pedro", "González Morales", "pgonzalez", "123456", "Vendedor"));
        registar(new Empleado("66666666", "Laura", "Díaz Castro", "ldiaz", "123456", "Vendedor"));
        registar(new Empleado("77777777", "Jorge", "Ramírez Ortiz", "jramirez", "123456", "Vendedor"));
        registar(new Empleado("88888888", "Sofía", "Torres Vargas", "storres", "123456", "Administrador"));
        registar(new Empleado("99999999", "Miguel", "Flores Reyes", "mflores", "123456", "Vendedor"));
        registar(new Empleado("10101010", "Isabella", "Morales Herrera", "imorales", "123456", "Vendedor"));
        registar(new Empleado("20202020", "Diego", "Castro Mendoza", "dcastro", "123456", "Vendedor"));
        registar(new Empleado("30303030", "Valentina", "Ortiz Gutiérrez", "vortiz", "123456", "Administrador"));
        registar(new Empleado("40404040", "Sebastián", "Vargas Silva", "svargas", "123456", "Vendedor"));
        registar(new Empleado("50505050", "Camila", "Reyes Rojas", "creyes", "123456", "Vendedor"));
        registar(new Empleado("60606060", "Mateo", "Herrera Navarro", "mherrera", "123456", "Vendedor"));
        registar(new Empleado("70707070", "Lucía", "Mendoza Paredes", "lmendoza", "123456", "Vendedor"));
        registar(new Empleado("80808080", "Daniel", "Gutiérrez Ríos", "dgutierrez", "123456", "Administrador"));
        registar(new Empleado("90909090", "Emma", "Silva Campos", "esilva", "123456", "Vendedor"));
        registar(new Empleado("12121212", "Nicolás", "Rojas Vega", "nrojas", "123456", "Vendedor"));
        registar(new Empleado("23232323", "Mía", "Navarro Salazar", "mnavarro", "123456", "Vendedor"));
        registar(new Empleado("34343434", "Santiago", "Paredes León", "sparedes", "123456", "Vendedor"));
        registar(new Empleado("45454545", "Victoria", "Ríos Cortés", "vrios", "123456", "Administrador"));
        registar(new Empleado("56565656", "Andrés", "Campos Mejía", "acampos", "123456", "Vendedor"));
        registar(new Empleado("67676767", "Martina", "Vega Peña", "mvega", "123456", "Vendedor"));
        registar(new Empleado("78787878", "Gabriel", "Salazar Medina", "gsalazar", "123456", "Vendedor"));
        registar(new Empleado("89898989", "Antonella", "León Carrillo", "aleon", "123456", "Vendedor"));
        registar(new Empleado("13131313", "Emiliano", "Cortés Ramos", "ecortes", "123456", "Administrador"));
        registar(new Empleado("24242424", "Renata", "Mejía Santana", "rmejia", "123456", "Vendedor"));
        registar(new Empleado("35353535", "Maximiliano", "Peña Aguilar", "mpena", "123456", "Vendedor"));
        registar(new Empleado("46464646", "Catalina", "Medina Domínguez", "cmedina", "123456", "Vendedor"));
        registar(new Empleado("57575757", "Alejandro", "Carrillo Vázquez", "acarrillo", "123456", "Vendedor"));
        registar(new Empleado("68686868", "Julieta", "Ramos Jiménez", "jramos", "123456", "Administrador"));
        registar(new Empleado("79797979", "Joaquín", "Santana Muñoz", "jsantana", "123456", "Vendedor"));
        registar(new Empleado("14141414", "Valeria", "Aguilar Delgado", "vaguilar", "123456", "Vendedor"));
        registar(new Empleado("25252525", "Leonardo", "Domínguez Cruz", "ldominguez", "123456", "Vendedor"));
        registar(new Empleado("36363636", "Emilia", "Vázquez Rivera", "evazquez", "123456", "Vendedor"));
        registar(new Empleado("47474747", "Samuel", "Jiménez Santos", "sjimenez", "123456", "Administrador"));
        registar(new Empleado("58585858", "Amanda", "Muñoz Núñez", "amunoz", "123456", "Vendedor"));
        registar(new Empleado("69696969", "Benjamín", "Delgado Cabrera", "bdelgado", "123456", "Vendedor"));
        registar(new Empleado("15151515", "Regina", "Cruz Fuentes", "rcruz", "123456", "Vendedor"));
        registar(new Empleado("26262626", "Thiago", "Rivera Ramón", "trivera", "123456", "Vendedor"));
        registar(new Empleado("37373737", "Ximena", "Santos Ochoa", "xsantos", "123456", "Administrador"));
        registar(new Empleado("48484848", "Ian", "Núñez Espinoza", "inunez", "123456", "Vendedor"));
        registar(new Empleado("59595959", "Daniela", "Cabrera Ibarra", "dcabrera", "123456", "Vendedor"));
        registar(new Empleado("16161616", "Ángel", "Fuentes Pacheco", "afuentes", "123456", "Vendedor"));
        registar(new Empleado("27272727", "Gabriela", "Ramón Maldonado", "gramon", "123456", "Vendedor"));
        registar(new Empleado("38383838", "David", "Ochoa Estrada", "dochoa", "123456", "Vendedor"));
        registar(new Empleado("49494949", "Paulina", "Espinoza Alvarado", "pespinoza", "123456", "Administrador"));
    }
    
    public Empleado buscarPorDNI(String DNI){
        for (int i = 0; i < totalEmpleados; i++) {
            if(empleados[i].getDni().equalsIgnoreCase(DNI)){
                return empleados[i];
            }
            
        }
        return null;
    }
    
    public boolean registar(Empleado empleado){
        //verificar si esta lleno el arreglo
        if(totalEmpleados == empleados.length){
            return false;
        }
        //evitar duplicados
        if(buscarPorDNI(empleado.getDni()) != null){
            return false;
            
        }
        //registar
        empleados[totalEmpleados] = empleado;
        totalEmpleados++;
        return true;
    }
    
    public boolean modificar(Empleado empleado){
        for (int i = 0; i < totalEmpleados; i++) {
            if(empleados[i].getDni().equalsIgnoreCase(empleado.getDni())){
                empleados[i].setDni(empleado.getDni());
                empleados[i].setNombre(empleado.getNombre());
                empleados[i].setApellido(empleado.getApellido());
                empleados[i].setUsuario(empleado.getUsuario());
                empleados[i].setContrasena(empleado.getContrasena());
                empleados[i].setRol(empleado.getRol());
                return true;           
            }
            
        }
        return false;
    }
    
    public boolean eliminar(String DNI){
        for (int i = 0; i < totalEmpleados; i++) {
            if(empleados[i].getDni().equalsIgnoreCase(DNI)){
                //correr los elementos una posicion a la izquierda
                for (int j = i; j < totalEmpleados-1; j++) {
                    empleados[j] = empleados[j+1];    
                }
                //limpiamos el ultimo casillero
                empleados[totalEmpleados-1] = null;
                totalEmpleados--;
                
                return true;
            
            }
            
        }
        return false;
    }
    
    public Empleado[] obtenerEmpleados(){
        return empleados;
    
    }
    
    public int obtenerTotalEmpleados(){
        return totalEmpleados;
    
    }
    
}
