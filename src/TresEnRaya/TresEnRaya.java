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

        int posicion1=0, posicion2=0;
        int hola;
        int jugador;

        //Comprobar si la casilla elegida está libre
        do {

            posicion1 = teclado.nextInt();
            posicion2 = teclado.nextInt();

            //Validar que la casilla seleccionada no esté ocupada, en ese caso, marcar la casilla como ocupada
            if (!objJuego.getCasillaCirculo(posicion1, posicion2)) {

                objJuego.setCasillaCirculo(posicion1, posicion2);  //ASIGNAR POSICIÓN CIRCULO
                objJuego.imprimirTablero();

            } else {
                System.out.println("La posición seleccionada ya se encuentra ocupada por:"); //saber si es una 'X' o 'O'

            }

            hola = teclado.nextInt();

        }while (hola != 0);
    }

}
