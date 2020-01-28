package Ordenador;

/*

    PROPIEDADES BASICAS
        tamanio int consultable
        velocidad int consultable
        tipo int consultable


    PROPIEDADES DERIVADAS
        Ninguna


    PROPIEDADES COMPARTIDAS
        Ninguna


    INTERFAZ
    METODOS BASICOS
        getTamanio()
        getVelocidad()
        getTipo()


    METODOS AÑADIDOS
        Ninguno



 */

public class Memoria {

    private int tamanio, velocidad;
    private String tipo;

    public Memoria(){  //Constructor

        this.tamanio = 0;
        this.velocidad = 0;
        this.tipo = " ";

    }


    public Memoria(int tamanio, int velocidad, String tipo){ //Constructor con parámetros

        this.tamanio = tamanio;
        this.velocidad = velocidad;
        this.tipo = tipo;

    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public int getTamanio() {
        return tamanio;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public String getTipo() {
        return tipo;
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


}
