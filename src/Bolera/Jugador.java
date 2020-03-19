package Bolera;

/*
    ANALISIS:
        Esta clase va a controlar el nombre y la puntuación de los jugadores

    PROPIEDADES BASICAS:
        String Nombre consultable
        int puntuacion consultable y modificable


    PROPIEDADES DERIVADAS:
        Ninguna



    INTERFAZ
    METODOS BASICOS:
        getNombre()

        getPuntuacion()
        setPuntuacion()

    METODOS AÑADIDOS:

 */


public class Jugador {

    private String nombre;
    private int puntuacion;


////////// CONSTRUCTORES //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Constructor sin parametros
    public Jugador(){

        this.nombre = " ";
        this.puntuacion = 0;

    }


    //Constructor con parametros

    public Jugador(String nombre, int puntuacion){

        this.nombre = nombre;
        this.puntuacion = puntuacion;

    }

///////// GETTERS Y SETTERS ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public String getNombre(){

        return this.nombre;
    }

    public int getPuntuacion(){

        return this.puntuacion;
    }

    public void setPuntuacion(int valor){

        this.puntuacion = valor;
    }


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
