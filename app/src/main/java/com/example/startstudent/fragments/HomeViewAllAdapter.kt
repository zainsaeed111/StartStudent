package com.example.startstudent.fragments

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.startstudent.databinding.HomeCatogeryRecycylerItemBinding
import com.example.startstudent.databinding.HomeViewallRecyclerItemsBinding

class HomeViewAllAdapter(private val HomeViewAllItems: List<HomeViewAllModel>) :
    RecyclerView.Adapter<HomeViewAllAdapter.ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = HomeViewallRecyclerItemsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return HomeViewAllItems.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val listModel = HomeViewAllItems[position]
        holder.tvNamehomeviewall.text = listModel.tvName_home_viewall
        holder.tvItemshomeviewall.text = listModel.tvItems_home_viewall
        holder.tvstatusBtn.text = listModel.tvstatus_Btn
        holder.tvstatusBtn.text = listModel.tvstatus_Btn
        holder.tvProfilename.text=listModel.tvProfile_name
        holder.proifleImg.setImageResource(listModel.proifle_Img)
    }

    inner class ItemViewHolder(private val binding: HomeViewallRecyclerItemsBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val tvNamehomeviewall: TextView = binding.tvNamehomeviewall
        val tvItemshomeviewall: TextView = binding.tvItemshomeviewall
        val tvstatusBtn: TextView = binding.tvstatusBtn
        val tvProfilename: TextView = binding.tvProfilename
        val proifleImg: ImageView = binding.proifleImg


        }
}