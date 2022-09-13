package com.example.test.ui.fragment_one

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.example.test.BaseFragment
import com.example.test.R
import com.example.test.databinding.FragmentFragmentOneBinding
import kotlinx.coroutines.launch

class FragmentOne : BaseFragment<FragmentFragmentOneBinding>(FragmentFragmentOneBinding::inflate) {

    val fragmentOneViewModel:FragmentOneViewModel by viewModels()

    override fun viewCreated() {

    }

    override fun listeners() {
        binding.btnClicl.setOnClickListener{
            viewLifecycleOwner.lifecycleScope.launch {
                viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                    val answer = fragmentOneViewModel.getYesOrNo()
                    binding.tvAnswer.text = answer.toString()

                }
            }
        }

    }

}