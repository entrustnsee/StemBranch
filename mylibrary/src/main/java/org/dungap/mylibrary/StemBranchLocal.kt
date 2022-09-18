package org.dungap.mylibrary

import java.util.*

class StemBranchLocal(
    private var myPointPT: GregorianCalendar? = null,
    private var myPointRT: GregorianCalendar? = null) {

    private val firstPoint: GregorianCalendar = GregorianCalendar(1919, 10, 7, 23, 0)

    init {
        firstPoint.timeZone = TimeZone.getTimeZone("GMT+09:00")
    }

    private val oneDayInMillis = 1000 * 60 * 60 * 24
    private val twoHoursInMillis = 1000 * 60 * 60 * 2
    private val days = ((myPointRT!!.timeInMillis - firstPoint.timeInMillis) / oneDayInMillis).toInt() + 1
    private val twoHours = ((myPointRT!!.timeInMillis - firstPoint.timeInMillis) / twoHoursInMillis).toInt() + 1

    fun ddSS(): String {
        val ten = days % 10
        return NumberToSymbol().intToSS(ten)
    }

    fun ddBB(): String {
        val twelve = days % 12
        return NumberToSymbol().intToBB(twelve)
    }

    fun hhSS(): String {
        val ten = twoHours % 10
        return NumberToSymbol().intToSS(ten)
    }

    fun hhBB(): String {
        val twelve = twoHours % 12
        return NumberToSymbol().intToBB(twelve)
    }
}