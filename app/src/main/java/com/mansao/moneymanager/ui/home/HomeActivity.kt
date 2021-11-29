package com.mansao.moneymanager.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mansao.moneymanager.R
import com.mansao.moneymanager.databinding.ActivityHomeBinding
import com.mansao.moneymanager.ui.addtask.AddTaskActivity

class HomeActivity : AppCompatActivity() {
    private lateinit var binding : ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fabAdd.setOnClickListener{
            intent = Intent(this, AddTaskActivity::class.java)
            startActivity(intent)
        }
    }
}