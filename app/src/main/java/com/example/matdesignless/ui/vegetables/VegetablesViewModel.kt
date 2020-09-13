package com.example.matdesignless.ui.vegetables

import androidx.lifecycle.ViewModel
import com.example.matdesignless.R
import com.example.matdesignless.entities.Entities

class VegetablesViewModel : ViewModel() {
    val vegetableList = listOf(
        Entities("carrots", R.drawable.carrots),
        Entities("potato", R.drawable.potato)
    )
}