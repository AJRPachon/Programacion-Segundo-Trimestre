package TresEnRaya;

/*
    PROPIEDADES BASICAS:
        char casillas[][]

    PROPIEDADES DERIVADAS:
        Ninguna

    PROPIEDADES COMPARTIDAS:
        Ninguna

    METODOS BASICOS:
        getCasillas(p1,p2)
        setCasillas(p1,p2,v)
        imprimirTablero()

    METODOS AÑADIDOS:


 */

public class Juego2 {

    private char[][] casillas;

/////////////// CONSTRUCTORES ///////////////////////////////////////////////////////////////////////////////////////////////

    public Juego2(){  //Constructor

        this.casillas = new char[3][3]; //En el constructor, creo el array bidimensional de 3x3

        for(int cont = 0; cont < casillas.length; cont++){

            for(int cont2 = 0; cont2 < casillas.length; cont2++) {
                casillas[cont][cont2] = ' '; //Para ponerle un valor por defecto (Lo he inicializado)
            }
        }

    }

    public Juego2(char[][] casillas){ //Constructor con parametros

        this.casillas = casillas;
    }


////////// GETTERS Y SETTERS CASILLAS ////////////////////////////////////////////////////////////////////////////////////////

    public char getCasillas(int p1, int p2) {
        return this.casillas[p1-1][p2-1];
    }

    public void setCasillas(int p1, int p2, char v) {
        this.casillas[p1-1][p2-1] = v;
    }


///////////// IMPRIMIR TABLERO //////////////////////////////////////////////////////////////////////////////////////////////

    public void imprimirTablero(){

        System.out.println("     [1] [2] [3]");

        for(int cont = 0; cont < casillas.length; cont++){

            System.out.print("["+(cont+1)+"] | ");

            for(int cont2 = 0; cont2 < casillas.length; cont2++){

                System.out.print(this.casillas[cont][cont2]+" | ");
            }

            System.out.println();
        }

    }


////////////////// COMPROBAR GANADOR  ///////////////////////////////////////////////////////////////////////////////////////

    public boolean comprobarGanador(char v){

        boolean ganador = false;
        int acumulaGanadorV=0;    //Vertical
        int acumulaGanadorH=0;    //Horizontal    // Si llega a 3, sabré que ha hecho linea, por lo tanto ha ganado
        int acumulaGanadorD1 = 0; //Diagonal
        int acumulaGanadorD2 = 0;


        for (int cont = 1; cont < this.casillas.length+1; cont++){ //cont recorre las filas
            if( acumulaGanadorV !=3 && acumulaGanadorH != 3 ) { // para si llega a 3, que deje de contar

                acumulaGanadorV=0; //Pongo estas variables a 0 para que cuando cambie el cont1 de valor, vuelvan a estar a 0, si no daría un ganador antes de tiempo
                acumulaGanadorH=0; //

                for (int cont2 = 1; cont2 < this.casillas.length+1; cont2++) { //cont2 recorre las columnas

                    if (getCasillas(cont, cont2) == v ) { //para saber si en esa casilla, en esa posición hay un valor en Horizontal
                        acumulaGanadorH += 1;
                    }

                    if (getCasillas(cont2, cont) == v) { //para saber si en esa casilla, en esa posición hay un valor en Vertical
                        acumulaGanadorV += 1;
                    }
                }
            }
        }

        for(int cont=1, cont2=3; cont < 4; cont++, cont2--){ // Para la diagonal de 0.2 - 1.1 - 2.0

            if( getCasillas(cont2,cont) == v ){ // Para la diagonal de 0.2 - 1.1 - 2.0
                acumulaGanadorD1 += 1;
            }

            if ( getCasillas(cont,cont) == v ){ // Para la diagonal sucesiva de 0.0 - 1.1 - 2.2
                acumulaGanadorD2 += 1;
            }

        }

        //Para saber si ha ganado
        if ( acumulaGanadorV == 3 || acumulaGanadorH == 3 || acumulaGanadorD1 == 3 || acumulaGanadorD2 ==3 ) {
            ganador = true;
        }

        return ganador;
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
