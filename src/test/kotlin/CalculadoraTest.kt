package  mutation.test

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.assertj.core.api.Assertions.assertThat

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CalculadoraTest {
    val calculadora : Calculadora = Calculadora()

    @Test
    fun testBhaskara() {
        val result = calculadora.bhaskara(2.0,9.0,7.0)
        val x1: Double = -1.0
        val x2: Double = -3.5
        assertThat(result).isEqualTo(Pair(x1, x2))
    }

    @Test
    fun testBhaskara2() {
        val result = calculadora.bhaskara(1.0,4.0,13.0)
        val x1: Double = Double.NaN
        val x2: Double = Double.NaN
        assertThat(result).isEqualTo(Pair(x1, x2))
    }

    @Test
    fun testBhaskara3() {
        val result = calculadora.bhaskara(2.0,2.0,0.0)
        val x1: Double = 0.0
        val x2: Double = -1.0
        assertThat(result).isEqualTo(Pair(x1, x2))
    }
}