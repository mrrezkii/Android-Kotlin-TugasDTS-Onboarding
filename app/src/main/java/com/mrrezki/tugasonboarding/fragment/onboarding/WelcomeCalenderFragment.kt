package com.mrrezki.tugasonboarding.fragment.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.mrrezki.tugasonboarding.databinding.FragmentWelcomeCalenderBinding

class WelcomeCalenderFragment : Fragment() {

    private lateinit var binding: FragmentWelcomeCalenderBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWelcomeCalenderBinding.inflate(inflater, container, false)
        return binding.root
    }

}