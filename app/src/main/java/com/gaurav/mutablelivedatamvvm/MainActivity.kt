package com.gaurav.mutablelivedatamvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.gaurav.mutablelivedatamvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var userModleActivity: UserModleActivity
    var i = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        userModleActivity = ViewModelProvider(this).get(UserModleActivity::class.java)
        binding.tvRed.setOnClickListener {
            userModleActivity.text.setValue("Red is clicked")
        }
        binding.tvBlue.setOnClickListener {
            userModleActivity.text.setValue("Blue is clicked")
        }
        binding.fragmentshowdata.setOnClickListener{
            i++
            binding.tvgetcount.text=i.toString()

        }


    }





}


