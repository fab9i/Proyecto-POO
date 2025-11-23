
package Registros;

import proyecto.Venta;

public class VentaRepositorio {
    private Venta[] ventas;
    private int size;

    public VentaRepositorio(int capacidad) {
        ventas = new Venta[capacidad];
        size = 0;
    }

    public boolean agregar(Venta v) {
        if (size >= ventas.length) {
            return false;
        }
        ventas[size] = v;
        size++;
        return true;
    }

    public Venta buscarPorCodigo(String codigo) {
        for (int i = 0; i < size; i++) {
            if (ventas[i].getCodigo().equals(codigo)) {
                return ventas[i];
            }
        }
        return null;
    }

    public Venta[] listar() {
        Venta[] lista = new Venta[size];

        for (int i = 0; i < size; i++) {
            lista[i] = ventas[i];
        }

        return lista;
    }

    public boolean eliminar(String codigo) {
        for (int i = 0; i < size; i++) {
            if (ventas[i].getCodigo().equals(codigo)) {

                for (int j = i; j < size - 1; j++) {
                    ventas[j] = ventas[j + 1];
                }

                ventas[size - 1] = null;
                size--;
                return true;
            }
        }
        return false;
    }
}
