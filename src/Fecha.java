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
        this.anio = 0;
        //if(!fechaValida) //mensaje de error

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
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //metodo de bisiesto boolean para el año
    /*
     * SIGNATURA:
     *      public boolean bisiestoFecha()
     *
     * COMENTARIO:
     *     El metodo devuelve un booleano segun la fecha sea bisiesta o no
     *
     *
     * PRECONDICION:
     *      Ninguna
     *
     * ENTRADA:
     *      No hace falta (Porque es un metodo de la clase del objeto, por lo tal conoce el atributo anio)
     *
     * SALIDA:
     *      booleano
     *
     * ENTRADA/SALIDA:
     *      Ninguna
     *
     * POSTCONDICIONES:
     *      El metodo bisiestoFecha tiene que devolver un booleano
     *
     *
     */

    public boolean bisiestoFecha(){

       boolean bisiesto;

        //Debe estar aqui para que no sea siempre true y se actualice en cada iteracion
        bisiesto = false;

       if (this.anio > 1582 && ((this.anio % 4 == 0) && (this.anio % 100 != 0)) || (this.anio % 400 == 0)) {

           bisiesto = true;

       }

       return bisiesto;

    }


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //validar mes boolean

    /*
     * SIGNATURA:
     *      private boolean mesValido()
     *
     * COMENTARIO:
     *     El metodo devuelve un booleano si el mes esta entre 1 y 12
     *
     * PRECONDICION:
     *      Ninguna
     *
     * ENTRADA:
     *      No hace falta (Porque es un metodo de la clase del objeto, por lo tal conoce el atributo mes)
     *
     * SALIDA:
     *      booleano
     *
     * ENTRADA/SALIDA:
     *      Ninguna
     *
     * POSTCONDICIONES:
     *      El metodo mesValido tiene que devolver un booleano
     *
     *
     */

    private boolean mesValido(){

        boolean mesBooleano;

        if ( this.mes >= 1 && this.mes <= 12 ){

            mesBooleano = true;

        }else{

            mesBooleano = false;

        }

        return mesBooleano;

    }


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    public boolean validarFecha() {

        boolean fechaValida;

        fechaValida = false;

        //validar fecha boolean
        switch (this.mes) {
            //Para cuando el dia acaba en 31
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                if (this.dia >= 1 || this.dia <= 31) {

                    fechaValida = true;

                }

            break;

            //Para cuando el dia acaba en 30
            case 4: case 6: case 9: case 11:
                if (dia < 1 || dia > 30) {

                }

                break;

            //CUANDO ANIO ES BISIESTO O NO
            case 2:
                if (bisiestoFecha()) {
                    //Validar dia
                    if (this.dia >= 1 || this.dia <= 29) {

                        fechaValida = true;

                    } else {
                        if (this.dia >= 1 || dia <= 28) {

                            fechaValida = true;

                        }
                    }
                }
                break;
        }

    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


}



