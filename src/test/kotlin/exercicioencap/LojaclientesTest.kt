package exercicioencap

import exercicio_testeUnit.exercicioscomTDD.Lojaclientes
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class LojaclientesTest {
    var clientTest = Lojaclientes("teste")


    @Test
    fun addcompraTest() {
        clientTest.addcompra("Cigarro")
        clientTest.addcompra("Bebida")
        assertEquals(2,clientTest.totalitens())
        assertTrue(clientTest.verificarItem("Bebida"))

    }

    @Test
    fun excluircompraTest() {
        clientTest.addcompra("Macarrao")
        clientTest.addcompra("Molho")
        clientTest.excluircompra("Molho")
        assertFalse(clientTest.verificarItem("Molho"))
        assertEquals(1,clientTest.totalitens())
    }

    @Test
    fun totalitens() {
        assertEquals(0, clientTest.totalitens())
    }
}