package Ordenador.Test;


import Ordenador.Memoria;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MemoriaTest {

    @Test
    public void testGetTamanio() {

        Memoria objMemoria = new Memoria(32, 3200, "DDR5");

        assertEquals( 32, objMemoria.getTamanio() );

    }

    @Test
    public void testGetVelocidad() {

        Memoria objMemoria = new Memoria(32, 3200, "DDR5");

        assertEquals( 3200, objMemoria.getVelocidad()  );

    }

    @Test
    public void testGetTipo() {

        Memoria objMemoria = new Memoria(32, 3200, "DDR5");

        assertEquals( "DDR5", objMemoria.getTipo() );

    }

    @Test
    public void testToString(){

        Memoria objMemoria = new Memoria(32,3200,"DDR5");

        assertEquals("Tamanio de la memoria: 32 Velocidad de la memoria: 3200Mhz Tipo de memoria: DDR5",objMemoria.toString());

    }

}
