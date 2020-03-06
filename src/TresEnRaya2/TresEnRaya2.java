package TresEnRaya2;
/*
    ANALISIS:
        Crear un tres en raya

    ENTRADAS:
        posicion1 y posicion2
    
    SALIDAS:
        Ninguna

    PSEUDOCODIGO GENERALIZADO:
    Inicio

        //Imprimir tablero*

        //Comprobar si la casilla elegida está libre

        //Repetir

            //Saber qué caracter toca en cada turno

            //Elegir posición
            //Comprobar que los datos introducidos, no estén fuera de rango de los arrays
            //Validar que la casilla seleccionada no esté ocupada, en ese caso, marcar la casilla como ocupada
                //Comprobar que los datos introducidos, no estén fuera de rango de los arrays

            //Asignar posición caracter*
            //Mostrar tablero*

            //Comprobar ganador*

        //Mientras ( !ganador && ronda < 9 )

        //Mostrar ganador de la partida*
    
    Fin
    
*/

import java.util.Scanner;

public class TresEnRaya2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Juego2 objJuego2 = new Juego2();

        int posicion1, posicion2;
        boolean ganador;
        char caracter;
        int ronda = 0;

        //Imprimir tablero
        objJuego2.imprimirTablero();

        //Comprobar si la casilla elegida está libre
        do {

////////////// REALIZAR JUGADA ///////////////////////////////////////////////////////////////////////////////////////

            //Para saber qué caracter toca en cada turno
            caracter = ( ronda % 2 != 0 ) ? 'X' : 'O'; // resultado = (condicion)?valor1:valor2;

            //Elegir posición
            System.out.println("Elija una posición para "+caracter);
            posicion1 = teclado.nextInt();
            posicion2 = teclado.nextInt();

            //Comprobar que los datos introducidos, no estén fuera de rango de los arrays
            while ( posicion1 < 1 || posicion1 > 3 || posicion2 < 1 || posicion2 > 3 ){
                System.out.println("Los parámetros elegidos no están dentro del rango, por favor, introduzca de nuevo su elección:");
                posicion1 = teclado.nextInt();
                posicion2 = teclado.nextInt();
            }

            //Validar que la casilla seleccionada no esté ocupada, en ese caso, marcar la casilla como ocupada
            while ( objJuego2.getCasillas(posicion1,posicion2) != ' ') {
                System.out.println("\nLa posición seleccionada ya se encuentra ocupada por la ficha " + objJuego2.getCasillas(posicion1,posicion2));
                System.out.println("Introduzca de nuevo la posición");
                objJuego2.imprimirTablero();
                posicion1 = teclado.nextInt();
                posicion2 = teclado.nextInt();

                //Comprobar que los datos introducidos, no estén fuera de rango de los arrays
                while ( posicion1 < 1 || posicion1 > 3 || posicion2 < 1 || posicion2 > 3 ){
                    System.out.println("Los parámetros elegidos no están dentro del rango, por favor, introduzca de nuevo su elección:");
                    posicion1 = teclado.nextInt();
                    posicion2 = teclado.nextInt();
                }
            }

            //Asignar posición caracter
            objJuego2.setCasillas(posicion1, posicion2, caracter );
            objJuego2.imprimirTablero();

            //Comprobar ganador
            ganador = objJuego2.comprobarGanador(caracter);

            ronda++;


        }while (!ganador && ronda < 9);

/////////// MOSTRAR GANADOR ////////////////////////////////////////////////////////////////////////////////////////////////

        //Mostrar ganador de la partida
        objJuego2.mostrarGanador(caracter);

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    }
}
