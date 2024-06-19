package com.example

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import com.example.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val digits = fibbo(100)
        binding.rvNumbers.layoutManager = GridLayoutManager(this,4)
        val numms = NumbersRecycler(digits)
        binding.rvNumbers.adapter = numms

    }
    fun fibbo(numbers:Int):List<Int>{
        val digits = mutableListOf(0,1)
        while (digits.size< numbers){
            digits.add(digits[digits.lastIndex]+digits[digits.lastIndex-1])
        }
        return digits
    }
}