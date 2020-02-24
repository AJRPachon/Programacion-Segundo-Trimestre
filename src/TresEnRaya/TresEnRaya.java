package TresEnRaya;
/*

PSEUDOCODIGO:
ProgramaPrincipal
Inicio

    Presentacion del programa



Fin


 */


import java.util.Arrays;
import java.util.Scanner;

public class TresEnRaya {

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        Juego objJuego = new Juego();

        int posicion1, posicion2;
        boolean ganadorEquis = false;
        boolean ganadorCirculo = false;
        int ronda = 0;

        objJuego.imprimirTablero();

        //Comprobar si la casilla elegida está libre
        do {

////////////// SELECCIONAR CIRCULO ///////////////////////////////////////////////////////////////////////////////////////

            System.out.println("Elija una posición para el circulo");
            posicion1 = teclado.nextInt();
            posicion2 = teclado.nextInt();

            //Validar que la casilla seleccionada no esté ocupada, en ese caso, marcar la casilla como ocupada
            if (!objJuego.getCasillaCirculo(posicion1, posicion2) && !objJuego.getCasillaEquis(posicion1, posicion2)) {

                objJuego.setCasillaCirculo(posicion1, posicion2);  //ASIGNAR POSICIÓN CIRCULO
                objJuego.imprimirTablero();

            } else {
                while ( objJuego.getCasillaCirculo(posicion1,posicion2) && objJuego.getCasillaEquis(posicion1,posicion2)) {
                    System.out.println("La posición seleccionada ya se encuentra ocupada"); //TODO saber si es una 'X' o 'O'
                    System.out.println("Introduzca de nuevo la posición");
                    posicion1 = teclado.nextInt();
                    posicion2 = teclado.nextInt();
                }
            }

            //Comprobar ganador
            ganadorCirculo = objJuego.comprobarGanadorCirculo();

/////////////// SELECCIONAR EQUIS ///////////////////////////////////////////////////////////////////////////////////////

            if (!ganadorCirculo) { //Para que no siga ejecutando si ya hay un ganador circulo
                System.out.println("Elija una posición para la equis");
                posicion1 = teclado.nextInt();
                posicion2 = teclado.nextInt();

                //Validar que la casilla seleccionada no esté ocupada, en ese caso, marcar la casilla como ocupada
                if (!objJuego.getCasillaEquis(posicion1, posicion2) && !objJuego.getCasillaCirculo(posicion1, posicion2)) {

                    objJuego.setCasillaEquis(posicion1, posicion2);  //ASIGNAR POSICIÓN CIRCULO
                    objJuego.imprimirTablero();

                } else {
                    while ( objJuego.getCasillaCirculo(posicion1,posicion2) && objJuego.getCasillaEquis(posicion1,posicion2)) {
                        System.out.println("La posición seleccionada ya se encuentra ocupada"); //TODO saber si es una 'X' o 'O'
                        System.out.println("Introduzca de nuevo la posición");
                        posicion1 = teclado.nextInt();
                        posicion2 = teclado.nextInt();
                    }
                }

                //Comprobar ganador
                ganadorEquis = objJuego.comprobarGanadorEquis();
            }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

         ronda++;

        }while (!ganadorCirculo && !ganadorEquis && ronda < 8);

        if (ganadorCirculo){
            System.out.println("Enhorabuena! ha ganado circulo");
        }else{
            if (ganadorEquis){
                System.out.println("Enhorabuena! ha ganado Equis");
            }else{
                System.out.println("Empate");
            }
        }

    }

}
