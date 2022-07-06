package com.example.definitelynotavirus

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.lifecycle.MutableLiveData
import androidx.navigation.findNavController
import com.example.definitelynotavirus.databinding.FragmentSixthWebviewBinding


class SixthWebviewFragment : Fragment() {
    private lateinit var binding:FragmentSixthWebviewBinding
    var isLoading= MutableLiveData<Boolean>()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if(isAdded){
            isLoading.value = true
            val webSettings = binding.wvDonorRequirement.settings
            webSettings.javaScriptEnabled = true

            binding.wvDonorRequirement.webViewClient = object : WebViewClient() {
                override fun onPageFinished(view: WebView, url: String) {
                    isLoading.value = false
                    binding.btNext.visibility=View.VISIBLE
                }
            }
            binding.wvDonorRequirement.loadUrl(getString(R.string.web_url))

            isLoading.observe(requireActivity()) {
                showLoading(it)
            }

            binding.btNext.setOnClickListener {
                view.findNavController().navigate(R.id.action_sixthWebviewFragment_to_seventhJustNextFragment)
            }
        }
    }
    private fun showLoading(show:Boolean){

        if(show){
            binding.ltJavrvis.visibility= View.VISIBLE
            binding.wvDonorRequirement.visibility= View.GONE
        }else{
            binding.ltJavrvis.visibility= View.GONE
            binding.wvDonorRequirement.visibility= View.VISIBLE
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentSixthWebviewBinding.inflate(inflater,container,false)
        return binding.root
    }

}