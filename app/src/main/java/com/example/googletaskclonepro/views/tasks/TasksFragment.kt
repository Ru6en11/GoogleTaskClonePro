package com.example.googletaskclonepro.views.tasks

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.foundation.views.BaseScreen
import com.example.googletaskclonepro.databinding.FragmentTasksBinding

class TasksFragment : Fragment() {

    class Screen : BaseScreen

    private lateinit var binding: FragmentTasksBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTasksBinding.inflate(inflater, container, false)

        return binding.root
    }

}