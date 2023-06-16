package com.example.jarellxml

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ToolbarActivity : AppCompatActivity() {
    lateinit var home:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toolbar)

        home=findViewById(R.id.hme)

        home.setOnClickListener {
            var keja=Intent(this,DashboardActivity::class.java)
            startActivity(keja)
        }
    }
}