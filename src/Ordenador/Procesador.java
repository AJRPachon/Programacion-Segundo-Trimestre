package Ordenador;

/*

    PROPIEDADES BASICAS
        modelo String consultable
        velocidad int consultable


    PROPIEDADES DERIVADAS
        Ninguna


    PROPIEDADES COMPARTIDAS
        Ninguna


    INTERFAZ
    METODOS BASICOS
        getModelo()
        getVelocidad()


    METODOS AÑADIDOS
        Ninguno



 */


public class Procesador {

    private String modelo;
    private int velocidad;


    public Procesador(){  //Constructor

        this.modelo = " ";
        this.velocidad = 0;

    }

    public Procesador(String modelo, int velocidad){    //Constructor con parametros

        this.modelo = modelo;
        this.velocidad = velocidad;

    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public int getVelocidad() {
        return velocidad;
    }

    public String getModelo() {
        return modelo;
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}

