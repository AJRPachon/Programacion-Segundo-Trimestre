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

    @Override //Para sobreescribir la clase
    public String toString(){

        return (this.tamanio + this.velocidad + this.tipo);

    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public int hashCode(){      //Sirve para identificar al objeto (como un "ID")

        return ((this.tamanio + this.velocidad) + 1);
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public int compareTo( Memoria objMemoria ){     //El metodo compareTo no se sobrescribe. Compara 2 objetos

        int res = -1;

        if ( this.velocidad > objMemoria.velocidad && this.tamanio > objMemoria.velocidad ){

            res = 1;

        }else {
            if ( this.velocidad == objMemoria.velocidad && this.tamanio == objMemoria.velocidad ) {

                res = 0;

            }
        }

        return res;

    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @Override
    public boolean equals( Object obj ){

        boolean igual = false;

        if ( obj != null && obj instanceof Memoria ) {

            Memoria objMemoria = (Memoria) obj;

            if (this.velocidad == objMemoria.velocidad && this.tamanio == objMemoria.tamanio) {

                igual = true;

            }
        }

        return igual;

    }


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public Memoria clone(){

        Memoria objMemoria = null;

        try {
            objMemoria = (Memoria)super.clone();
        }catch (CloneNotSupportedException nombreDeLaExcepcion){
            System.out.println(nombreDeLaExcepcion.getMessage());
        }

        return objMemoria;

    }


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
