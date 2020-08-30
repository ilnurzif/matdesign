package com.matdesign.appmatdesign

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import androidx.preference.PreferenceManager
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.settings_activity.*

class SettingsActivity : BaseActivity() {
    lateinit var editor:SharedPreferences.Editor

    override fun onCreate(savedInstanceState: Bundle?) {
        editor= PreferenceManager.getDefaultSharedPreferences(this).edit()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.settings_activity)
        setOnClickListener(defaultThemeFab)
        setOnClickListener(redThemeFab)
    }

    fun setOnClickListener(fab: FloatingActionButton) {
        fab.setOnClickListener{view: View? ->  editor.putString("themeName",
            view?.tag as String? )
            editor.commit()
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val intent= Intent(this,MainActivity::class.java)
        startActivity(intent)
        return true
    }
}