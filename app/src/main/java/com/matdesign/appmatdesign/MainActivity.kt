package com.matdesign.appmatdesign

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.Menu
import android.view.MenuItem
import androidx.fragment.app.FragmentTransaction
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val frag2: Fragment = Fragment()
        val ft: FragmentTransaction? = supportFragmentManager.beginTransaction()
        ft?.let {
            frag2?.let { ft.add(R.id.fragment, frag2) }
            it.commit()
        }

        mTextInputLayout.setHint(getString(R.string.hint))
        mEditText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(
                s: CharSequence,
                start: Int,
                count: Int,
                after: Int
            ) {
            }

            override fun onTextChanged(
                s: CharSequence,
                start: Int,
                before: Int,
                count: Int
            ) {
            }

            override fun afterTextChanged(s: Editable) {
                if (s.length > mTextInputLayout.getCounterMaxLength())
                    mTextInputLayout.setError("Max character length is " + mTextInputLayout.getCounterMaxLength())
                else mTextInputLayout.setError(
                    null
                )
            }
        })
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        when (id) {
            R.id.setting -> onSettingClick()
        }
        return super.onOptionsItemSelected(item)
    }

    private fun onSettingClick() {
        val intent = Intent(this, SettingsActivity::class.java)
        startActivity(intent)
    }
}