package com.example.ihead_beta.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import com.example.ihead_beta.databinding.ActivityMainSittingBinding
import com.example.ihead_beta.fragment.FragmentSitting
import java.util.Timer
import java.util.TimerTask

class MainActivitySitting : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainSittingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainSittingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dialog = FragmentSitting()

        val timer = Timer()
        val timerTask = object : TimerTask(){
            override fun run() {
                dialog.show(supportFragmentManager, "FragmentSitting")
            }
        }

        timer.schedule(timerTask, 10000)

    }


}