package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.myapplication.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentHomeBinding.inflate(layoutInflater )
val navController =findNavController()
        binding.bottomHometoInside.setOnClickListener {
val testArgument = "desde el home"
            //navController.navigate(R.id.action_homeFragment_to_insideHome)
        val directions = HomeFragmentDirections.actionHomeFragmentToInsideHome(testArgument)
            navController.navigate(directions)
        }

        return binding.root
    }


}