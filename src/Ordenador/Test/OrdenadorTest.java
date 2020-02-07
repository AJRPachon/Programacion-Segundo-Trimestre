package Ordenador.Test;

import static org.junit.Assert.*;

import Ordenador.DiscoDuro;
import Ordenador.Memoria;
import Ordenador.Ordenador;
import Ordenador.Procesador;
import org.junit.Test;

public class OrdenadorTest {


	@Test
	public void testGetPrecioBase(){

		Memoria objMemoria = new Memoria();
		DiscoDuro objDiscoDuro = new DiscoDuro();
		Procesador objProcesador = new Procesador();
		Ordenador objOrdenador = new Ordenador(750, 7, objMemoria, objDiscoDuro, objProcesador );

		assertEquals( objOrdenador.getPrecioBase(), 750, 0.001 );

	}

	@Test
	public void testGetIVA(){

		Memoria objMemoria = new Memoria();
		DiscoDuro objDiscoDuro = new DiscoDuro();
		Procesador objProcesador = new Procesador();
		Ordenador objOrdenador = new Ordenador(750, 7, objMemoria, objDiscoDuro, objProcesador );

		assertEquals( objOrdenador.getIVA(), 7 );

	}

}
