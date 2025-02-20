package com.example.idzdigital

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.idzdigital.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        val name = intent.getStringExtra("username")
        val birthDate = intent.getStringExtra("birthDate")
        val email = intent.getStringExtra("email")

        binding.nameValue.text = name
        binding.birthDateValue.text = birthDate
        binding.emailValue.text = email
    }
}