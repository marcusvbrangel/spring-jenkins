package com.marvin.springjenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    Calculadora calculadora = new Calculadora();

    @Test
    public void testSomar() {
        assertEquals(5, calculadora.somar(2, 3));
        assertEquals(-1, calculadora.somar(-2, 1));
        assertEquals(0, calculadora.somar(0, 0));
    }

    @Test
    public void testSubtrair() {
        assertEquals(1, calculadora.subtrair(3, 2));
        assertEquals(-3, calculadora.subtrair(-2, 1));
        assertEquals(0, calculadora.subtrair(0, 0));
    }

    @Test
    public void testMultiplicar() {
        assertEquals(6, calculadora.multiplicar(2, 3));
        assertEquals(-2, calculadora.multiplicar(-2, 1));
        assertEquals(0, calculadora.multiplicar(0, 3));
    }

    @Test
    public void testDividir() {
        assertEquals(2, calculadora.dividir(6, 3));
        assertEquals(-2, calculadora.dividir(-4, 2));
        assertEquals(0.5, calculadora.dividir(1, 2));
        assertEquals(0.5, calculadora.dividir(1, 0));
    }

    @Test
    public void testModulo() {
        assertEquals(1, calculadora.modulo(7, 3));
        assertEquals(-1, calculadora.modulo(-7, 3));
        assertEquals(0, calculadora.modulo(6, 3));
    }
}
