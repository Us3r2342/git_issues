package es.clase.tienda;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarritoTest {

    private Carrito carrito;

    @BeforeEach
    void preparar() {
        carrito = new Carrito();
        carrito.anadir(new Producto("Boli", 10, 10), 2);
        carrito.anadir(new Producto("Goma", 5, 10), 1);
        carrito.anadir(new Producto("Regla", 3, 10), 1);
    }

    @Test
    @DisplayName("Issue 9: el total debe tener en cuenta la cantidad (2x10 + 1x5 + 1x3 = 28)")
    void issue09_totalConCantidades() {
        assertEquals(28.0, carrito.calcularTotal(), 0.0001);
    }

    @Test
    @DisplayName("Issue 10: eliminar un producto no debe lanzar excepción")
    void issue10_eliminarProducto() {
        assertDoesNotThrow(() -> carrito.eliminar("Boli"));
        assertEquals(2, carrito.numeroLineas());
    }

    @Test
    @DisplayName("Issue 11: la última línea debe ser la de 'Regla'")
    void issue11_ultimaLinea() {
        LineaCarrito ultima = assertDoesNotThrow(() -> carrito.getUltimaLinea());
        assertEquals("Regla", ultima.getProducto().getNombre());
    }
}
