package com.example.ihead_beta.activity

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import com.example.ihead_beta.R
import com.example.ihead_beta.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /*val dialog = MyFragment()
        dialog.show(supportFragmentManager, "MyDialogFragment")*/

        val imageButtonSafety: ImageButton = findViewById(R.id.imageButtonSafety)
        val imageButtonSitting: ImageButton = findViewById(R.id.imageButtonSitting)

        imageButtonSafety.setOnClickListener {
            val intent = Intent(this, MainActivitySafety::class.java)
            startActivity(intent)
        }

        imageButtonSitting.setOnClickListener {
            val intent = Intent(this, MainActivitySitting::class.java)
            startActivity(intent)
        }

    }




}



