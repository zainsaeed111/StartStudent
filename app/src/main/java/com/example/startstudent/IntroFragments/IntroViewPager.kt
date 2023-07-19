package com.example.startstudent.IntroFragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.example.startstudent.PageAdapter
import com.example.startstudent.R
import com.example.startstudent.databinding.FragmentIntroViewPagerBinding
import com.example.startstudent.fragments.*

class IntroViewPager : Fragment() {

    private lateinit var binding: FragmentIntroViewPagerBinding
    private lateinit var viewPager: ViewPager2
    private var currentPageIndex = 0

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentIntroViewPagerBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        updateIndicatorsAndButtons(currentPageIndex, binding.dotedImgbtn, binding.introtwoNextbtn)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewPager = binding.introViewpager
        val backButton = binding.introtwoBackbtn
        val nextButton = binding.introtwoNextbtn
        val dotImageView = binding.dotedImgbtn

        val fragmentList = arrayListOf<Fragment>(
            SplashFragment(),
            IntroScreenOne(),
            IntroScreenTwo(),
            IntroScreenThree(),
            IntroScreeenFourth(),
            /*LoginFragment(),
            ForgetPassEnterEmail(),
            LoginForgetOtp(),
            SuscribtionList(),
            HomeFragment()*/
        )

        viewPager.adapter = PageAdapter(fragmentList, childFragmentManager, lifecycle)




        backButton.setOnClickListener {
            if (currentPageIndex > 0) {
                currentPageIndex--
                viewPager.currentItem = currentPageIndex
                updateIndicatorsAndButtons(currentPageIndex, dotImageView, nextButton)
            }
        }

        nextButton.setOnClickListener {
            if (currentPageIndex < fragmentList.size - 1) {
                currentPageIndex++
                viewPager.currentItem = currentPageIndex
                updateIndicatorsAndButtons(currentPageIndex, dotImageView, nextButton)
            }
        }

        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                currentPageIndex = position
                updateIndicatorsAndButtons(currentPageIndex, dotImageView, nextButton)
            }
        })
    }

    private fun updateIndicatorsAndButtons(
        currentPageIndex: Int,
        dotImageView: ImageView?,
        nextButton: ImageView?
    ) {
        when (currentPageIndex) {
            0 -> {
                dotImageView?.visibility = View.GONE
                nextButton?.visibility = View.GONE
                binding.introtwoBackbtn.visibility=View.GONE
                binding.tvImgbtnskip.visibility=View.GONE
            }
            1 -> {
                dotImageView?.setImageResource(R.drawable.intro_one_doted_line)
                nextButton?.setImageResource(R.drawable.intro_screen_one_next_img_btn)
                dotImageView?.visibility = View.VISIBLE
                nextButton?.visibility = View.VISIBLE
                binding.tvImgbtnskip.visibility = View.VISIBLE


            }
            2 -> {
                dotImageView?.setImageResource(R.drawable.intro_two_doted_line)
                nextButton?.setImageResource(R.drawable.intro_screen_one_next_img_btn)
                dotImageView?.visibility = View.VISIBLE
                nextButton?.visibility = View.VISIBLE
                binding.introtwoBackbtn.visibility = View.VISIBLE
                binding.tvImgbtnskip.visibility = View.VISIBLE


            }
            3 -> {
                dotImageView?.setImageResource(R.drawable.intro_three_doted_line)
                binding.tvImgbtnskip.visibility = View.VISIBLE
                binding.tvImgbtnskip.setOnClickListener {
                    findNavController().navigate(R.id.loginFragment)
                }


            }
            4 -> {

                dotImageView?.visibility = View.GONE
                nextButton?.visibility = View.GONE
                binding.introtwoBackbtn.visibility=View.GONE
                binding.tvImgbtnskip.visibility = View.GONE
                binding.tvImgbtnskip.setOnClickListener(null)

            }

            }

    }
}
