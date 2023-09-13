package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una cadena: ");
        String cadena = scanner.nextLine();

        boolean resultado = esPalindromo(cadena);

        if (resultado) {
            System.out.println("La cadena es un palindromo.");
        } else {
            System.out.println("La cadena no es un palindromo o esta vacia.");
        }
    }
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

