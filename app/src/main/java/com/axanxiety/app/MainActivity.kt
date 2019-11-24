package com.axanxiety.app

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val woodBlockBtn = findViewById<Button>(R.id.woodBlockBtn)
        val beepBtn = findViewById<Button>(R.id.beepBtn)
        val settingsBtn = findViewById<ImageButton>(R.id.settingsBtn);

        val woodBlockSound : MediaPlayer = MediaPlayer.create(this@MainActivity, R.raw.woodblock)
        val beepSound : MediaPlayer = MediaPlayer.create(this@MainActivity, R.raw.beep)

        woodBlockBtn.setOnClickListener {
           playSound(woodBlockSound)
        }

        beepBtn.setOnClickListener {
            playSound(beepSound)
        }

        settingsBtn.setOnClickListener {
            val intent = Intent(this, About::class.java)
            startActivity(intent)
        }
    }

    private fun playSound(player:MediaPlayer) {
        if(player.isPlaying){
            player.stop()
        }
        player.start()
    }
}
