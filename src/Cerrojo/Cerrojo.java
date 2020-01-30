package Cerrojo;
/*
    ANALISIS:
        1. Diseñe e implemente una clase Cerrojo con combinación que tiene los siguientes requisitos:
         a. Tiene una combinación, que es una secuencia de tres números y está oculta.
         b. La combinación puede cambiarse, pero sólo por alguien que conoce la combinación actual.
         c. El cerrojo se puede abrir proporcionando la combinación.
         d. Deshabilite la copia de cerrojos con combinación.

    PROPIEDADES BASICAS
        combinacion int modificable

    PROPIEDADES DERIVADAS
        Ninguna


    PROPIEDADES COMPARTIDAS
        Ninguna


    INTERFAZ
    METODOS BASICOS
        setCombinacion()


    METODOS AÑADIDOS
        Ninguno

 */


public class Cerrojo implements Cloneable {

    private int combinacion;

    public Cerrojo(){       //Constructor

        this.combinacion = 000;

    }

    public Cerrojo(int combinacion){        //Constructor con parametros

        this.combinacion = combinacion;

    }

    public void setCombinacion(int combinacion){

        this.combinacion = combinacion;

    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Override //Para sobreescribir la clase Object
    public String toString(){

        return ("El atributo combinacion tiene un valor: "+this.combinacion);

    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public int hashCode(){      //Sirve para identificar al objeto (como un "ID")

        return this.combinacion+1;
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public int compareTo( Cerrojo objCerrojo2 ){     //El metodo compareTo no se sobrescribe. Compara 2 objetos

        int res = -1;

        if ( this.combinacion > objCerrojo2.combinacion){

            res = 1;

        }else {
            if (this.combinacion == objCerrojo2.combinacion ) {

                res = 0;

            }
        }

        return res;

    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @Override
    public boolean equals( Object obj ){        //Comprueba si 2 objetos son iguales. Devuelve booleano

        boolean igual = this == obj ;

        if( obj != null && obj instanceof Cerrojo ){

            Cerrojo objCerrojo = (Cerrojo)obj;    //Casteo obj a la clase Cerrojo

            if( this.combinacion == objCerrojo.combinacion ){

                igual = true;

            }
        }

        return igual;

    }


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public Cerrojo clone(){

        Cerrojo objCerrojo = null;

        try {
            objCerrojo = (Cerrojo)super.clone();
        }catch (CloneNotSupportedException e){
            System.out.println(e.getMessage());
        }

        return objCerrojo;
        
    }


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
