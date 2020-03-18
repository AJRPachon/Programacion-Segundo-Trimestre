package Bolera;

/*

    Se desea ver en pantalla todos los datos de la competición, la puntuación final de cada partida en cada pista, la máxima puntuación de cada pista
    junto con los nombres de los ganadores.

    ANALISIS:
        Esta clase va a gestionar las partidas que se vayan realizando en la competición, la puntuación de los jugadores, y se encargará de imprimir los resultados

    PROPIEDADES BASICAS:
        int[numPartidas][4] partidaJugador ( filas: numPartidas ·· columnas: Jugador(4) )

    PROPIEDADES DERIVADAS:
        Ninguna


    INTERFAZ
    METODOS BASICOS:
        getPartidaJugador()

        //Patrón de legación clase Jugador
        getJugaNombre()
        getJugaPuntuacion()
        setJugaPuntuacion()


    METODOS AÑADIDOS:

       jugarPartida()  ··  ( Para el numero total de partidas, recorre el array y va generando las puntuaciones de los jugadores (generarPuntuacionJugadores()) )

       generarPuntuacionJugadores()  ··  ( Genera una puntuación para cada uno de los jugadores ( del 0 al 300 ) )

       mostrarPuntuacionFinal() ·· ( Puntuación de cada jugador en cada pista )

       calcularGanador() ·· ( Calcula cual Jugador ha ganado( puntuación más alta ), devuelve la posición del array en la que se encuentre el ganador( Clase Jugador ) )

       maxPuntuacionPista()  ·· ( Muestra la máxima puntuación por pista + nombre ganador )


 */


public class Partida {

////////// CONSTRUCTORES //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

///////// GETTERS Y SETTERS ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

///////// JUGAR PARTIDA ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/*
    SIGNATURA:
        public void jugarPartida()

    COMENTARIO:
        Para el numero total de partidas, recorre el array y va generando las puntuaciones de los jugadores (generarPuntuacionJugadores())

    ENTRADAS:

    SALIDAS:

    ENTRADA/SALIDA:

    PRECONDICIONES:
        El array partidaJugador debe contener el numero total de partidas y deben de haberse creado los jugadores

    POSTCONDICIONES:
        El array partidaJugador debe contendrá el numero total de partidas y las puntuaciones correspondientes a cada jugador

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

///////// CALCULAR GANADOR ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/*
    SIGNATURA:
        public int calcularGanador()

    COMENTARIO:
        Calcula cual Jugador ha ganado( puntuación más alta ), devuelve la posición del array en la que se encuentre el ganador ( Clase Jugador )

    ENTRADAS:

    SALIDAS:
        Entero con la posición del array del ganador de la partida

    ENTRADA/SALIDA:

    PRECONDICIONES:
        Se ha debido de jugar la partida de la cual queremos calcular el ganador

    POSTCONDICIONES:
        Devolverá el ganador de esa partida

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

///////// METODOS OVERRIDE ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
