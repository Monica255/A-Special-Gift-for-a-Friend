package com.example.definitelynotavirus

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.example.definitelynotavirus.databinding.FragmentFirstHelloBinding
import java.util.zip.Inflater

class FirstHelloFragment : Fragment() {
    private lateinit var binding:FragmentFirstHelloBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val viewModel=ViewModelProvider(requireActivity())[MainViewModel::class.java]
        binding.btHi.setOnClickListener {
            view.findNavController().navigate(R.id.action_firstHelloFragment_to_secondNameFragment)
            viewModel.hallo="Hi"
        }
        binding.btHalooo.setOnClickListener {
            view.findNavController().navigate(R.id.action_firstHelloFragment_to_secondNameFragment)
            viewModel.hallo="Halooo"
        }

        binding.btHola.setOnClickListener {
            view.findNavController().navigate(R.id.action_firstHelloFragment_to_secondNameFragment)
            viewModel.hallo="Hola"
        }

        binding.btAlo.setOnClickListener {
            view.findNavController().navigate(R.id.action_firstHelloFragment_to_secondNameFragment)
            viewModel.hallo="Alo"
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentFirstHelloBinding.inflate(inflater,container,false)
        return binding.root
    }

}