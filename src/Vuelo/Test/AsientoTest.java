package Vuelo.Test;

import Vuelo.Asiento;
import org.junit.Test;

import static org.junit.Assert.*;

public class AsientoTest {

////////////////////// GETTERS Y SETTERS FUMADORES  //////////////////////////////////////////////////////////////////////////////

    @Test
    public void getFumadores() {

        Asiento[] obj = new Asiento[20];

        for(int cont=16; cont < obj.length; cont++ ){

            obj[cont] = new Asiento(); //Para inicializar el array de objetos
        }

        boolean res;

        res = obj[18].getFumadores();

        assertFalse(res);

    }

    @Test
    public void setFumadores() {

        Asiento[] obj = new Asiento[20];
        boolean res,res2;

        for(int cont=16; cont < obj.length; cont++ ){

            obj[cont] = new Asiento(); //Para inicializar el array de objetos
        }

        res = obj[18].getFumadores(); //Primero cogemos el valor que tiene antes de ser cambiado
        obj[18].setFumadores();         //Cambiamos el valor de la misma casilla
        res2 = obj[18].getFumadores();  //Lo recogemos en una nueva variable

        assertNotEquals(res2,res);      //Comparamos esas 2 variables para saber si no son iguales


    }

////////////////////// GETTERS Y SETTERS NORMALES  //////////////////////////////////////////////////////////////////////////////

    @Test
    public void getNormales() {

        Asiento[] obj = new Asiento[20];

        for (int cont = 0; cont < 16; cont++){

            obj[cont] = new Asiento();
        }

        boolean res;

        res = obj[4].getNormales();

        assertFalse(res);

    }

    @Test
    public void setNormales() {

        Asiento[] obj = new Asiento[20];

        boolean res,res2;

        for(int cont=16; cont < obj.length; cont++ ){

            obj[cont] = new Asiento(); //Para inicializar el array de objetos
        }

        res = obj[18].getNormales(); //Primero cogemos el valor que tiene antes de ser cambiado
        obj[18].setNormales();         //Cambiamos el valor de la misma casilla
        res2 = obj[18].getNormales();  //Lo recogemos en una nueva variable

        assertNotEquals(res2,res);      //Comparamos esas 2 variables para saber si no son iguales


    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Test
    public void testToString() {
    }

    @Test
    public void testHashCode() {
    }

    @Test
    public void testEquals() {


    }

    @Test
    public void testClone() {
    }


}