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

    @Test
    public void test2() {
        Polidivisible p1 = new Polidivisible(102);

        boolean resultadoReal = p1.esPolidivisible();
        boolean resultadoEsperado = true;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test3() {
        Polidivisible p1 = new Polidivisible(9876);

        boolean resultadoReal = p1.esPolidivisible();
        boolean resultadoEsperado = true;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test4() {
        Polidivisible p1 = new Polidivisible(7589);

        boolean resultadoReal = p1.esPolidivisible();
        boolean resultadoEsperado = false;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test5() {
        Polidivisible p1 = new Polidivisible(10009);

        boolean resultadoReal = p1.esPolidivisible();
        boolean resultadoEsperado = false;

        assertEquals(resultadoEsperado, resultadoReal);
    }


}