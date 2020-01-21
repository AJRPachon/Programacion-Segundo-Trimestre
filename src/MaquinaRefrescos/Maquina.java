package MaquinaRefrescos;

/*
    ANALISIS:

        Estudia MaquinaBebidas como un servicio automático de venta de bebidas.
        Debes añadir las propiedades y funcionalidades que consideres interesantes.


    PROPIEDADES BÁSICAS

        dineroTotal double consultable y modificable

    PROPIEDADES DERIVADAS

        No tiene

    PROPIEDADES COMPARTIDAS

        NO TIENE TETE CABESA TRONCO MACHO TIO

    INTERFAZ

        MÉTODOS BÁSICOS

            getDineroTotal()
            setDineroTotal()

        MÉTODOS AÑADIDOS    //Los que no son ni get ni set

            Ninguno

*/

public class Maquina {

    private double dineroTotal;

    public Maquina(){  //Constructor

        this.dineroTotal=0;

    }

    public Maquina(double dineroTotal){ //Constructor con parametros

        this.dineroTotal = dineroTotal;

    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Una vez que tengo los constuctores tengo que crear las funciones
    //this = Para referirse a las propiedades mismas de la clase

    public double getDineroTotal() { //

        return this.dineroTotal;

    }

    //Como es un procedimiento, double dineroTotal es el valor por parámetros que le pasamos desde el main
    //para cambiar el valor de this.dineroTotal

    public void setDineroTotal(double dineroTotal) {

        this.dineroTotal = dineroTotal;

    }
}
