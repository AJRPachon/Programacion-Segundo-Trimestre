package Bolera;

/*
    PROGRAMA PRINCIPAL
    INICIO

        //REPETIR

            //Leer y validar el numero de pistas que va a tener el torneo

            //Leer y validar el numero de jugadores que va a tener el torneo

            //Crear el objeto partida

            //Crear los nombres de los jugadores*

            //Crear los jugadores*

            //Cargar los jugadores con las puntuaciones*

            //Mostrar todas las puntuaciones por pista*

            //Mostrar la máxima puntuacion por pista*

            //Mostrar ganador o empate*

        //Mientras ( repetir != N )

    FIN



 */

import java.util.Scanner;

public class Competicion {

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        int cantPista;
        int cantJuga;
        int cantNombres; //Para saber la cantidad de nombres que tenemos que crear

        //Leer y validar el numero de pistas que va a tener el torneo
        System.out.println("Introduzca la cantidad de pistas que tendrá el torneo");
        cantPista = teclado.nextInt();

        //Validar pistas
        while ( cantPista <= 0 ){
            System.out.println("Las pistas no pueden ser 0 o menores que cero, introduzca de nuevo el numero de pistas");
            cantPista = teclado.nextInt();
        }

        //Leer y validar el numero de jugadores que va a tener el torneo
        System.out.println("Introduzca la cantidad de pistas que tendrá el torneo");
        cantJuga = teclado.nextInt();

        //Validar numero jugadores
        while ( cantJuga <= 0 ){
            System.out.println("Los jugadores no pueden ser 0 o menores que cero, introduzca de nuevo el numero de jugadores que participarán en el torneo");
            cantJuga = teclado.nextInt();
        }


        //Crear el objeto partida
        Partida objPartida = new Partida(cantPista, cantJuga);

        //Crear los nombres de los jugadores*
        cantNombres = cantPista * cantJuga;

        objPartida.crearNombreJugadores(cantNombres);

        //Crear los jugadores*
        objPartida.crearJugadores();

        //Cargar los jugadores con las puntuaciones*
        objPartida.generarPuntuacionJugadores();

        //Mostrar todas las puntuaciones por pista*
        objPartida.mostrarPuntuacionPista();

        //Mostrar la máxima puntuacion por pista*
        objPartida.maxPuntuacionPista();

        //Mostrar ganador o empate*













    }

}
