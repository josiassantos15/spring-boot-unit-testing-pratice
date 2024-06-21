package com.josias.spring_boot_unit_testing_practice.utilitarios;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testes unitarios para SaudacaoUtil")
class SaudacaoUtilTest {

    @Test
    @DisplayName("deve retornar saudacao de acordo com a hora informada")
    void saudar() {
        String saudacao = SaudacaoUtil.saudar(10);
        assertEquals("Bom dia", saudacao, "Saudação incorreta!");
    }

    @Test
    @DisplayName("deve retornar exception ao informar hora errada")
    void saudar_exception() {
        var exception = assertThrows(IllegalArgumentException.class,
                () -> SaudacaoUtil.saudar(-10),
                "A exception não foi lançada corretamente");
        assertEquals("Hora inválida", exception.getMessage());
    }
}