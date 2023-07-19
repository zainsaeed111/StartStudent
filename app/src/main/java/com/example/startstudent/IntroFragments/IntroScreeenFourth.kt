package com.example.startstudent.IntroFragments

import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.VideoView
import androidx.navigation.fragment.findNavController
import com.example.startstudent.R
import com.example.startstudent.databinding.FragmentIntroScreeenFourthBinding

class IntroScreeenFourth : Fragment() {

    private lateinit var binding: FragmentIntroScreeenFourthBinding
    private lateinit var videoView: VideoView
    private val videoUri: Uri by lazy {
        Uri.parse("android.resource://${requireContext().packageName}/${R.raw.vide_bg}")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentIntroScreeenFourthBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onResume() {
        super.onResume()
        videoView.start()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        videoView = binding.videoEnd
        videoView.setVideoURI(videoUri)
        videoView.setOnCompletionListener {
            videoView.start()
        }
        videoView.start()

        binding.closeButton.setOnClickListener {
            findNavController().navigate(R.id.loginFragment)
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = IntroScreeenFourth()
    }
}
