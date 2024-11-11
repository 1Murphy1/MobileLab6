package com.example.newactivity

import android.content.Intent;
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button;


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnShowPic: Button = findViewById(R.id.btn_show_pic)

        btnShowPic.setOnClickListener {
            val intent = Intent(this, PicActivity::class.java)

            val imageUrl = "https://cdn.mobilesyrup.com/wp-content/uploads/2023/07/pokemon-sleep-promo-image-header.jpg"
            intent.putExtra("picLink", imageUrl)

            startActivity(intent)
        }

    }



}