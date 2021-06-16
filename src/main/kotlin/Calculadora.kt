package  mutation.test

import kotlin.math.pow
import kotlin.math.sqrt

class Calculadora {

    fun deltaBhaskara(valorA: Double, valorB: Double, valorC: Double): Double {
        val delta = valorB.pow(2.0) - 4.0 * valorA * valorC
        return delta
    }

    fun bhaskara(valorA: Double, valorB: Double, valorC: Double): Pair<Double, Double>{
        val raizQuadrada = sqrt(deltaBhaskara(valorA, valorB, valorC))

        val x1 = x1Bhaskara(valorA, valorB, raizQuadrada)
        val x2 = x2Bhaskara(valorA, valorB, raizQuadrada)

        return Pair(x1, x2)
    }

    fun x1Bhaskara(valorA: Double, valorB: Double, raizQuadrada: Double): Double{
        val aux = (valorB.times(-1) + raizQuadrada)
        val x1 = aux.div(2.0 * valorA)

        return x1
    }

    fun x2Bhaskara(valorA: Double, valorB: Double, raizQuadrada: Double): Double{
        val aux = (valorB.times(-1) - raizQuadrada)
        val x2 = aux.div(2.0 * valorA)

        return x2
    }


}