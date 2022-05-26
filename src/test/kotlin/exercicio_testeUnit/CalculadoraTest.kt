package exercicio_testeUnit

import exercicio_testeUnit.exercicioscomTDD.Calculadora
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CalculadoraTest {

    @Test
    fun somaTest() {
        assertEquals(4.0, Calculadora.soma(2.0,2.0))
    }

    @Test
    fun subtracaoTest() {
        assertEquals(0.0, Calculadora.subtracao(2.0,2.0))
    }

    @Test
    fun multi() {
        assertEquals(6.0, Calculadora.multi(2.0,3.0))
    }

    @Test
    fun divTeste() {
        assertEquals(1.0, Calculadora.div(2.0,2.0))
    }

    @Test
    fun potTeste() {
        assertEquals(25.0, Calculadora.pot(5.0,2.0))
    }

    @Test
    fun raiz2Teste() {
        assertEquals(5.0, Calculadora.raiz2(25.0))
    }
}