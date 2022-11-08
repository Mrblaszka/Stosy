package com.example.stosy

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import java.util.LinkedList
import java.util.Stack

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Mateusz Blacha 3Pr
        var text1 = findViewById<EditText>(R.id.txt)
        val add = findViewById<Button>(R.id.bt1_st)
        val del = findViewById<Button>(R.id.bt1_st2)
        var text2 = findViewById<TextView>(R.id.txt2)
        val first = findViewById<TextView>(R.id.bt1_st3)
        val last = findViewById<TextView>(R.id.bt1_st4)
        val stos = Stack<Int>()
        text2.text = ""


        add.setOnClickListener {
            if (text2.toString() != "") {
                if (stos.isEmpty()) {
                    stos.add(text1.text.toString().toInt())
                    text2.text = stos.toString()

                } else {
                    first.isInvisible
                    last.isInvisible
                    stos.add(text1.text.toString().toInt())
                    text2.text = stos.toString()
                }

            }
        }

        del.setOnClickListener {
            stos.pop()
            text2.text = stos.toString()
        }

        last.setOnClickListener {
            if (!stos.isEmpty()) {
                text2.text = "Ostatni element" + stos.last().toString()
            }
        }
        first.setOnClickListener {
            if (!stos.isEmpty()) {
                text2.text = "Pierwszy element" + stos.first().toString()
            }
        }
    }
}
