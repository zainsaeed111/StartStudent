package com.example.startstudent.fragments

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.startstudent.ChatAdapter
import com.example.startstudent.ChatModel
import com.example.startstudent.FilterBottomSheet
import com.example.startstudent.R
import com.example.startstudent.databinding.FragmentChatGptBinding
import com.example.startstudent.databinding.FragmentHomeBinding
import com.example.startstudent.databinding.HomeCatogeryRecycylerItemBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        binding.nvView.itemIconTintList=null



        val recyclerView = binding.cotogeryRecycler
        recyclerView.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)

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
        viewAllRecycler()
        openDrawer()
        return binding.root
}

    private fun openDrawer() {
        val navController = findNavController()

        // set up the NavigationView with the NavController
        binding.nvView.setupWithNavController(navController)

        // set up click listeners for the menu items in the NavigationView
        binding.nvView.setNavigationItemSelectedListener { menuItem ->
            // handle the menu item click event
            when (menuItem.itemId) {
                R.id.drawerProfile -> {
                    // navigate to the desired fragment using the NavController
                    navController.navigate(R.id.drawerProfile)
                }
                R.id.drawermyFlashcards -> {
                    // navigate to another desired fragment using the NavController
                    navController.navigate(R.id.drawermyFlashcards)
                }
                // add more menu items and actions as needed
                R.id.drawermyPackage -> {
                    // navigate to another desired fragment using the NavController
                    navController.navigate(R.id.drawermyPackage)
                }

                R.id.drawerAboutUs -> {
                    // navigate to another desired fragment using the NavController
                    navController.navigate(R.id.drawerAboutUs)
                }

                R.id.drawerTerms -> {
                    // navigate to another desired fragment using the NavController
                    navController.navigate(R.id.drawerTerms)
                }

            }
            // close the NavigationView drawer
            binding.drawerLayout.closeDrawers()
            true
        }    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    binding.filerserachImgbtnhome.setOnClickListener(){
        // Set bottom sheet state to expanded
        val bottomSheet = FilterBottomSheet()
        bottomSheet.show(childFragmentManager, "FilterBottomSheet")
    }

      binding.tvViewallHome.setOnClickListener {
          findNavController().navigate(R.id.flashCard2)
      }

    }

    private fun viewAllRecycler() {

        val recyclerView = binding.viewAllRecyclerview
        recyclerView.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
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













}