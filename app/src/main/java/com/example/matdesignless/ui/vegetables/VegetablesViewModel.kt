package com.example.matdesignless.ui.vegetables

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class VegetablesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is vegetable Fragment"
    }
    val text: LiveData<String> = _text
}