package Vuelo;
/*

    PROPIEDADES BASICAS:
        Asiento asientos[]
        

    PROPIEDADES DERIVADAS:
        Ninguna


    PROPIEDADES COMPARTIDAS:
        Ninguna


    INTERFAZ
    METODOS BASICOS:
        getAsiento()
        getFumadoresAsiento()  //patron de legacion
        getNormalesAsiento()   //patron de legacion


    METODOS AÑADIDOS:
        Ninguna

    
*/


import java.util.Arrays;

public class VueloObjetos {

    private Asiento[] asientos;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public VueloObjetos(){ //Constructor

        this.asientos = new Asiento[20];

        for( int cont = 0; cont < asientos.length; cont++ ){

            asientos[cont] = new Asiento(); //Para ponerle un valor por defecto (Lo he inicializado)

        }
    }

    public VueloObjetos(Asiento[] asientos){  //Constructor con parametros

        this.asientos = asientos;
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //creamos una variable posición pasada por parámetros para coger una casilla concreta del array
    public boolean getFumadoresAsiento(int posicion){

        return this.asientos[posicion-1].getFumadores();
    }

    public boolean getNormalesAsiento(int posicion){

        return this.asientos[posicion-1].getNormales();
    }

    public Asiento[] getAsiento(){

        return this.asientos;
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Metodo para cambiar la posicion del asiento a true (ocupado)
    /*
        SIGNATURA:
            public void asignarAsiento(int posicionAsiento)

        COMENTARIO:
            El metodo tiene cambiar la posicion del asiento a true (ocupado)

        ENTRADAS:
            Asiento que queremos cambiar

     */

    public void asignarAsientoN(int posicionAsiento){

        this.asientos[posicionAsiento-1].setNormales();

    }

    public void asignarAsientoF(int posicionAsiento){

        this.asientos[posicionAsiento-1].setFumadores();

    }


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Metodo para calcular el numero de asientos ocupados por no fumadores
    public int calcularNormales(){

        int contadorNormales=0;

        for(int cont = 0; cont < 16; cont++) { //16 porque es hasta donde llegan los no fumadores

            if (asientos[cont].getNormales()) { //Para saber si el asiento está ocupado o no

                contadorNormales++;
            }
        }
        return contadorNormales;
    }


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Metodo para calcular el numero de asientos ocupados por fumadores
    public int calcularFumadores(){

        int contadorFumadores=0;

        for(int cont = 16; cont < asientos.length; cont++)

            if( asientos[cont].getFumadores()){ //Para saber si el asiento está ocupado o no

                contadorFumadores++;
            }
        return contadorFumadores;
    }


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /*
        SIGNATURA:
            public int[] asientosDisponiblesNF()

        COMENTARIO:
            El metodo tiene que crear un nuevo array con los asientos disponibles (int)

        ENTRADAS:
            Ninguna

        SALIDAS:
            Array de int con los asientos disponibles

        ENTRADA/SALIDA:
            Ninguna

        PRECONDICIONES:
            Ninguna

        POSTCONDICIONES:
            El metodo devuelve asociado al nombre el Array cargado con los asientos (int)

     */

    //Metodo para calcular asientos libres de no fumadores

    public int[] asientosDisponiblesNF() {

        //Calculo numero de asientos vacios de no fumadores
        int cont2 = 0;
        for (int cont = 0; cont < 16; cont++){  // 16 porque son los asientos de no fumadores

            if( !asientos[cont].getNormales() ){
                cont2++;
            }
        }

        //Creo el nuevo objeto para guardar la longitud total del array que quiero devolver
        int aDNF[] = new int[cont2];

        //Añadir los asientos que están vacios a nuestro nuevo array
        int cont3 = 0;
        for (int cont = 0; cont < 16; cont++){

            if( !asientos[cont].getNormales() ){
                aDNF[cont3] = cont+1;
                cont3++;
            }
        }

        return aDNF;

    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /*
        SIGNATURA:
            public int[] asientosDisponiblesF()

        COMENTARIO:
            El metodo tiene que crear un nuevo array con los asientos disponibles (int)

        ENTRADAS:
            Ninguna

        SALIDAS:
            Array de int con los asientos disponibles

        ENTRADA/SALIDA:
            Ninguna

        PRECONDICIONES:
            Ninguna

        POSTCONDICIONES:
            El metodo devuelve asociado al nombre el Array cargado con los asientos (int)

     */

    //Metodo para calcular asientos libres de fumadores

    public int[] asientosDisponiblesF(){

        //Calcular la cantidad de asientos de no fumadores que están libres
        int cont2 = 0;
        for( int cont = 16; cont < asientos.length; cont++ ){

            if ( !asientos[cont].getFumadores() ) {
                cont2++;
            }
        }

        //Crear un nuevo array con los asientos de fumadores disponibles y la longitud de cont2
        int aDF[] = new int[cont2];


        //Cargar el nuevo array con los valores de los asientos libres
        int cont3 = 0;

        for( int cont = 16; cont < asientos.length; cont++ ){

            if ( !asientos[cont].getFumadores() ) {
                aDF[cont3] = cont + 1;
                cont3++;
            }

        }

        return aDF;
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void imprimirAsientosDisp() {
        System.out.println("Hay disponibles " + calcularNormales() + " para personas no fumadoras\nHay disponibles " + calcularFumadores() + " para personas fumadoras");
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//Mostrar numero de asientos restantes disponibles para no fumadores

    public void asientosRNF() {
        System.out.print("Los asientos disponibles para no fumadores son: ");
        System.out.println(Arrays.toString(asientosDisponiblesNF()));
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//Mostrar numero de asientos restantes disponibles para fumadores

    public void asientosRF() {
        System.out.print("Los asientos disponibles para fumadores son: ");
        System.out.println(Arrays.toString(asientosDisponiblesF()));
    }


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/*
    @Override  //TODO Crear un nuevo metodo toString
    public String toString(){

        return ();
    }*/

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








