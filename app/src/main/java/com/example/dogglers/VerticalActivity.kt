package com.example.dogglers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dogglers.adapter.DogCardAdapter
import com.example.dogglers.consta.Layout
import com.example.dogglers.databinding.ActivityVerticalBinding

class VerticalActivity : AppCompatActivity() {
    private lateinit var binding: ActivityVerticalBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVerticalBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.verticalRecycle.adapter = DogCardAdapter(
            applicationContext,
            Layout.VERTICAL
        )
        binding.verticalRecycle.setHasFixedSize(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}