package Array1;
/*
    ANALISIS:
        1. Implementa una clase de utilidad donde se contemplen funcionalidades como:
            a. Dado un array cargado aleatoriamente, generar a partir de él otro array que contenga los elementos pares que se encuentran en el primero.
            b. Crear un array de 20 elementos, con números aleatorios comprendidos entre 100 y 300, de forma que no se repita ningún elemento.
            c. Dado un array de números enteros, generar a partir de él un nuevo array donde se almacenen los elementos del primero que sean primos.
            d. A partir de un array generar otro con los elementos al revés.
            e. Funcionalidad que reciba un array de enteros y un número y devuelva la posición en la que lo encuentre y -1 si el número no está en el array. En el array no puede haber números repetidos.

    ENTRADAS:
    
    SALIDAS:
    
    PSEUDOCODIGO GENERALIZADO:
    Inicio
    
    
    Fin
    
*/

import java.util.Random;

class EjercicioArray {

    /*
    SIGNATURA:

    COMENTARIO:
         a. Dado un array cargado aleatoriamente, generar a partir de él otro array que contenga
          los elementos pares que se encuentran en el primero.

    PRECONDICIONES:
        Ninguna

    ENTRADAS:
        Ninguna

    SALIDAS:
        Ninguna

    ENTRADAS/SALIDAS:
        Ninguna

    POSTCONDICION:
        El array generado tiene que contener solo los elementos pares del otro array


     */

    public void practicaArray(){

        Random rnd = new Random();

        int numeroaleatorio;
        int arrayAleatorios[] = new int[10];

        //Añadir numero aleatorios al array
        for (int cont = 0; cont < arrayAleatorios.length; cont++){

            numeroaleatorio = rnd.nextInt();

            arrayAleatorios[cont] = numeroaleatorio;

        }



    }


}
