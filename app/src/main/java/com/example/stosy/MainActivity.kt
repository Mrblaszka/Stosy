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

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Mateusz Blacha 3Pr
        val text = findViewById<EditText>(R.id.txt).text.toString().toInt()
        val add = findViewById<Button>(R.id.bt1_st)
        val del = findViewById<Button>(R.id.bt1_st2)
        var text2 = findViewById<TextView>(R.id.txt2).text
        val first = findViewById<TextView>(R.id.bt1_st3)
        val last = findViewById<TextView>(R.id.bt1_st4)
        val stos = LinkedList<Int>();


        if(stos.isEmpty()){
            first.isInvisible
            last.isInvisible
            add.setOnClickListener {
            stos.addFirst(text)
            text2 = stos.toString()
        }
        }
        else {
            first.isVisible
            last.isVisible
            add.setOnClickListener {
                stos.add(text)
                text2 = stos.toString()
            }
        }

    }
}