/*

    PROPIEDADES BASICAS
        dia int consultable
        mes int consultable
        anio int consultable


    PROPIEDADES DERIVADAS
        Ninguna


    PROPIEDADES COMPARTIDAS
        Ninguna


    INTERFAZ
    METODOS BASICOS
        getDia()
        getMes()
        getAnio()


    METODOS AÑADIDOS
        Ninguno



 */




public class Fecha {

    private int dia, mes, anio;

    public Fecha(){ //Constructor

        this.dia = 0;
        this.mes = 0;
        this.anio= 0;

    }

    public Fecha(int dia, int mes, int anio){  //Constructor con parametros

        this.dia = dia;
        this.mes = mes;
        this.anio = anio;

    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public int getDia() {
        return this.dia;
    }

    public int getMes() {
        return this.mes;
    }

    public int getAnio() {
        return this.anio;
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}



