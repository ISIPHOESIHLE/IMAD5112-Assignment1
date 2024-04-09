package com.example.myassignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ageNumber = findViewById<EditText>(R.id.ageNumber)
        val btnGenerate = findViewById<Button>(R.id.btnGenerate)
        val btnCancel = findViewById<Button>(R.id.btnCancel)
        val txtResult = findViewById<TextView>(R.id.txtResult)
        btnGenerate.setOnClickListener{
            val age =ageNumber.text.toString().toIntOrNull()
            if (age != null) {
                val result = when (age) {
                    in 0..20 -> "j"
                    in 21..31 -> "f"
                    in 32..42 -> "p"
                    in 43..53 -> "g"
                    in 54..64 -> "t"
                    in 65..75 -> "l"
                    in 76..86 -> "r"
                    in 87..98 -> "o"
                    in 99..100 -> "s"
                    else -> "k"
                }
                    txtResult.text = "Age: $age\n${
                        when (result) {
                            "j" -> "There is no historical figures between 0-20."
                            "f" -> "Kurt Cobain was an American musician who passed away at the age of 27 years.He was born in 1967 and died in 1994."
                            "p" -> "Martin Luther King was an American minister and activist who passed away at the age of 39 years.MLT was born in 1929 and died in 1968."
                            "g" -> "Vladmir Lenin was the Former Chairman of the Council of People Commissars of the Soviet Union who passed away at the age of 53 years.He was born in 1870 and died in 1924."
                            "t" -> "Adolf Hitler was the Former Chancellor the German reign who passed away at the age of 56 years.He was born in 1889 and died in 1945."
                            "l" -> "Muhammad Ali was an American professional Boxer who passed away at the age of 74 years.He was born in 1942 and died in 2016."
                            "r" -> "Immanuel Kant was a German Philosopher who passed away at the age of 79 years.He was born in 1724 and died in 1804."
                            "o" -> "Pieter Willem Botha the State President of South Africa who passed away at the age of 90 years. He was born in 1916 and died in 2006"
                            "s" -> "Mike Nussbaum was an American actor and director who passed away at the age of 99 years just before his 100th birtrhday.He was born in 1923 and died in 2023."
                            else -> "Unfortunately you are above the age required"
                        }
                    }"
                } else {
                    txtResult.text = "Please enter a valid age."
                }
            }

            btnCancel.setOnClickListener {
                ageNumber.text.clear()
                txtResult.text = ""
            }
        }      }




