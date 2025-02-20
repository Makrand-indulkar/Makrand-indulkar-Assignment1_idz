package com.example.idzdigital

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.idzdigital.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.submitBtn.setOnClickListener {
            val name = binding.edtName.text.toString()
            val edtDay = binding.edtDay.text.toString()
            val edtMonth = binding.edtMonth.text.toString()
            val edtYear = binding.edtYear.text.toString()
            val birthDate = "$edtDay/$edtMonth/$edtYear"
            val email = binding.edtEmail.text.toString()
            if (checkFieldsAreNotEmpty(name, edtDay, edtMonth, edtYear, email)) {
                val intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("username", name)
                intent.putExtra("birthDate", birthDate)
                intent.putExtra("email", email)
                startActivity(intent)
            }
        }
    }

    private fun checkFieldsAreNotEmpty(
        name: String,
        edtDay: String,
        edtMonth: String,
        edtYear: String,
        email: String
    ): Boolean {
        return when {
            name.isEmpty() -> {
                Toast.makeText(this, "Name is required", Toast.LENGTH_SHORT).show()
                false
            }

            edtDay.isEmpty() -> {
                Toast.makeText(this, "Birth date is required", Toast.LENGTH_SHORT).show()
                false
            }

            edtMonth.isEmpty() -> {
                Toast.makeText(this, "Birth date is required", Toast.LENGTH_SHORT).show()
                false
            }

            edtYear.isEmpty() -> {
                Toast.makeText(this, "Birth date is required", Toast.LENGTH_SHORT).show()
                false
            }

            email.isEmpty() -> {
                Toast.makeText(this, "Email is required", Toast.LENGTH_SHORT).show()
                false
            }

            else -> true
        }
    }

}