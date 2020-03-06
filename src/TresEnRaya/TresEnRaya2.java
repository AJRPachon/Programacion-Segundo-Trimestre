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

        Juego2 obj = new Juego2();

        obj.imprimirTablero();

        obj.setCasillas(1,2,'X');

        System.out.println(obj.getCasillas(1,1));

        obj.imprimirTablero();

    }
}
