package org.dungap.mylibrary

import java.util.*

open class StemBranchKorea(
    var nodes: Array<Array<String>>,
    var myPointPT: GregorianCalendar? = null,
    private var lineCount: Int = 0
) {
    init {
        countToMyBar()
    }

    private fun countToMyBar() {
        val barsToMyPoint = ArrayList<String>()
        val pointInBar = GregorianCalendar(TimeZone.getTimeZone("GMT+09:00"))
        for (node in nodes) {
            val yy = node[0].toInt()
            val mm = node[1].toInt()
            val dd = node[2].toInt()
            val hh = node[3].toInt()
            val mt = node[4].toInt()
            pointInBar[GregorianCalendar.YEAR] = yy
            pointInBar[GregorianCalendar.MONTH] = mm - 1
            pointInBar[GregorianCalendar.DATE] = dd
            pointInBar[GregorianCalendar.HOUR_OF_DAY] = hh
            pointInBar[GregorianCalendar.MINUTE] = mt
            if (myPointPT!! >= pointInBar) {
                barsToMyPoint.add("a")
            }
            lineCount = barsToMyPoint.size - 1
        }
    }

    fun node(): String {
        return nodes[lineCount][5]
    }

    fun mmStem(): String {
        return nodes[lineCount][6]
    }

    fun mmBranch(): String {
        return nodes[lineCount][7]
    }

    fun yyStem(): String {
        return nodes[lineCount][8]
    }

    fun yyBranch(): String {
        return nodes[lineCount][9]
    }

    fun yy30Stem(): String {
        return nodes[lineCount][10]
    }

    fun yy30Branch(): String {
        return nodes[lineCount][11]
    }

    fun springYear(): String {
        return nodes[lineCount][12]
    }
}