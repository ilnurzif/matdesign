package com.example.matdesignless.ui.vegetables

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.matdesignless.R
import com.example.matdesignless.ui.FructsListAdapter
import kotlinx.android.synthetic.main.fragment_fructs.*

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
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fructsRW.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = FructsListAdapter(vegetablesViewModel.vegetableList)
        }
    }
}