package Bolera;

/*

    8. En una bolera de 12 pistas se celebra una competición de bolos.

    En dicha competición participan 4 jugadores por pista, y para cada uno de ellos se almacena su nombre y las puntuaciones de cada partida.

     Implementar un programa para gestionar esta competición.

     Se desea ver en pantalla todos los datos de la competición, la puntuación final de cada partida en cada pista, la máxima puntuación de cada pista
     junto con los nombres de los ganadores.


*/

/*
    ANALISIS:

    PROPIEDADES BASICAS:
        Jugador [cantJuga] numJugador consultable ( cantJuga en este caso es 4 )
        int IDPista consultable ( propiedad compartida (static) )


    PROPIEDADES DERIVADAS:
        int puntMaximaPista consultable



    INTERFAZ
    METODOS BASICOS:
        getPistaJugadores()


        //Patron delegacion
            getJugadorNombre()

            getJugadorPuntuacion()
            setJugadorPuntuacion()

            getJugadorID()


    METODOS AÑADIDOS:
        mostrarPuntuacionFinal() ·· ( Puntuación de cada jugador )
        maxPuntuacionPista()  ·· ( Muestra la máxima puntuación + nombre ganador )
        generarPuntuacionJugadores()  ··  ( Genera una puntuación para cada uno de los jugadores ( del 0 al 300 ) )


*/

public class Pista {



///////// MOSTRAR PUNTUACION FINAL ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/*
    SIGNATURA:
         public void mostrarPuntuacionFinal()

    COMENTARIO:
        Puntuación de cada jugador en cada pista impresa por pantalla

    ENTRADAS:

    SALIDAS:

    ENTRADA/SALIDA:

    PRECONDICIONES:
        Se han debido de jugar todas las partidas

    POSTCONDICIONES:
        Mostrara las puntuaciones de los jugadores impresa por pantalla

 */


///////// MAXIMA PUNTUACION PISTA /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/*
    SIGNATURA:
        public void maxPuntuacionPista()

    COMENTARIO:
        Muestra la máxima puntuación por pista + nombre ganador ( calcular ganador )

    ENTRADAS:

    SALIDAS:

    ENTRADA/SALIDA:

    PRECONDICIONES:
        Se han debido de jugar todas las partidas

    POSTCONDICIONES:
        Debe mostrar el nombre del ganador (puntuación más alta ( calcularGanador ) )

 */


///////// GENERAR PUNTUACION JUGADORES ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/*
    SIGNATURA:
        public void generarPuntuacionJugadores()

    COMENTARIO:
        Genera una puntuación para cada uno de los jugadores ( del 0 al 300 )

    ENTRADAS:

    SALIDAS:

    ENTRADA/SALIDA:

    PRECONDICIONES:
        El array partidaJugador debe contener el numero total de partidas y deben de haberse creado los jugadores

    POSTCONDICIONES:
        El array partidaJugador debe contendrá las puntuaciones correspondientes a cada jugador
 */

///////// METODOS OVERRIDE ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
