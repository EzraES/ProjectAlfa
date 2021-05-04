package com.dicoding.projectalfa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.dicoding.projectalfa.Laporansaya.LaporanSaya

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLaporanSaya: Button = findViewById(R.id.btn_tomove)
        btnLaporanSaya.setOnClickListener{
            val intens = Intent(this@MainActivity, LaporanSaya::class.java)
            startActivity(intens)
        }
    }
}