package MaquinaRefrescos;

/*
    ANALISIS:

        Estudia MaquinaBebidas como un servicio automático de venta de bebidas.
        Debes añadir las propiedades y funcionalidades que consideres interesantes.


    PROPIEDADES BÁSICAS

        cantidad INT Consultable
        sabor    String Consultable
        valor double Consultable

    PROPIEDADES DERIVADAS

        No tiene

    PROPIEDADES COMPARTIDAS

        NO TIENE

    INTERFAZ

        MÉTODOS BÁSICOS

            getCantidad()   getSabor()     getValor()

        MÉTODOS AÑADIDOS    //Los que no son ni get ni set

            Ninguno

*/



public class Refrescos {

    private int cantidad;
    private String sabor;
    private double valor;

    public Refrescos(){  //Constructor

        this.cantidad = 0; //Cuando pongo this se está refiriendo a los atributos de la clase
        this.sabor = " ";  //Porque puede tener el mismo nombre que los atributos que les pase por parámetros
        this.valor = 0.0;

    }


    public Refrescos( int cantidad, String sabor, double valor ){ //Constructor con parametros

        this.cantidad = cantidad;
        this.sabor = sabor;
        this.valor = valor;

    }

    //Una vez que tengo los constuctores tengo que crear las funciones
    //this = Para referirse a las propiedades mismas de la clase

    public int getCantidad(){

        return this.cantidad;

    }

    public String getSabor() {

        return this.sabor;
    }

    public double getValor() {

        return this.valor;

    }

}
