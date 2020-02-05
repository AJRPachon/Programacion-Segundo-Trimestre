package Ordenador.Test;

import Ordenador.Procesador;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProcesadorTest {

    @Test
    public void testGetModelo(){

        Procesador objProcesador = new Procesador("i7-4790", 3);

        assertEquals( objProcesador.getModelo(), "i7-4790" );

    }

    @Test
    public void testGetVelocidad(){

        Procesador objProcesador = new Procesador("i7-4790", 3);

        assertEquals( objProcesador.getModelo(), "i7-4790" );

    }


}
