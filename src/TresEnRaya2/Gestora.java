package TresEnRaya2;

import java.util.Scanner;

public class Gestora {

    //Para saber qué caracter toca en cada turno
    public char turno(char caracter, int ronda){

        if ( ronda % 2 != 0 ){
            caracter = 'X';
        }else{
            caracter = 'O';
        }
        return caracter;
    }


}
