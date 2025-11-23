/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_01_02_06_10;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejecutor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner sc = new Scanner(System.in);

        // --- Usuarios iniciales del sistema ---
        Administrador admin1 = new Administrador("111", "Juan", "Pérez", "admin", "1234", "Admin");
        Vendedor vendedor1 = new Vendedor("222", "Luis", "Gómez", "vendedor", "abcd", "Vendedor");

        Empleado[] usuarios = { admin1, vendedor1 };

        // ========== LOGIN ==========
        Empleado usuarioLogueado = null;

        System.out.println("=== LOGIN DEL SISTEMA ===");
        System.out.print("Usuario: ");
        String user = sc.nextLine();
        System.out.print("Contraseña: ");
        String password = sc.nextLine();

        for (Empleado i : usuarios) {
            if (i.login(user, password)) {
                usuarioLogueado = i;
                break;
            }
        }

        if (usuarioLogueado == null) {
            System.out.println("ERROR: Usuario o contraseña incorrectos.");
            return;
        }

        System.out.println("\nBienvenido " + usuarioLogueado.getNombre() + " [" + usuarioLogueado.getRol() + "]");

        // ======================================================
        // ========== MENÚ SEGÚN ROL ============================
        // ======================================================

        if (usuarioLogueado.esAdmin()) {
            menuAdministrador((Administrador) usuarioLogueado);
        } else {
            menuVendedor((Vendedor) usuarioLogueado);
        }
    }

    // ============================================================
    // ====================== MENÚ ADMIN ===========================
    // ============================================================
    public static void menuAdministrador(Administrador admin) {
        Scanner sc = new Scanner(System.in);
        int op;

        do {
            System.out.println("\n=== MENU ADMINISTRADOR ===");
            System.out.println("1. Gestionar Empleados");
            System.out.println("2. Gestionar Vehículos");
            System.out.println("3. Gestionar Promociones");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1 -> menuEmpleados(admin);
                case 2 -> menuVehiculos(admin);
                case 3 -> menuPromociones(admin);
            }
        } while (op != 0);
    }

    // ============================================================
    // ====================== MENU EMPLEADOS =======================
    // ============================================================
    public static void menuEmpleados(Administrador admin) {
        Scanner sc = new Scanner(System.in);
        int op;

        do {
            System.out.println("\n--- GESTIÓN DE EMPLEADOS ---");
            System.out.println("1. Registrar empleado");
            System.out.println("2. Modificar empleado");
            System.out.println("3. Eliminar empleado");
            System.out.println("0. Regresar");
            System.out.print("Opción: ");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1 -> {
                    System.out.print("DNI: ");
                    String dni = sc.nextLine();
                    System.out.print("Nombre: ");
                    String nom = sc.nextLine();
                    System.out.print("Apellido: ");
                    String ape = sc.nextLine();
                    System.out.print("Usuario: ");
                    String usu = sc.nextLine();
                    System.out.print("Contraseña: ");
                    String pass = sc.nextLine();
                    System.out.print("Rol (Admin/Vendedor): ");
                    String rol = sc.nextLine();

                    Empleado nuevo = rol.equalsIgnoreCase("Admin")
                            ? new Administrador(dni, nom, ape, usu, pass, rol)
                            : new Vendedor(dni, nom, ape, usu, pass, rol);

                    admin.agregarEmpleado(nuevo);
                    System.out.println("Empleado registrado.");
                }
                case 2 -> {
                    System.out.print("DNI del empleado a modificar: ");
                    String dni = sc.nextLine();
                    System.out.print("Nuevo nombre: ");
                    String nuevo = sc.nextLine();
                    admin.modificarEmpleado(dni, nuevo);
                }
                case 3 -> {
                    System.out.print("DNI del empleado a eliminar: ");
                    String dni = sc.nextLine();
                    admin.eliminarEmpleado(dni);
                }
            }
        } while (op != 0);
    }

    // ============================================================
    // ===================== MENU VEHÍCULOS ========================
    // ============================================================
    public static void menuVehiculos(Administrador admin) {
        Scanner sc = new Scanner(System.in);
        int op;

        do {
            System.out.println("\n--- GESTIÓN DE VEHÍCULOS ---");
            System.out.println("1. Registrar Vehículo");
            System.out.println("2. Modificar Vehículo");
            System.out.println("3. Eliminar Vehículo");
            System.out.println("0. Regresar");
            System.out.print("Opción: ");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1 -> {
                    System.out.print("Código: ");
                    String cod = sc.nextLine();
                    System.out.print("Marca: ");
                    String marca = sc.nextLine();
                    System.out.print("Modelo: ");
                    String modelo = sc.nextLine();
                    System.out.print("Color: ");
                    String color = sc.nextLine();
                    System.out.print("Año: ");
                    int anio = sc.nextInt(); sc.nextLine();
                    System.out.print("Tipo: ");
                    String tipo = sc.nextLine();
                    System.out.print("Precio: ");
                    double precio = sc.nextDouble(); sc.nextLine();
                    System.out.print("Estado: ");
                    String estado = sc.nextLine();

                    Vehiculo v = new Vehiculo(cod, marca, modelo, color, anio, tipo, precio, estado);
                    admin.agregarVehiculo(v);
                    System.out.println("Vehículo registrado.");
                }

                case 2 -> {
                    System.out.print("Código del vehículo: ");
                    String cod = sc.nextLine();
                    System.out.print("Nuevo modelo: ");
                    String nuevoModelo = sc.nextLine();
                    admin.modificarVehiculo(cod, nuevoModelo);
                }

                case 3 -> {
                    System.out.print("Código del vehículo: ");
                    String cod = sc.nextLine();
                    admin.eliminarVehiculo(cod);
                }
            }
        } while (op != 0);
    }

    // ============================================================
    // ===================== MENU PROMOCIONES ======================
    // ============================================================
    public static void menuPromociones(Administrador admin) {
        Scanner sc = new Scanner(System.in);
        int op;

        do {
            System.out.println("\n--- GESTIÓN DE PROMOCIONES ---");
            System.out.println("1. Registrar promoción");
            System.out.println("2. Modificar promoción");
            System.out.println("3. Eliminar promoción");
            System.out.println("0. Regresar");
            System.out.print("Opción: ");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1 -> {
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Tipo (Porcentaje/Monto): ");
                    String tipo = sc.nextLine();
                    System.out.print("Valor: ");
                    double valor = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Fecha inicio (AAAA-MM-DD): ");
                    LocalDate ini = LocalDate.parse(sc.nextLine());
                    System.out.print("Fecha fin (AAAA-MM-DD): ");
                    LocalDate fin = LocalDate.parse(sc.nextLine());

                    Promocion p = new Promocion(nombre, tipo, valor, ini, fin);
                    admin.agregarPromocion(p);
                    System.out.println("Promoción registrada.");
                }

                case 2 -> {
                    System.out.print("Nombre de la promoción: ");
                    String nombre = sc.nextLine();
                    System.out.print("Nuevo valor: ");
                    double nuevoValor = sc.nextDouble();
                    sc.nextLine();
                    admin.modificarPromocion(nombre, nuevoValor);
                }

                case 3 -> {
                    System.out.print("Nombre de la promoción: ");
                    String nombre = sc.nextLine();
                    admin.eliminarPromocion(nombre);
                }
            }

        } while (op != 0);
    }


    // ============================================================
    // ====================== MENU VENDEDOR ========================
    // ============================================================
    public static void menuVendedor(Vendedor v) {
        System.out.println("\nEl vendedor aún no tiene funciones implementadas en este demo.");
    }
}

  
