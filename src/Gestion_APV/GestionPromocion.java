package Gestion_APV;

import Administrador_Promocion_Vehiculos.Promocion;
import java.time.LocalDate;

public class GestionPromocion {
    private Promocion[] promociones;
    private int totalPromociones;

    public GestionPromocion() {
        promociones = new Promocion[100];
        totalPromociones = 0;
        
        //lista promos
    registar(new Promocion("Descuento Año Nuevo", "Porcentaje", 15.0, LocalDate.of(2025, 1, 1), LocalDate.of(2025, 1, 31)));
    registar(new Promocion("Rebaja San Valentín", "Porcentaje", 10.0, LocalDate.of(2025, 2, 10), LocalDate.of(2025, 2, 14)));
    registar(new Promocion("Oferta Carnaval", "Monto", 3000.0, LocalDate.of(2025, 2, 20), LocalDate.of(2025, 3, 5)));
    registar(new Promocion("Promoción Día de la Mujer", "Porcentaje", 12.0, LocalDate.of(2025, 3, 1), LocalDate.of(2025, 3, 8)));
    registar(new Promocion("Descuento Primavera", "Porcentaje", 8.0, LocalDate.of(2025, 3, 21), LocalDate.of(2025, 4, 21)));
    registar(new Promocion("Super Oferta Abril", "Monto", 4500.0, LocalDate.of(2025, 4, 1), LocalDate.of(2025, 4, 30)));
    registar(new Promocion("Día del Trabajo", "Porcentaje", 18.0, LocalDate.of(2025, 4, 28), LocalDate.of(2025, 5, 2)));
    registar(new Promocion("Especial Día de la Madre", "Porcentaje", 20.0, LocalDate.of(2025, 5, 5), LocalDate.of(2025, 5, 11)));
    registar(new Promocion("Promoción Verano", "Porcentaje", 14.0, LocalDate.of(2025, 5, 15), LocalDate.of(2025, 6, 15)));
    registar(new Promocion("Descuento Día del Padre", "Porcentaje", 16.0, LocalDate.of(2025, 6, 10), LocalDate.of(2025, 6, 16)));
    registar(new Promocion("Mega Sale Junio", "Monto", 5000.0, LocalDate.of(2025, 6, 20), LocalDate.of(2025, 6, 30)));
    registar(new Promocion("Fiestas Patrias", "Porcentaje", 25.0, LocalDate.of(2025, 7, 20), LocalDate.of(2025, 7, 31)));
    registar(new Promocion("Promoción Mitad de Año", "Porcentaje", 22.0, LocalDate.of(2025, 7, 1), LocalDate.of(2025, 7, 15)));
    registar(new Promocion("Descuento Agosto", "Monto", 3500.0, LocalDate.of(2025, 8, 1), LocalDate.of(2025, 8, 31)));
    registar(new Promocion("Vuelta al Cole", "Porcentaje", 10.0, LocalDate.of(2025, 8, 15), LocalDate.of(2025, 9, 15)));
    registar(new Promocion("Aniversario Concesionaria", "Porcentaje", 30.0, LocalDate.of(2025, 9, 1), LocalDate.of(2025, 9, 10)));
    registar(new Promocion("Promoción Septiembre", "Monto", 6000.0, LocalDate.of(2025, 9, 15), LocalDate.of(2025, 9, 30)));
    registar(new Promocion("Oferta Otoño", "Porcentaje", 12.0, LocalDate.of(2025, 9, 23), LocalDate.of(2025, 10, 23)));
    registar(new Promocion("Halloween Special", "Porcentaje", 13.0, LocalDate.of(2025, 10, 25), LocalDate.of(2025, 10, 31)));
    registar(new Promocion("Promoción Octubre", "Monto", 4000.0, LocalDate.of(2025, 10, 1), LocalDate.of(2025, 10, 20)));
    registar(new Promocion("Black Friday", "Porcentaje", 40.0, LocalDate.of(2025, 11, 28), LocalDate.of(2025, 11, 30)));
    registar(new Promocion("Cyber Monday", "Porcentaje", 35.0, LocalDate.of(2025, 12, 1), LocalDate.of(2025, 12, 2)));
    registar(new Promocion("Navidad 2025", "Porcentaje", 28.0, LocalDate.of(2025, 12, 15), LocalDate.of(2025, 12, 25)));
    registar(new Promocion("Fin de Año", "Monto", 7000.0, LocalDate.of(2025, 12, 26), LocalDate.of(2025, 12, 31)));
    registar(new Promocion("Super Oferta Enero", "Porcentaje", 17.0, LocalDate.of(2026, 1, 5), LocalDate.of(2026, 1, 20)));
    registar(new Promocion("Remate Inventario", "Porcentaje", 45.0, LocalDate.of(2025, 3, 15), LocalDate.of(2025, 3, 31)));
    registar(new Promocion("Promoción Ejecutiva", "Monto", 8000.0, LocalDate.of(2025, 4, 10), LocalDate.of(2025, 4, 25)));
    registar(new Promocion("Descuento Corporativo", "Porcentaje", 20.0, LocalDate.of(2025, 5, 1), LocalDate.of(2025, 12, 31)));
    registar(new Promocion("Cliente Frecuente", "Porcentaje", 15.0, LocalDate.of(2025, 1, 1), LocalDate.of(2025, 12, 31)));
    registar(new Promocion("Primera Compra", "Monto", 2500.0, LocalDate.of(2025, 1, 1), LocalDate.of(2025, 12, 31)));
    registar(new Promocion("Promoción Flash", "Porcentaje", 50.0, LocalDate.of(2025, 6, 6), LocalDate.of(2025, 6, 6)));
    registar(new Promocion("Weekend Sale", "Porcentaje", 18.0, LocalDate.of(2025, 7, 5), LocalDate.of(2025, 7, 6)));
    registar(new Promocion("Oferta Relámpago", "Monto", 5500.0, LocalDate.of(2025, 8, 8), LocalDate.of(2025, 8, 10)));
    registar(new Promocion("Mega Descuento", "Porcentaje", 32.0, LocalDate.of(2025, 9, 9), LocalDate.of(2025, 9, 12)));
    registar(new Promocion("Promoción Express", "Monto", 4200.0, LocalDate.of(2025, 10, 10), LocalDate.of(2025, 10, 15)));
    registar(new Promocion("Oferta Especial 11.11", "Porcentaje", 38.0, LocalDate.of(2025, 11, 11), LocalDate.of(2025, 11, 11)));
    registar(new Promocion("Promoción Triple 12", "Porcentaje", 26.0, LocalDate.of(2025, 12, 12), LocalDate.of(2025, 12, 12)));
    registar(new Promocion("Descuento Jubilados", "Porcentaje", 12.0, LocalDate.of(2025, 1, 1), LocalDate.of(2025, 12, 31)));
    registar(new Promocion("Promoción Estudiantes", "Porcentaje", 10.0, LocalDate.of(2025, 3, 1), LocalDate.of(2025, 11, 30)));
    registar(new Promocion("Descuento Militar", "Porcentaje", 15.0, LocalDate.of(2025, 1, 1), LocalDate.of(2025, 12, 31)));
    registar(new Promocion("Oferta Profesionales", "Monto", 3800.0, LocalDate.of(2025, 2, 1), LocalDate.of(2025, 12, 31)));
    registar(new Promocion("Super Promo Febrero", "Porcentaje", 19.0, LocalDate.of(2026, 2, 1), LocalDate.of(2026, 2, 28)));
    registar(new Promocion("Liquidación Total", "Porcentaje", 55.0, LocalDate.of(2025, 12, 20), LocalDate.of(2025, 12, 31)));
    registar(new Promocion("Promoción VIP", "Monto", 10000.0, LocalDate.of(2025, 6, 1), LocalDate.of(2025, 6, 30)));
    registar(new Promocion("Descuento Referido", "Porcentaje", 8.0, LocalDate.of(2025, 1, 1), LocalDate.of(2025, 12, 31)));
    registar(new Promocion("Oferta Twin", "Porcentaje", 24.0, LocalDate.of(2025, 5, 20), LocalDate.of(2025, 5, 25)));
    registar(new Promocion("Promoción Golden", "Monto", 6500.0, LocalDate.of(2025, 7, 10), LocalDate.of(2025, 7, 20)));
    registar(new Promocion("Descuento Platinum", "Porcentaje", 27.0, LocalDate.of(2025, 8, 20), LocalDate.of(2025, 8, 30)));
    registar(new Promocion("Oferta Diamond", "Monto", 9000.0, LocalDate.of(2025, 10, 5), LocalDate.of(2025, 10, 15)));
    registar(new Promocion("Promoción Elite", "Porcentaje", 33.0, LocalDate.of(2025, 11, 1), LocalDate.of(2025, 11, 15)));
    }
    
