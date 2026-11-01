package es.clase.tienda;

/**
 * Cliente de la tienda. El email es opcional (puede ser null).
 */
public class Cliente {

    private final String nombre;
    private final String email;

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public Cliente(String nombre) {
        this(nombre, null);
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    /**
     * Indica si el cliente tiene un email válido (no nulo y con '@').
     * Un cliente sin email debe devolver false.
     */
    public boolean tieneEmailValido() {
        return email.contains("@");
    }

    @Override
    public String toString() {
        return nombre + (email != null ? " <" + email + ">" : "");
    }
}
