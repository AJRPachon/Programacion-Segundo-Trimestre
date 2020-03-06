package TresEnRaya;
/*
    ANALISIS:
    
    ENTRADAS:
    
    SALIDAS:
    
    PSEUDOCODIGO GENERALIZADO:
    Inicio
    
    
    Fin
    
*/

import java.util.Scanner;

public class TresEnRaya2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Juego2 objJuego2 = new Juego2();

        int posicion1, posicion2;
        boolean ganador = false;
        char caracter = ' ';
        int ronda = 0;

        objJuego2.imprimirTablero();

        //Comprobar si la casilla elegida está libre
        do {

////////////// REALIZAR JUGADA ///////////////////////////////////////////////////////////////////////////////////////

            //Para saber qué caracter toca en cada turno
            if ( ronda % 2 != 0 ){
                caracter = 'X';
            }else{
                caracter = 'O';
            }

            System.out.println("Elija una posición para "+caracter);
            posicion1 = teclado.nextInt();
            posicion2 = teclado.nextInt();

            //Validar que la casilla seleccionada no esté ocupada, en ese caso, marcar la casilla como ocupada
            while ( objJuego2.getCasillas(posicion1,posicion2) != ' ') {
                System.out.println("\nLa posición seleccionada ya se encuentra ocupada por la ficha "+objJuego2.getCasillas(posicion1,posicion2)); //TODO saber si es una 'X' o 'O'
                System.out.println("Introduzca de nuevo la posición");
                objJuego2.imprimirTablero();
                posicion1 = teclado.nextInt();
                posicion2 = teclado.nextInt();

            }

            objJuego2.setCasillas(posicion1, posicion2, caracter );  //ASIGNAR POSICIÓN CIRCULO
            objJuego2.imprimirTablero();

            //Comprobar ganador
            ganador = objJuego2.comprobarGanador(caracter);

            ronda++;


/////////// MOSTRAR GANADOR ////////////////////////////////////////////////////////////////////////////////////////////////

        }while (!ganador && ronda < 9);

        if (objJuego2.comprobarGanador(caracter)){
            System.out.println("Enhorabuena! ha ganado "+caracter);
        }else{
            System.out.println("Empate");
        }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    }
}
