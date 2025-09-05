package com.example;

import java.util.Random;

public class GeneradorAleatorio {

    /**
     * Genera un número entero aleatorio dentro de un rango especificado, incluyendo ambos extremos.
     *
     * @param minimo el valor mínimo del rango (inclusive).
     * @param maximo el valor máximo del rango (inclusive).
     * @return un número aleatorio entre `minimo` y `maximo`, ambos incluidos.
     * @throws IllegalArgumentException si `minimo` es mayor que `maximo`.
     *
     */
    public int generar(int minimo, int maximo) {
        if (minimo > maximo) {
            throw new IllegalArgumentException("El valor mínimo no puede ser mayor que el máximo.");
        }
        Random random = new Random();
        return random.nextInt(maximo - minimo + 1) + minimo;
    }
}
