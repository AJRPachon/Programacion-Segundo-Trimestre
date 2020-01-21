package Personas;

/*
    ANALISIS:

        7. Estudia una interfaz para un tipo Persona considerando que estamos interesados en el nombre, edad, DNI,
         genero (H hombre, M mujer, O otro), peso y altura.

        También deseamos:
        • Calcular el IMC() para saber si la persona está en su peso ideal (IMC=peso en kg/(altura^2  en m)). Si una persona está
          por debajo de su peso ideal se devuelve un -1 si está en su peso ideal un 0 y si tiene sobrepeso un 1.
        • Saber si es mayor de edad.

         Otras especificaciones:
            • Orden natural: por nombre.
            • Criterio de Igualdad: si tienen iguales todos los atributos.
            • Representación como cadena: todos los datos en líneas sucesivas.
            • Se implantaran todos los constructores: por defecto, ordinarios y de copia.
            • Dota a la clase de cuántos métodos consideres oportuno para su correcto funcionamiento


    PROPIEDADES BÁSICAS

        nombre String consultable
        dni String consultable
        genero Char consultable
        peso double consultable y modificable
        altura double consultable y modificable


    PROPIEDADES DERIVADAS

        edad int consultable
        imc double consultable


    PROPIEDADES COMPARTIDAS

        NO TIENE TETE CABESA TRONCO MACHO TIO

    INTERFAZ

        MÉTODOS BÁSICOS

             getNombre()
             getDni()
             getGenero()
             getPeso()     setPeso()
             getAltura()   setAltura()

             getEdad()
             getImc()

        MÉTODOS AÑADIDOS    //Los que no son ni get ni set

            Ninguno

*/

import java.math.*;
import java.util.Scanner;

public class Persona {

private double peso,altura, imc;
private String nombre, dni;
private char genero;
private int edad;

    public Persona(){ //Constructor

        this.altura = 0;
        this.peso = 0;
        this.edad = 0;
        this.imc = 0;
        this.genero = ' ';
        this.nombre = " ";
        this.dni = " ";

    }

    public Persona(double peso, double altura, double imc, String nombre, String dni, char genero, int edad) { //Constructor con parametros

        this.altura = altura;
        this.peso = peso;
        this.edad = edad;
        this.imc = imc;
        this.genero = genero;
        this.nombre = nombre;
        this.dni = dni;

    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return this.edad;
    }

    public double getImc() {
        return peso/(Math.pow(altura,2));
    }

    public String getDni() {
        return this.dni;
    }

    public char getGenero() {
        return this.genero;
    }

    public String getNombre() {
        return this.nombre;
    }



///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/*
 * SIGNATURA:
 *      public static double calculaImc(double imc);
 *
 * COMENTARIO:
 *     El subprograma nos devuelve 1,0 o -1 dependiendo del imc que nos de
 *
 *
 * PRECONDICION:
 *      Ninguna
 *
 * ENTRADA:
 *      peso y altura
 *
 * SALIDA:
 *      NumeroImc
 *
 * ENTRADA/SALIDA:
 *      Ninguna
 *
 * POSTCONDICIONES:
 *      El metodo calculaImc devuelve un valor asociado al nombre
 *
 *
 *  Por debajo de 18.5    Bajo peso
 *  18.5 – 24.9    Normal
 *  25.0 – 29.9    Sobrepeso
 *  30.0 o más    Obeso
 *
 *
 */


    public static double calculaImc(double imc) {

        double numeroImc = 0;

        if( imc < 18.5 ){

            numeroImc = -1;

        }else{

            if( imc >= 18.5 && imc <= 24.9 ){

                numeroImc = 0;

            }else{

                numeroImc = 1;

            }
        }

        return numeroImc;
    }



    public static void validarGenero(char genero){

        Scanner teclado = new Scanner(System.in);

        while( genero != 'M' || genero != 'H' || genero != 'O'){

            System.out.println("*while* Introduzca genero \n[M]Mujer \n[H]Hombre \n[O]Otro");
            genero = teclado.next().charAt(0);
            genero = Character.toUpperCase(genero);

        }

    }


}


