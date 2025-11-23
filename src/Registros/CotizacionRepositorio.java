/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Registros;

import proyecto.Cotizacion;
import java.time.LocalDate;

/**
 *
 * @author thiag
 */
public class CotizacionRepositorio {
    private Cotizacion[] cotizaciones;
    private int size;

    public CotizacionRepositorio(int capacidad) {
        cotizaciones = new Cotizacion[capacidad];
        size = 0;
    }

    public boolean agregar(Cotizacion c) {
        if (size >= cotizaciones.length) {
            return false;
        }
        cotizaciones[size] = c;
        size++;
        return true;
    }

    public Cotizacion buscarPorCodigo(String codigo) {
        for (int i = 0; i < size; i++) {
            if (cotizaciones[i].getCodigo().equals(codigo)) {
                return cotizaciones[i];
            }
        }
        return null;
    }

    public Cotizacion[] listar() {
        Cotizacion[] lista = new Cotizacion[size];

        for (int i = 0; i < size; i++) {
            lista[i] = cotizaciones[i];
        }

        return lista;
    }

    public boolean eliminar(String codigo) {
        for (int i = 0; i < size; i++) {
            if (cotizaciones[i].getCodigo().equals(codigo)) {

                for (int j = i; j < size - 1; j++) {
                    cotizaciones[j] = cotizaciones[j + 1];
                }

                cotizaciones[size - 1] = null;
                size--;
                return true;
            }
        }
        return false;
    }
}
