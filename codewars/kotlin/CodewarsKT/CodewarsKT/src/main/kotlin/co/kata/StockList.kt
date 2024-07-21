package main.kotlin.co.kata

object StockList {
    fun stockSummary(lstOfArt: Array<String>, lstOfCat: Array<String>): String {
        if (lstOfArt.isEmpty()) return ""
        val resultMap: MutableMap<String, Int> = hashMapOf()
        lstOfArt.map {
            val cat = it.first().toString()
            val currentCount = resultMap.getOrDefault(cat, 0)
            resultMap[cat] = it.split(" ")[1].toInt() + currentCount
        }
        return lstOfCat.joinToString(" - ") {
            "(${it} : ${resultMap.getOrDefault(it, 0)})"
        }
    }
}