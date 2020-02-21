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
