package com.compose.calculatorcompose

sealed class CalculatorActions {
    data class Number(val number: Int): CalculatorActions()
    object ClearAction: CalculatorActions()
    object DeleteAction: CalculatorActions()
    object DecimalAction: CalculatorActions()
    object CalculateAction: CalculatorActions()
    data class Operation(val calculatorOperation: CalculatorOperation): CalculatorActions()
}