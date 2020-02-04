package Ordenador;

import static org.junit.Assert.*;

import Ordenador.DiscoDuro;
import Ordenador.Memoria;
import Ordenador.Ordenador;
import Ordenador.Procesador;
import org.junit.Test;

public class OrdenadorTest {

	@Test
	public void testMemoria() {

		Memoria objMemoria = new Memoria(5, 10, "hola");

		assertEquals( objMemoria.getTamanio(), 5 );
		assertEquals( objMemoria.getVelocidad(), 10 );
		assertEquals( objMemoria.getTipo(), "hola" );

	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Test
	public void testDiscoDuro(){

		DiscoDuro objDiscoDuro = new DiscoDuro(20, "adios");

		assertEquals( objDiscoDuro.getTamanio(), 20 );
		assertEquals( objDiscoDuro.getTipo(), "adios" );

	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Test
	public void testProcesador(){

		Procesador objProcesador = new Procesador("vale", 30);

		assertEquals( objProcesador.getModelo(), "vale" );
		assertEquals( objProcesador.getVelocidad(), 30 );

	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Test
	public void testOrdenador(){

		Memoria objMemoria = new Memoria();
		DiscoDuro objDiscoDuro = new DiscoDuro();
		Procesador objProcesador = new Procesador();
		Ordenador objOrdenador = new Ordenador(2.0, 5, objMemoria, objDiscoDuro, objProcesador );

		assertEquals( objOrdenador.getPrecioBase(), 2.5, 0.5 );
		assertEquals( objOrdenador.getIVA(), 5 );

	}

}
