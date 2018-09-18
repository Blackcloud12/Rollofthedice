package codekaizen.com.rollofthedice

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollResultTextView: TextView = findViewById(R.id.rollResultTextView)
        val seekBar: SeekBar = findViewById(R.id.seekBar)
        val rollButton: Button = findViewById(R.id.rollButton)
        val sliderPercentageText : TextView = findViewById(R.id.sliderPercentageText)

        rollButton.setOnClickListener {
            val roll : Int = Random().nextInt(seekBar.progress)+1
            rollResultTextView.text = roll.toString()
        }

        seekBar.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                val inputString = "Percentage: ${seekBar.progress}%"
                sliderPercentageText.text = inputString
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
            }

        })


    }
}


