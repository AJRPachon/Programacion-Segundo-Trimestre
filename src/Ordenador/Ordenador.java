package Ordenador;
/*
    ANALISIS:
    3. Estudiar e implementar una clase Ordenador. Estamos interesados en:

        a. El tamaño, tipo y velocidad de su memoria.

        b. Tamaño y tipo del disco duro

        c. Modelo y velocidad del procesador.

        d. Precio base

        e. IVA

        f. Precio de mercado

    Considera el mejor diseño e implementa tests para todas las clases que aparezcan en tu diseño.
    Queremos usar expresamente tipos envolturas en vez de tipos primitivos dónde sea posible y adecuado.

    PROPIEDADES BASICAS
        precioBase double consultable
        precioDeMercado double consultable
        IVA int consultable
        memoria Memoria consultable
        discoDuro DiscoDuro consultable
        procesador Procesador consultable


    PROPIEDADES DERIVADAS
        Ninguna


    PROPIEDADES COMPARTIDAS
        Ninguna


    INTERFAZ
    METODOS BASICOS
        getPecioBase()
        getPrecioDeMercado()
        getIVA()
        getMemoria()
        getDiscoDuro()
        getProcesador()


    METODOS AÑADIDOS
        Ninguno

 */



public class Ordenador implements Cloneable {

    private double precioBase, precioDeMercado;
    private int IVA;
    private Memoria memoria;
    private DiscoDuro discoDuro;
    private Procesador procesador;

    public Ordenador(){     //Constructor

        this.precioBase = 0.0;
        this.precioDeMercado = 0.0;
        this.IVA = 0;
        this.memoria = new Memoria();  //Estoy creando un objeto y se lo estoy asignando al atributo memoria
        this.discoDuro = new DiscoDuro();
        this.procesador = new Procesador();

    }

    public Ordenador(double precioBase, double precioDeMercado, int IVA, Memoria memoria, DiscoDuro discoDuro, Procesador procesador){       //Constructor con parametros

        this.precioBase = precioBase;
        this.precioDeMercado = precioDeMercado;
        this.IVA = IVA;
        this.memoria = memoria;
        this.discoDuro = discoDuro;
        this.procesador = procesador;

    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public double getPrecioBase(){
        return this.precioBase;
    }

    public double getPrecioDeMercado() {
        return this.precioDeMercado;
    }

    public int getIVA() {
        return this.IVA;
    }

//////////////////////////////////////////// MEMORIA/////////////////////////////////////////////////////////////////////////

    public int getTamanioMemoria(){
                                           //Tengo que poner el nombre del objeto
        return this.memoria.getTamanio();  //Porque es el atributo de la clase
                                           //Dentro de la clase tengo un atributo llamado memoria (this.memoria)
    }

    public int getVelocidadMemoria(){

        return this.memoria.getVelocidad();

    }

    public String getTipoMemoria(){

        return this.memoria.getTipo();

    }


/////////////////////////////////////////////// DISCO DURO //////////////////////////////////////////////////////////////////

    public int getTamanioDiscoDuro(){

        return this.discoDuro.getTamanio();

    }

    public String getTipoDiscoDuro(){

        return this.discoDuro.getTipo();

    }


////////////////////////////////////////////// PROCESADOR ///////////////////////////////////////////////////////////////////

    public String getModeloProcesador(){

        return this.procesador.getModelo();

    }

    public int getVelocidadProcesador(){

        return this.procesador.getVelocidad();

    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Override //Para sobreescribir la clase
    public String toString(){

        return (this.memoria.toString() + this.procesador.toString() + this.discoDuro.toString() + this.precioBase + this.precioDeMercado + this.IVA);

    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public int hashCode(){      //Sirve para identificar al objeto (como un "ID")

        return ((this.memoria.hashCode() + this.discoDuro.hashCode() + this.procesador.hashCode() + (int)this.precioBase + (int)this.precioDeMercado + (int)this.IVA) + 1);
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public int compareTo( Ordenador objOrdenador ){     //El metodo compareTo no se sobrescribe. Compara 2 objetos

        int res = -1;

        if ( this.getTamanioMemoria() > objOrdenador.getTamanioMemoria() && this.getVelocidadMemoria() > objOrdenador.getVelocidadMemoria()
            && this.getVelocidadProcesador() > objOrdenador.getVelocidadProcesador() && this.getTamanioDiscoDuro() > objOrdenador.getTamanioDiscoDuro()
            && this.IVA > objOrdenador.IVA && this.precioDeMercado > objOrdenador.precioDeMercado
            && this.precioBase > objOrdenador.precioBase){

                res = 1;

        }else {
            if (this.getTamanioMemoria() == objOrdenador.getTamanioMemoria() && this.getVelocidadMemoria() == objOrdenador.getVelocidadMemoria()
                    && this.getVelocidadProcesador() == objOrdenador.getVelocidadProcesador() && this.getTamanioDiscoDuro() == objOrdenador.getTamanioDiscoDuro()
                    && this.IVA == objOrdenador.IVA && this.precioDeMercado == objOrdenador.precioDeMercado
                    && this.precioBase == objOrdenador.precioBase ) {

                res = 0;

            }
        }

        return res;

    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @Override
    public boolean equals( Object obj ){        //Comprueba si 2 objetos son iguales. Devuelve booleano

        boolean igual = this == obj ;

        if( obj != null && obj instanceof Ordenador ){

            Ordenador objOrdenador = (Ordenador)obj;    //Casteo obj a la clase Cerrojo

            if( this.memoria.equals(objOrdenador.memoria) && this.procesador.equals(objOrdenador.procesador) && this.discoDuro.equals(objOrdenador.discoDuro) ){

                igual = true;

            }
        }

        return igual;

    }


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public Ordenador clone(){

        Ordenador objOrdenador = null;

        try {
            objOrdenador = (Ordenador)super.clone();
        }catch (CloneNotSupportedException nombreDeLaExcepcion){
            System.out.println(nombreDeLaExcepcion.getMessage());
        }

        return objOrdenador;

    }


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


}
