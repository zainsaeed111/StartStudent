package com.example.startstudent.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.startstudent.R
import com.example.startstudent.databinding.FragmentFlashCardBinding
import com.example.startstudent.databinding.FragmentHomeBinding

class FlashCard : Fragment() {
    private lateinit var binding: FragmentFlashCardBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentFlashCardBinding.inflate(layoutInflater, container, false)
        implcotogeryflashRecycler()
        implviewAllflashRecyclerview()
        return binding.root


    }

    private fun implviewAllflashRecyclerview() {
        val recyclerView = binding.viewAllflashRecyclerview
        recyclerView.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        val homeViewAllItems = ArrayList<HomeViewAllModel>()
        homeViewAllItems.add(
            HomeViewAllModel(
                "John Doe",
                "10 items",
                "Active",
                "Jeednev",
                R.drawable.circular_example_img
            )
        )
        homeViewAllItems.add(
            HomeViewAllModel(
                "Jane Smith",
                "5 items",
                "Inactive",
                "Jaxianel",
                R.drawable.circular_example_imgi
            )
        )
        homeViewAllItems.add(
            HomeViewAllModel(
                "Zahid Ali",
                "0 items",
                "Active",
                "Mueed Zahid",
                R.drawable.circular_example_imgi
            )
        )
        homeViewAllItems.add(
            HomeViewAllModel(
                "Ghulam Ali",
                "2 items",
                "Active",
                "Ghulam Ali",
                R.drawable.circular_example_imgi
            )
        )
        // Create the adapter and set it to the RecyclerView
        val adapter = HomeViewAllAdapter(homeViewAllItems)
        recyclerView.adapter = adapter
    }
    private fun implcotogeryflashRecycler() {
        val recyclerView = binding.cotogeryflashRecycler
        recyclerView.layoutManager = LinearLayoutManager(context,
            LinearLayoutManager.HORIZONTAL,false)

        // Prepare the data for the RecyclerView
        val catogeryTexts = arrayOf("All", "Latest", "Weak Understanding", "Strong Understanding")
        val data = ArrayList<HomeCatogeryModel>()
        for (i in catogeryTexts.indices) {
            data.add(
                HomeCatogeryModel(
                    home_catogery_tv = catogeryTexts[i]
                )
            )
        }


        // Create the adapter and set it to the RecyclerView
        val adapter = HomeCatogeryAdapter(data)
        recyclerView.adapter = adapter

    }


}