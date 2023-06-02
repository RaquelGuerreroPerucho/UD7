package es.iesmz.ed.algoritmes;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class cablejatTest {
    @Test
    public void HM() {
        ArrayList<String> cables = new ArrayList<String>();
        cables.add("HM");

        Cablejat cableado = new Cablejat(cables);

        boolean resultadoReal =cableado.esPotConnectar();
        boolean resultadoEsperado = true;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void HH() {
        ArrayList<String> cables = new ArrayList<String>();
        cables.add("HH");

        Cablejat cableado = new Cablejat(cables);

        boolean resultadoReal =cableado.esPotConnectar();
        boolean resultadoEsperado = false;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void HMMH() {
        ArrayList<String> cables = new ArrayList<String>();
        cables.add("HM");
        cables.add("MH");

        Cablejat cableado = new Cablejat(cables);

        boolean resultadoReal =cableado.esPotConnectar();
        boolean resultadoEsperado = true;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void HMHHMM() {
        ArrayList<String> cables = new ArrayList<String>();
        cables.add("HM");
        cables.add("HH");
        cables.add("MM");

        Cablejat cableado = new Cablejat(cables);

        boolean resultadoReal =cableado.esPotConnectar();
        boolean resultadoEsperado = true;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void HMHHMMMH() {
        ArrayList<String> cables = new ArrayList<String>();
        cables.add("HM");
        cables.add("HH");
        cables.add("MM");
        cables.add("MH");

        Cablejat cableado = new Cablejat(cables);

        boolean resultadoReal =cableado.esPotConnectar();
        boolean resultadoEsperado = true;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void AAHMMH() {
        ArrayList<String> cables = new ArrayList<String>();
        cables.add("AA");
        cables.add("HM");
        cables.add("MH");

        Cablejat cableado = new Cablejat(cables);

        boolean resultadoReal =cableado.esPotConnectar();
        boolean resultadoEsperado = false;

        assertEquals(resultadoEsperado, resultadoReal);
    }

}