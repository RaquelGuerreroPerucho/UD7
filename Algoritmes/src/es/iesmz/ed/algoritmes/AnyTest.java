package es.iesmz.ed.algoritmes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnyTest {
    @Test
    public void test1964(){
        int resultadoReal = Any.digitsDiferents(1964);
        int resultadoEsperado = 4;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test1664(){
        int resultadoReal = Any.digitsDiferents(1664);
        int resultadoEsperado = 3;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test1999(){
        int resultadoReal = Any.digitsDiferents(1999);
        int resultadoEsperado = 2;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test2222(){
        int resultadoReal = Any.digitsDiferents(2222);
        int resultadoEsperado = 1;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test20020(){
        int resultadoReal = Any.digitsDiferents(212346);
        int resultadoEsperado = 5;

        assertEquals(resultadoEsperado, resultadoReal);
    }
}