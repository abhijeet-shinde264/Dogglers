package com.example.dogglers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dogglers.adapter.DogCardAdapter
import com.example.dogglers.consta.Layout
import com.example.dogglers.databinding.ActivityHorizontalBinding

class HorizontalActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHorizontalBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHorizontalBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.horizontalRecyclerView.adapter = DogCardAdapter(
            applicationContext,
            Layout.HORIZONTAL
        )
        binding.horizontalRecyclerView.setHasFixedSize(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}