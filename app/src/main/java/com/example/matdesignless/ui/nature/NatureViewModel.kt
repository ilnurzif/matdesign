package com.example.matdesignless.ui.nature

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.matdesignless.R
import com.example.matdesignless.entities.Entities

class NatureViewModel : ViewModel() {
    val natureList = listOf(
        Entities("nature1", R.drawable.nature1),
        Entities("nature2", R.drawable.nature2),
        Entities("nature3", R.drawable.nature2)
    )

    private val _text = MutableLiveData<String>().apply {
        value = "This is nature Fragment"
    }
    val text: LiveData<String> = _text
}