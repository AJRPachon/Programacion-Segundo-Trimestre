package Personas;
/*
    ANALISIS:
        • Calcular el IMC() para saber si la persona está en su peso ideal (IMC=peso en kg/(altura^2  en m)). Si una persona está
          por debajo de su peso ideal se devuelve un -1 si está en su peso ideal un 0 y si tiene sobrepeso un 1.
        • Saber si es mayor de edad.
    
    ENTRADAS:
        int peso
        double altura
    
    SALIDAS:
        El imc de la persona, si está en sobrepeso, peso ideal o bajo peso
        Saber si es mayor de edad

    
    PSEUDOCODIGO GENERALIZADO:
    Inicio

        LeerYValidarPeso
        LeerYValidarAltura
        LeerYValidarFechaDeNacimiento (realizar subprograma con las validaciones que ya cree)
        LeerYValidarNombre
        LeerYValidarDni
        LeerYValidarGenero

        CalcularImc (llamada al método getImc)
        Calcular datos sobre el peso
        CalcularEdad

        MostrarDatos (imc, peso 1,0,-1, datos personales(edad tambien))

    Fin
    
*/

import java.util.Scanner;
import java.util.GregorianCalendar;

public class MainPersona {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double peso,altura, imc=0, numeroImc;
        String nombre, dni;
        char genero;
        int edad, anio;
        GregorianCalendar fechaNac;


        //LeerYValidarPeso
        System.out.println("Introduzca peso");
        peso = teclado.nextDouble();

        //LeerYValidarAltura
        System.out.println("Introduzca altura");
        altura = teclado.nextDouble();

        //LeerYValidarFechaDeNacimiento (realizar subprograma con las validaciones que ya cree)


        //LeerYValidarNombre
        System.out.println("Introduzca nombre");
        nombre = teclado.next();

        //LeerYValidarDni
        System.out.println("Introduzca dni");
        dni = teclado.next();

        //LeerYValidarGenero
        System.out.println("Introduzca genero \n[M]Mujer \n[H]Hombre \n[O]Otro");
        genero = teclado.next().charAt(0);
        genero = Character.toUpperCase(genero);

        while( genero != 'M' && genero != 'H' && genero != 'O'){

            System.out.println("*while* Introduzca genero \n[M]Mujer \n[H]Hombre \n[O]Otro");
            genero = teclado.next().charAt(0);
            genero = Character.toUpperCase(genero);

        }


        Persona ObjPersona = new Persona(peso, altura, nombre, dni, genero); //Una vez que tengo todos los datos para construir el objeto, lo creo.
                                            //Persona sería la clase a la que hago referencia
                                            //ObjPersona es el nombre que le he dado a mi objeto
                                            //Faltan los parametros

        //CalcularImc (llamada al método getImc)
        imc = ObjPersona.getImc();

        //Calcular datos sobre el peso // Crear un metodo para ello
        numeroImc = ObjPersona.calculaImc();


        //CalcularEdad

        //MostrarDatos (imc, peso 1,0,-1, datos personales(edad tambien))


        
    }
}
