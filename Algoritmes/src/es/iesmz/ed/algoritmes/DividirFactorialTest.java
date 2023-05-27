package es.iesmz.ed.algoritmes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DividirFactorialTest {
    @Test
    public void test1(){
        long resultadoReal = DividirFactorial.divisio(4,6);
        long resultadoEsperado = (long) 0.03333333333333333;

        assertEquals(resultadoEsperado, resultadoReal,0.1);
    }

    @Test
    public void test2(){
        long resultadoReal = DividirFactorial.divisio(0,50);
        long resultadoEsperado = (long) 0.02;

        assertEquals(resultadoEsperado, resultadoReal,0.1);
    }

    @Test
    public void test3(){
        long resultadoReal = DividirFactorial.divisio(0,0);
        long resultadoEsperado =1;

        assertEquals(resultadoEsperado, resultadoReal,0.1);
    }

    @Test
    public void test4(){
        long resultadoReal = DividirFactorial.divisio(10,7);
        long resultadoEsperado = 720;

        assertEquals(resultadoEsperado, resultadoReal,0.1);
    }

    @Test
    public void test5(){
        long resultadoReal = DividirFactorial.divisio(1,1);
        long resultadoEsperado = 1;

        assertEquals(resultadoEsperado, resultadoReal,0.1);
    }

    @Test
    public void test6(){
        long resultadoReal = DividirFactorial.divisio(9,7);
        long resultadoEsperado = 72;

        assertEquals(resultadoEsperado, resultadoReal,0.1);
    }
}