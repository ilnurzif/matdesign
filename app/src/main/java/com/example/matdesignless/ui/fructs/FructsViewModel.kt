package com.example.matdesignless.ui.fructs

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FructsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is fructs Fragment"
    }
    val text: LiveData<String> = _text
}