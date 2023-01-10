package com.example.responsi_1824

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {

    private lateinit var btnHome : Button
    private lateinit var btnPayment : Button
    private lateinit var btnHistory : Button
    private lateinit var btnSetting : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btnHome = findViewById(R.id.btn_home)
        btnPayment = findViewById(R.id.btn_payment)
        btnSetting = findViewById(R.id.btn_setting)
    }
}