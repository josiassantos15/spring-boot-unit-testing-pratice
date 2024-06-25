package com.josias.spring_boot_unit_testing_practice.utilitarios;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class SaudacaoUtilTest {

    @Test
    void dado_um_horario_matutino_Quando_suadar_Entao_deve_retornar_bom_dia() {
        //Arrange
        int horaValida = 5;

        //Act
        String saudacao = SaudacaoUtil.saudar(horaValida);

        //Assert
        assertEquals("Bom dia", saudacao, "Saudação incorreta!");
    }

    @Test
    void dado_um_horario_vespertino_Quando_suadar_Entao_deve_retornar_boa_tarde() {
        int horaValida = 4;
        String saudacao = SaudacaoUtil.saudar(horaValida);
        assertEquals("Boa noite", saudacao, "Saudação incorreta!");
    }

    @Test
    void dado_uma_hora_invalida_Quando_saudar_Entao_deve_retornar_exception() {
        int horaInvalida = -10;
        Executable executable = () -> SaudacaoUtil.saudar(horaInvalida);
        var exception = assertThrows(IllegalArgumentException.class,
                executable,
                "A exception não foi lançada corretamente");
        assertEquals("Hora inválida", exception.getMessage());
    }

    @Test void dado_uma_horavalida_Quando_saudar_Entao_nao_deve_retornar_exception() {
        int horaValida = 0;
        Executable executable = () -> SaudacaoUtil.saudar(horaValida);
        assertDoesNotThrow(executable);
    }
}