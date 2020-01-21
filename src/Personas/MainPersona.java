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
        CalcularEdad

        MostrarDatos (imc, peso 1,0,-1, datos personales(edad tambien))

    Fin
    
*/

import java.util.Scanner;

public class MainPersona {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double peso,altura, imc;
        String nombre, dni;
        char genero;
        int edad;


        //LeerYValidarPeso
        peso = teclado.nextDouble();

        //LeerYValidarAltura
        altura = teclado.nextDouble();

        //LeerYValidarFechaDeNacimiento (realizar subprograma con las validaciones que ya cree)


        //LeerYValidarNombre
        nombre = teclado.next();

        //LeerYValidarDni
        dni = teclado.next();

        //LeerYValidarGenero
        genero = teclado.next().charAt(0);

        Persona ObjPersona = new Persona(); //Una vez que tengo todos los datos para construir el objeto, lo creo.
                                            //Persona sería la clase a la que hago referencia
                                            //ObjPersona es el nombre que le he dado a mi objeto

        //CalcularImc (llamada al método getImc)
        imc = ObjPersona.getImc();

        //CalcularEdad

        //MostrarDatos (imc, peso 1,0,-1, datos personales(edad tambien))


    }
}
