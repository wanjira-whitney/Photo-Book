package dev.wanjira.picturs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class GWagon : AppCompatActivity() {
    lateinit var btnNext3: Button
    lateinit var btnPrevious2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gwagon)
        btnNext3 = findViewById(R.id.btnNext3)
        btnNext3.setOnClickListener {
            val intent = Intent(this, RangeRoverActivity::class.java)
            startActivity(intent)
        }
        btnPrevious2 = findViewById(R.id.btnPrevious2)
        btnPrevious2.setOnClickListener {
            val intent = Intent(this, LamboActivity::class.java)
            startActivity(intent)
        }
    }
}