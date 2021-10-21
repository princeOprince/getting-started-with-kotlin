package com.princeoprince

import org.junit.jupiter.api.Assertions
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe
import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.verify

class CalculatorSpek : Spek( {
    var calculator: Calculator? = null

    describe("the calculator") {

        beforeEachTest {
            calculator = Calculator(NullResult())
        }

        it("should add two numbers") {
            val result = calculator?.add(12, 13)

            Assertions.assertEquals(25, result)
        }

        it("should accumulate one number") {
            calculator?.accumulate(23)

            Assertions.assertEquals(23, calculator?.total)
        }

        it("should accumulate two number") {
            calculator?.accumulate(2)
            calculator?.accumulate(3)

            Assertions.assertEquals(5, calculator?.total)
        }
    }

    describe("the output should be written correctly") {
        val result: Result = mock()
        val calculator = Calculator(result)

        it("should write the output amount") {
            calculator.accumulate(23)
            verify(result).write(23)
        }
    }
})

