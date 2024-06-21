package com.josias.spring_boot_unit_testing_practice.utilitarios;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testes unitarios para FiltroNumeros")
class FiltroNumerosTest {

    @Test
    @DisplayName("Deve retornar numeros pares")
    void numerosPares() {
        List<Integer> numeros = asList(1, 2, 3, 4);
        List<Integer> numerosParesEsperados = asList(2, 4);
        List<Integer> resultado = FiltroNumeros.numerosPares(numeros);
        assertIterableEquals(numerosParesEsperados, resultado, "Resultado diferente do esperado");
    }

    @Test
    @DisplayName("Deve retornar numeros impares")
    void numerosImpares() {
        List<Integer> numeros = asList(1, 2, 3, 4);
        List<Integer> numerosImparesEsperados = asList(1, 3);
        List<Integer> resultado = FiltroNumeros.numerosImpares(numeros);
        assertIterableEquals(numerosImparesEsperados, resultado, "Resultado diferente do esperado");
    }

    @Test
    @DisplayName("Deve retornar true se numero for positivo")
    void isPositivo() {
        assertTrue(FiltroNumeros.isPositivo(2));
    }

    @Test
    @DisplayName("Deve retornar false se numero for positivo")
    void isNotPositivo() {
        assertFalse(FiltroNumeros.isPositivo(-2));
    }
}