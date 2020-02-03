package Ordenador;
/*
    ANALISIS:
    
    ENTRADAS:
    
    SALIDAS:
    
    PSEUDOCODIGO GENERALIZADO:
    Inicio
    
    
    Fin
    
*/

import java.util.Scanner;

public class MainOrdenador {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Ordenador array[] = new Ordenador[2];

        double precioBase;
        int IVA = 7;

        int tamanioMemoria, velocidadMemoria;
        String tipoMemoria;

        String modeloProcesador;
        int velocidadProcesador;

        int tamanioDiscoDuro;
        String tipoDiscoDuro;

        Memoria objMemoriaMain;
        Procesador objProcesadorMain;
        DiscoDuro objDiscoDuroMain;
        Ordenador objOrdenadorMain;

        for(int cont = 0; cont < array.length; cont++){

            System.out.println("Introcuzca precio base para ordenador "+cont);
            precioBase = teclado.nextDouble();

/////////////////////////////////////////// MEMORIA /////////////////////////////////////////////////////////////////////////

            System.out.println("Introcuzca tamanioMemoria para ordenador "+cont);
            tamanioMemoria = teclado.nextInt();

            System.out.println("Introcuzca velocidadMemoria para ordenador "+cont);
            velocidadMemoria = teclado.nextInt();

            System.out.println("Introcuzca tipoMemoria para ordenador "+cont);
            tipoMemoria = teclado.next();

//////////////////////////////////////////// PROCESADOR /////////////////////////////////////////////////////////////////////

            System.out.println("Introcuzca modeloProcesador para ordenador "+cont);
            modeloProcesador = teclado.next();

            System.out.println("Introcuzca velocidadProcesador para ordenador "+cont);
            velocidadProcesador = teclado.nextInt();

//////////////////////////////////////////// DISCO DURO /////////////////////////////////////////////////////////////////////

            System.out.println("Introcuzca tamanioDiscoDuro  para ordenador "+cont);
            tamanioDiscoDuro = teclado.nextInt();

            System.out.println("Introcuzca tipoDiscoDuro para ordenador "+cont);
            tipoDiscoDuro = teclado.next();

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

            objMemoriaMain = new Memoria(tamanioMemoria,velocidadMemoria, tipoMemoria);
            objProcesadorMain = new Procesador(modeloProcesador, velocidadProcesador);
            objDiscoDuroMain = new DiscoDuro(tamanioDiscoDuro, tipoDiscoDuro);
            objOrdenadorMain = new Ordenador(precioBase, IVA, objMemoriaMain, objDiscoDuroMain, objProcesadorMain);

            array[cont] = objOrdenadorMain;

        }

        System.out.println(array[1].toString());

    }
}
