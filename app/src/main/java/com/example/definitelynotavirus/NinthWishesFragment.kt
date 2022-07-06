package com.example.definitelynotavirus

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.definitelynotavirus.databinding.FragmentNinthWishesBinding


class NinthWishesFragment : Fragment() {
    private lateinit var binding:FragmentNinthWishesBinding


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        playAnimation()

        binding.btNext.setOnClickListener {
            view?.findNavController()?.navigate(R.id.action_ninthWishesFragment_to_tenthLastFragment)
        }
    }
    private fun playAnimation(){
        val first= ObjectAnimator.ofFloat(binding.tvWish1,View.ALPHA,1f).setDuration(1500)
        val second= ObjectAnimator.ofFloat(binding.tvWish2,View.ALPHA,1f).setDuration(1500)
        val third= ObjectAnimator.ofFloat(binding.tvWish3,View.ALPHA,1f).setDuration(1500)
        val fourth= ObjectAnimator.ofFloat(binding.tvWish4,View.ALPHA,1f).setDuration(1500)
        val fifth= ObjectAnimator.ofFloat(binding.tvWish5,View.ALPHA,1f).setDuration(1500)
        val sixth= ObjectAnimator.ofFloat(binding.tvWish6,View.ALPHA,1f).setDuration(1500)
        val next= ObjectAnimator.ofFloat(binding.btNext,View.ALPHA,1f).setDuration(1500)


        AnimatorSet().apply {
            playSequentially(first, second, third,fourth,fifth,sixth,next)
            start()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentNinthWishesBinding.inflate(inflater,container,false)
        return binding.root
    }

}