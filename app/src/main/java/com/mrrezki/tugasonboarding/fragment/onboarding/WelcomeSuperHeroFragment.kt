package com.mrrezki.tugasonboarding.fragment.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.mrrezki.tugasonboarding.databinding.FragmentWelcomeSuperHeroBinding

class WelcomeSuperHeroFragment : Fragment() {

    private lateinit var binding: FragmentWelcomeSuperHeroBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWelcomeSuperHeroBinding.inflate(inflater, container, false)
        return binding.root
    }

}