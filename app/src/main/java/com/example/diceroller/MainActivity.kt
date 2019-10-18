package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val resetButton: Button = findViewById(R.id.reset_button)
        resetButton.setOnClickListener { reset() }

    }
    private fun rollDice() {
        val randomInt1 = Random().nextInt(6) + 1
        val randomInt2 = Random().nextInt(6) + 1
        val randomInt3 = Random().nextInt(6) + 1
        val result1Text: TextView = findViewById(R.id.result1_text)
        val result2Text: TextView = findViewById(R.id.result2_text)
        val result3Text: TextView = findViewById(R.id.result3_text)

        val sumText: TextView = findViewById(R.id.sum_text)
        result1Text.text = randomInt1.toString()
        result2Text.text = randomInt2.toString()
        result3Text.text = randomInt3.toString()

        var sumInt = randomInt1.toString().toInt() + randomInt2.toString().toInt() + randomInt3.toString().toInt()
        sumText.text = "Total : " + sumInt.toString()
    }

    private fun reset(){
        val result1Text: TextView = findViewById(R.id.result1_text)
        val result2Text: TextView = findViewById(R.id.result2_text)
        val result3Text: TextView = findViewById(R.id.result3_text)
        val sumText: TextView = findViewById(R.id.sum_text)
        result1Text.text = "0"
        result2Text.text = "0"
        result3Text.text = "0"

        sumText.text = "Total: 0"

    }
}
