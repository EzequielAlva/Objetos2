package ar.edu.unlp.info.oo2.ejercicio07;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    private Calculadora calculadora;

    @BeforeEach
    void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    public void estadoInicialTest() {
        assertEquals("0.0", calculadora.getResultado());

        calculadora.setValor(5);
        assertEquals("5.0", calculadora.getResultado());

        calculadora.setValor(10);
        assertEquals("10.0", calculadora.getResultado());
    }

    @Test
    public void estadoMasTest() {
        calculadora.setValor(5);
        calculadora.mas();
        calculadora.setValor(7);
        assertEquals("12.0", calculadora.getResultado());

        calculadora.mas();
        calculadora.setValor(8);
        assertEquals("20.0", calculadora.getResultado());
    }

    @Test
    public void estadoMenosTest() {
        calculadora.setValor(20);
        calculadora.menos();
        calculadora.setValor(7);
        assertEquals("13.0", calculadora.getResultado());
    }

    @Test
    public void estadoPorTest() {
        calculadora.setValor(2);
        calculadora.por();
        calculadora.setValor(7);
        assertEquals("14.0", calculadora.getResultado());
    }

    @Test
    public void estadoDivididoTest() {
        calculadora.setValor(20);
        calculadora.dividido();
        calculadora.setValor(2);
        assertEquals("10.0", calculadora.getResultado());

        calculadora.dividido();
        calculadora.setValor(0);
        assertEquals("Error", calculadora.getResultado());
    }

    @Test
    public void errorTest() {
        calculadora.setValor(20);
        calculadora.mas();
        calculadora.menos();
        assertEquals("Error", calculadora.getResultado());

        calculadora.setValor(20);
        calculadora.mas();
        calculadora.setValor(20);
        assertEquals("Error", calculadora.getResultado());
    }

    @Test
    public void borrarTest() {
        calculadora.setValor(20);
        calculadora.mas();
        calculadora.menos();
        assertEquals("Error", calculadora.getResultado());

        calculadora.borrar();

        calculadora.setValor(20);
        calculadora.mas();
        calculadora.setValor(20);
        assertEquals("40.0", calculadora.getResultado());
    }
}
