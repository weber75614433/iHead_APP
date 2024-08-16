package com.example.ihead_beta.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import com.example.ihead_beta.databinding.ActivityMainSafetyBinding
import com.example.ihead_beta.fragment.FragmentSafety
import java.util.Timer
import java.util.TimerTask

class MainActivitySafety : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainSafetyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainSafetyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dialog = FragmentSafety()

        val timer = Timer()
        val timerTask = object : TimerTask(){
            override fun run() {
                dialog.show(supportFragmentManager, "FragmentSafety")
            }
        }

        timer.schedule(timerTask, 10000)

    }


}