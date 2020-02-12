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
        int fumadores = 0;
        int pasajeros = 0;
        int asientosDisponibles = 0;
        int asientosDisponiblesFumadores = 0;
        int cont = 0;
        int cont2 = 0;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //Mostrar todos los asientos disponibles en el vuelo
        System.out.println("Hay disponibles "+asientos.length+" asientos para no fumadores");
        System.out.println("Hay disponibles "+fumador.length+" asientos para fumadores");

        //Preguntar si es fumador o no //16 asientos
        System.out.println("\nIndique donde desea sentarse");
        System.out.println("[1]No fumador\n[2]Fumador");
        opcion = teclado.nextInt();

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        do{  //Para repetir el programa

            //Leer y validar opcion
            while( opcion != 1 && opcion != 2 ){
                System.out.println("Respuesta incorrecta, por favor, selecciona una de las opciones disponibles");
                System.out.println("[1] No fumador\n[2] Fumador");
                opcion = teclado.nextInt();
            }

            switch (opcion) { //fumador o no

                case 1:  //opcion1 no fumador

                    //Asignar asiento y mostrar
                    pasajeros++;
                    asientos[cont2] = pasajeros;

                    //Mostrar numero de asientos restantes disponibles
                    asientosDisponibles = asientos.length - cont2-1;
                    System.out.println("Quedan "+asientosDisponibles+" asientos disponibles para no fumadores");
                    cont2++;

                break;


                case 2:  //opcion2 fumador //4 asientos

                    //Asignar asiento y mostrar
                    fumadores++;
                    fumador[cont] = fumadores;

                    //Mostrar numero de asientos restantes disponibles
                    asientosDisponiblesFumadores = fumador.length - cont-1;
                    System.out.println("Quedan "+asientosDisponiblesFumadores+" asientos disponibles para fumadores");
                    cont++;

                break;

            } //Fin Segun

            if( fumador[3] == 0 || asientos[15] == 0) {
                System.out.println("\nElija asiento en las siguientes zonas:\n[1] No fumador\n[2] Fumador");
                opcion = teclado.nextInt();
            }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

            if ( asientos[15] == 16 && fumador[3] == 4 ) {
                System.out.println("\nLo sentimos pero no quedan más asientos disponibles en este vuelo");
                System.out.println("Si ha realizado la reserva del asiento, la llevaremos a cabo, en caso contrario, pruebe a mirar los horarios disponibles para el próximo vuelo");
                opcion = 3;
            }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

            //Preguntar si desea cambiar a zona fumador o salir
            if( asientos[15] != 0 && opcion == 1){
                System.out.println("\nNo hay mas asientos disponibles en la zona de no fumadores");
                System.out.println("¿Desea cancelar la reserva o elegir un asiento en la zona de fumadores?");
                System.out.println("[3] Cancelar vuelo\n[2] Asiento en zona de fumadores");
                opcion = teclado.nextInt();

                //Leer opcion y validar
                while (opcion != 3 && opcion != 2) {
                    System.out.println("Respuesta incorrecta, por favor, selecciona una de las opciones disponibles");
                    System.out.println("[3] Cancelar vuelo\n[2] Asiento en zona de fumadores");
                    opcion = teclado.nextInt();
                }
            }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

            //Preguntar si desea cambiar a zona no fumador o salir
            if( fumador[3] != 0 && opcion == 2) {
                System.out.println("\nNo hay mas asientos disponibles en la zona de fumadores");
                System.out.println("¿Desea cancelar la reserva o elegir un asiento en la zona de no fumadores?");
                System.out.println("[3] Cancelar vuelo\n[1] Asiento en zona de no fumadores");
                opcion = teclado.nextInt();

                //Leer opcion y validar
                while (opcion != 3 && opcion != 1) {
                    System.out.println("Respuesta incorrecta, por favor, selecciona una de las opciones disponibles");
                    System.out.println("[3] Cancelar vuelo\n[1] Asiento en zona de no fumadores");
                    opcion = teclado.nextInt();
                }
            }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        }while (opcion != 3);


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    }
}
