package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
public class juegoTest {
    @Mock
    private Consola consola;

    @Mock
    private GeneradorAleatorio generadorAleatorio;

    @Mock
    private Estadisticas estadisticas;

    @InjectMocks
    private Juego juego;

    @Test
    public void testJuego() {
        //Simulaciones
        when(generadorAleatorio.generar(anyInt(),anyInt())).thenReturn(42);
        when(consola.pedirNumero()).thenReturn(42);
        when(consola.preguntarSeguir()).thenReturn("N");
        when(estadisticas.getAciertos()).thenReturn(1);
        when(estadisticas.getFallos()).thenReturn(0);

        //Ejecutar la logica
        juego.iniciar();

        //Verificaciones
        verify(consola).mostrarResultado(42,42);
        verify(estadisticas).registrarResultado(42,42);
        verify(consola).mostrarEstadisticas(1,0);
    }
}
