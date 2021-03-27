package com.matdesign.appmatdesign

import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.preference.PreferenceManager

open class BaseActivity : AppCompatActivity() {
    lateinit var sp:SharedPreferences
// изм строка
    // строка 2
    // стр 3444
    override fun onCreate(savedInstanceState: Bundle?) {
        sp = PreferenceManager.getDefaultSharedPreferences(this)
        val themeName=sp.getString("themeName", "0")
        val theme:Int?=themeName?.toInt()
        when (theme) {
            "0".toInt()->
                setTheme(R.style.AppTheme)
            "1".toInt()->
                setTheme(R.style.AppThemeRed)
        }

        super.onCreate(savedInstanceState)
    }

}