package Absentismo;

/*

7. El departamento de Contabilidad de la empresa quiere conocer el alcance del absentismo laboral durante una semana.
 El número de ausentes se guarda en el array AUSENTES en el que cada fila contiene la cantidad diaria semanal de bajas
 por departamento numerados del 1 al 5. Se pretende procesar la tabla para:
    a) Imprimir en pantalla el array completo junto al número del departamento al que pertenecen los datos.
    b) Total de ausentes por departamento a lo largo de la semana.
    c) Total de ausentes por día de la semana.
    d) Total de ausentes en la empresa durante la semana.
    e) Porcentaje de diferencia (+ 0 - ) de cada departamento respecto a la media semanal.
    f) Resumen del absentismo de toda la compañía representado mediante diagrama de barras usando *,
       señalando porcentajes totales de ausencias ocurrido cada día de la semana
       Para probar, cargar aleatoriamente el array con números de 0 a 5

 */

import java.util.Random;

public class Ausente {

    private int[][] ausentes;
    private int acumulaDias=0;

    Random rnd = new Random();

    public Ausente(){  //Constructor

        this.ausentes = new int[5][7];

        for(int cont = 0; cont < 5; cont++){

            for (int cont2 = 0; cont2 < 7; cont2++){

                this.ausentes[cont][cont2] = rnd.nextInt(6);
            }
        }
    }

    public Ausente(int[][] ausente){  //Constructor con parametros

        this.ausentes = ausente;

    }


//////////////////// GETTERS Y SETTERS AUSENTES /////////////////////////////////////////////////////////////////////////////////

    public int[][] getAusentes() {
        return ausentes;
    }

    public int getAusentesP(int p1, int p2) { //Saber el numero de ausentes concreto de un departamento
        return this.ausentes[p1-1][p2-1];
    }

    public void setAusentes(int p1, int p2, int valor) { //Para darle un valor a la casilla de ausente
        this.ausentes[p1-1][p2-1] = valor;
    }

///////////// IMPRIMIR SEMANA COMPLETA /////////////////////////////////////////////////////////////////////////////////////////

    public void imprimirSemana(){

        System.out.println("                 DIAS DE LA SEMANA");
        System.out.println("           [L] [M] [X] [J] [V] [S] [D]");

        for(int cont = 0; cont < ausentes.length; cont++){

            System.out.print("Depto ["+(cont+1)+"] | ");

            for(int cont2 = 0; cont2 < 7; cont2++){

                System.out.print(this.ausentes[cont][cont2]+" | ");
            }

            System.out.println();
        }

    }

///////////// IMPRIMIR ABSENTISMO /////////////////////////////////////////////////////////////////////////////////////////

    public void resumenAbsentismo() {

        int sumaNum;

        for (int cont = 0; cont < 7; cont++) {

            sumaNum = 0;

            for (int cont2 = 0; cont2 < 5; cont2++) {

                sumaNum += getAusentesP(cont2+1, cont+1);

            }

            System.out.print("Día de la semana "+(cont+1)+":");

            for (int cont3 = 0; cont3 < sumaNum; cont3++ ){

                System.out.print("*");

            }

            System.out.println();

        }
    }

///////////// TOTAL AUSENTES POR SEMANA POR DEPARTAMENTOS ///////////////////////////////////////////////////////////////////////////////////

    public void totalDepartamentoSemana() {

        for (int cont = 0; cont < 5; cont++) {

            acumulaDias=0;

            for (int cont2 = 0; cont2 < 7; cont2++) {

                acumulaDias += getAusentesP(cont+1,cont2+1);
            }

            System.out.println("Departamento "+(cont+1)+": "+acumulaDias);

        }

    }


///////////// TOTAL AUSENTE POR DIA DE LA SEMANA/// //////////////////////////////////////////////////////////////////////////////

    public void totalAusenteDiaSemana() {

        for (int cont = 0; cont < 7; cont++) {

            acumulaDias=0;

            for (int cont2 = 0; cont2 < 5; cont2++) {

                acumulaDias += getAusentesP(cont2+1,cont+1);
            }

            System.out.println("Día "+(cont+1)+": "+acumulaDias);

        }

    }


/////////// TOTAL AUSENTES SEMANA ENTERA /////////////////////////////////////////////////////////////////////////////////////////

    public int totalAusenteSemana() {

        acumulaDias = 0;

        for (int cont = 0; cont < 5; cont++) {

            for (int cont2 = 0; cont2 < 7; cont2++) {

                acumulaDias += getAusentesP(cont+1,cont2+1);
            }
        }

        return acumulaDias;

    }


/////////// MEDIA SEMANAL ////////////////////////////////////////////////////////////////////////////////////////////////////

    public double mediaSemanal(){

        double mediaSemanal;

        mediaSemanal = (double)totalAusenteSemana() / 7 ;

        return mediaSemanal;

    }


////////// PORCENTAJE DE DIFERENCIA ////////////////////////////////////////////////////////////////////////////////////////////

    public void porcentajeDiferencia() {

        int porcentaje;

        for (int cont = 0; cont < 5; cont++) {

            acumulaDias = 0;

            for (int cont2 = 0; cont2 < 7; cont2++) {

                acumulaDias += getAusentesP(cont + 1, cont2 + 1);

            }

            porcentaje = (100 * (acumulaDias - (int)mediaSemanal())) / acumulaDias;

            System.out.println("Porcentaje de diferencia departamento " + (cont + 1) + ": " +porcentaje+"%");

        }


    }


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
