package com.example;

public class RandomNumberGenerator {

    public static void main(String[] args) {
        Consola consola = new Consola();
        GeneradorAleatorio generadorAleatorio = new GeneradorAleatorio();
        Estadisticas estadisticas = new Estadisticas();

        Juego juego = new Juego(consola, generadorAleatorio, estadisticas);
        juego.iniciar();

    }
}



