package com.example.karibusoko


import android.net.Uri
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Handler
import android.os.Looper
import android.util.Log
import com.example.activities.MainActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)

        val videoView = findViewById<VideoView>(R.id.videoView)
        val videoUri = Uri.parse("android.resource://$packageName/${R.raw.splashscreen}")
        videoView.setVideoURI(videoUri)

        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        videoView.setMediaController(mediaController)

        videoView.setOnPreparedListener { mediaPlayer ->
            mediaPlayer.start()

            // Stop video and redirect after 3 seconds
            Handler(Looper.getMainLooper()).postDelayed({
                navigateToMainActivity()
            }, 3000) // 3000 milliseconds = 3 seconds
        }

        videoView.setOnCompletionListener {
            navigateToMainActivity()
        }

        videoView.setOnErrorListener { _, what, extra ->
            Log.e("VideoView", "Error playing video: what=$what, extra=$extra")
            true // Indicate error is handled
        }
    }

    private fun navigateToMainActivity() {
        val intent = Intent (this, MainActivity::class.java)
        startActivity(intent)
        finish() // Prevent the user from navigating back to the splash screen
    }
}