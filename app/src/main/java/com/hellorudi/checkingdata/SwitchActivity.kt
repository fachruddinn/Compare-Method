package com.hellorudi.checkingdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_switch.*

class SwitchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_switch)
        checkButton()
    }

    private fun checkButton() {
        switchButton.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                val dataValue = "70"
                tvDataSwitch.text = dataValue
                tvDataSwitch.visibility = View.VISIBLE
            } else {
                val dataNull = null
                tvDataSwitch.text = dataNull
                tvDataSwitch.visibility = View.VISIBLE
            }
        }
        switchButtonTwo.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                val dataValueB = "80"
                tvDataSwitchTwo.text = dataValueB
                tvDataSwitchTwo.visibility = View.VISIBLE
            } else {
                val dataStringNull = "null"
                tvDataSwitchTwo.text = dataStringNull
                tvDataSwitchTwo.visibility = View.VISIBLE
            }
        }
    }
}
