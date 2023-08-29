package com.example.minuevaapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider


class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel
    private lateinit var editText1: EditText
    private lateinit var editText2: EditText
    private lateinit var compareButton: Button
    private lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        
        editText1 = findViewById(R.id.ediText1)
        editText2 = findViewById(R.id.ediText2)
        compareButton = findViewById(R.id.compareButton)
        resultTextView = findViewById(R.id.resultTextView)

        viewModel.resultLiveData.observe(this) { result ->
            resultTextView.text = result
        }

        compareButton.setOnClickListener {
            val text1 = "Mi Nuevo proyecto"
            val text2 = "Hola amigos"
            val result = viewModel.compareTexts(text1, text2)

            val resultText = if (result) "Las cadenas son iguales" else "Las cadenas son diferentes"
            resultTextView.text = resultText
        }
    }
}
