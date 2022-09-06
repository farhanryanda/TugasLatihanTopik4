package com.farhanryanda.tugastopik4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.farhanryanda.tugastopik4.databinding.FragmentHasilUmurBinding
import com.farhanryanda.tugastopik4.databinding.FragmentHomeBinding


class HasilUmurFragment : Fragment() {

    private var _binding: FragmentHasilUmurBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHasilUmurBinding.inflate(inflater,container,false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var getName = arguments?.getString("nama")
        var getUmur = arguments?.getInt("umur")

        binding.tvSayHello.text = "Halo , $getName"
        binding.tvUmur.text = "umur kamu $getUmur tahun"

    }


}