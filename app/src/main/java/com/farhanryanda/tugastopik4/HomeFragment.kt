package com.farhanryanda.tugastopik4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.farhanryanda.tugastopik4.databinding.FragmentHomeBinding
import com.farhanryanda.tugastopik4.databinding.FragmentLoginBinding


class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater,container,false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var getUsername = arguments?.getString("username")
        binding.tvSayHello.text = "Hello, $getUsername"

        binding.btnHitung.setOnClickListener {
            var tahunLahir = binding.edtTahunLahir.text.toString().toInt()
            var tahunSekarang = 2022
            var getUmur = tahunSekarang - tahunLahir
            var bundle = Bundle()
            bundle.putInt("umur",getUmur)
            bundle.putString("nama",getUsername)
            Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_hasilUmurFragment,bundle)
        }

        binding.btnProfile.setOnClickListener {
            var bundle = Bundle()
            bundle.putString("name",getUsername)
            Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_profileFragment,bundle)

        }
    }

}