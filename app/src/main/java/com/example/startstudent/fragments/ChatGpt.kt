package com.example.startstudent.fragments

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.startstudent.ChatAdapter
import com.example.startstudent.ChatModel
import com.example.startstudent.R
import com.example.startstudent.databinding.FragmentChatGptBinding


class ChatGpt : Fragment() {
   private lateinit var binding: FragmentChatGptBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding=FragmentChatGptBinding.inflate(layoutInflater, container, false)
        val recyclerView = binding.chatgptRecycler
        recyclerView.layoutManager = LinearLayoutManager(context)
        val replyString = getString(R.string.chat_reply_tv) // get the string from resources

        // Prepare the data for the RecyclerView
        val data = ArrayList<ChatModel>()
        for (i in 1..10) {
            data.add(
                ChatModel(

                    " In publishing and ?",
                replyString,

            )
            )
        }

        // Create the adapter and set it to the RecyclerView
        val adapter = ChatAdapter(data)
        recyclerView.adapter = adapter

        // Set click listener to open bottom sheet
        binding.craetenewsplashBtn.setOnClickListener {
            val bottomSheet = ModalBottomSheet()
            bottomSheet.show(childFragmentManager, "ModalBottomSheet")
        }

        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}