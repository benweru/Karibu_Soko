package com.example.fragments

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.karibusoko.R

class EditProfileFragment : Fragment() {

    private lateinit var ivEditProfilePicture: ImageView
    private lateinit var etEditUsername: TextInputEditText
    private lateinit var etEditPassword: TextInputEditText
    private lateinit var btnUpdateProfile: Button
    private lateinit var btnDeleteAccount: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_edit_profile, container, false)

        // Initialize views
        ivEditProfilePicture = view.findViewById(R.id.ivEditProfilePicture)
        etEditUsername = view.findViewById(R.id.etEditUsername)
        etEditPassword = view.findViewById(R.id.etEditPassword)
        btnUpdateProfile = view.findViewById(R.id.btnUpdateProfile)
        btnDeleteAccount = view.findViewById(R.id.btnDeleteAccount)

        // Set up listeners
        ivEditProfilePicture.setOnClickListener {
            Toast.makeText(requireContext(), "Change Profile Picture", Toast.LENGTH_SHORT).show()
        }

        btnUpdateProfile.setOnClickListener {
            val username = etEditUsername.text.toString()
            val password = etEditPassword.text.toString()

            if (username.isBlank()) {
                etEditUsername.error = "Username cannot be empty"
            } else if (password.isBlank()) {
                etEditPassword.error = "Password cannot be empty"
            } else {
                // Update profile logic here
                Toast.makeText(requireContext(), "Profile Updated", Toast.LENGTH_SHORT).show()
            }
        }

        btnDeleteAccount.setOnClickListener {
            // Logic to delete the account
            Toast.makeText(requireContext(), "Account Deleted", Toast.LENGTH_SHORT).show()
        }

        return view
    }
}
