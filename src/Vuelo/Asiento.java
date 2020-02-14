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


public class Asiento {

    private boolean fumadores;
    private boolean ocupado;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        public Asiento(){ //Constructor

            this.fumadores = false;
            this.ocupado = false;

        }

        public Asiento(boolean fumadores, boolean ocupado){  //Constructor con parametros

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

            if ( obj != null && obj instanceof Asiento) {

                Asiento objAsiento = (Asiento) obj;

                if (this.fumadores == objAsiento.fumadores && this.ocupado == objAsiento.ocupado ) {

                    igual = true;

                }
            }

            return igual;

        }

        @Override
        public Asiento clone(){

            Asiento objAsiento = null;

            try {
                objAsiento = (Asiento)super.clone();
            }catch (CloneNotSupportedException nombreDeLaExcepcion){
                System.out.println(nombreDeLaExcepcion.getMessage());
            }

            return objAsiento;

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
