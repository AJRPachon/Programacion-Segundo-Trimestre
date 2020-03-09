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

    /*
        SIGNATURA: public void imprimirSemana()

        COMENTARIO: El metodo imprime los dias de la semana y los departamentos que hay, con la cantidad de ausentes por día y departamento

        ENTRADAS: Ninguna

        SALIDAS: Semana impresa

        ENTRADA/SALIDA: Ninguna

        PRECONDICIONES: El array de ausentes tiene que estar cargado con el numero de ausentes antes de poder imprimirlo

        POSTCONDICIONES: Semana impresa

     */

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

    /*
        SIGNATURA: public void resumenAbsentismo()

        COMENTARIO: El metodo tiene que imprimir el tablero (con sus casillas ocupadas o no)

        ENTRADAS: Ninguna

        SALIDAS: ( Por pantalla ) Gráfico en forma de barras "*"

        ENTRADA/SALIDA: Ninguna

        PRECONDICIONES: Ninguna

        POSTCONDICIONES: Ninguna

     */

    public void resumenAbsentismo() {

        int sumaNum;

        //Vale para ir contando los dias de la semana
        for (int cont = 0; cont < 7; cont++) {

            sumaNum = 0;

            //Cuenta el numero de ausentes total por día
            for (int cont2 = 0; cont2 < 5; cont2++) {

                sumaNum += getAusentesP(cont2+1, cont+1);

            }

            //Asigna valor de cada dia de la semana
            System.out.print(Enum.values()[cont]+": ");

            //Imprime la cantidad de ausentes en forma de *
            for (int cont3 = 0; cont3 < sumaNum; cont3++ ){

                System.out.print("*");

            }

            //Salto de linea para cada dia de la semana
            System.out.println();

        }
    }

///////////// TOTAL AUSENTES POR SEMANA POR DEPARTAMENTOS ///////////////////////////////////////////////////////////////////////////////////

    /*
        SIGNATURA: public void totalDepartamentoSemana()

        COMENTARIO: Cuenta e imprime la cantidad de ausentes por departamento que ha habido en una semana

        ENTRADAS: Ninguna

        SALIDAS: ( Por pantalla ) Numero total de ausentes por departamento

        ENTRADA/SALIDA: Ninguna

        PRECONDICIONES: Ninguna

        POSTCONDICIONES: Ninguna

     */

    public void totalDepartamentoSemana() {

        //Cuenta los departamentos
        for (int cont = 0; cont < 5; cont++) {

            acumulaDias=0;

            //Cuenta los dias de la semana
            for (int cont2 = 0; cont2 < 7; cont2++) {

                //Acumula la cantidad total de ausentes
                acumulaDias += getAusentesP(cont+1,cont2+1);
            }

            //Imprime la cantidad de ausentes que ha habido en una semana en cada departamento
            System.out.println("Departamento "+(cont+1)+": "+acumulaDias);

        }

    }


///////////// TOTAL AUSENTE POR DIA DE LA SEMANA/// //////////////////////////////////////////////////////////////////////////////

    /*
        SIGNATURA: public void totalAusenteDiaSemana()

        COMENTARIO: Cuenta e imprime la cantidad de ausentes por departamento que ha habido en una semana

        ENTRADAS: Ninguna

        SALIDAS: ( Por pantalla ) Numero total de ausentes por dia de la semana

        ENTRADA/SALIDA: Ninguna

        PRECONDICIONES: Ninguna

        POSTCONDICIONES: Ninguna

     */

    public void totalAusenteDiaSemana() {

        //Dias de la semana
        for (int cont = 0; cont < 7; cont++) {

            acumulaDias=0;

            //Departamentos
            for (int cont2 = 0; cont2 < 5; cont2++) {

                acumulaDias += getAusentesP(cont2+1,cont+1);
            }

            //Muestra los ausentes por dia de la semana
            System.out.println(Enum.values()[cont]+": "+acumulaDias);

        }

    }


/////////// TOTAL AUSENTES SEMANA ENTERA /////////////////////////////////////////////////////////////////////////////////////////

    /*
        SIGNATURA: public void totalAusenteSemana()

        COMENTARIO:

        ENTRADAS: Ninguna

        SALIDAS: 

        ENTRADA/SALIDA: Ninguna

        PRECONDICIONES: Ninguna

        POSTCONDICIONES: Ninguna

     */

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
