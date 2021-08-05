package com.mrrezki.tugasonboarding.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mrrezki.tugasonboarding.adapter.OnboardingAdapter
import com.mrrezki.tugasonboarding.databinding.ActivityOnboardingBinding

class OnboardingActivity : AppCompatActivity() {
    private val binding: ActivityOnboardingBinding by lazy {
        ActivityOnboardingBinding.inflate(
            layoutInflater
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setupView()
    }

    private fun setupView() {
        val adapter = OnboardingAdapter(supportFragmentManager, lifecycle)
        binding.viewpager.adapter = adapter
        binding.dotsIndicator.setViewPager2(binding.viewpager)
    }
}