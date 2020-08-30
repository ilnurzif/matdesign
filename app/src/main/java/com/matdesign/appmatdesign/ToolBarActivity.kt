package com.matdesign.appmatdesign

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.toolbar_activity.*

class ToolBarActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val TAG="Debug"
        super.onCreate(savedInstanceState)
        setContentView(R.layout.toolbar_activity)
        setSupportActionBar(toolbar)
        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true)
        toolbar.setNavigationOnClickListener{
             Log.d(TAG, "hideToolBarActivity")
             finish() }
        }
    }