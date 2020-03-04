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

public class Absentismo {

    public static void main(String [] args){

        Ausente objAusente = new Ausente();

        int p1 = 2, p2 = 7;

        //Imprimir los dias de la semana y el numero de ausentes por día de cada semana y departamentos
        objAusente.imprimirSemana();

        //Saber el numero de ausentes concreto de un departamento
        System.out.println();
        System.out.println(objAusente.getAusentesP(p1,p2));
        System.out.println();


        //b) Total de ausentes por departamento a lo largo de la semana.
        objAusente.totalDepartamentoSemana();
        System.out.println();


        //c) Total de ausentes por día de la semana.
        objAusente.totalAusenteDiaSemana();
        System.out.println();


        //d) Total de ausentes en la empresa durante la semana.
        objAusente.totalAusenteSemana();
        System.out.println();


        //e) Porcentaje de diferencia (+ 0 - ) de cada departamento respecto a la media semanal.
        objAusente.porcentajeDiferencia();
        System.out.println();

    }

}
