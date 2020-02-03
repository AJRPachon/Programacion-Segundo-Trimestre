package MaquinaRefrescos;

/*
    ANALISIS:

        Estudia MaquinaBebidas como un servicio automático de venta de bebidas.
        Debes añadir las propiedades y funcionalidades que consideres interesantes.


    PROPIEDADES BÁSICAS

        dineroTotal double consultable y modificable

    PROPIEDADES DERIVADAS

        No tiene

    PROPIEDADES COMPARTIDAS

        NO TIENE TETE CABESA TRONCO MACHO TIO

    INTERFAZ

        MÉTODOS BÁSICOS

            getDineroTotal()
            setDineroTotal()

        MÉTODOS AÑADIDOS    //Los que no son ni get ni set

            Ninguno

*/


public class Maquina {

    private double dineroTotal;
    private Refrescos refrescos;

    public Maquina(){  //Constructor

        this.dineroTotal=0;
        this.refrescos = new Refrescos();

    }

    public Maquina(double dineroTotal, Refrescos refrescos){ //Constructor con parametros

        this.dineroTotal = dineroTotal;
        this.refrescos = new Refrescos();

    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Una vez que tengo los constuctores tengo que crear las funciones
    //this = Para referirse a las propiedades mismas de la clase

    public double getDineroTotal() { //

        return this.dineroTotal;

    }

    public int getCantidadRefrescos(){

        return this.refrescos.getCantidad();

    }

    public String getSaborRefrescos(){

        return this.refrescos.getSabor();

    }

    public double getValorRefrescos(){

        return this.refrescos.getValor();

    }

    //Como es un procedimiento, double dineroTotal es el valor por parámetros que le pasamos desde el main
    //para cambiar el valor de this.dineroTotal

    public void setDineroTotal(double dineroTotal) {

        this.dineroTotal = dineroTotal;

    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Override //Para sobreescribir la clase
    public String toString(){

        return (this.dineroTotal + this.refrescos.toString());

    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public int hashCode(){      //Sirve para identificar al objeto (como un "ID")

        return ((int)this.dineroTotal + 1);
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public int compareTo( Maquina objMaquina ){     //El metodo compareTo no se sobrescribe. Compara 2 objetos

        int res = -1;

        if ( this.dineroTotal > objMaquina.dineroTotal ){

            res = 1;

        }else {
            if ( this.dineroTotal == objMaquina.dineroTotal ) {

                res = 0;

            }
        }

        return res;

    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @Override
    public boolean equals( Object obj ){

        boolean igual = false;

        if ( obj != null && obj instanceof Maquina) {

            Maquina objMaquina = (Maquina) obj;

            if (this.dineroTotal == objMaquina.dineroTotal) {

                igual = true;

            }
        }

        return igual;

    }


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public Maquina clone(){

        Maquina objMaquina = null;

        try {
            objMaquina = (Maquina)super.clone();
        }catch (CloneNotSupportedException nombreDeLaExcepcion){
            System.out.println(nombreDeLaExcepcion.getMessage());
        }

        return objMaquina;

    }


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
