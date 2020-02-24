package TresEnRaya;

/*
    PROPIEDADES BASICAS:
        Casilla casillas[][]

    PROPIEDADES DERIVADAS:
        Ninguna

    PROPIEDADES COMPARTIDAS:
        Ninguna

    METODOS BASICOS:
        getCasilla()
        getCasillaCirculo()  //Patron de legacion
        getCasillaEquis()   //Patron de legacion

    METODOS AÑADIDOS:
       asignarCasillaCirculo()
       asignarCasillaEquis()


 */

public class Juego {

    private Casilla casillas[][];

    public Juego(){  //Constructor

        this.casillas = new Casilla[3][3]; //En el constructor, creo el array bidimensional de 3x3

        for(int cont = 0; cont < casillas.length; cont++){

            for(int cont2 = 0; cont2 < casillas.length; cont2++) {
                casillas[cont][cont2] = new Casilla(); //Para ponerle un valor por defecto (Lo he inicializado)
            }                               //Se pone Casilla() porque es el constructor del objeto
        }

    }

    public Juego(Casilla[][] casillas){   //Constructor con parametros

        this.casillas = casillas;
    }

//////////////////// GET CASILLA /////////////////////////////////////////////////////////////////////////////////

    public Casilla[][] getCasilla(){

        return this.casillas;
    }

//////////////////// GETTERS Y SETTERS CASILLA CIRCULO /////////////////////////////////////////////////////////////////////////////////

    public boolean getCasillaCirculo(int posicion1, int posicion2){

        return this.casillas[posicion1-1][posicion2-1].getCirculo();
    }

    public void setCasillaCirculo(int posicion1, int posicion2){

        this.casillas[posicion1-1][posicion2-1].setCirculo();
    }


//////////////////// GETTERS Y SETTERS CASILLA EQUIS /////////////////////////////////////////////////////////////////////////////////

    public boolean getCasillaEquis(int posicion1, int posicion2){

        return this.casillas[posicion1-1][posicion2-1].getEquis();
    }

    public void setCasillaEquis(int posicion1, int posicion2){

        this.casillas[posicion1-1][posicion2-1].setEquis();
    }

//////////////////// COMPROBAR GANADOR EQUIS /////////////////////////////////////////////////////////////////////////////////

    public boolean comprobarGanadorEquis(){

        boolean ganador = false;
        int acumulaGanadorEquisV=0;    //Vertical
        int acumulaGanadorEquisH=0;    //Horizontal    // Si llega a 3, sabré que ha hecho linea, por lo tanto ha ganado
        int acumulaGanadorEquisD1 = 0; //Diagonal 1
        int acumulaGanadorEquisD2 = 0; //Diagonal negativa

        for (int cont = 1; cont < this.casillas.length+1; cont++){ //cont recorre las filas
            if( acumulaGanadorEquisV !=3 && acumulaGanadorEquisH != 3 ) { // para si llega a 3, que deje de contar

                acumulaGanadorEquisV=0; //Pongo estas variables a 0 para que cuando cambie el cont1 de valor, vuelvan a estar a 0, si no daría un ganador antes de tiempo
                acumulaGanadorEquisH=0;

                for (int cont2 = 1; cont2 < this.casillas.length+1; cont2++) { //cont2 recorre las columnas

                    if (getCasillaEquis(cont, cont2)) { //para saber si en esa casilla, en esa posición hay una Equis en Horizontal
                        acumulaGanadorEquisH += 1;
                    }

                    if (getCasillaEquis(cont2, cont)) { //para saber si en esa casilla, en esa posición hay una Equis en Vertical
                        acumulaGanadorEquisV += 1;
                    }
                }
            }
        }

        for(int cont=1, cont2=3; cont < 3; cont++, cont2--){ // Para la diagonal de 0.2 - 1.1 - 2.0

            if( getCasillaEquis(cont2,cont) ){ // Para la diagonal de 0.2 - 1.1 - 2.0
                acumulaGanadorEquisD1 += 1;
            }

            if ( getCasillaEquis(cont,cont) ){ // Para la diagonal sucesiva de 0.0 - 1.1 - 2.2
                acumulaGanadorEquisD2 += 1;
            }

        }

        if ( acumulaGanadorEquisV == 3 || acumulaGanadorEquisH == 3 || acumulaGanadorEquisD1 == 3 || acumulaGanadorEquisD2 == 3 ) {  //Para saber si ha ganado
            ganador = true;
        }


        return ganador;

    }


//////////////////// COMPROBAR GANADOR CIRCULO /////////////////////////////////////////////////////////////////////////////////

    public boolean comprobarGanadorCirculo(){

        boolean ganador = false;
        int acumulaGanadorCiculoV=0;    //Vertical
        int acumulaGanadorCiculoH=0;    //Horizontal    // Si llega a 3, sabré que ha hecho linea, por lo tanto ha ganado
        int acumulaGanadorCirculoD1 = 0; //Diagonal
        int acumulaGanadorCiculoD2 = 0;

        for (int cont = 1; cont < this.casillas.length+1; cont++){ //cont recorre las filas
            if( acumulaGanadorCiculoV !=3 && acumulaGanadorCiculoH != 3 ) { // para si llega a 3, que deje de contar

                acumulaGanadorCiculoV=0; //Pongo estas variables a 0 para que cuando cambie el cont1 de valor, vuelvan a estar a 0, si no daría un ganador antes de tiempo
                acumulaGanadorCiculoH=0;

                for (int cont2 = 1; cont2 < this.casillas.length+1; cont2++) { //cont2 recorre las columnas

                    if (getCasillaCirculo(cont, cont2)) { //para saber si en esa casilla, en esa posición hay una Equis en Horizontal
                        acumulaGanadorCiculoH += 1;
                    }

                    if (getCasillaCirculo(cont2, cont)) { //para saber si en esa casilla, en esa posición hay una Equis en Vertical
                        acumulaGanadorCiculoV += 1;
                    }
                }
            }
        }

        for(int cont=1, cont2=3; cont < 3; cont++, cont2--){ // Para la diagonal de 0.2 - 1.1 - 2.0

            if( getCasillaCirculo(cont2,cont) ){ // Para la diagonal de 0.2 - 1.1 - 2.0
                acumulaGanadorCirculoD1 += 1;
            }

            if ( getCasillaCirculo(cont,cont) ){ // Para la diagonal sucesiva de 0.0 - 1.1 - 2.2
                acumulaGanadorCiculoD2 += 1;
            }

        }


        if ( acumulaGanadorCiculoV == 3 || acumulaGanadorCiculoH == 3 || acumulaGanadorCirculoD1 == 3 || acumulaGanadorCiculoD2 ==3 ) {  //Para saber si ha ganado
            ganador = true;
        }

        return ganador;
    }



//TODO //////////////////////// METODOS OVERRIDE ////////////////////////////////////////////////////////////

    public void imprimirTablero(){

        for(int cont = 0; cont < casillas.length; cont++){

            for(int cont2 = 0; cont2 < casillas.length; cont2++){

                System.out.print(this.casillas[cont][cont2].comprobarCasilla()+" | ");
            }

            System.out.println();
        }

    }


}
