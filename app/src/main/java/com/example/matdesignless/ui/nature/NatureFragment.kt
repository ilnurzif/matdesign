package com.example.matdesignless.ui.nature

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.matdesignless.R

class NatureFragment : Fragment() {

    private lateinit var natureViewModel: NatureViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        natureViewModel =
                ViewModelProviders.of(this).get(NatureViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_nature, container, false)
        val textView: TextView = root.findViewById(R.id.text_gallery)
        natureViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        }) 
        return root
    }
}