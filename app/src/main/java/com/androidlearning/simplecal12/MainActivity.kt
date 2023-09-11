package com.androidlearning.simplecal12

import android.content.DialogInterface
import android.content.DialogInterface.OnClickListener
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.androidlearning.simplecal12.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.plus.setOnClickListener(OnCalculationClickListener())
        binding.minus.setOnClickListener(OnCalculationClickListener())
        binding.multiply.setOnClickListener(OnCalculationClickListener())
        binding.divid.setOnClickListener(OnCalculationClickListener())
    }

    inner class OnCalculationClickListener:View.OnClickListener{
        override fun onClick(p0: View?) {
            var num1 = Integer.parseInt(binding.value1.text.toString())
            var num2 = Integer.parseInt(binding.value2.text.toString())



            if(p0?.id==R.id.plus){
                binding.result.text= "Result: " + (num1 + num2)
            }

            else if (p0?.id==R.id.minus){
                binding.result.text = "Result: " + (num1-num2)
            }

            else if (p0?.id==R.id.multiply){
                binding.result.text = "Result: " + (num1*num2)
            }

            else if (p0?.id==R.id.divid){
                binding.result.text = "Result: " + (num1/num2)
            }


        }

        }
    }

