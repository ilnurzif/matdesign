package com.matdesign.appmatdesign

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_buttons.*

class ButtonsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buttons)
        closeButton.setOnClickListener {finish()}
        enterButton.setOnClickListener {
            val intent= Intent(this,ToolBarActivity::class.java)
            startActivity(intent)
        }
    }
}