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
        ImprimirMatriz()

 */

public class Matriz {

    private int[][] cuadrado;

/////////// CONSTRUCTORES/ ////////////////////////////////////////////////////////////////////////////

    public Matriz(){  //Constructor

        this.cuadrado = new int[3][3];  //3x3 para crear un cuadrado magico por defecto

        for ( int cont = 0; cont < cuadrado.length; cont++ ){

            for ( int cont2 = 0; cont2 < cuadrado.length; cont2++ ){

                this.cuadrado[cont][cont2] = 0;  //Para inicializar el array a 0

            }
        }

    }

    public Matriz(int fila, int columna){ //Constructor por parametros //Para cuando quiera crear el cuadrado de N dimensiones

        this.cuadrado = new int[fila][columna];

        for ( int cont = 0; cont < cuadrado.length; cont++ ){

            for ( int cont2 = 0; cont2 < cuadrado.length; cont2++ ){

                this.cuadrado[cont][cont2] = 0;  //Para inicializar el array a 0

            }
        }
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

//////// IMPRIMIR MATRIZ ///////////////////////////////////////////////////////////////////////////////

    /*
        SIGNATURA: public void imprimirCuadradoMagico()

        COMENTARIO: El metodo imprime el cuadrado mágico ya resuelto

        ENTRADAS: Ninguna

        SALIDAS: cuadrado magico impreso

        ENTRADA/SALIDA: Ninguna

        PRECONDICIONES: El array cuadrado tiene que estar completado con los numeros mágicos

        POSTCONDICIONES: Cuadrado mágico impeso

     */

    public void imprimirCuadradoMagico(){

        System.out.print("      ");

        //Imprime los numero de columnas
        for (int cont = 0; cont < cuadrado.length; cont++){
            System.out.print("["+(cont+1)+"]   ");
        }

        System.out.println();

        for(int cont = 0; cont < cuadrado.length; cont++){

            //Imprime los numeros de filas
            System.out.print("["+(cont+1)+"] | ");

            for(int cont2 = 0; cont2 < cuadrado.length; cont2++){

                //Para cuando el numero que va a imprimir sea mayor o igual que 10, cambie la tabulación
                if ( this.cuadrado[cont][cont2] >= 10 ){

                    System.out.print(this.cuadrado[cont][cont2] + "  | ");

                }else {

                    System.out.print(" "+this.cuadrado[cont][cont2] + "  | ");
                }
            }

            System.out.println();
        }

    }


////////////////////////////////////////////////////////////////////////////////////////////////////////

}
