package com.example.prueba

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.prueba.databinding.FragmentForgotBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ForgotFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ForgotFragment : Fragment() {

    private var _binding: FragmentForgotBinding?=null
    private val binding: FragmentForgotBinding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentForgotBinding.inflate(layoutInflater,container,false)
        return binding.root
    }


    override fun onStart() {
        super.onStart()
        binding.forgotFragmentLoginLabelL2.setOnClickListener {
            findNavController().navigate(R.id.action_forgotFragment2_to_signUpFragment2)

        }



            }
        }


