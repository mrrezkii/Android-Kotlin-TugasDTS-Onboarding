package com.mrrezki.tugasonboarding.fragment.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.mrrezki.tugasonboarding.databinding.FragmentResetPasswordBinding

class ResetPasswordFragment : Fragment() {

    private lateinit var binding: FragmentResetPasswordBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentResetPasswordBinding.inflate(inflater, container, false)
        return binding.root
    }

    private fun postChangePassword(view: View) {
        Toast.makeText(requireContext(), "Reset completed", Toast.LENGTH_SHORT).show()
    }

}