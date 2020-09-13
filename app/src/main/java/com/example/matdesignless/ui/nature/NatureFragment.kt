package com.example.matdesignless.ui.nature

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.matdesignless.R
import kotlinx.android.synthetic.main.fragment_nature.*


class NatureFragment : Fragment() {
    private lateinit var natureViewModel: NatureViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        natureViewModel =  ViewModelProviders.of(this).get(NatureViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_nature, container, false)
        return root
    }

    private fun initView(arg: Int?) {
       arg?.let{natureIW.setImageResource(natureViewModel.natureList.get(arg).imageId)}
       arg?.let{natureNameTW.setText(natureViewModel.natureList.get(arg).name)}
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val arg=arguments?.getInt(ARG_SECTION_NUMBER)
        initView(arg)
    }
   companion object {
        private const val ARG_SECTION_NUMBER = "section_number"
        @JvmStatic
        fun newInstance(sectionNumber: Int): NatureFragment {
            return NatureFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_SECTION_NUMBER, sectionNumber)
                }
            }
        }
    }
}