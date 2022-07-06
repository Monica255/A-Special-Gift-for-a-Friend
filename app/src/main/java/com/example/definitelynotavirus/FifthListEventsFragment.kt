package com.example.definitelynotavirus

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.definitelynotavirus.data.Data
import com.example.definitelynotavirus.data.Events
import com.example.definitelynotavirus.databinding.FragmentFifthListEventsBinding

class FifthListEventsFragment : Fragment() {
    private lateinit var binding:FragmentFifthListEventsBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if(isAdded){
            val layoutManager = LinearLayoutManager(requireActivity())
            binding.rvEvents.layoutManager = layoutManager
            setEventData(Data.getListEvents())
        }
    }

    private fun setEventData(event: List<Events>) {
        val listEventsAdapter = AdapterEvents(event)
        binding.rvEvents.adapter = listEventsAdapter

        listEventsAdapter.setOnItemClickCallback(object : AdapterEvents.OnItemClickCallback {
            override fun onItemClicked(data: Events) {
                if(data.date=="4 Juli 2001"){
                    view?.findNavController()?.navigate(R.id.action_fifthListEventsFragment_to_sixthWebviewFragment)
                }
            }
        })
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentFifthListEventsBinding.inflate(inflater,container,false)
        return binding.root
    }

}