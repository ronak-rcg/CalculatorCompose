package com.compose.calculatorcompose

data class CalculatorState(
    val firstNumber: String = "",
    val secondNumber: String = "",
    val operation: CalculatorOperation? = null
)
