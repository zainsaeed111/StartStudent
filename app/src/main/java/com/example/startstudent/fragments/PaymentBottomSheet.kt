package com.example.startstudent.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.startstudent.R
import com.example.startstudent.databinding.FragmentPaymentBottomSheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class PaymentBottomSheet :   BottomSheetDialogFragment() {

    private lateinit var binding: FragmentPaymentBottomSheetBinding
    override fun getTheme() = R.style.NoBackgroundDialogTheme

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding= FragmentPaymentBottomSheetBinding.inflate(layoutInflater,container,false)
        return binding.root
    }


}