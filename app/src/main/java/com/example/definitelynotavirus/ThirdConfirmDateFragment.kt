package com.example.definitelynotavirus

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.example.definitelynotavirus.databinding.FragmentThirdConfirmDateBinding


class ThirdConfirmDateFragment : Fragment() {
    private lateinit var binding:FragmentThirdConfirmDateBinding
    private var counter=0
    private var random= arrayListOf(1,2,3,4,5,6,7,8)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val viewModel=ViewModelProvider(requireActivity())[MainViewModel::class.java]
        binding.tvTitle.text="${viewModel.hallo} ${viewModel.name} "

        binding.btAnswer.setOnClickListener {
            randomButton()
        }

        binding.bt1.setOnClickListener {
            randomButton()
        }

        binding.bt2.setOnClickListener {
            randomButton()
        }

        binding.bt3.setOnClickListener {
            randomButton()
        }
        binding.bt4.setOnClickListener {
            randomButton()
        }
        binding.bt5.setOnClickListener {
            randomButton()
        }
        binding.bt6.setOnClickListener {
            randomButton()
        }
        binding.bt7.setOnClickListener {
            randomButton()
        }
        binding.bt8.setOnClickListener {
            randomButton()
        }
    }

    private fun hideAllButton(){
        binding.apply {
            tvWarning.text=""
            btAnswer.visibility=View.GONE
            bt1.alpha=0F
            bt2.alpha=0F
            bt3.alpha=0F
            bt4.alpha=0F
            bt5.alpha=0F
            bt6.alpha=0F
            bt7.alpha=0F
            bt8.alpha=0F

            btAnswer.isEnabled=false
            bt1.isEnabled=false
            bt2.isEnabled=false
            bt3.isEnabled=false
            bt3.isEnabled=false
            bt4.isEnabled=false
            bt5.isEnabled=false
            bt6.isEnabled=false
            bt7.isEnabled=false
            bt8.isEnabled=false
        }
    }

    private fun randomButton(){
        if(counter<=5){
            hideAllButton()
            val ran=(0 until random.size-1).random()
            val btn=random[ran]
            when(btn){
                1->{
                    binding.tvWarning.text="Hah tau?"
                    binding.bt1.alpha=1F
                    binding.bt1.isEnabled=true
                }
                2->{
                    binding.tvWarning.text="Ah seriusss?"
                    binding.bt2.alpha=1F
                    binding.bt2.isEnabled=true
                }
                3->{
                    binding.tvWarning.text="Beneran tauuu?"
                    binding.bt3.alpha=1F
                    binding.bt3.isEnabled=true
                }
                4->{
                    binding.tvWarning.text="Yakin?"
                    binding.bt4.alpha=1F
                    binding.bt4.isEnabled=true
                }
                5->{
                    binding.tvWarning.text="Gasalah inget tuh?"
                    binding.bt5.alpha=1F
                    binding.bt5.isEnabled=true
                }
                6->{
                    binding.tvWarning.text="Coba diinget dulu"
                    binding.bt6.alpha=1F
                    binding.bt6.isEnabled=true
                }
                7->{
                    binding.tvWarning.text="Yakin pake banget?"
                    binding.bt7.alpha=1F
                    binding.bt7.isEnabled=true
                }
                8->{
                    binding.tvWarning.text="Ah masa sih inget?"
                    binding.bt8.alpha=1F
                    binding.bt8.isEnabled=true
                }
            }
            random.remove(btn)
            counter++
        }else{
            view?.findNavController()?.navigate(R.id.action_thirdConfirmDateFragment_to_fourthTodaysDateFragment)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentThirdConfirmDateBinding.inflate(inflater,container,false)
        return binding.root
    }

}