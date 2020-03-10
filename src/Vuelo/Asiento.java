package Vuelo;

/*

    PROPIEDADES BASICAS:
        int fumadores
        int normales


    PROPIEDADES DERIVADAS:
        Ninguna


    PROPIEDADES COMPARTIDAS:
        Ninguna


    INTERFAZ
    METODOS BASICOS:
        getFumadores()
        getNormales()

        setFumadores()
        setNormales()

    METODOS AÑADIDOS:
        Ninguna


*/


public class Asiento {

    private boolean fumadores;
    private boolean normales;

///////////////////////////// CONSTRUCTORES ////////////////////////////////////////////////////////////////////////

        public Asiento(){ //Constructor

            this.fumadores = false;
            this.normales = false;

        }

        public Asiento(boolean fumadores, boolean normales){  //Constructor con parametros

            this.fumadores = fumadores;
            this.normales = normales;

        }

////////////////////////////////// GETTERS Y SETTERS //////////////////////////////////////////////////////////////////////////

        //FUMADORES
        public boolean getFumadores(){

            return this.fumadores;
        }

        public void setFumadores(){

            this.fumadores = true;
        }


        //NORMALES
        public boolean getNormales(){

            return this.normales;
        }

        public void setNormales(){

            this.normales = true;
        }


////////////////////////////////// METODOS OVERRIDE ///////////////////////////////////////////////////////////////

        @Override
        public String toString(){

            return ("El numero de fumadores son: "+this.fumadores+"\nEl numero de pasajeros son: "+this.normales);

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

                if (this.fumadores == objAsiento.fumadores && this.normales == objAsiento.normales ) {

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

    //////////////////////// COMPARE TO ////////////////////////////////////////////////////////////////////////////

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
