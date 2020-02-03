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

        double precioBase = 10;
        int IVA = 7;

        int tamanioMemoria = 10, velocidadMemoria= 2400;
        String tipoMemoria = "DDR4";

        String modeloProcesador = "i7-4790";
        int velocidadProcesador = 3200;

        int tamanioDiscoDuro = 2064;
        String tipoDiscoDuro = "SSD";



        Memoria objMemoriaMain = new Memoria(tamanioMemoria,velocidadMemoria, tipoMemoria);
        Procesador objProcesadorMain = new Procesador(modeloProcesador, velocidadProcesador);
        DiscoDuro objDiscoDuroMain = new DiscoDuro(tamanioDiscoDuro, tipoDiscoDuro);
        Ordenador objOrdenadorMain = new Ordenador(precioBase, IVA, objMemoriaMain, objDiscoDuroMain, objProcesadorMain);

        System.out.println("El precio de mercado de este ordenador es de: "+objOrdenadorMain.getPrecioDeMercado()+"€");



    }
}
