package com.example.startstudent.fragments

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.startstudent.ChatAdapter
import com.example.startstudent.ChatModel
import com.example.startstudent.R
import com.example.startstudent.databinding.ChatgptRecyclerItemsBinding
import com.example.startstudent.databinding.HomeCatogeryRecycylerItemBinding

class HomeCatogeryAdapter(private val HomeCatogeryItems: List<HomeCatogeryModel>) :
    RecyclerView.Adapter<HomeCatogeryAdapter.ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = HomeCatogeryRecycylerItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return HomeCatogeryItems.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val listModel = HomeCatogeryItems[position]
        holder.tvexampleCatogery.text = listModel.home_catogery_tv
    }

    inner class ItemViewHolder(private val binding: HomeCatogeryRecycylerItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val tvexampleCatogery: TextView = binding.tvExampleCaotogery
    }
}