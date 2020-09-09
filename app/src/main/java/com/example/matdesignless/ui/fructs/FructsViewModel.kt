package com.example.matdesignless.ui.fructs

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.matdesignless.R
import com.example.matdesignless.entities.Fruct

class FructsViewModel : ViewModel() {
    val fructList = listOf(
        Fruct("apple", R.drawable.apple),
        Fruct("pear", R.drawable.pear))
}