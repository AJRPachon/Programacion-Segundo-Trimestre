package CuadradoMagico;

/*
    9. Un cuadrado mágico es una matriz cuadrada con un número impar de filas y columnas, cuyas filas y columnas y sus diagonales principal
     y secundaria, suman el mismo valor. Por ejemplo, la matriz siguiente es un cuadrado mágico de 3 por 3:
        6 1 8
        7 5 3
        2 9 4
    Los números en cada fila, cada columna y cada diagonal suman 15
    Una técnica que se utiliza para generar cuadrados mágicos es la siguiente:
    Se comienza fijando un valor de 1 en el elemento central de la primera fila.

    A continuación, se van escribiendo los sucesivos valores (2, 3, etc.) desplazándose desde la posición anterior una fila hacia
     arriba y una columna hacia la izquierda.

    Estos desplazamientos se realizan tratando la matriz como si estuviera envuelta sobre si misma, de forma que moverse una posición
    hacia arriba desde la fila superior lleva a la inferior y moverse una posición a la izquierda desde la primera columna conduce a la última.

    Si la nueva posición está ya ocupada, en lugar de desplazarse una fila hacia arriba y una columna hacia la izquierda, se moverá
    simplemente una fila hacia abajo y continuará el proceso.

    Realizar un programa en Java que genere el cuadrado mágico de dimensión n, siendo n un número impar que introduce el usuario
    y comprendido entre 2 y 9.


 */

/*

    Cagar el array con ceros para poder compararlo a la hora de añadir numeros

    p2 = array.length / 2
    club[0][p2]  //aquí es donde tienen que empezar todos los cuadrados mágicos ( empiezan por el 1 )

    setNumero(int 0,int p2) para añadir el 1 siempre

    fila = 0
    columna = p2

    numInsertado++

    REPETIR

        Si ( club[fila-1][columna-1] != 0 ) fila = fila+1 //Para saber si la siguiente posición está ocupada
        SiNo
            fila-- columna--
        FinSi

        Si ( fila < 0 || fila > array.length-1 ) fila == array.length-1
        Si ( columna < 0 || columna > array.length-1 ) columna == array.length-1 //Para cuando lleguen a 0, que vuelvan a la posición inicial

        setNumero(fila, columna) //Para darle valor a la casilla

        numInsertado++

    MIENTRAS ( numInsertado < array.length )



 */

public class CuadradoMagico {

    public static void main(String[] args){

        int fila = 3;
        int columna = 3;
        int p2; //columna de la matriz
        int p1 = 0; //fila de la matriz
        int numInsertado = 1; //Numero que va a ir incrementando en la matriz
        int p1Ant, p2Ant;

        Matriz cuadrado = new Matriz(fila, columna);

        //Saber cuál es el punto medio del cuadrado
        p2 = cuadrado.getCuadrado().length / 2;

        //Insertar el 1 en la matriz
        cuadrado.setPosicionCuadrado(p1, p2, numInsertado);
        numInsertado = 2; //Para cuando empiece la matriz, empiece en 2

        do { //REPETIR

            //Auxiliares para cuando la casilla siguiente esté ocupada, coja los valores anteriores y sólo haya que restarle 1 a la columna
            p1Ant = p1;
            p2Ant = p2;

            //En cada iteración, se disminuyen los valores
            p1--;
            p2--;


            //Para cuando fila llegue a 0, que vuelvan a la posición inicial
            if ( p1 < 0 ){ //|| p1 > cuadrado.getCuadrado().length - 1

                p1 = cuadrado.getCuadrado().length - 1;
            }

            //Para cuando columna llegue a 0, que vuelvan a la posición inicial
            if ( p2 < 0 ){ //|| p2 > cuadrado.getCuadrado().length -1

                p2 = cuadrado.getCuadrado().length - 1;
            }

            //Saber si la siguiente posición está ocupada
            if ( cuadrado.getPosicionCuadrado(p1,p2) != 0 ) {
                p1 = p1Ant+1;
                p2 = p2Ant;
            }

            //Darle valor a la casilla
            cuadrado.setPosicionCuadrado(p1, p2, numInsertado);

            numInsertado++;

        }while ( numInsertado <= (cuadrado.getCuadrado().length * cuadrado.getCuadrado().length )  );


        //Imprimir resultado cuadrado mágico
        cuadrado.imprimirCuadradoMagico();


    }


}
