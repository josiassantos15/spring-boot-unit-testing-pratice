package com.josias.spring_boot_unit_testing_practice.utilitarios;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testes unitarios para Pessoa")
class PessoaTest {

    @Test
    @DisplayName("Asserções agrupadas")
    void assertAllPessoa() {
        Pessoa pessoa = new Pessoa("John", "Doe");
        assertAll("Asserções de pessoa",
                () -> assertEquals("John", pessoa.getNome()),
                () -> assertEquals("Doe", pessoa.getSobrenome()),
                () -> assertEquals("John Doe", pessoa.getNomeCompleto()));
    }
}