package com.hellorudi.checkingdata

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnMethodSatu: Button
    private lateinit var btnMethodDua: Button
    private lateinit var btnSwitchData: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMethodSatu = findViewById(R.id.buttonMethodSatu)
        btnMethodDua = findViewById(R.id.buttonMethodDua)
        btnSwitchData = findViewById(R.id.buttonSwitchData)


        btnMethodSatu.setOnClickListener(this)
        btnMethodDua.setOnClickListener(this)
        btnSwitchData.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when (v.id) {
                R.id.buttonMethodSatu -> {
                    val intent = Intent(this, DataActivity::class.java)
                    startActivity(intent)
                }
                R.id.buttonMethodDua -> {
                    val intent = Intent(this, DataTwoActivity::class.java)
                    startActivity(intent)
                }
                R.id.buttonSwitchData -> {
                    val intent = Intent(this, SwitchActivity::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}