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
        Esta clase contiene un array con el numero de jugadores (en este caso 4) por pista
        Gestionará quién es el ganador, puntuación máxima

    PROPIEDADES BASICAS:
        Jugador [cantPista][cantJuga] partida consultable ( cantJuga en este caso es 4 ) ( cantPista en este caso 12)
        int IDPista consultable
        int incrementoIDP consultable ( propiedad compartida (static) )


    PROPIEDADES DERIVADAS:
        int puntMaximaPista consultable



    INTERFAZ
    METODOS BASICOS:
        getPartida()
        getIDPista()

        getLongitudPista()
        getLongitudJugadores()


        //Patron delegacion
            getJugadorNombre()

            getJugadorPuntuacion()
            setJugadorPuntuacion()

            getJugadorID()


    METODOS AÑADIDOS:
        crearJugadores() ·· ( Añade el nombre y la puntuación(0) a nuestro array numJugador )
        mostrarPuntuacionPista() ·· ( Puntuación de cada jugador de cada pista )
        maxPuntuacionPista()  ·· ( Muestra la máxima puntuación + nombre ganador )
        generarPuntuacionJugadores()  ··  ( Genera una puntuación para cada uno de los jugadores ( del 0 al 300 ) )


*/

import java.util.Random;

public class Partida {

    private Jugador[][] partida;
    private int IDPista;
    private static int incrementoIDP = 0;

    private Jugador nombre;
    private Jugador puntuacion;
    private Jugador IDJugador;


////////// CONSTRUCTORES //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Constructor sin parametros
    public Partida(){

        this.partida = new Jugador[1][1];
        this.IDPista = ++incrementoIDP;

    }

    //Constructor con parametros
    public Partida(int cantPista, int cantJuga){

        this.partida = new Jugador[cantPista][cantJuga];
        this.IDPista = ++incrementoIDP;

    }

///////// GETTERS Y SETTERS ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Metodos Basicos
    public Jugador[][] getPartida() {
        return this.partida;
    }

    public int getIDPista() {
        return this.IDPista;
    }

    public int getLongitudPista(){
        return this.partida.length; //Devuelve la longitud de las filas
    }

    public int getLongitudJugadores(){
        return this.partida[0].length; //Devuelve la longiud de las columnas
    }


    //·······························//

    //Metodos clase Jugador
    public String getJugadorNombre() {
        return this.nombre.getNombre();
    }

    public int getJugadorPuntuacion() {
        return this.puntuacion.getPuntuacion();
    }

    public void setJugadorPuntuacion(int valor) {
        this.puntuacion.setPuntuacion(valor);
    }

    public int getJugadorIDJugador() {
        return this.IDJugador.getIDJugador();
    }



///////// MOSTRAR PUNTUACION FINAL ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/*
    SIGNATURA:
         public void mostrarPuntuacionPista()

    COMENTARIO:
        Puntuación de cada jugador de cada pista impresa por pantalla

    ENTRADAS:

    SALIDAS:

    ENTRADA/SALIDA:

    PRECONDICIONES:
        Se ha debido de jugar al menos 1 partida

    POSTCONDICIONES:
        Mostrara las puntuaciones de los jugadores impresa por pantalla

 */

    public void mostrarPuntuacionPista(){

        //Recorre las pistas
        for ( int cont = 0; cont < partida.length; cont++ ){

            System.out.println("Pista "+cont+":");

            //Recorre los jugadores
            for ( int cont2 = 0; cont2 < partida[0].length; cont2++ ) {

                System.out.println("El/La jugador/a " + this.partida[cont][cont2].getNombre() + " ha sacado una puntuación de :" + this.partida[cont][cont2].getPuntuacion());
            }

            System.out.println();
        }

    }


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

    public void maxPuntuacionPista(){

        int puntuacionActual;
        int puntuacionAnterior = 0;
        int jugador = 0; //para guardar la posición en la que se encuentra el jugador con la máxima puntuación

        //Recorrer el array para ver las puntuaciones de cada jugador

        //Recorre las pistas
        for ( int cont = 0; cont < partida.length; cont++ ){

            //Recorre los jugadores
            for ( int cont2 = 0; cont2 < partida[0].length; cont2++) {

                puntuacionActual = this.partida[cont][cont2].getPuntuacion();

                if (puntuacionActual > puntuacionAnterior) {

                    jugador = cont2;

                }

                puntuacionAnterior = puntuacionActual;
            }

            System.out.println("Pista "+cont+":");
            System.out.println("El jugador ganador es "+this.partida[cont][jugador].getNombre());
            System.out.println("Con una puntuación de :"+this.partida[cont][jugador].getPuntuacion()+" puntos");
            System.out.println();

        }

    }


///////// CREAR JUGADORES ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


/*

    SIGNATURA:
        public void crearJugadores()

    COMENTARIO:
        Añade el nombre y la puntuación(0) a nuestro array numJugador

    ENTRADAS:
        nombre ( proviene del Enum )

    SALIDAS:

    ENTRADA/SALIDA:

    PRECONDICIONES:
        Debe de haberse inicializado el array jugadores

    POSTCONDICIONES:
        Jugadores con nombres, IDs únicos y puntuaciones(en este caso 0)

 */

    //Tengo que pasarle el contador que va a ir cogiendo los nombres de los jugadores
    public void crearJugadores(int contadorNombres){

        NombreJugadores objNombreJuga = new NombreJugadores();

        String nombres;
        int puntuacion = 0;

        //Recorre las partidas
        for (int cont = 0; cont < partida.length; cont++) {

            //Recorre los jugadores
            for ( int cont2 = 0; cont2 < partida[0].length; cont2++) {

                //Coge el nombre
                nombres = objNombreJuga.nombres[contadorNombres];

                //Creamos el jugador con el nombre y la puntuacion
                this.partida[cont][cont2] = new Jugador(nombres, puntuacion);

            }
        }

    }


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
        Deben de haberse creado los jugadores

    POSTCONDICIONES:
        Los jugadores deben tener una puntuación ( del 0 al 300 )

 */

    public void generarPuntuacionJugadores(){

        Random rnd = new Random();

        int valor;

        //Añadir las puntuaciones a los jugadores
        //Recorre las partidas
        for ( int cont = 0; cont < partida.length; cont++ ){

            //Recorre los jugadores
            for ( int cont2 = 0; cont2 < partida[0].length; cont2++ ) {

                //Generar la puntuación, de 0 a 300
                valor = rnd.nextInt(301);

                //Asignamos el valor del random al jugador correspondiente
                this.partida[cont][cont2].setPuntuacion(valor);

            }

        }

    }
    

///////// METODOS OVERRIDE ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
