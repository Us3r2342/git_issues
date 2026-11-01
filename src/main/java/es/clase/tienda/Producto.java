package es.clase.tienda;

/**
 * Producto que se vende en la tienda.
 */
public class Producto {

    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    /**
     * Cambia el precio del producto (por ejemplo, al subir o bajar precios).
     */
    public void setPrecio(double precio) {
        precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    /**
     * Devuelve el precio tras aplicar un descuento en porcentaje.
     * Ejemplo: precio 100, descuento 20 -> 80
     */
    public double precioConDescuento(int porcentaje) {
        return precio * porcentaje / 100;
    }

    /**
     * Indica si hay unidades suficientes para vender la cantidad pedida.
     * Ejemplo: stock 3, cantidad 3 -> true
     */
    public boolean hayStock(int cantidad) {
        return stock > cantidad;
    }

    @Override
    public String toString() {
        return nombre + " (" + precio + " €, stock: " + stock + ")";
    }
}
