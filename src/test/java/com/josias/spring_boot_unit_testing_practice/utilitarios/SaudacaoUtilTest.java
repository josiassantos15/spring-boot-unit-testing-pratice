package com.josias.spring_boot_unit_testing_practice.utilitarios;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testes unitarios para SaudacaoUtil")
class SaudacaoUtilTest {

    @Test
    @DisplayName("deve retornar saudacao Bom dia à partir de 5h")
    void saudar() {
        //Arrange
        int horaValida = 5;

        //Act
        String saudacao = SaudacaoUtil.saudar(horaValida);

        //Assert
        assertEquals("Bom dia", saudacao, "Saudação incorreta!");
    }

    @Test
    @DisplayName("deve retornar saudacao Boa Noite até 4h")
    void saudar_boaNoite() {
        int horaValida = 4;
        String saudacao = SaudacaoUtil.saudar(horaValida);
        assertEquals("Boa noite", saudacao, "Saudação incorreta!");
    }

    @Test
    @DisplayName("deve retornar exception ao informar hora errada")
    void saudar_exception() {
        int horaInvalida = -10;
        Executable executable = () -> SaudacaoUtil.saudar(horaInvalida);
        var exception = assertThrows(IllegalArgumentException.class,
                executable,
                "A exception não foi lançada corretamente");
        assertEquals("Hora inválida", exception.getMessage());
    }
}