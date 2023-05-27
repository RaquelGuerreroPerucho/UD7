package es.iesmz.ed.algoritmes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HyperparTest {
    @Test
    public void testNumeroHyperPar(){
        boolean resultadoReal = Hyperpar.esHyperpar(2468);
        boolean resultadoEsperado = true;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testNumeroNoHyperPar(){
        boolean resultadoReal = Hyperpar.esHyperpar(2334);
        boolean resultadoEsperado = false;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testNumeroHyperParNegativo(){
        boolean resultadoReal = Hyperpar.esHyperpar(-4224);
        boolean resultadoEsperado = true;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testNumeroNoHyperParNegativo(){
        boolean resultadoReal = Hyperpar.esHyperpar(-1214);
        boolean resultadoEsperado = false;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testNumeroNoHyperParNegativo2(){
        boolean resultadoReal = Hyperpar.esHyperpar(-111111155555555L);
        boolean resultadoEsperado = false;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testNumeroNoHyperPar2(){
        boolean resultadoReal = Hyperpar.esHyperpar(1000000888880000005L);
        boolean resultadoEsperado = false;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testHyperPar2(){
        boolean resultadoReal = Hyperpar.esHyperpar(2222222226666666668L);
        boolean resultadoEsperado = true;

        assertEquals(resultadoEsperado, resultadoReal);
    }
}