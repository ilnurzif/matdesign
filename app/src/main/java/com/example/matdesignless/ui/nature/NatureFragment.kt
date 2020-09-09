package com.example.matdesignless.ui.nature

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
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fructsRW.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = FructsListAdapter(natureViewModel.natureList)
        }
    }
}