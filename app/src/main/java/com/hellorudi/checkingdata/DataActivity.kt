package com.hellorudi.checkingdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_data.*

class DataActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data)
        checkingData()
    }

    private fun checkingData() {
        val dataDummy = null
//        val dataDummy = "2"
        when {
            dataDummy == null -> {
                tvDataSatu.visibility = View.INVISIBLE
            }
            dataDummy != "" -> {
                tvDataSatu.text = dataDummy
                tvDataSatu.visibility = View.VISIBLE
            }
        }
    }
}