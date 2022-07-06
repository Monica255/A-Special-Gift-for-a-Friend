package com.example.definitelynotavirus

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.addTextChangedListener
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.example.definitelynotavirus.databinding.FragmentSecondNameBinding

class SecondNameFragment : Fragment(),View.OnFocusChangeListener {
    private lateinit var binding:FragmentSecondNameBinding
    private var name=""
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.etNama.onFocusChangeListener=this
        binding.etNama.addTextChangedListener {
            name=binding.etNama.text?.trim().toString()
            binding.btOk.isEnabled = name.isNotEmpty()
        }

        binding.btOk.setOnClickListener {
            if(name.isNotEmpty()) {
                checkName(name)
            }
        }
    }

    private fun checkName(name:String){

        val viewModel=ViewModelProvider(requireActivity())[MainViewModel::class.java]
        if(name.equals("lisa",true)
            || name.equals("elisabeth",true)
            || name.equals("elisabeth tyas",true)
            || name.equals("tyas",true)
            || name.equals("beth",true)
            || name.equals("elisa",true)
        ){
            viewModel.name=name
            view?.findNavController()?.navigate(R.id.action_secondNameFragment_to_thirdConfirmDateFragment)
        }else{
            binding.tvWarning.text="Yang bener lah ngisi namanya"
            binding.etNama.clearFocus()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentSecondNameBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onFocusChange(v: View?, f: Boolean) {
        if(v!=null&&v.id==R.id.et_nama){
            if(f){
                binding.tvWarning.text=""
            }
        }
    }

}