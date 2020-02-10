package Hogwarts;

/*
 El Colegio Hogwarts de magia y hechicería utiliza un esquema de puntuación de alumnos basado en calificaciones relativas. De acuerdo con este esquema,
  a la calificación numérica n obtenida por un alumno en un examen se le asigna una calificación cualitativa SB,NT,AP,IS,MD de acuerdo con el siguiente criterio:

    a. Si n < m – 3/2 σ, entonces la calificación es MD,
    b. Si m – 3/2 σ ≤ n < m – 1/2 σ, entonces la calificación es SS,
    c. Si m - 1/2 σ ≤ n < m +1/2σ, entonces la calificación es AP,
    d. Si m + 1/2 σ ≤ n < m +3/2 σ, entonces la calificación es NT,
    e. Si m+3/2σ ≤ n, entonces la calificación es SB.

    Aquí m es la media de las notas obtenidas por todos los alumnos en el examen, y σ es la desviación típica. Escribe un programa que dadas las notas numéricas obtenidas
    por los alumnos en un examen muestre un diagrama con la distribución de las puntuaciones cualitativas de la forma:
    MH *** (matrícula de honor)
    SB ***** (sobresaliente)
    NT ************  (notable)
    AP ********************** (aprobado)
    IS ********* (insuficiente)
    MD ** (muy deficiente)

    Donde, para cada calificación, se muestran tantos asteriscos como alumnos hayan logrado dicha calificación.
    Siendo Xi cada una de las notas, N el número de alumnos y μ es el valor medio de {Xi}, la fórmula para hallar la desviación típica es la siguiente:


 */

import java.util.Random;

public class ColegioHogwarts{

    public static void main(String[] args) {

        colegioHogwartsMetodo();

    }



//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        /*
    SIGNATURA:
        public static void ColegioHogwartsMetodo()

    COMENTARIO:


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

        public static void colegioHogwartsMetodo(){

            int notas[] = new int[20];
            int notaAleatoria;
            int sumaNotas = 0;
            int notaMedia = 0;
            double desTipica = 0;

            Random rnd = new Random();

            //Para añadir las notas aleatorias al array == N
            for(int cont=0; cont < notas.length; cont++){

                notaAleatoria =  rnd.nextInt(10)+1;

                notas[cont] = notaAleatoria;

                sumaNotas += notaAleatoria;

            }


            //Calcular la nota media de todos los alumnos == M
            notaMedia = sumaNotas/notas.length;

            //Calcular la desviación típica

            desTipica = Math.sqrt(Math.pow((sumaNotas-notaMedia),2) / notas.length);









        }

}
