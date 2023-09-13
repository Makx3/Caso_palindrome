package org.example;
import java.util.Scanner;

public class Main {
    public static boolean esPalindromo(String cadena) {
        // Elimina espacios en blanco y convierte la cadena a minúsculas
        cadena = cadena.replaceAll("\\s", "").toLowerCase();

        if (cadena.isEmpty()) {
            return false; // Si la cadena está vacía, no es un palíndromo.
        }

        String resultado = new StringBuilder(cadena).reverse().toString();
        return cadena.equals(resultado);
    }
}

