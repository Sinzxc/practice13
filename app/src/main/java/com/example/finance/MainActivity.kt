package com.example.finance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val edtv:EditText = findViewById(R.id.editTextText)
        edtv.requestFocus()
    }
        fun Click(view: View){
            val edtv:EditText = findViewById(R.id.editTextText)
            val edtv2:EditText = findViewById(R.id.editTextText2)
            val tv: TextView = findViewById(R.id.textView4)
            if (edtv!!.text.toString() == "") {
                Toast.makeText(this, "Введите курс обмена!", Toast.LENGTH_SHORT).show()
                edtv.requestFocus()
            }
            else if ( edtv2!!.text.toString() == ""){
                Toast.makeText(this, "Введите сумму для обмена!", Toast.LENGTH_SHORT).show()
                edtv.requestFocus()
            }
            else { val text: String = edtv.text.toString()
                    val text2: String = edtv2.text.toString()
                    var num1: Int = text.toInt()
                    var num2: Int = text2.toInt()
                    tv.setText((num1*num2).toString())
            }



        }
}