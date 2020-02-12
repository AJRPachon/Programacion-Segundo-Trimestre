package Vuelo;
/*

    PROPIEDADES BASICAS:
        int fumadores
        int pasajeros


    PROPIEDADES DERIVADAS:
        Ninguna


    PROPIEDADES COMPARTIDAS:
        Ninguna


    INTERFAZ
    METODOS BASICOS:
        getFumadores()
        getPasajeros()


    METODOS AÑADIDOS:
        Ninguna

    
*/


import org.jetbrains.annotations.NotNull;

public class VueloObjetos {

    private int fumadores;
    private int pasajeros;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public VueloObjetos(){ //Constructor

        this.fumadores = 0;
        this.pasajeros = 0;

    }

    public VueloObjetos(int fumadores, int pasajeros){  //Constructor con parametros

        this.fumadores = fumadores;
        this.pasajeros = pasajeros;

    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public int getFumadores(){

        return this.fumadores;

    }

    public int getPasajeros(){

        return this.pasajeros;

    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public String toString(){

        return ("El numero de fumadores son: "+this.fumadores+"\nEl numero de pasajeros son: "+this.pasajeros);

    }

    @Override
    public int hashCode(){

        return ((this.fumadores + this.pasajeros)*2);

    }

    @Override
    public boolean equals( Object obj ){

        boolean igual = false;

        if ( obj != null && obj instanceof VueloObjetos) {

            VueloObjetos objVueloObjetos = (VueloObjetos) obj;

            if (this.fumadores == objVueloObjetos.fumadores && this.pasajeros == objVueloObjetos.pasajeros ) {

                igual = true;

            }
        }

        return igual;

    }

    @Override
    public VueloObjetos clone(){

        VueloObjetos objVueloObjetos = null;

        try {
            objVueloObjetos = (VueloObjetos)super.clone();
        }catch (CloneNotSupportedException nombreDeLaExcepcion){
            System.out.println(nombreDeLaExcepcion.getMessage());
        }

        return objVueloObjetos;

    }


    public int compareTo(VueloObjetos objVueloObjetos){

        int res = -1;

        if ( this.fumadores > objVueloObjetos.fumadores && this.pasajeros > objVueloObjetos.pasajeros ){

            res = 1;

        }else {
            if ( this.fumadores == objVueloObjetos.fumadores && this.pasajeros > objVueloObjetos.pasajeros ) {

                res = 0;

            }
        }

        return res;

    }



}








