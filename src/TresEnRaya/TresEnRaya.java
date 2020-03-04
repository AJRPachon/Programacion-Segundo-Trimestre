package TresEnRaya;
/*

PSEUDOCODIGO:
ProgramaPrincipal
Inicio

    Presentacion del programa



Fin


 */


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
            while ( objJuego.getCasillaCirculo(posicion1,posicion2) || objJuego.getCasillaEquis(posicion1,posicion2)) {
                    System.out.println("\nLa posición seleccionada ya se encuentra ocupada"); //TODO saber si es una 'X' o 'O'
                    System.out.println("Introduzca de nuevo la posición");
                    objJuego.imprimirTablero();
                    posicion1 = teclado.nextInt();
                    posicion2 = teclado.nextInt();

                }

            objJuego.setCasillaCirculo(posicion1, posicion2);  //ASIGNAR POSICIÓN CIRCULO
            objJuego.imprimirTablero();

            //Comprobar ganador
            ganadorCirculo = objJuego.comprobarGanadorCirculo();

        ronda++;

/////////////// SELECCIONAR EQUIS ///////////////////////////////////////////////////////////////////////////////////////

            if (!ganadorCirculo && ronda < 9) { //Para que no siga ejecutando si ya hay un ganador circulo
                System.out.println("Elija una posición para la equis");
                posicion1 = teclado.nextInt();
                posicion2 = teclado.nextInt();

                //Validar que la casilla seleccionada no esté ocupada, en ese caso, marcar la casilla como ocupada
                while ( objJuego.getCasillaCirculo(posicion1,posicion2) || objJuego.getCasillaEquis(posicion1,posicion2)) {
                        System.out.println("\nLa posición seleccionada ya se encuentra ocupada"); //TODO saber si es una 'X' o 'O'
                        System.out.println("Introduzca de nuevo la posición");
                        objJuego.imprimirTablero();
                        posicion1 = teclado.nextInt();
                        posicion2 = teclado.nextInt();
                    }

                objJuego.setCasillaEquis(posicion1, posicion2);  //ASIGNAR POSICIÓN EQUIS
                objJuego.imprimirTablero();

                //Comprobar ganador
                ganadorEquis = objJuego.comprobarGanadorEquis();
            }

         ronda++;

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        }while (!ganadorCirculo && !ganadorEquis && ronda < 9);

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
