package Bolera;

/*

    ANALISIS:


    PROPIEDADES BASICAS:



    PROPIEDADES DERIVADAS:
        Ninguna


    INTERFAZ
    METODOS BASICOS:




    METODOS AÑADIDOS:




 */


public class PartidaGestora {

    private Pista[] partida;


////////// CONSTRUCTORES //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public PartidaGestora(){ //Constructor sin parametros

        this.partida = new Pista[12];

    }

    public PartidaGestora(int nPartidas){

        this.partida = new Pista[nPartidas];

    }

///////// GETTERS Y SETTERS ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

///////// JUGAR PARTIDA ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Crear un método que recorra las pistas y dentro del mismo que también recorra
    // cada array individual y vaya añadiendo los nombres en cada jugador

    public void cargarJugadores(){

        int pistas = 12;
        int jugadores = 4;
        int contadorNombres = 0; //Coge los nombres del array de la clase NombreJugadores


        Pista objPista = new Pista(jugadores);

        //recorrer las pistas ( 12 pistas )
        for ( int cont = 0; cont < pistas; cont++ ){

            //recorrer los nombres de los jugadores ( en este caso 4 jugadores )
            for (int cont2 = 0; cont2 < jugadores; cont2++  ){

                contadorNombres += cont2;

                objPista.crearJugadores(contadorNombres);

            }

            contadorNombres+= 1; //Para sumarle 1 en la siguiente iteración de los nombres

        }

    }

///////// METODOS OVERRIDE ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
