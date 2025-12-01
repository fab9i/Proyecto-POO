/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionEmpleado;

import Administrador_Promocion_Vehiculos.Administrador;
import Administrador_Promocion_Vehiculos.Empleado;
import Vendedor_Clientes_Cotizacion_Pagos_Ventas.Vendedor;

/**
 *
 * @author admin
 */
public class GestionEmpleadoLogin {

    private Empleado[] empleados;
    private int total;

    public GestionEmpleadoLogin() {

        empleados = new Empleado[50];
        total = 0;

        // Usuarios cualquiera, rol definido en constructor
        empleados[total++] = new Administrador("12345678", "Carlos", "Rodríguez García", "crodriguez", "123456", "Administrador");
        empleados[total++] = new Administrador("87654321", "María", "López Martínez", "mlopez", "123456", "Administrador");
        empleados[total++] = new Vendedor("11111111", "Juan", "Pérez Sánchez", "jperez", "123456", "Vendedor");
        empleados[total++] = new Vendedor("22222222", "Ana", "García Torres", "agarcia", "123456", "Vendedor");
        empleados[total++] = new Vendedor("33333333", "Luis", "Martínez Flores", "lmartinez", "123456", "Vendedor");
        empleados[total++] = new Administrador("44444444", "Carmen", "Fernández Ruiz", "cfernandez", "123456", "Administrador");
        empleados[total++] = new Vendedor("55555555", "Pedro", "González Morales", "pgonzalez", "123456", "Vendedor");
        empleados[total++] = new Vendedor("66666666", "Laura", "Díaz Castro", "ldiaz", "123456", "Vendedor");
        empleados[total++] = new Vendedor("77777777", "Jorge", "Ramírez Ortiz", "jramirez", "123456", "Vendedor");
        empleados[total++] = new Administrador("88888888", "Sofía", "Torres Vargas", "storres", "123456", "Administrador");
        empleados[total++] = new Vendedor("99999999", "Miguel", "Flores Reyes", "mflores", "123456", "Vendedor");
        empleados[total++] = new Vendedor("10101010", "Isabella", "Morales Herrera", "imorales", "123456", "Vendedor");
        empleados[total++] = new Vendedor("20202020", "Diego", "Castro Mendoza", "dcastro", "123456", "Vendedor");
        empleados[total++] = new Vendedor("30303030", "Valentina", "Ortiz Gutiérrez", "vortiz", "123456", "Vendedor");
        empleados[total++] = new Vendedor("40404040", "Sebastián", "Vargas Silva", "svargas", "123456", "Vendedor");
        empleados[total++] = new Vendedor("50505050", "Camila", "Reyes Rojas", "creyes", "123456", "Vendedor");
        empleados[total++] = new Vendedor("60606060", "Mateo", "Herrera Navarro", "mherrera", "123456", "Vendedor");
        empleados[total++] = new Vendedor("70707070", "Lucía", "Mendoza Paredes", "lmendoza", "123456", "Vendedor");
        empleados[total++] = new Administrador("80808080", "Daniel", "Gutiérrez Ríos", "dgutierrez", "123456", "Administrador");
        empleados[total++] = new Vendedor("90909090", "Emma", "Silva Campos", "esilva", "123456", "Vendedor");
        empleados[total++] = new Vendedor("12121212", "Nicolás", "Rojas Vega", "nrojas", "123456", "Vendedor");
        empleados[total++] = new Vendedor("23232323", "Mía", "Navarro Salazar", "mnavarro", "123456", "Vendedor");
        empleados[total++] = new Vendedor("34343434", "Santiago", "Paredes León", "sparedes", "123456", "Vendedor");
        empleados[total++] = new Administrador("45454545", "Victoria", "Ríos Cortés", "vrios", "123456", "Administrador");
        empleados[total++] = new Vendedor("56565656", "Andrés", "Campos Mejía", "acampos", "123456", "Vendedor");
        empleados[total++] = new Vendedor("67676767", "Martina", "Vega Peña", "mvega", "123456", "Vendedor");
        empleados[total++] = new Vendedor("78787878", "Gabriel", "Salazar Medina", "gsalazar", "123456", "Vendedor");
        empleados[total++] = new Vendedor("89898989", "Antonella", "León Carrillo", "aleon", "123456", "Vendedor");
        empleados[total++] = new Administrador("13131313", "Emiliano", "Cortés Ramos", "ecortes", "123456", "Administrador");
        empleados[total++] = new Vendedor("24242424", "Renata", "Mejía Santana", "rmejia", "123456", "Vendedor");
        empleados[total++] = new Vendedor("35353535", "Maximiliano", "Peña Aguilar", "mpena", "123456", "Vendedor");
        empleados[total++] = new Vendedor("46464646", "Catalina", "Medina Domínguez", "cmedina", "123456", "Vendedor");
        empleados[total++] = new Vendedor("57575757", "Alejandro", "Carrillo Vázquez", "acarrillo", "123456", "Vendedor");
        empleados[total++] = new Administrador("68686868", "Julieta", "Ramos Jiménez", "jramos", "123456", "Administrador");
        empleados[total++] = new Vendedor("79797979", "Joaquín", "Santana Muñoz", "jsantana", "123456", "Vendedor");
        empleados[total++] = new Vendedor("14141414", "Valeria", "Aguilar Delgado", "vaguilar", "123456", "Vendedor");
        empleados[total++] = new Vendedor("25252525", "Leonardo", "Domínguez Cruz", "ldominguez", "123456", "Vendedor");
        empleados[total++] = new Vendedor("36363636", "Emilia", "Vázquez Rivera", "evazquez", "123456", "Vendedor");
        empleados[total++] = new Administrador("47474747", "Samuel", "Jiménez Santos", "sjimenez", "123456", "Administrador");
        empleados[total++] = new Vendedor("58585858", "Amanda", "Muñoz Núñez", "amunoz", "123456", "Vendedor");
        empleados[total++] = new Vendedor("69696969", "Benjamín", "Delgado Cabrera", "bdelgado", "123456", "Vendedor");
        empleados[total++] = new Vendedor("15151515", "Regina", "Cruz Fuentes", "rcruz", "123456", "Vendedor");
        empleados[total++] = new Vendedor("26262626", "Thiago", "Rivera Ramón", "trivera", "123456", "Vendedor");
        empleados[total++] = new Administrador("37373737", "Ximena", "Santos Ochoa", "xsantos", "123456", "Administrador");
        empleados[total++] = new Vendedor("48484848", "Ian", "Núñez Espinoza", "inunez", "123456", "Vendedor");
        empleados[total++] = new Vendedor("59595959", "Daniela", "Cabrera Ibarra", "dcabrera", "123456", "Vendedor");
        empleados[total++] = new Vendedor("16161616", "Ángel", "Fuentes Pacheco", "afuentes", "123456", "Vendedor");
        empleados[total++] = new Vendedor("27272727", "Gabriela", "Ramón Maldonado", "gramon", "123456", "Vendedor");
        empleados[total++] = new Vendedor("38383838", "David", "Ochoa Estrada", "dochoa", "123456", "Vendedor");
        empleados[total++] = new Administrador("49494949", "Paulina", "Espinoza Alvarado", "pespinoza", "123456", "Administrador");

    }

    public Empleado buscarUsuario(String usuario) {
        for (int i = 0; i < total; i++) {
            if (empleados[i].getUsuario().equalsIgnoreCase(usuario)) {
                return empleados[i];
            }
        }
        return null;
    }
}
