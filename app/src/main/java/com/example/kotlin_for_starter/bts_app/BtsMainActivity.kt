package com.example.kotlin_for_starter.bts_app

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.kotlin_for_starter.R

class BtsMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bts_main)


        // 1. 화면 클릭 감지
        val img1 = findViewById<ImageView>(R.id.bts_image_1)
        val img2 = findViewById<ImageView>(R.id.bts_image_2)
        val img3 = findViewById<ImageView>(R.id.bts_image_3)
        val img4 = findViewById<ImageView>(R.id.bts_image_4)
        val img5 = findViewById<ImageView>(R.id.bts_image_5)
        val img6 = findViewById<ImageView>(R.id.bts_image_6)
        val img7 = findViewById<ImageView>(R.id.bts_image_7)

        img1.setOnClickListener {
            // 2. 클릭 후 사진을 크게 보여주는 화면 표출
            val intent = Intent(this, Bts1Activity::class.java)
            startActivity(intent)
        }

        img2.setOnClickListener {
            val intent = Intent(this, Bts2Activity::class.java)
            startActivity(intent)
        }

        img3.setOnClickListener {
            val intent = Intent(this, Bts3Activity::class.java)
            startActivity(intent)
        }

        img4.setOnClickListener {
            val intent = Intent(this, Bts4Activity::class.java)
            startActivity(intent)
        }

        img5.setOnClickListener {
            val intent = Intent(this, Bts5Activity::class.java)
            startActivity(intent)
        }

        img6.setOnClickListener {
            val intent = Intent(this, Bts6Activity::class.java)
            startActivity(intent)
        }

        img7.setOnClickListener {
            val intent = Intent(this, Bts7Activity::class.java)
            startActivity(intent)
        }
    }
}