package com.ir.viewpagerfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.ListFragment
import com.ir.viewpagerfragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var arrayListFragment: ArrayList<Fragment>
    lateinit var adapter: Adapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        setContentView(binding.root)

        arrayListFragment = ArrayList()
        arrayListFragment.add(FirstFragment())
        arrayListFragment.add(SecondFragment())
        arrayListFragment.add(ThirdFragment())

        adapter = Adapter(arrayListFragment , supportFragmentManager , lifecycle)

        binding.myViewPager.adapter = adapter

    }
}