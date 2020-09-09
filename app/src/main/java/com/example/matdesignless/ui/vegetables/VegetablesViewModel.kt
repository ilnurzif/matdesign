package com.example.matdesignless.ui.vegetables

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.matdesignless.R
import com.example.matdesignless.entities.Fruct

class VegetablesViewModel : ViewModel() {
    val vegetableList = listOf(
        Fruct("carrots", R.drawable.carrots),
        Fruct("potato", R.drawable.potato)
    )
}