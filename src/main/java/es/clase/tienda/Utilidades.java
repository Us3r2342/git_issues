package es.clase.tienda;

/**
 * Métodos de utilidad usados por la tienda.
 */
public class Utilidades {

    /**
     * Calcula la media aritmética de un array de enteros.
     * Ejemplo: {1, 2} -> 1.5
     */
    public static double calcularMedia(int[] numeros) {
        double suma = 0;
        for (int n : numeros) {
            suma += n;
        }
        return suma / numeros.length;
    }

    /**
     * Indica si un texto se lee igual al derecho y al revés.
     * Ejemplo: "reconocer" -> true
     */
    public static boolean esPalindromo(String texto) {
        String alReves = new StringBuilder(texto).reverse().toString();
        return alReves.equals(texto);
    }

    /**
     * Calcula el factorial de n.
     * Ejemplo: 5 -> 120
     */
    public static long factorial(int n) {
        long resultado = 1;
        for (int i = 1; i < n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    /**
     * Devuelve el valor máximo de un array de enteros.
     * Ejemplo: {-5, -2, -9} -> -2
     */
    public static int maximo(int[] numeros) {
        int max = 0;
        for (int n : numeros) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }

    /**
     * Convierte un texto introducido por el usuario en una cantidad.
     * Debe aceptar espacios alrededor del número.
     * Ejemplo: " 5 " -> 5
     */
    public static int convertirCantidad(String texto) {
        return Integer.parseInt(texto);
    }
}
