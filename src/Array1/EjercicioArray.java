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

import java.util.Map;
import java.util.Random;

class EjercicioArray {

    /*
    SIGNATURA: public static void practicaArray()

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

 public static void main (String[] args){

     //practicaArray();
     arrayVeinte();

 }


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void practicaArray(){  //Static porque es un metodo de la clase
                                        //No static - son gestoras, los metodos son lo de los objetos (crear el objeto para poder usarlo)

        Random rnd = new Random();

        int cont2 = 0;
        int numeroaleatorio;
        int arrayAleatorios[] = new int[10];


        //Añadir numero aleatorios al array
        for (int cont = 0; cont < arrayAleatorios.length; cont++){

            numeroaleatorio = rnd.nextInt(15);

            arrayAleatorios[cont] = numeroaleatorio;

            if(numeroaleatorio % 2 == 0 && numeroaleatorio != 0) {

                cont2++;

            }

        }


        int arrayPares[] = new int[cont2];

        for (int cont = 0, cont3 = 0; cont < arrayAleatorios.length; cont++){

            if( arrayAleatorios[cont] % 2 == 0 && arrayAleatorios[cont] != 0 ){

                arrayPares[cont3] = arrayAleatorios[cont];

                cont3++;

            }

        }

        for(int cont = 0; cont < arrayAleatorios.length; cont++){

            System.out.print(arrayAleatorios[cont]+" | ");

        }

        System.out.println();

        for(int cont = 0; cont < arrayPares.length; cont++){

            System.out.print(arrayPares[cont]+" | ");

        }



    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /*
    SIGNATURA:
        public static void arrayVeinte()

    COMENTARIO:
          b. Crear un array de 20 elementos, con números aleatorios comprendidos
           entre 100 y 300, de forma que no se repita ningún elemento.

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

    public static void arrayVeinte(){

        int elementos[] = new int[20];
        int aleatorio;

        Random rnd = new Random();

        for(int cont = 0; cont < elementos.length; cont++){

            //Math.floor(Math.random()*(N-M+1)+M) para que los dos numeros estén incluidos M < N
            aleatorio = (int) Math.floor(Math.random()*(300-100+1)+100);

            for(int cont2 = 0; cont2 < cont; cont2++){

                if (aleatorio == elementos[cont2]){
                    aleatorio = (int) Math.floor(Math.random()*(300-100+1)+100);
                    cont2 = -1;
                }

            }

            elementos[cont] = aleatorio;

            System.out.print(elementos[cont]+" | ");

        }


    }


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /*
    SIGNATURA:
        public static void arrayPrimos()

    COMENTARIO:
          c. Dado un array de números enteros, generar a partir de él un nuevo array donde se almacenen
            los elementos del primero que sean primos.

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

    public static void arrayPrimos(){

        int cont2 = 0;
        int numeros[] = new int[10];
        int primos[] = new int[cont2];
        int elementos;

        Random rnd = new Random();


        for(int cont = 0; cont < primos.length; cont++){

            elementos = rnd.nextInt(20)+1;

            numeros[cont] = elementos;

            if (elementos ){


            }

        }



    }


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
