package com.example.startstudent

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.startstudent.databinding.ChatgptRecyclerItemsBinding

class ChatAdapter(private val chatItems: List<ChatModel>) :
    RecyclerView.Adapter<ChatAdapter.ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = ChatgptRecyclerItemsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return chatItems.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val listModel = chatItems[position]

        holder.chatSend.text = listModel.chat_send_tv
        holder.chatReply.text=listModel.chat_reply_tv

    }

    inner class ItemViewHolder(private val binding: ChatgptRecyclerItemsBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val chatSend: TextView =itemView.findViewById(R.id.sendtextTv)
        val chatReply: TextView =itemView.findViewById(R.id.tvchatReply)
    }
}