package com.ir.viewpagerfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.ir.viewpagerfragment.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {
    lateinit var arrayList: ArrayList<String>
    lateinit var adapterRecycler: AdapterRecycler
    lateinit var binding: FragmentThirdBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentThirdBinding.inflate(layoutInflater)
        arrayList = ArrayList()
        addString()
        adapterRecycler = AdapterRecycler(requireActivity(), arrayList)
        binding.recyclerViewThird.adapter = adapterRecycler
        return binding.root
    }

    private fun addString() {
        for (i in 0..99) {
            arrayList.add("Third Fragment ${i+1}")
        }
    }

}