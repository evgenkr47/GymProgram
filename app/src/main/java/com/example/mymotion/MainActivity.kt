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
        CoroutineScope(Dispatchers.Main).launch{
            startMotion()
        }
    }

    private suspend fun startMotion(){
        delay(1000)
        binding.motionLayout.transitionToEnd()
    }

}