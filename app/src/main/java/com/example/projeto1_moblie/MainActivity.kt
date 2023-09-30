package com.example.projeto1_moblie


import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.DialogInterface
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.ImageButton
import com.example.projeto1_moblie.R.id.btnOpenSecondActivity


class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAlert = findViewById<Button>(R.id.btnAlert)
        btnAlert.setOnClickListener {
            exibirAlerta()
        }
        val btnOpenSecondActivity = findViewById<ImageButton>(btnOpenSecondActivity)
        btnOpenSecondActivity.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

    }



    private fun exibirAlerta() {
        val builder = AlertDialog.Builder(this)

        builder.setTitle("Olá, eu sou:")
            .setMessage("Victor Emmanuel Barros - 01535015")
            .setPositiveButton("OK", DialogInterface.OnClickListener { dialog, which ->

            })

            .show()
    }
}