    public Promocion buscarPorNombre(String nombre){
        for (int i = 0; i < totalPromociones; i++) {
            if(promociones[i].getNombre().equalsIgnoreCase(nombre)){
                return promociones[i];
            }
            
        }
        return null;
    }
    
    public boolean registar(Promocion promocion){
        //verificar si esta lleno el arreglo
        if(totalPromociones == promociones.length){
            return false;
        }
        //evitar duplicados
        if(buscarPorNombre(promocion.getNombre()) != null){
            return false;
            
        }
        //registar
        promociones[totalPromociones] = promocion;
        totalPromociones++;
        return true;
    }
    
    public boolean modificar(Promocion promocion){
        for (int i = 0; i < totalPromociones; i++) {
            if(promociones[i].getNombre().equalsIgnoreCase(promocion.getNombre())){
                promociones[i].setNombre(promocion.getNombre());
                promociones[i].setTipo(promocion.getTipo());
                promociones[i].setValor(promocion.getValor());
                promociones[i].setFechaInicio(promocion.getFechaInicio());
                promociones[i].setFechaFin(promocion.getFechaFin());
                return true;           
            }
            
        }
        return false;
    }
    
    public boolean eliminar(String nombre){
        for (int i = 0; i < totalPromociones; i++) {
            if(promociones[i].getNombre().equalsIgnoreCase(nombre)){
                //correr los elementos una posicion a la izquierda
                for (int j = i; j < totalPromociones-1; j++) {
                    promociones[j] = promociones[j+1];    
                }
                //limpiamos el ultimo casillero
                promociones[totalPromociones-1] = null;
                totalPromociones--;
                
                return true;
            
            }
            
        }
        return false;
    }
    
    public Promocion[] obtenerPromociones(){
        return promociones;
    
    }
    
    public int obtenerTotalPromociones(){
        return totalPromociones;
    
    }
    
    

}