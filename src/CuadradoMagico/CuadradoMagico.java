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

public class CuadradoMagico {
}
