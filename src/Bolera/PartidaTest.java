package Bolera;

import org.junit.Test;

import static org.junit.Assert.*;

public class PartidaTest {



    @Test
    public void crearNombreJugadores() {

        int cantPista = 12;
        int cantJuga = 4;
        int cantNombres = cantPista * cantJuga;
        int posicion;
        String nombre;

        Partida objPartida = new Partida(cantPista, cantJuga);
        objPartida.crearNombreJugadores(cantNombres);

        //Extremos
        posicion = 1;
        nombre = objPartida.getNombreJugadores(posicion);
        assertNotEquals(null, nombre);

        posicion = cantNombres; //CantNombres porque va a ser siempre nuestro extremo
        nombre = objPartida.getNombreJugadores(posicion);
        assertNotEquals(null, nombre);

    }

    @Test
    public void crearJugadores() {

        int cantPista = 12;
        int cantJuga = 4;
        int cantNombres = cantPista * cantJuga;
        int posPista;
        int posJuga;

        String nombre;
        int puntuacion;

        Partida objPartida = new Partida (cantPista, cantJuga);
        objPartida.crearNombreJugadores(cantNombres);
        objPartida.crearJugadores();

        //Extremos
        posPista = 1;
        posJuga = 1;

        nombre = objPartida.getJugadorNombre(posPista,posJuga);
        assertNotEquals(null, nombre);

        puntuacion = objPartida.getJugadorPuntuacion(posPista,posJuga);
        assertEquals(0, puntuacion);


        posPista = cantPista;
        posJuga = cantJuga;

        nombre = objPartida.getJugadorNombre(posPista,posJuga);
        assertNotEquals(null, nombre);

        puntuacion = objPartida.getJugadorPuntuacion(posPista,posJuga);
        assertEquals(0, puntuacion);

    }

    @Test
    public void generarPuntuacionJugadores() {

        int cantPista = 12;
        int cantJuga = 4;
        int cantNombres = cantPista * cantJuga;
        int posPista;
        int posJuga;

        int puntuacion;

        Partida objPartida = new Partida (cantPista, cantJuga);
        objPartida.crearNombreJugadores(cantNombres);
        objPartida.crearJugadores();
        objPartida.generarPuntuacionJugadores();

        //Extremos
        posPista = 1;
        posJuga = 1;
        puntuacion = objPartida.getJugadorPuntuacion(posPista,posJuga);
        assertNotEquals(null, puntuacion);

        posPista = cantPista;
        posJuga = cantJuga;
        puntuacion = objPartida.getJugadorPuntuacion(posPista,posJuga);
        assertNotEquals(null, puntuacion);

    }

    @Test
    public void mostrarPuntuacionPista() {
    }

    @Test
    public void maxPuntuacionPista() {
    }


    @Test
    public void getPartida() {

        int cantPista = 12;
        int cantJuga = 4;
        int cantNombres = cantPista * cantJuga;
        Jugador[][] partida;
        Jugador[][] partida2;

        Partida objPartida = new Partida (cantPista, cantJuga);
        Partida objPartida2 = new Partida(cantPista, cantJuga);

        partida = objPartida.getPartida();
        partida2 = objPartida2.getPartida();
        assertArrayEquals(partida2,partida);

    }

    @Test
    public void getIDPista() {
    }

    @Test
    public void getLongitudPista() {
    }

    @Test
    public void getLongitudJugadores() {
    }

    @Test
    public void getJugadorNombre() {
    }

    @Test
    public void getJugadorPuntuacion() {
    }

    @Test
    public void setJugadorPuntuacion() {
    }

    @Test
    public void getJugadorIDJugador() {
    }
}