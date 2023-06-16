package com.example.jarellxml

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast

class ImageButton : AppCompatActivity() {
    lateinit var number1:EditText
    lateinit var number2:EditText
    lateinit var image:ImageButton
    lateinit var difference:Button
    lateinit var product:Button
    lateinit var quotient:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_button)

        number1=findViewById(R.id.txtnum1)
        number2=findViewById(R.id.txtnum2)
        image=findViewById(R.id.imgbtn)
        difference=findViewById(R.id.btn3)
        product=findViewById(R.id.btn1)
        quotient=findViewById(R.id.btn2)

        //Addition
        image.setOnClickListener{
            if (number1.toString().isEmpty()||number2.text.toString().isEmpty()){
                Toast.makeText(applicationContext, "Enter both numbers!",Toast.LENGTH_LONG).show()
            }
            else{
                var num1=Integer.parseInt(number1.text.toString())
                var num2=Integer.parseInt(number2.text.toString())
                Toast.makeText(applicationContext, "Sum of two numbers is "+(num1+num2),Toast.LENGTH_LONG).show()
            }
        }

        //Difference
        difference.setOnClickListener {
            if (number1.toString().isEmpty()||number2.text.toString().isEmpty()){
                Toast.makeText(applicationContext,"Enter both numbers!",Toast.LENGTH_LONG).show()
            }
            else{
                var num1=Integer.parseInt(number1.text.toString())
                var num2=Integer.parseInt(number2.text.toString())
                Toast.makeText(applicationContext, "difference of two numbers is "+(num1-num2),Toast.LENGTH_LONG).show()
            }
        }

        //Product
        product.setOnClickListener {
            if (number1.toString().isEmpty()||number2.text.toString().isEmpty()){
                Toast.makeText(applicationContext,"Enter both numbers!",Toast.LENGTH_LONG).show()
            }
            else{
                var num1=Integer.parseInt(number1.text.toString())
                var num2=Integer.parseInt(number2.text.toString())
                Toast.makeText(applicationContext, "product of two numbers is "+(num1*num2),Toast.LENGTH_LONG).show()
            }
        }

        //Quotient
        quotient.setOnClickListener {
            if (number1.toString().isEmpty()||number2.text.toString().isEmpty()){
                Toast.makeText(applicationContext,"Enter both numbers!",Toast.LENGTH_LONG).show()
            }
            else{
                var num1=Integer.parseInt(number1.text.toString())
                var num2=Integer.parseInt(number2.text.toString())
                Toast.makeText(applicationContext, "quotient of two numbers is "+(num1/num2),Toast.LENGTH_LONG).show()
            }
        }

    }
}