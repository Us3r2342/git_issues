package es.clase.tienda;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilidadesTest {

    @Test
    @DisplayName("Issue 1: la media de {1, 2} debe ser 1.5")
    void issue01_mediaConDecimales() {
        assertEquals(1.5, Utilidades.calcularMedia(new int[]{1, 2}), 0.0001);
    }

    @Test
    @DisplayName("Issue 2: 'reconocer' debe ser palíndromo")
    void issue02_palindromo() {
        assertTrue(Utilidades.esPalindromo("reconocer"));
        assertFalse(Utilidades.esPalindromo("java"));
    }

    @Test
    @DisplayName("Issue 3: el factorial de 5 debe ser 120")
    void issue03_factorial() {
        assertEquals(120, Utilidades.factorial(5));
        assertEquals(1, Utilidades.factorial(0));
    }

    @Test
    @DisplayName("Issue 4: el máximo de {-5, -2, -9} debe ser -2")
    void issue04_maximoNegativos() {
        assertEquals(-2, Utilidades.maximo(new int[]{-5, -2, -9}));
        assertEquals(7, Utilidades.maximo(new int[]{3, 7, 1}));
    }

    @Test
    @DisplayName("Issue 5: convertir \" 5 \" debe devolver 5")
    void issue05_convertirCantidadConEspacios() {
        assertEquals(5, Utilidades.convertirCantidad(" 5 "));
        assertEquals(12, Utilidades.convertirCantidad("12"));
    }
}
