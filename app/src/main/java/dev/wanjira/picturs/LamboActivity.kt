package dev.wanjira.picturs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LamboActivity : AppCompatActivity() {
    lateinit var btnNext2: Button
    lateinit var btnPrevious: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lambo)
        btnNext2 = findViewById(R.id.btnNext2)
        btnNext2.setOnClickListener {
            val intent = Intent(this, GWagon::class.java)
            startActivity(intent)
        }
        btnPrevious = findViewById(R.id.btnPrevious)
        btnPrevious.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}