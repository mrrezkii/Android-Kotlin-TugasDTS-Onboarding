package com.mrrezki.tugasonboarding.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mrrezki.tugasonboarding.databinding.ActivityMainBinding
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    private val activityScope = CoroutineScope(Dispatchers.Main)
    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(
            layoutInflater
        )
    }
    private val moveToOnboardingActivity: Intent by lazy {
        Intent(
            this@MainActivity,
            OnboardingActivity::class.java
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        activityScope.launch {
            delay(3000)

            startActivity(moveToOnboardingActivity)
            finish()
        }
    }

    override fun onPause() {
        activityScope.cancel()
        super.onPause()
    }
}