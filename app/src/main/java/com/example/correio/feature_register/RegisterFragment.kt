package com.example.correio.feature_register

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.correio.R
import com.example.correio.databinding.RegisterFragmentBinding
import papaya.`in`.sendmail.SendMail


class RegisterFragment : Fragment() {

    private lateinit var binding: RegisterFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = RegisterFragmentBinding.inflate(layoutInflater, container, false)
        binding.startButton.setOnClickListener {
            val getEmail = binding.emailEdittext.text.toString()
            val getBody = binding.surpriseEdittext.text.toString()
            val mail = SendMail(
                getString(R.string.KEY1), getString(R.string.KEY2),
                getEmail,
                "Você recebeu um correio elegante!",
                getBody
            )
            mail.execute()
            findNavController().navigate(
                RegisterFragmentDirections.actionRegisterFragmentToSuccesFragment()
            )
        }

        return binding.root
    }

}