package com.josias.spring_boot_unit_testing_practice.utilitarios;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testes unitarios para Pessoa")
class PessoaTest {

    @Test
    @Disabled("Não é mais necessário")
    @DisplayName("Asserções agrupadas")
    void assertAllPessoa() {
        Pessoa pessoa = new Pessoa("John", "Doe");
        assertAll("Asserções de pessoa",
                () -> assertEquals("John", pessoa.getNome()),
                () -> assertEquals("Doe", pessoa.getSobrenome()),
                () -> assertEquals("John Doe", pessoa.getNomeCompleto()));
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "ENV", matches = "DEV")
    @DisplayName("Asserções agrupadas desabilita teste em PROD")
    void assertAllPessoa_disabledIfEnvironmentVariable() {
        Pessoa pessoa = new Pessoa("John", "Doe");
        Assumptions.assumeTrue("PROD".equals(System.getenv("PROD")),
                () -> "Abortando teste: Não deve ser executado em PROD");
        assertAll("Asserções de pessoa",
                () -> assertEquals("John", pessoa.getNome()),
                () -> assertEquals("Doe", pessoa.getSobrenome()),
                () -> assertEquals("John Doe", pessoa.getNomeCompleto()));
    }
}