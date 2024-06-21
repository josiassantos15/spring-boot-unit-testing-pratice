package com.josias.spring_boot_unit_testing_practice.utilitarios;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testes unitarios para SimuladorEspera")
class SimuladorEsperaTest {

    @Test
    @DisplayName("Deve esperar e não dar Timeout")
    void esperar() {
        assertTimeoutPreemptively(Duration.ofSeconds(1), () -> SimuladorEspera.esperar(Duration.ofMillis(10)));
    }
}