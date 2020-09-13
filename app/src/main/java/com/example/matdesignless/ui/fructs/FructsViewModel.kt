package com.example.matdesignless.ui.fructs

import androidx.lifecycle.ViewModel
import com.example.matdesignless.R
import com.example.matdesignless.entities.Entities

class FructsViewModel : ViewModel() {
    val fructList = listOf(
        Entities("apple", R.drawable.apple),
        Entities("pear", R.drawable.pear))
}