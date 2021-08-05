package com.mrrezki.tugasonboarding.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.mrrezki.tugasonboarding.fragment.WelcomeCalenderFragment
import com.mrrezki.tugasonboarding.fragment.WelcomeSlideAssignFragment
import com.mrrezki.tugasonboarding.fragment.WelcomeSuperHeroFragment

class OnboardingAdapter(
    fragmentManager: FragmentManager, lifecycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle) {

    private val fragments: ArrayList<Fragment> = arrayListOf(
        WelcomeCalenderFragment(), WelcomeSuperHeroFragment(), WelcomeSlideAssignFragment()
    )

    override fun getItemCount(): Int {
        return fragments.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }

}