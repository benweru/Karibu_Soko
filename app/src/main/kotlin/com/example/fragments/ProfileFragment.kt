package com.example.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

import com.example.karibusoko.R

import com.example.karibusoko.databinding.FragmentProfileBinding

import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView



class ProfileFragment : Fragment() {

    // Declare a nullable binding variable
    private var _binding: FragmentProfileBinding? = null
    // Create a non-nullable reference to binding
    private val binding get() = _binding!!

    // Define a list of MenuItems (This data could be dynamic or fetched from a data source)
    private val menuItems = listOf(
        MenuItem(R.id.menuYourProfile, "Your Profile", R.drawable.profile),
        MenuItem(R.id.menuPaymentMethods, "Payment Methods", R.drawable.ic_payment),
        MenuItem(R.id.menuMyOrders, "My Orders", R.drawable.ic_orders),
        MenuItem(R.id.menuSettings, "Settings", R.drawable.cog),
        MenuItem(R.id.menuHelpCenter, "Help Center", R.drawable.help),
        MenuItem(R.id.menuPrivacyPolicy, "Privacy Policy", R.drawable.ic_privacy),
        MenuItem(R.id.menuInviteFriends, "Invite Friends", R.drawable.ic_invite),
        MenuItem(R.id.menuLogout, "Logout", R.drawable.logout)
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment using binding
        _binding = FragmentProfileBinding.inflate(inflater, container, false)

        // Set the profile data
        binding.userName.text = "Esther Mwangi"
        binding.profileImage.setImageResource(R.drawable.profile) // Replace with dynamic image if necessary

        // Dynamically populate the menu items
        populateMenuItems()

        // Return the root view of the fragment
        return binding.root
    }

    // Populate the menu items dynamically
    private fun populateMenuItems() {
        for (menuItem in menuItems) {
            val menuLayout = binding.root.findViewById<LinearLayout>(menuItem.id)

            // Check if menuLayout is not null
            menuLayout?.let {
                val icon = it.findViewById<ImageView>(R.id.menuIcon)
                val title = it.findViewById<TextView>(R.id.menuTitle)

                icon?.setImageResource(menuItem.iconResId) // Safely set the image
                title?.text = menuItem.title // Safely set the title

                // Set click listener for each menu item
                it.setOnClickListener {
                    handleMenuClick(menuItem.title)
                }
            }
        }
    }

    // Handle menu item clicks
    private fun handleMenuClick(menuTitle: String) {
        when (menuTitle) {
            "Your Profile" -> {

                val editProfileFragment = EditProfileFragment()


                parentFragmentManager.beginTransaction()
                    .replace(R.id.container, editProfileFragment)
                    .addToBackStack(null)
                    .commit()

            }
            "Payment Methods" -> {
                // Navigate to payment methods screen
            }
            "My Orders" -> {
                // Navigate to orders screen
            }
            "Settings" -> {
                // Navigate to settings screen
            }
            "Help Center" -> {
                // Navigate to help center screen
            }
            "Privacy Policy" -> {
                // Navigate to privacy policy
            }
            "Invite Friends" -> {
                // Navigate to invite friends screen
            }
            "Logout" -> {
                // Perform logout operation
            }
        }
    }

    // Clean up the binding reference when the view is destroyed to avoid memory leaks
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    // Data class to hold menu item details
    data class MenuItem(
        val id: Int,           // The ID of the menu layout
        val title: String,     // The title of the menu item
        val iconResId: Int     // The icon resource ID for the menu item
    )
}
