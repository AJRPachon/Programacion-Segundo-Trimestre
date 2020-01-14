
/*

 Rectángulo. Un rectángulo tiene lados y estamos interesados en su área y su perímetro.

    PROPIEDADES BÁSICAS

        ladoMenor   INT consultable
        ladoMayor   INT consultable


    PROPIEDADES DERIVADAS

        perimetro   void consultable
        area        void consultable

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


import java.util.Scanner;

public class Rectangulo {

    /*PROPIEDADES BÁSICAS

    ladoMenor   INT consultable
    ladoMayor   INT consultable
    */

    private int ladoMenor, ladoMayor;

    public Rectangulo(){ //Constuctor

        this.ladoMenor= 0; //Cuando pongo this se está refiriendo a los atributos de la clase
        this.ladoMayor=0;  //Porque puede tener el mismo nombre que los atributos que les pase por parámetros

    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public Rectangulo(int ladoMenor, int ladoMayor){ //Constructor con parámetros



    }

    /*
    PROPIEDADES DERIVADAS

    perimetro   void consultable
    area        void consultable
    */





}
