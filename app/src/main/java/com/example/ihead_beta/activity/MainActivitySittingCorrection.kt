package com.example.ihead_beta.activity

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import com.example.ihead_beta.R
import com.example.ihead_beta.databinding.ActivityMainSittingCorrectionBinding
import com.example.ihead_beta.fragment.FragmentSitting
import com.example.ihead_beta.fragment.FragmentSittingCorrectionTips
import java.util.Timer
import java.util.TimerTask

class MainActivitySittingCorrection : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainSittingCorrectionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainSittingCorrectionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dialog = FragmentSittingCorrectionTips()
        val imageView = findViewById<ImageView>(R.id.imageViewSittingCorrection)
        val textViewIdealCVA = findViewById<TextView>(R.id.idealCVA)
        val textViewCurrentCVA = findViewById<TextView>(R.id.currentCVA)
        val condition = true

        val button = findViewById<Button>(R.id.buttonSittingCorrection)
        button.setOnClickListener {
            dialog.show(supportFragmentManager, "FragmentSittingCorrectionTips")
            dialog.show(supportFragmentManager, "FragmentSittingCorrectionResult")
        }

        textViewCurrentCVA.text = "45"
        !condition

        textViewIdealCVA.text = "60"

        if (!condition){
            imageView.setImageResource(R.drawable.wrongsitting)
        }

    }

}