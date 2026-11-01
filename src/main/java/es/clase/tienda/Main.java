package es.clase.tienda;

/**
 * Demostración de la tienda. Cada prueba se ejecuta por separado:
 * si una falla, se muestra el error y se continúa con la siguiente.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== TIENDA ===");

        probar("1. Media de {1, 2} (esperado 1.5)",
                () -> Utilidades.calcularMedia(new int[]{1, 2}));
        probar("2. ¿'reconocer' es palíndromo? (esperado true)",
                () -> Utilidades.esPalindromo("reconocer"));
        probar("3. Factorial de 5 (esperado 120)",
                () -> Utilidades.factorial(5));
        probar("4. Máximo de {-5, -2, -9} (esperado -2)",
                () -> Utilidades.maximo(new int[]{-5, -2, -9}));
        probar("5. Convertir \" 5 \" (esperado 5)",
                () -> Utilidades.convertirCantidad(" 5 "));

        probar("6. Libro de 20 € que sube a 25 € (esperado 25.0)", () -> {
            Producto libro = new Producto("Libro", 20, 5);
            libro.setPrecio(25);
            return libro.getPrecio();
        });
        probar("7. Producto de 100 € con 20% dto (esperado 80.0)",
                () -> new Producto("Silla", 100, 1).precioConDescuento(20));
        probar("8. Stock 3, ¿puedo vender 3? (esperado true)",
                () -> new Producto("Mesa", 50, 3).hayStock(3));

        probar("9. Total de 2 x 10 € + 1 x 5 € (esperado 25.0)", () -> {
            Carrito c = new Carrito();
            c.anadir(new Producto("Boli", 10, 10), 2);
            c.anadir(new Producto("Goma", 5, 10), 1);
            return c.calcularTotal();
        });
        probar("10. Eliminar 'Boli' del carrito (esperado 2 líneas)", () -> {
            Carrito c = new Carrito();
            c.anadir(new Producto("Boli", 10, 10), 2);
            c.anadir(new Producto("Goma", 5, 10), 1);
            c.anadir(new Producto("Regla", 3, 10), 1);
            c.eliminar("Boli");
            return c.numeroLineas();
        });
        probar("11. Última línea del carrito (esperado 1 x Goma)", () -> {
            Carrito c = new Carrito();
            c.anadir(new Producto("Boli", 10, 10), 2);
            c.anadir(new Producto("Goma", 5, 10), 1);
            return c.getUltimaLinea();
        });

        probar("12. ¿Cliente sin email tiene email válido? (esperado false)",
                () -> new Cliente("Ana").tieneEmailValido());
    }

    private static void probar(String descripcion, java.util.concurrent.Callable<Object> accion) {
        try {
            System.out.println(descripcion + " -> " + accion.call());
            System.out.println();
        } catch (Exception e) {
            System.out.println(descripcion + " -> ERROR: " + e);
            System.out.println();
        }
    }
}
