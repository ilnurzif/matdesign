package com.example.matdesignless.ui.fructs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.matdesignless.R

class FructsFragment : Fragment() {

    private lateinit var fructsViewModel: FructsViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        fructsViewModel =
                ViewModelProviders.of(this).get(FructsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_fructs, container, false)
        val textView: TextView = root.findViewById(R.id.text_gallery)
        fructsViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}