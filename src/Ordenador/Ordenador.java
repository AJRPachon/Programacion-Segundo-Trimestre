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


public class Ordenador {

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

        return this.memoria.getTamanio();  //Tengo que poner el nombre del objeto
                                           //Porque es el atributo de la clase
                                           //Dentro de la clase tengo un atributo llamado memoria (this.memoria)
    }


/////////////////////////////////////////////// DISCO DURO //////////////////////////////////////////////////////////////////

    public DiscoDuro getDiscoDuro() {
        return discoDuro;
    }


////////////////////////////////////////////// PROCESADOR ///////////////////////////////////////////////////////////////////

    public Procesador getProcesador() {
        return procesador;
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
