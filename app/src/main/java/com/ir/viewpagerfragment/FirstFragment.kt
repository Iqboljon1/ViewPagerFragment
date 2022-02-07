package com.ir.viewpagerfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.ir.viewpagerfragment.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {
    lateinit var arrayList: ArrayList<String>
    lateinit var adapterRecycler: AdapterRecycler
    lateinit var binding: FragmentFirstBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View{
        binding = FragmentFirstBinding.inflate(layoutInflater)
        arrayList = ArrayList()
        addString()
        adapterRecycler = AdapterRecycler(requireActivity() , arrayList)
        binding.recyclerViewFirst.adapter = adapterRecycler
        return binding.root
    }

    private fun addString() {
        for (i in 0..99){
            arrayList.add("First Fragment ${i+1}")
        }
    }

}