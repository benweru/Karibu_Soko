package com.example.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fragments.SignUpFragment
import com.example.karibusoko.R

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        // Check if the fragment is already added
        if (supportFragmentManager.findFragmentById(R.id.signUpFragmentContainer) == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.signUpFragmentContainer, SignUpFragment())
                .commit()
        }
    }
}
