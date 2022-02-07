package com.ir.viewpagerfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.ir.viewpagerfragment.databinding.FragmentFirstBinding
import com.ir.viewpagerfragment.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    lateinit var arrayList: ArrayList<String>
    lateinit var adapterRecycler: AdapterRecycler
    lateinit var binding: FragmentSecondBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        arrayList = ArrayList()
        addString()
        adapterRecycler = AdapterRecycler(requireActivity() , arrayList)
        binding.recyclerViewSecond.adapter = adapterRecycler
        return binding.root
    }

    private fun addString() {
        for (i in 0..99){
            arrayList.add("Second Fragment ${i+1}")
        }
    }

}