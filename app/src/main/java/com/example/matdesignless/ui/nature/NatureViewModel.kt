package com.example.matdesignless.ui.nature

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NatureViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is nature Fragment"
    }
    val text: LiveData<String> = _text
}