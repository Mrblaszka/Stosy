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
import java.util.Queue
import java.util.Stack

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Mateusz Blacha 3Pr
        val title = findViewById<TextView>(R.id.title)
        var text1 = findViewById<EditText>(R.id.txt)
        val add = findViewById<Button>(R.id.bt1_st)
        val del = findViewById<Button>(R.id.bt1_st2)
        var text2 = findViewById<TextView>(R.id.txt2)
        val first = findViewById<TextView>(R.id.bt1_st3)
        val last = findViewById<TextView>(R.id.bt1_st4)
        val stos = Stack<Int>()
        val last2 = findViewById<Button>(R.id.bt1_st6)
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
            val ele = stos.removeLast()
            text2.text = ele.toString()
        }

        last.setOnClickListener {
            if (!stos.isEmpty()) {
                text2.text = "Ostatni element: " + stos.last().toString()
            }
        }
        first.setOnClickListener {
            if (!stos.isEmpty()) {
                text2.text = "Pierwszy element: " + stos.first().toString()
            }
        }
        last.setOnClickListener {
            if(!stos.isEmpty()){
                text2.text = "Wszystkie: " + stos.toString()
            }
        }


        //Kolejka

        val zmiana = findViewById<Button>(R.id.kolejka)
        val kolejka: Queue<Int>  = LinkedList<Int>()
        zmiana.setOnClickListener {
            text2.text = ""
            text1.text.clear()
            zmiana.text = "Użyj stosu"
            title.text = "Lista"

            zmiana.setOnClickListener {
                title.text = "STOS"
            }
        }
        add.setOnClickListener {
            if (text2.toString() != "") {
                kolejka.add(text1.text.toString().toInt())
                text2.text = kolejka.toString()
            }
        }

        del.setOnClickListener {
            if (text2.toString() != "") {
                val ele2 = kolejka.poll()
                text2.text = "Usunięty element: " + ele2.toString()
            }
        }
        first.setOnClickListener {
            if(text2.toString() != ""){
                val pierwszy = kolejka.first().toString()
                text2.text = "Pierwszy element: " + pierwszy
            }
        }
        last2.setOnClickListener {
            if(text2.toString() != ""){
                text2.text = "Wszystkie elementy: " + kolejka.toString()
            }
        }
        last.setOnClickListener {
            if(text2.toString() != ""){
                val ostatni2 = kolejka.last().toString()
                text2.text = "Ostatni element" + ostatni2
            }
        }
    }



}
