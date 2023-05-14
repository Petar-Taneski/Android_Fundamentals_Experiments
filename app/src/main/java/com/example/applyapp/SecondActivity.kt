package com.example.applyapp

import android.content.Intent
import android.os.Binder
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.applyapp.databinding.ActivityMainBinding
import com.example.applyapp.databinding.SecondActivityBinding

class SecondActivity: AppCompatActivity() {
    public lateinit var binding: SecondActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SecondActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnApply.setOnClickListener{
            var fName = binding.txtFirstName.text.toString()
            var lName = binding.txtLastName.text.toString()
            var bDay = binding.txtBday.text.toString()
            var country = binding.txtCountry.text.toString()
            Log.d("MainActivity","$fName $lName, born on: $bDay in $country")
        }

        binding.btnPhoto.setOnClickListener{
            binding.ivNumbers.setImageResource(R.drawable.numbers)
        }


        binding.btnCheck.setOnClickListener{
            if(binding.etResult.text.toString().equals("6")){
                Intent(this,ThirdActivity::class.java).also {
                    startActivity(it)
                }
            }else{
                Toast.makeText(applicationContext,"Wrong answer!", Toast.LENGTH_SHORT).show()
            }
        }

        binding.btnBack.setOnClickListener{
         finish()
        }
    }
}
