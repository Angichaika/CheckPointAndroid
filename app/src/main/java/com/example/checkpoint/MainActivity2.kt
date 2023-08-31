package com.example.checkpoint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.checkpoint.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button2.setOnClickListener {
            val userInput = binding.textView2.text.toString()
            binding.textView2.text = userInput
        }
    }
}
