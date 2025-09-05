package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GeneradorAleatorioTest {


    GeneradorAleatorio generadorAleatorio = new GeneradorAleatorio();

    @Test
    public void testNumeroDentroDelRango() {
        for (int i = 0; i < 1000; i++) {
            int numero = generadorAleatorio.generar(1, 100);
            assertTrue(numero >= 1 && numero <= 100);
        }
    }

    @Test
    public void testMinimoMayorQueMaximoLanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> {
            generadorAleatorio.generar(100, 1);
        });
    }
}
