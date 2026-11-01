package es.clase.tienda;

import java.util.ArrayList;
import java.util.List;

/**
 * Carrito de la compra.
 */
public class Carrito {

    private final List<LineaCarrito> lineas = new ArrayList<>();

    public void anadir(Producto producto, int cantidad) {
        lineas.add(new LineaCarrito(producto, cantidad));
    }

    public int numeroLineas() {
        return lineas.size();
    }

    /**
     * Calcula el importe total del carrito (precio x cantidad de cada línea).
     * Ejemplo: 2 x 10 € + 1 x 5 € -> 25 €
     */
    public double calcularTotal() {
        double total = 0;
        for (LineaCarrito linea : lineas) {
            total += linea.getProducto().getPrecio();
        }
        return total;
    }

    /**
     * Elimina del carrito todas las líneas del producto con ese nombre.
     */
    public void eliminar(String nombreProducto) {
        for (LineaCarrito linea : lineas) {
            if (linea.getProducto().getNombre().equals(nombreProducto)) {
                lineas.remove(linea);
            }
        }
    }

    /**
     * Devuelve la última línea añadida al carrito.
     */
    public LineaCarrito getUltimaLinea() {
        return lineas.get(lineas.size());
    }
}
