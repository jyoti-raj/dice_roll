package com.example.dise_roller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //funtion for button after click
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener { RollDice() }
//        val button_1 = findViewById<Button>(R.id.button1)
//        button.setOnClickListener { Count_up() }

        //reset dice
        val reset = findViewById<Button>(R.id.button2)
        reset.setOnClickListener{Call_Reset()}
    }


    private fun Call_Reset(){
       // val resultText = findViewById<TextView>(R.id.button1)
        //resultText.text = " "
        val resultText = findViewById<ImageView>(R.id.image1)
        resultText.setImageResource(R.drawable.empty_dice)
    }

//show pop up with text Button Clicked after cliking button

    private fun RollDice() {
        val randomInt = (1..6).random()
//        var resultText = findViewById<TextView>(R.id.button1)
//        resultText.text = randomInt.toString()

        val resource = findViewById<ImageView>(R.id.image1)
        val drawable_Resource = when(randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }
        resource.setImageResource(drawable_Resource)

        //  Toast.makeText(this,"Button Clicked",Toast.LENGTH_SHORT).show()
    }

//    private fun Count_up() {
//        val resultText = findViewById<TextView>(R.id.button1)
//        if (resultText.text == "Hello World!"){
//            resultText.text = "1"
//        }
//        else{
//            var result2 = resultText.text.toString().toInt()
//            if(result2 < 6){
//                result2 = result2 + 1
//                resultText.text = result2.toString()
//            }
//
//        }
//    }

}

