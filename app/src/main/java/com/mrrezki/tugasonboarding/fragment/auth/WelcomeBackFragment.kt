package com.mrrezki.tugasonboarding.fragment.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.mrrezki.tugasonboarding.databinding.FragmentWelcomeBackBinding

class WelcomeBackFragment : Fragment() {

    private lateinit var binding: FragmentWelcomeBackBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWelcomeBackBinding.inflate(inflater, container, false)
        return binding.root
    }

}