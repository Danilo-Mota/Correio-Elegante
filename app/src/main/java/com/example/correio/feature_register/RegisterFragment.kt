package com.example.correio.feature_register

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.correio.R
import com.example.correio.databinding.RegisterFragmentBinding

class RegisterFragment : Fragment() {

    private lateinit var binding: RegisterFragmentBinding
    //private lateinit var viewModel: RegisterViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = RegisterFragmentBinding.inflate(layoutInflater, container, false)


        return binding.root
    }

}