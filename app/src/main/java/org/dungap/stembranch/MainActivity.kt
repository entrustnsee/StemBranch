package org.dungap.stembranch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.dungap.mylibrary.StemBranchLocal
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val timeP = GregorianCalendar()
        val timeR = GregorianCalendar(TimeZone.getTimeZone("GMT+09:00"))

        println(StemBranchLocal(timeP, timeR).ddSS())
        println(StemBranchLocal(timeP, timeR).ddBB())
        println(StemBranchLocal(timeP, timeR).hhSS())
        println(StemBranchLocal(timeP, timeR).hhBB())
        println(timeR.timeZone.toString())


    }
}