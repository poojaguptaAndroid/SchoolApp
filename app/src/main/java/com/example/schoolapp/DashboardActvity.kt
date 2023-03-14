package com.example.schoolapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.schoolapp.databinding.ActivityDashboardActvityBinding

class DashboardActvity : AppCompatActivity() {

    lateinit var binding :ActivityDashboardActvityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardActvityBinding.inflate(layoutInflater)

        setContentView(binding.root)


    }
}