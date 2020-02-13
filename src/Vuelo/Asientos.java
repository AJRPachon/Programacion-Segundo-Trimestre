package Vuelo;

/*

    PROPIEDADES BASICAS:
        int fumadores
        int ocupado
        int asientos[]


    PROPIEDADES DERIVADAS:
        Ninguna


    PROPIEDADES COMPARTIDAS:
        Ninguna


    INTERFAZ
    METODOS BASICOS:
        getFumadores()
        getOcupado()


    METODOS AÑADIDOS:
        Ninguna


*/


public class Asientos {

    private boolean fumadores;
    private boolean ocupado;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        public Asientos(){ //Constructor

            this.fumadores = false;
            this.ocupado = false;

        }

        public Asientos(boolean fumadores, boolean ocupado){  //Constructor con parametros

            this.fumadores = fumadores;
            this.ocupado = ocupado;

        }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        public boolean getFumadores(){

            return this.fumadores;

        }

        public boolean getOcupado(){

            return this.ocupado;

        }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        @Override
        public String toString(){

            return ("El numero de fumadores son: "+this.fumadores+"\nEl numero de pasajeros son: "+this.ocupado);

        }

        @Override
        public int hashCode(){

            return 2;

        }

        @Override
        public boolean equals( Object obj ){

            boolean igual = false;

            if ( obj != null && obj instanceof Asientos) {

                Asientos objAsientos = (Asientos) obj;

                if (this.fumadores == objAsientos.fumadores && this.ocupado == objAsientos.ocupado ) {

                    igual = true;

                }
            }

            return igual;

        }

        @Override
        public Asientos clone(){

            Asientos objAsientos = null;

            try {
                objAsientos = (Asientos)super.clone();
            }catch (CloneNotSupportedException nombreDeLaExcepcion){
                System.out.println(nombreDeLaExcepcion.getMessage());
            }

            return objAsientos;

        }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /*
        public int compareTo(Asientos objAsientos){

            int res = -1;

            if ( this.fumadores > objAsientos.fumadores && this.ocupado > objAsientos.ocupado ){

                res = 1;

            }else {
                if ( this.fumadores == objAsientos.fumadores && this.ocupado > objAsientos.ocupado ) {

                    res = 0;

                }
            }

            return res;

        }

        */

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


}
