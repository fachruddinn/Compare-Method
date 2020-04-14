package com.hellorudi.checkingdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_data.*
import kotlinx.android.synthetic.main.activity_data_two.*

class DataTwoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_two)
        checkingData()
    }

    private fun checkingData() {
        val dataDummy = null
//        val dataDummy = "2"
        when {
            dataDummy != "" -> {
                tvDataDua.text = dataDummy
                tvDataDua.visibility = View.VISIBLE
            }
            dataDummy == null -> {
                tvDataDua.visibility = View.INVISIBLE
            }
        }
    }
}