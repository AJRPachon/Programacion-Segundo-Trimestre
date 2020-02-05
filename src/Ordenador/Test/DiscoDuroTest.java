package Ordenador.Test;

import Ordenador.DiscoDuro;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class DiscoDuroTest {

    @Test
    public void testGetTamanio(){

        DiscoDuro objDiscoDuro = new DiscoDuro(480, "SSD");

        assertEquals( objDiscoDuro.getTamanio(), 480 );

    }

    @Test
    public void testGetTipo(){

        DiscoDuro objDiscoDuro = new DiscoDuro(480, "SSD");

        assertEquals( objDiscoDuro.getTipo(), "SSD" );

    }

}
