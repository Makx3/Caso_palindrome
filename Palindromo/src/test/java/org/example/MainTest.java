package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void pruebaCadenaConEspacios() {
        String cadena = "No subas abuson";
        boolean resultado = Main.esPalindromo(cadena);
        assertTrue(resultado);
    }

    @Test
    void pruebaPalindromoInvalido() {
        String cadena = "hola";
        boolean resultado = Main.esPalindromo(cadena);
        assertFalse(resultado);
    }

    @Test
    void pruebaCadenaVacia() {
        String cadena = "";
        boolean resultado = Main.esPalindromo(cadena);
        assertFalse(resultado);
    }
    @Test
    void pruebaPalindromoConNumeros() {
        String cadena = "12321";
        boolean resultado = Main.esPalindromo(cadena);
        assertTrue(resultado);
    }
}