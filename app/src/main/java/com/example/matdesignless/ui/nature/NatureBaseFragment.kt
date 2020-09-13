package com.example.matdesignless.ui.nature

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.viewpager.widget.ViewPager
import com.example.matdesignless.R
import kotlinx.android.synthetic.main.tabs_main.*


class NatureBaseFragment : Fragment() {
    private lateinit var natureViewModel: NatureViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        natureViewModel =  ViewModelProviders.of(this).get(NatureViewModel::class.java)
        val root = inflater.inflate(R.layout.tabs_main, container, false)
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViewPager(view_pager)
        tabs.setupWithViewPager(view_pager)
    }

    private fun setupViewPager(viewPager: ViewPager) {
        val adapter = ViewPagerAdapter(activity?.supportFragmentManager)
        adapter.addFragment(NatureFragment.newInstance(0), "nature1")
        adapter.addFragment(NatureFragment.newInstance(1), "nature2")
        adapter.addFragment(NatureFragment.newInstance(2), "nature3")

        viewPager.adapter = adapter
    }

}