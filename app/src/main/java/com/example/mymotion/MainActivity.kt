package com.example.mymotion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mymotion.databinding.ActivityMainBinding
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        GlobalScope.launch (Dispatchers.IO){
            delay(1000)
            withContext(Dispatchers.Main){
                binding.motionLayout.transitionToEnd()
            }
        }


    }
}