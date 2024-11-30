package com.example.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.karibusoko.R
import com.example.karibusoko.databinding.FragmentCartBinding
import com.example.karibusoko.databinding.FragmentCheckoutBinding

import com.example.karibusoko.databinding.FragmentOnboardingBinding


class CheckoutFragment : Fragment() {
    private var _binding: FragmentCheckoutBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding =  FragmentCheckoutBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Navigate to checkout
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
