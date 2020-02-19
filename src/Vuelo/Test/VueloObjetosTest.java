package Vuelo.Test;

import Vuelo.VueloObjetos;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VueloObjetosTest {

    @Test
    void getFumadoresAsiento() {

        VueloObjetos obj = new VueloObjetos();

        boolean res;

        res = obj.getFumadoresAsiento(15);  //Asigno a res si la posición 15, que en este caso debería ser false

        assertFalse(res);

    }

    @Test
    void getNormalesAsiento() {
    }

    @Test
    void getAsiento() {
    }

    @Test
    void asignarAsientoN() {
    }

    @Test
    void asignarAsientoF() {
    }

    @Test
    void calcularNormales() {
    }

    @Test
    void calcularFumadores() {
    }

    @Test
    void asientosDisponiblesNF() {
    }

    @Test
    void asientosDisponiblesF() {
    }

    @Test
    void imprimirAsientosDisp() {
    }

    @Test
    void asientosRNF() {
    }

    @Test
    void asientosRF() {
    }

    @Test
    void testHashCode() {
    }

    @Test
    void testEquals() {
    }

    @Test
    void testClone() {
    }

    @Test
    void compareTo() {
    }
}