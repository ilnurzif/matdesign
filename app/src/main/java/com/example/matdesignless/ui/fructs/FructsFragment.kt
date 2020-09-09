package com.example.matdesignless.ui.fructs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.matdesignless.R
import com.example.matdesignless.ui.FructsListAdapter
import kotlinx.android.synthetic.main.fragment_fructs.*

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
        return root
    }

      override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
       super.onViewCreated(view, savedInstanceState)
     fructsRW.apply {
           layoutManager = LinearLayoutManager(activity)
           adapter = FructsListAdapter(fructsViewModel.fructList)
       }
    }
}