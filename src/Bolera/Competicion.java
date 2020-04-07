package Bolera;

/*
    PROGRAMA PRINCIPAL
    INICIO




    FIN



 */



public class Competicion {

    public static void main(String[] args){

        int cantPista = 12;
        int cantJuga = 4;

        Partida objPartida = new Partida(cantPista, cantJuga);

        objPartida.crearNombreJugadores();

        objPartida.crearJugadores();

        objPartida.generarPuntuacionJugadores();

        objPartida.mostrarPuntuacionPista();

        objPartida.maxPuntuacionPista();

    }

}
