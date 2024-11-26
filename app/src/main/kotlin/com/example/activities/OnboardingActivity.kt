package com.example.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fragments.OnboardingFragment

import com.example.karibusoko.R

class OnboardingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)

        // Check if the fragment is already added
        if (supportFragmentManager.findFragmentById(R.id.onboardingFragmentContainer) == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.onboardingFragmentContainer, OnboardingFragment())
                .commit()
        }
    }
}
