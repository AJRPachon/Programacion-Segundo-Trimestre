package Ordenador;

/*

    PROPIEDADES BASICAS
        tamanio int consultable
        tipo int consultable


    PROPIEDADES DERIVADAS
        Ninguna


    PROPIEDADES COMPARTIDAS
        Ninguna


    INTERFAZ
    METODOS BASICOS
        getTamanio()
        getTipo()


    METODOS AÑADIDOS
        Ninguno



 */


public class DiscoDuro {

    private int tamanio;
    private String tipo;

    public DiscoDuro(){ //Constructor

        this.tamanio = 0;
        this.tipo = " ";

    }

    public DiscoDuro(int tamanio, String tipo){  //Constructor con parámetros

        this.tamanio = tamanio;
        this.tipo = tipo;

    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    public int getTamanio() {
        return tamanio;
    }

    public String getTipo() {
        return tipo;
    }


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
