package com.example.correio.feature_loading

import android.os.Bundle
import android.os.Handler
import android.os.HandlerThread
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.correio.R
import com.example.correio.databinding.FragmentLoadingBinding
import kotlinx.coroutines.delay
import java.lang.Thread.sleep
import java.util.concurrent.Delayed

class LoadingFragment : Fragment() {
    lateinit var handler: Handler
    private lateinit var binding : FragmentLoadingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoadingBinding.inflate(inflater, container, false )
        handler = Handler()
        handler.postDelayed({
            findNavController().navigate(
                LoadingFragmentDirections.actionLoadingFragmentToHomeFragment())
            Toast.makeText(context, "Bem-vindo(a)", Toast.LENGTH_SHORT).show()
        }, 4000)

        return binding.root
        }
}

