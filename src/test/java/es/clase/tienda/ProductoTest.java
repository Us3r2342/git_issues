package es.clase.tienda;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductoTest {

    @Test
    @DisplayName("Issue 6: setPrecio debe cambiar el precio del producto")
    void issue06_setPrecio() {
        Producto libro = new Producto("Libro", 20, 5);
        libro.setPrecio(25);
        assertEquals(25.0, libro.getPrecio(), 0.0001);
    }

    @Test
    @DisplayName("Issue 7: 100 € con un 20% de descuento deben ser 80 €")
    void issue07_precioConDescuento() {
        Producto silla = new Producto("Silla", 100, 1);
        assertEquals(80.0, silla.precioConDescuento(20), 0.0001);
        assertEquals(100.0, silla.precioConDescuento(0), 0.0001);
    }

    @Test
    @DisplayName("Issue 8: con stock 3 se pueden vender 3 unidades")
    void issue08_stockJusto() {
        Producto mesa = new Producto("Mesa", 50, 3);
        assertTrue(mesa.hayStock(3));
        assertTrue(mesa.hayStock(2));
        assertFalse(mesa.hayStock(4));
    }
}
