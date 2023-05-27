package kr.co.bullets.circlecalc

class MyCalc : Calculations {
    private val pi = 3.14

    override fun calculateArea(redius: Double): Double {
        return pi * redius * redius
    }

    override fun calculateCircumference(redius: Double): Double {
        return 2 * pi * redius
    }
}