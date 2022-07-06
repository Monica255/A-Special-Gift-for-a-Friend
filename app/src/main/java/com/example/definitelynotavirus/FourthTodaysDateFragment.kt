package com.example.definitelynotavirus

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.definitelynotavirus.databinding.FragmentFourthTodaysDateBinding


class FourthTodaysDateFragment : Fragment() {
    private lateinit var binding:FragmentFourthTodaysDateBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btNext.setOnClickListener {
            view?.findNavController()?.navigate(R.id.action_fourthTodaysDateFragment_to_fifthListEventsFragment)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentFourthTodaysDateBinding.inflate(inflater,container,false)
        return binding.root
    }

}