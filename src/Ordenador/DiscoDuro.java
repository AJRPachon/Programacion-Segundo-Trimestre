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

    @Override //Para sobreescribir la clase
    public String toString(){

        return ("Tamaño: "+this.tamanio+" Gb" + "\nTipo: "+this.tipo);

    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public int hashCode(){      //Sirve para identificar al objeto (como un "ID")

        return (this.tamanio + 1);
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public int compareTo( DiscoDuro objDiscoDuro ){     //El metodo compareTo no se sobrescribe. Compara 2 objetos

        int res = -1;

        if ( this.tamanio > objDiscoDuro.tamanio ){

            res = 1;

        }else {
            if ( this.tamanio == objDiscoDuro.tamanio ) {

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

            DiscoDuro objDiscoDuro = (DiscoDuro) obj;

            if (this.tamanio == objDiscoDuro.tamanio) {

                igual = true;

            }
        }

        return igual;

    }


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public DiscoDuro clone(){

        DiscoDuro objDiscoDuro = null;

        try {
            objDiscoDuro = (DiscoDuro)super.clone();
        }catch (CloneNotSupportedException nombreDeLaExcepcion){
            System.out.println(nombreDeLaExcepcion.getMessage());
        }

        return objDiscoDuro;

    }


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
