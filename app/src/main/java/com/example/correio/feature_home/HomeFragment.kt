package com.example.correio.feature_home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.correio.R
import com.example.correio.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater, container, false)

        navigateToRegister()
        return binding.root
    }
    private fun navigateToRegister(){
        binding.startButton.setOnClickListener {
        findNavController().navigate(
            HomeFragmentDirections.actionHomeFragmentToRegisterFragment()
        )
        }
    }
}