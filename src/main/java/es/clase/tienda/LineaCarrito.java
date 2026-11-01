package es.clase.tienda;

/**
 * Una línea del carrito: un producto y la cantidad de unidades.
 */
public class LineaCarrito {

    private final Producto producto;
    private final int cantidad;

    public LineaCarrito(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return cantidad + " x " + producto.getNombre();
    }
}
