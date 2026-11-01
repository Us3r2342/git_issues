package es.clase.tienda;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    @DisplayName("Issue 12: un cliente sin email no tiene email válido (y no debe fallar)")
    void issue12_clienteSinEmail() {
        Cliente ana = new Cliente("Ana");
        assertFalse(assertDoesNotThrow(ana::tieneEmailValido));
        assertTrue(new Cliente("Luis", "luis@correo.es").tieneEmailValido());
        assertFalse(new Cliente("Eva", "evacorreo.es").tieneEmailValido());
    }
}
