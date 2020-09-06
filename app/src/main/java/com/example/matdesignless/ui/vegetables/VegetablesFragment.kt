package com.example.matdesignless.ui.vegetables

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.matdesignless.R

class VegetablesFragment : Fragment() {

    private lateinit var vegetablesViewModel: VegetablesViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        vegetablesViewModel =
                ViewModelProviders.of(this).get(VegetablesViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_vegetables, container, false)
        val textView: TextView = root.findViewById(R.id.text_veg)
        vegetablesViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}