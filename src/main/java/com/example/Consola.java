package com.example;

import java.util.Scanner;

public class Consola {
    private final Scanner scanner = new Scanner(System.in);

    /**
     * Pregunta al usuario por un número entre 1 y 100
     *
     * @return el número introducido por el usuario
     */
    public int pedirNumero(){
        System.out.print("Introduce un número entre 1 y 100: ");
        return scanner.nextInt();
    }

    /**
     * Pregunta al usuario si desea seguir jugando y valida la respuesta.
     * Solo se aceptan las respuestas "S" (sí) o "N" (no), sin distinguir entre mayúsculas y minúsculas.
     * Si la respuesta no es válida, se muestra un mensaje de error y se vuelve a preguntar.
     *
     * @return una cadena que representa la respuesta del usuario: "S" para continuar o "N" para finalizar.
     */
    public String preguntarSeguir(){
        String seguirJugando;

        do {
            System.out.print("¿Quieres seguir jugando? (S/N): ");
            seguirJugando = scanner.next().trim().toUpperCase();

            if (!seguirJugando.equals("S") && !seguirJugando.equals("N")) {
                System.out.println("Debe responder con S o N");
            }
        } while (!seguirJugando.equals("S") && !seguirJugando.equals("N"));

        return seguirJugando;
    }

    /**
     * Revisa si el número introducido por el usuario coincide con el número aleatorio generado
     * e informa al usuario por consola.
     *
     * @param numeroUsuario el número introducido por el usuario.
     * @param numeroAleatorio el número aleatorio generado por el sistema.
     * @return nada.
     */
    public void mostrarResultado(int numeroUsuario, int numeroAleatorio){

        if (numeroUsuario == numeroAleatorio) {
            System.out.println("¡Lo has acertado!");
        } else {
            System.out.println("Esta vez no has acertado. El número era: " + numeroAleatorio);
        }
    }

    /**
     * Muestra al usuario las estadísticas del juego
     *
     * @param aciertos el número de aciertos del juego.
     * @param fallos el número de fallos del juego.
     * @return nada
     */
    public void mostrarEstadisticas (int aciertos, int fallos){
        System.out.println("\nNúmero de aciertos: " + aciertos);
        System.out.println("Número de fallos: " + fallos);
        System.out.println("Gracias por jugar. Hasta pronto.");
    }
}
