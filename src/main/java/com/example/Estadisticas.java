package com.example;


public class Estadisticas {
    private int aciertos = 0;
    private int fallos = 0;

    /**
     * Analiza si el número introducido por el usuario coincide con el número aleatorio generado
     * y actualiza las estadísticas de aciertos y fallos en consecuencia.
     *
     * @param numeroUsuario el número introducido por el usuario.
     * @param numeroAleatorio el número aleatorio generado por el sistema.
     * @return nada
     */
    public void registrarResultado (int numeroUsuario, int numeroAleatorio){
        if (numeroUsuario == numeroAleatorio){
            aciertos ++;
        } else {
            fallos ++;
        }
    }

    /**
     * Devuelve el numero de aciertos
     *
     * @return numero de aciertos
     */
    public int getAciertos() {
        return aciertos;
    }

    /**
     * Devuelve el numero de fallos
     *
     * @return numero de fallos
     */
    public int getFallos() {
        return fallos;
    }
}
