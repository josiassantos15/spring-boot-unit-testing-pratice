package com.josias.spring_boot_unit_testing_practice.utilitarios;

import java.time.Duration;

public class SimuladorEspera {

    private SimuladorEspera() {

    }

    public static void esperar(Duration duration) {
        try {
            Thread.sleep(duration.toMillis());
        } catch (Exception ignored) {

        }
    }

}
