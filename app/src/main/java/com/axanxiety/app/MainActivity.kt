package com.axanxiety.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    enum class Sounds {
        WoodBlock,
        Beep
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val woodBlockBtn = findViewById<Button>(R.id.woodBlockBtn)
        val beepBtn = findViewById<Button>(R.id.beepBtn)

        woodBlockBtn.setOnClickListener {
            playSound(Sounds.WoodBlock)
        }

        beepBtn.setOnClickListener {
            playSound(Sounds.Beep)
        }
    }

    private fun playSound(sound:Sounds) {

    }
}
