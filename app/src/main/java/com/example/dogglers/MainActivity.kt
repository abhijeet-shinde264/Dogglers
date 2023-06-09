package com.example.dogglers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.dogglers.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var listIntent: Intent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.verticalButton.setOnClickListener{launchVertical()}

        binding.horizontalButton.setOnClickListener{launchHorizontal()}

        binding.gridButton.setOnClickListener { launchGrid() }
    }

    private fun launchGrid() {
        listIntent = Intent(this,GridActivity::class.java)
        startActivity(listIntent)
    }

    private fun launchHorizontal() {
        listIntent = Intent(this,HorizontalActivity::class.java)
        startActivity(listIntent)
    }

    private fun launchVertical() {
        listIntent = Intent(this,VerticalActivity::class.java)
        startActivity(listIntent)
    }
}