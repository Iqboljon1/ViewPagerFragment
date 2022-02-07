package com.ir.viewpagerfragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.ListFragment
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class Adapter(
    var arrayListFragment: ArrayList<Fragment>,
    var fragmentManager: FragmentManager,
    var lifecycle: Lifecycle,
) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int = arrayListFragment.size

    override fun createFragment(position: Int): Fragment {
        return arrayListFragment[position]
    }
}