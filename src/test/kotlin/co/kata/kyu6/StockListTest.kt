package co.kata.kyu6

import main.kotlin.co.kata.kyu6.StockList
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class StockListTest {
    private fun testing(lstOfArt: Array<String>, lstOfCat: Array<String>, expect: String) {
        val actual: String = StockList.stockSummary(lstOfArt, lstOfCat)
        assertEquals(expect, actual)
    }
    @Test
    fun basicTests() {
        var b = arrayOf("BBAR 150", "CDXE 515", "BKWR 250", "BTSQ 890", "DRTY 600")
        var c = arrayOf("A", "B", "C", "D")
        var res = "(A : 0) - (B : 1290) - (C : 515) - (D : 600)"
        testing(b, c, res)

        b = arrayOf("ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600")
        c = arrayOf("A", "B")
        res = "(A : 200) - (B : 1140)"
        testing(b, c, res)

        testing(arrayOf(), arrayOf("A", "B"), "")
        testing(arrayOf(), arrayOf(), "")
    }
}