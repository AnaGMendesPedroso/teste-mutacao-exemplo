package  mutation.test

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.assertj.core.api.Assertions.assertThat

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CalculadoraTest {
    val calculadora : Calculadora = Calculadora()

    @Test
    fun testSoma() {
        val result = calculadora.somar(1.5,2.5)
        assertThat(result).isEqualTo(4.0)
    }

    @Test
    fun testSubtracao() {
        val result = calculadora.subtrair(2.5,1.5)
        assertThat(result).isEqualTo(1.0)
    }

    @Test
    fun testMultiplicao() {
        val result = calculadora.multiplicar(1.5,2.5)
        assertThat(result).isEqualTo(3.75)
    }

    @Test
    fun testDivisao() {
        val result = calculadora.dividir(10.0,2.0)
        assertThat(result).isEqualTo(5.0)
    }

    @Test
    fun testPotencia() {
        val result = calculadora.potencia(10.0,2.0)
        assertThat(result).isEqualTo(100.0)
    }

    @Test
    fun testBhaskara() {
        val result = calculadora.bhaskara(2.0,9.0,7.0)
        val x1: Double = -1.0
        val x2: Double = -3.5
        assertThat(result).isEqualTo(Pair(x1, x2))
    }
}