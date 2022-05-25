package dev.wanjira.picturs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TurboActivity : AppCompatActivity() {
    lateinit var btnPrevious4: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_turbo)
        btnPrevious4 = findViewById(R.id.btnPrevious4)
        btnPrevious4.setOnClickListener {
            val intent = Intent(this, RangeRoverActivity::class.java)
            startActivity(intent)
        }
    }
}