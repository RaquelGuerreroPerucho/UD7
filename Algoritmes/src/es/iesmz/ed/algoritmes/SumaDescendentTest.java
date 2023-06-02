package es.iesmz.ed.algoritmes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumaDescendentTest {
    @Test
    public void test4578(){
        long resultadoReal = SumaDescendent.suma(4578);
        long resultadoEsperado = 5242;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test9(){
        long resultadoReal = SumaDescendent.suma(9);
        long resultadoEsperado = 9;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test60007(){
        long resultadoReal = SumaDescendent.suma(60007);
        long resultadoEsperado = 13;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testMenos9876(){
        long resultadoReal = SumaDescendent.suma(-9876);
        long resultadoEsperado = -30;

        assertEquals(resultadoEsperado, resultadoReal);
    }
}