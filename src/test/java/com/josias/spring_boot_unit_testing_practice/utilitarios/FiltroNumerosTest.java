package com.josias.spring_boot_unit_testing_practice.utilitarios;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class FiltroNumerosTest {

    @Test
    void dado_uma_lista_de_numeros_Quando_filtrar_por_pares_Entao_deve_retornar_numeros_pares() {
        List<Integer> numeros = asList(1, 2, 3, 4);
        List<Integer> numerosParesEsperados = asList(2, 4);
        List<Integer> resultado = FiltroNumeros.numerosPares(numeros);
        assertIterableEquals(numerosParesEsperados, resultado, "Resultado diferente do esperado");
    }

    @Test
    void dado_uma_lista_de_numeros_Quando_filtrar_por_impares_Entao_deve_retornar_numeros_impares() {
        List<Integer> numeros = asList(1, 2, 3, 4);
        List<Integer> numerosImparesEsperados = asList(1, 3);
        List<Integer> resultado = FiltroNumeros.numerosImpares(numeros);
        assertIterableEquals(numerosImparesEsperados, resultado, "Resultado diferente do esperado");
    }

    @Test
    void dado_um_numero_positivo_Quando_verificar_se_positivo_Entao_deve_retornar_true() {
        assertTrue(FiltroNumeros.isPositivo(2));
    }

    @Test
    void dado_um_numero_negativo_Quando_verificar_se_positivo_Entao_deve_retornar_false() {
        assertFalse(FiltroNumeros.isPositivo(-2));
    }
}