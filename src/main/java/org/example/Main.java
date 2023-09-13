package org.example;
public class Main {
    public static void main(String[] args) {
        String cadena1 = "oso";
        boolean resultado1 = esPalindromo(cadena1);
        System.out.println(resultado1); // Esto imprimirá true, ya que "oso" es un palíndromo.

        String cadena2 = "hola";
        boolean resultado2 = esPalindromo(cadena2);
        System.out.println(resultado2); // Esto imprimirá false, ya que "hola" no es un palíndromo.

        String cadena3 = "Dabale arroz a la zorra el abad";
        boolean resultado3 = esPalindromo(cadena3);
        System.out.println(resultado3); // Esto imprimirá true, ya que "issac no ronca asi" es un palíndromo con espacios.
    }
    public static boolean esPalindromo(String cadena) {
        // Elimina espacios en blanco y convierte la cadena a minúsculas
        cadena = cadena.replaceAll("\s", "").toLowerCase();

        String resultado = new StringBuilder(cadena).reverse().toString();
        return cadena.equals(resultado);
    }
}
