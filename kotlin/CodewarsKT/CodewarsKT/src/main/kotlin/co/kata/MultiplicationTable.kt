package main.kotlin.co.kata

class MultiplicationTable {
    object KataSolution {
        fun multiplicationTable(size: Int): Array<IntArray> {
            val result = mutableListOf<IntArray>()
            for (i in 0..<size) {
                val iArray = IntArray(size)
                for (j in 0..<size) {
                    iArray[j] = when {
                        i == 0 -> j+1
                        j == 0 -> result[0][i]
                        else -> iArray[0] * result[0][j]
                    }
                }
                result.add(iArray)
            }
            return result.toTypedArray()
        }
    }
}