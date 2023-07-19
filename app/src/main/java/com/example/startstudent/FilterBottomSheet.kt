package com.example.startstudent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.startstudent.databinding.FragmentFilterBottomSheetBinding
import com.example.startstudent.databinding.FragmentPaymentBottomSheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class FilterBottomSheet: BottomSheetDialogFragment()  {

    private lateinit var binding: FragmentFilterBottomSheetBinding
    override fun getTheme() = R.style.NoBackgroundDialogTheme

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentFilterBottomSheetBinding.inflate(layoutInflater,container,false)
        return binding.root
    }


}