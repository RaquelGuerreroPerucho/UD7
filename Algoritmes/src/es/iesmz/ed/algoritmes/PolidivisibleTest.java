package es.iesmz.ed.algoritmes;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
class PolidivisibleTest {

    @Test
    public void test1() {
        Polidivisible p1 = new Polidivisible(381654729);

        boolean resultadoReal = p1.esPolidivisible();
        boolean resultadoEsperado = true;

        assertEquals(resultadoEsperado, resultadoReal);
    }

}