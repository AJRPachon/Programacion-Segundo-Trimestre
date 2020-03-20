package Bolera;

/*
    ANALISIS:
        Esta clase va a controlar el nombre y la puntuación de los jugadores

    PROPIEDADES BASICAS:
        String Nombre consultable
        int puntuacion consultable y modificable
        int IDJugador consultable ( propiedad compartida (static) )
        int incrementoID consultable


    PROPIEDADES DERIVADAS:
        Ninguna



    INTERFAZ
    METODOS BASICOS:
        getNombre()

        getPuntuacion()
        setPuntuacion()

        getIDJugador

    METODOS AÑADIDOS:

 */


public class Jugador {

    private String nombre;
    private int puntuacion;
    private int IDJugador;
    private static int incrementoID = 0;


////////// CONSTRUCTORES //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Constructor sin parametros
    public Jugador(){

        this.nombre = " ";
        this.puntuacion = 0;
        this.IDJugador = ++incrementoID;

    }


    //Constructor con parametros

    public Jugador(String nombre, int puntuacion){

        this.nombre = nombre;
        this.puntuacion = puntuacion;
        this.IDJugador = ++incrementoID;

    }

///////// GETTERS Y SETTERS ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public String getNombre(){

        return this.nombre;
    }

    public int getPuntuacion(){

        return this.puntuacion;
    }

    public int getIDJugador(){

        return this.IDJugador;
    }

    public void setPuntuacion(int valor){

        this.puntuacion = valor;
    }

///////// METODOS OVERRIDE ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
