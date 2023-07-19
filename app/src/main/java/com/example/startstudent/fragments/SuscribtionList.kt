package com.example.startstudent.fragments

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.startstudent.R
import com.example.startstudent.databinding.FragmentChatGptBinding
import com.example.startstudent.databinding.FragmentSuscribtionListBinding
import com.example.startstudent.databinding.PaymentBottomsheetLayoutBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog


class SuscribtionList : Fragment() {
    private lateinit var binding: FragmentSuscribtionListBinding
    private lateinit var bottomSheetBehavior: BottomSheetBehavior<ConstraintLayout>


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSuscribtionListBinding.inflate(layoutInflater, container, false)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.activatetrailBtn.setOnClickListener() {
            // Set bottom sheet state to expanded
              val bottomSheet = PaymentBottomSheet()
            bottomSheet.show(childFragmentManager, "PaymentBottomSheet")

        }

    }

    private fun showBottomSheetDialog() {


    }


}