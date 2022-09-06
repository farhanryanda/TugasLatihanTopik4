package com.farhanryanda.tugastopik4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.farhanryanda.tugastopik4.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {

    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentLoginBinding.inflate(inflater,container,false)
        val view = binding.root
        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnLogin.setOnClickListener {
            var username = binding.edtUsername.text.toString()
            var password = binding.edtPassword.text.toString()
            var bundle = Bundle()
            bundle.putString("username", username)

            if (username == "Farhan" && password == "farhan") {

                Toast.makeText(context, "Login Successed", Toast.LENGTH_SHORT).show()
                Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_homeFragment,bundle)
            } else {
                Toast.makeText(context, "Login Failed", Toast.LENGTH_SHORT).show()
            }

        }

        binding.btnForgetPassword.setOnClickListener {
            view.findNavController().navigate(R.id.action_loginFragment_to_forgetPasswordFragment)
        }
        binding.btnRegister.setOnClickListener {
            view.findNavController().navigate(R.id.action_loginFragment_to_registerFragment)
        }
        binding.btnHelp.setOnClickListener{
            view.findNavController().navigate(R.id.action_loginFragment_to_helpFragment)
        }
        binding.btnChat.setOnClickListener{
            view.findNavController().navigate(R.id.action_loginFragment_to_chatFragment)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}