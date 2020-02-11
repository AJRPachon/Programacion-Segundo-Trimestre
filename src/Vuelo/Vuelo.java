package Vuelo;
/*
    ANALISIS:
    3. (Sistema de Reserva de Vuelos). Una pequeña compañía aérea acaba de comprar un ordenador para su sistema de reserva de vuelos.
    Escribir un programa que asigne asientos para cada vuelo del único avión de la compañía (capacidad: 20 asientos).

    El programa debe contemplar zona de fumadores y no fumadores.

    Los no fumadores ocuparan los asientos 1-16 y los fumadores el resto.

    Utiliza un array de una dimensión para representar los asientos del avión.

    Utiliza 0 para indicar asiento vacío y 1 asiento ocupado.

    El programa nunca debe hacer "overbooking", es decir, reasignar un asiento que ya está ocupado.

    Si la sección de fumadores se llena, el programa debe preguntar al pasajero si desea un asiento en la zona de no fumadores,
    y viceversa. Si acepta, entonces has de realizar la asignación de asiento correspondiente.

    Si no acepta, avise de la salida del próximo vuelo.

    Añada cuantos requisitos considere conveniente.


    ENTRADAS:
        Fumador o no
    
    SALIDAS:
    
    PSEUDOCODIGO GENERALIZADO:
    Inicio
        REPETIR

            Preguntar si es fumador o no //16 asientos
            Leer y validar opcio

            Si (asientos ocupados)
                Preguntar si desea cambiar a zona fumador o salir
                Leer opcion y validar

            Si (asientos fumador ocupados)
                Preguntar si desea cambiar a zona no fumador o salir
                Leer opcion y validar

            Segun Opcion //fumador o no

                opcion1 no fumador
                    Mostrar numero de asientos disponibles
                    Asignar asiento y mostrar

                opcion2 fumador //4 asientos
                    Mostrar numero de asientos disponibles
                    Asignar asiento y mostrar

            Fin Segun

        MIENTRAS (Opcion != 3)
    
    Fin
    
*/

import java.util.Scanner;

public class Vuelo {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int opcion=0;
        int asientos[] = new int [16];
        int fumador[] = new int [4];
        int pasajeros = 1;
        int asientosDisponibles;
        int asientosDisponiblesFumadores;
        int fumadores = 1;
        int cont=0;

        do {

            //Preguntar si es fumador o no //16 asientos
            System.out.println("[1]No fumador\n[2]Fumador");
            opcion = teclado.nextInt()-1;

            //Leer y validar opcion
/*
            if(asientos[16] == pasajeros ){
                //Preguntar si desea cambiar a zona fumador o salir
                //Leer opcion y validar
            }

            if(fumador[4] == fumadores){
              //Preguntar si desea cambiar a zona no fumador o salir
              //Leer opcion y validar
            }
*/
            switch (opcion) { //fumador o no

                case 1:  //opcion1 no fumador
                    //Mostrar numero de asientos disponibles
                    if (asientos[cont] == 0) {
                        asientosDisponibles = asientos.length - cont;
                        System.out.println("Hay "+asientosDisponibles+" asientos disponibles para no fumadores");
                        cont++;
                    }

                    //Asignar asiento y mostrar
                    asientos[pasajeros-1] = pasajeros;
                    pasajeros++;

                break;


                case 2:  //opcion2 fumador //4 asientos
                    //Mostrar numero de asientos disponibles
                    if (fumador[cont] == 0) {
                        asientosDisponiblesFumadores = fumador.length - cont;
                        System.out.println("Hay "+asientosDisponiblesFumadores+" asientos disponibles para no fumadores");
                        cont++;
                    }

                    //Asignar asiento y mostrar
                     fumador[fumadores-1] = fumadores;
                     fumadores++;

                 break;

            } //Fin Segun

        }while (opcion != 3);


    }
}
