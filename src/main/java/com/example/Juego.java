package com.example;

public class Juego {
    private final Consola consola;
    private final GeneradorAleatorio generadorAleatorio;
    private final Estadisticas estadisticas;


    //Constructor con parametros
    public Juego(Consola consola, GeneradorAleatorio generadorAleatorio, Estadisticas estadisticas) {
        this.consola = consola;
        this.generadorAleatorio = generadorAleatorio;
        this.estadisticas = estadisticas;
    }

    //Metodo
    public void iniciar(){
        int numeroAleatorio, numeroUsuario;
        String seguirJugando;

        do {
            // Numero aleatorio del sistema
            numeroAleatorio = generadorAleatorio.generar(1, 100);

            // Numero aleatorio del usuario, cogido de consola
            numeroUsuario = consola.pedirNumero();

            // Mostrar el resultado
            consola.mostrarResultado(numeroUsuario, numeroAleatorio);

            // Registrar las estadísticas
            estadisticas.registrarResultado(numeroUsuario,numeroAleatorio);

            // Preguntar al usuario si quiere seguir jugando
            seguirJugando = consola.preguntarSeguir();

        } while (seguirJugando.equals("S"));

        //Informar al usuario del resultado del juego
        consola.mostrarEstadisticas(estadisticas.getAciertos(), estadisticas.getFallos());

    }
}
