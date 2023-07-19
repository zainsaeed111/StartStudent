package com.example.startstudent.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.startstudent.R
import com.example.startstudent.databinding.FragmentIntroViewPagerBinding
import com.example.startstudent.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding=FragmentLoginBinding.inflate(layoutInflater,container,false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.loginBtn.setOnClickListener(){
            findNavController().navigate(R.id.homeFragment)
        }

        binding.tvlabelloginSignup.setOnClickListener(){
            findNavController().navigate(R.id.signUp)
        }
        binding.forgotPasswordText.setOnClickListener(){
            findNavController().navigate(R.id.forgetPassEnterEmail)
        }


    }
}