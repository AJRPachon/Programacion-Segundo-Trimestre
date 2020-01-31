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

    @Override //Para sobreescribir la clase
    public String toString(){

        return (this.velocidad + this.modelo);

    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public int hashCode(){      //Sirve para identificar al objeto (como un "ID")

        return (this.velocidad + 1);
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public int compareTo( Procesador objProcesador ){     //El metodo compareTo no se sobrescribe. Compara 2 objetos

        int res = -1;

        if ( this.velocidad > objProcesador.velocidad ){

            res = 1;

        }else {
            if ( this.velocidad == objProcesador.velocidad ) {

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

            Procesador objProcesador = (Procesador) obj;

            if (this.velocidad == objProcesador.velocidad) {

                igual = true;

            }
        }

        return igual;

    }


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public Procesador clone(){

        Procesador objProcesador = null;

        try {
            objProcesador = (Procesador)super.clone();
        }catch (CloneNotSupportedException nombreDeLaExcepcion){
            System.out.println(nombreDeLaExcepcion.getMessage());
        }

        return objProcesador;

    }


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}

