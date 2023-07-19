package com.example.startstudent.drawerFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.startstudent.R
import com.example.startstudent.databinding.FragmentIntroViewPagerBinding
import com.example.startstudent.databinding.FragmentProfileBinding
import com.example.startstudent.databinding.FragmentUpdatePasswordBinding


class Profile : Fragment() {
    private lateinit var binding: FragmentProfileBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
     binding=FragmentProfileBinding.inflate(layoutInflater,container,false)
        binding.btnupdatePassword.setOnClickListener {
            findNavController().navigate(R.id.updatePassword2)
        }
        return binding.root


    }


}