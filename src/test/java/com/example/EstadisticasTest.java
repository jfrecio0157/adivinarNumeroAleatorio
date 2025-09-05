package com.example;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class EstadisticasTest {

    @Test
    public void testRegistrarAcierto() {
        Estadisticas estadisticas = new Estadisticas();
        estadisticas.registrarResultado(50, 50);
        assertEquals(1, estadisticas.getAciertos());
        assertEquals(0, estadisticas.getFallos());
    }

    @Test
    public void testRegistrarFallo() {
        Estadisticas estadisticas = new Estadisticas();
        estadisticas.registrarResultado(50, 60);
        assertEquals(0, estadisticas.getAciertos());
        assertEquals(1, estadisticas.getFallos());
    }

    @Test
    public void testMultiplesResultados() {
        Estadisticas estadisticas = new Estadisticas();
        estadisticas.registrarResultado(10, 10); // acierto
        estadisticas.registrarResultado(20, 30); // fallo
        estadisticas.registrarResultado(40, 40); // acierto
        assertEquals(2, estadisticas.getAciertos());
        assertEquals(1, estadisticas.getFallos());
    }
}
