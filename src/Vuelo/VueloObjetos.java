package Vuelo;
/*

    PROPIEDADES BASICAS:
        int fumadores
        int pasajeros
        int asientos[]
        

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


import java.util.Arrays;

public class VueloObjetos {

    private Asiento asientos[];

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public VueloObjetos(){ //Constructor

        this.asientos = new Asiento[20];
    }

    public VueloObjetos(int fumadores, int pasajeros, Asiento[] asientos){  //Constructor con parametros

        this.asientos = asientos;
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //creamos una variable posición pasada por parámetros para coger una casilla concreta del array
    public boolean getFumadoresAsiento(int posicion){

        return this.asientos[posicion].getFumadores();
    }

    public boolean getOcupadosAsiento(int posicion){

        return this.asientos[posicion].getOcupado();
    }


    public Asiento[] getAsiento(){

        return this.asientos;
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Metodo para calcular asientos ocupados por fumadores
    public int calcularFumadores(){

        int contadorFumadores=0;

        for(int cont = 16; cont < asientos.length; cont++)

            if( asientos[cont].getOcupado()){  //Como quiero conocer los asientos de fumadores, debo de llamar al metodo getOcupado() para saber cuales están ocupados y cuales no

                  contadorFumadores++;
            }
        return contadorFumadores;
    }


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /*
        SIGNATURA:
            public Asiento[] asientosDisponibles()

        COMENTARIO:
            El metodo tiene que crear un nuevo array con los asientos disponibles

        ENTRADAS:
            Ninguna

        SALIDAS:
            Array con los asientos disponibles

        ENTRADA/SALIDA:
            Ninguna

        PRECONDICIONES:
            Ninguna

        POSTCONDICIONES:
            El metodo devuelve asociado al nombre el Array cargado con los asientos

     */

    //Metodo para calcular asientos libres de fumadores
    public Asiento[] asientosDisponiblesNF() {

        int asientosDisponiblesNF=0;
        Asiento[] aD = new Asiento[];

        //Calculo numero de asientos vacios
        for (int cont = 0; cont < 17; cont++){

            if( asientos[cont].getOcupado() ){

                asientosDisponiblesNF++;
            }

        }

        for ( int cont = 0; cont < 17; cont++ ){ //del 0 al 17 porque son los numeros que puede tener el asiento

            if( asientos[cont].getOcupado() ){



            }

        }


        //Añado el numero de asientos vacios al nuevo array

    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Metodo para calcular asientos ocupados por no fumadores
    public int calcularOcupadosNF(){

        int contadorOcupadosNF = 0;

        for(int cont = 0; cont < 16; cont++){

            if( asientos[cont].getOcupado() ){ // seria = a true, con !asien... seria = false

                contadorOcupadosNF++;
            }
        }
        return contadorOcupadosNF;
    }


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public String toString(){

        return ("El numero de fumadores son: "+calcularFumadores()+"\nEl numero de pasajeros son: "+calcularOcupadosNF());
    }

    @Override
    public int hashCode(){

        return ((Arrays.hashCode(this.asientos))*2); //Es mejor usar este metodo que this.asientos.hashCode() porque estoy usando el metodo de la clase Arrays
    }

    @Override
    public boolean equals( Object obj ){

        boolean igual = false;

        if ( obj != null && obj instanceof VueloObjetos) {

            VueloObjetos objVueloObjetos = (VueloObjetos) obj;

            if (this.asientos == objVueloObjetos.asientos ) {

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

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public int compareTo(VueloObjetos objVueloObjetos){

        int res = -1;

        if ( this.asientos.length > objVueloObjetos.asientos.length ){

            res = 1;

        }else {
            if ( this.asientos == objVueloObjetos.asientos ) {

                res = 0;
            }
        }
        return res;
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}








