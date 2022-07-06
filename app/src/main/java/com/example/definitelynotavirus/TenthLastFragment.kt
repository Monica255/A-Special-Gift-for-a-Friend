package com.example.definitelynotavirus

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.example.definitelynotavirus.databinding.FragmentTenthLastBinding


class TenthLastFragment : Fragment() {
    private lateinit var binding:FragmentTenthLastBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var imageList=ArrayList<SlideModel>()
        imageList.add(SlideModel(R.drawable.lisa1,""))
        imageList.add(SlideModel(R.drawable.lisa2,""))
        imageList.add(SlideModel(R.drawable.lisa3,""))
        imageList.add(SlideModel(R.drawable.lisa4,""))
        imageList.add(SlideModel(R.drawable.lisa5,""))

        binding.isPhotos.setImageList(imageList,ScaleTypes.CENTER_CROP)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentTenthLastBinding.inflate(inflater,container,false)
        return binding.root
    }

}