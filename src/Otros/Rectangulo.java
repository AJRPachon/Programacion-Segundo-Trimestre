package Otros;
/*

 Rectángulo. Un rectángulo tiene lados y estamos interesados en su área y su perímetro.

    PROPIEDADES BÁSICAS

        ladoMenor   INT consultable
        ladoMayor   INT consultable


    PROPIEDADES DERIVADAS

        perimetro   consultable
        area        consultable

    PROPIEDADES COMPARTIDAS

        NO TIENE TETE CABESA TRONCO MACHO TIO


    INTERFAZ

        MÉTODOS BÁSICOS

            getLadoMenor()
            getLadoMayor()
            getPerimetro()
            getArea()

        MÉTODOS AÑADIDOS

            NINGUNO

*/



public class Rectangulo {

    /*PROPIEDADES BÁSICAS

    ladoMenor   INT consultable
    ladoMayor   INT consultable
    */

    private int ladoMenor, ladoMayor;

    public Rectangulo(){ //Constuctor

        this.ladoMenor = 0; //Cuando pongo this se está refiriendo a los atributos de la clase
        this.ladoMayor = 0;  //Porque puede tener el mismo nombre que los atributos que les pase por parámetros

    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public Rectangulo(int ladoMenor, int ladoMayor){ //Constructor con parámetros

        this.ladoMenor = ladoMenor;
        this.ladoMayor = ladoMayor;

    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Constructor de copia
    //Como es un objeto distinto, tengo que obtener las propiedades del objeto de la clase
    //Tengo que hacerlo a través del método

    public Rectangulo(Rectangulo nombreDelObjeto){

        this.ladoMenor = nombreDelObjeto.getLadoMenor();
        this.ladoMayor = nombreDelObjeto.getLadoMayor();

    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Una vez que tengo los constuctores tengo que crear las funciones
    //this = Para referirse a las propiedades mismas de la clase

    public int getLadoMenor(){

        return this.ladoMenor;

    }

    public int getLadoMayor(){
        
        return this.ladoMayor;

    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Si fuese modificable se haría de esta manera
    //Como es un procedimiento, int ladoMenor es el valor por parámetros que le pasamos desde el main
    //para cambiar el valor de this.ladoMenor

    public void setLadoMenor(int ladoMenor){

        this.ladoMenor = ladoMenor;

    }

    public void setLadoMayor(int ladoMayor){

        this.ladoMayor = ladoMayor;

    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /*
    PROPIEDADES DERIVADAS

    perimetro   consultable
    area        consultable
    */

    //Si es un método derivado, no hay que guardarlo en el objeto porque se calcularía cada vez que se llame
    //No hace falta declararlo como atributo de la clase


    public double getPerimetro(){

        return 2*(this.ladoMayor + this.ladoMenor);

    }

    public double getArea(){

        return this.ladoMayor * this.ladoMenor;

    }

}
