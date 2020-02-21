package TresEnRaya;

/*
    PROPIEDADES BASICAS:
        int circulo consultable y modificable
        int equis consultable y modificable

    PROPIEDADES DERIVADAS:
        Ninguna

    PROPIEDADES COMPARTIDAS:
        Ninguna

    METODOS BASICOS:
        getCirculo()
        setCirculo()

        getEquis()
        setEquis()

    METODOS AÑADIDOS:
       Ninguno


 */

public class Casilla {

    private boolean circulo;
    private boolean equis;

    public Casilla(){  //Constructor

        this.circulo = false; // El circulo será 0
        this.equis = false;   // La equis será 1

    }

    public Casilla(boolean circulo, boolean equis){ //Constructor con parametros

        this.circulo = circulo;
        this.equis = equis;

    }

///////////////////// GETTERS Y SETTERS CIRCULO /////////////////////////////////////////////////////////////

    public boolean getCirculo(){

        return this.circulo;
    }

    public boolean setCirculo(){

        return this.circulo = true;
    }

///////////////////// GETTERS Y SETTERS EQUIS /////////////////////////////////////////////////////////////

    public boolean getEquis(){

        return this.equis;
    }

    public boolean setEquis(){

        return this.equis = true;
    }


//////////////////////// METODO COMPROBAR CASILLA ////////////////////////////////////////////////////////////////////////////

    /*
        NECESIDADES:
            Imprime 'X' cuando el atributo(equis) de la clase es true.
            Imprime 'O' cuando el atributo(circulo) de la clase es true.
            Imprime ' ' cuando los dos atributos de la clase son false.
     */

    public char comprobarCasilla(){

        char valor = ' ';

        if( this.getEquis() ){
            valor = 'X';

        }else{
            if( this.getCirculo() ) {
                valor = 'O';
            }
        }

        return valor;
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////






//TODO //////////////////////// METODOS OVERRIDE ////////////////////////////////////////////////////////////


}
