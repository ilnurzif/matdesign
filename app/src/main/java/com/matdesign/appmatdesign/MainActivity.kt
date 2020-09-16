package com.matdesign.appmatdesign

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.fragment.app.FragmentTransaction

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id=item.itemId
        when(id) {
          R.id.setting->onSettingClick()
        }
        return super.onOptionsItemSelected(item)
    }

    private fun onSettingClick() {
      val intent=Intent(this,SettingsActivity::class.java)
        startActivity(intent)
    }
}