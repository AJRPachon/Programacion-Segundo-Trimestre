package CuadradoMagico;

/*
    ANALISIS:
        Nada

    PROPIEDADES BASICAS
        cuadrado[][] consultable y modificable

    PROPIEDADES DERIVADAS
        Ninguna


    PROPIEDADES COMPARTIDAS
        Ninguna


    INTERFAZ
    METODOS BASICOS
        getCuadrado()
        setCuadrado
        getPosicionCuadrado()
        setPosicionCuadrado()


    METODOS AÑADIDOS
        Ninguno

 */

public class Matriz {

    private int[][] cuadrado;

/////////// CONSTRUCTORES/ ////////////////////////////////////////////////////////////////////////////

    public Matriz(){  //Constructor

        this.cuadrado = new int[3][3];  //3x3 para crear un cuadrado magico por defecto

    }

    public Matriz(int fila, int columna){ //Constructor por parametros //Para cuando quiera crear el cuadrado de N dimensiones

        this.cuadrado = new int[fila][columna];
    }

///////// GETTERS AND SETTERS /////////////////////////////////////////////////////////////////////////

    public int[][] getCuadrado() {
        return this.cuadrado;
    }

    public void setCuadrado(int[][] cuadrado) {
        this.cuadrado = cuadrado;
    }

    public int getPosicionCuadrado(int p1, int p2){

        return this.cuadrado[p1][p2];
    }

    public void setPosicionCuadrado(int p1, int p2, int valor){
        this.cuadrado[p1][p2] = valor;
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////

}
