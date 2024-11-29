package com.example.activities

import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.karibusoko.R

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile) // Replace with your actual layout file

        // Menu items data
        val menuItems = listOf(
            MenuItem(R.id.menuYourProfile, "Your Profile", R.drawable.profile_picture),
            MenuItem(R.id.menuPaymentMethods, "Payment Methods", R.drawable.ic_payment),
            MenuItem(R.id.menuMyOrders, "My Orders", R.drawable.ic_orders),
            MenuItem(R.id.menuSettings, "Settings", R.drawable.cog),
            MenuItem(R.id.menuHelpCenter, "Help Center", R.drawable.help),
            MenuItem(R.id.menuPrivacyPolicy, "Privacy Policy", R.drawable.ic_privacy),
            MenuItem(R.id.menuInviteFriends, "Invite Friends", R.drawable.ic_invite),
            MenuItem(R.id.menuLogout, "Logout", R.drawable.logout)
        )

        // Populate menu items
        for (menuItem in menuItems) {
            val menuLayout = findViewById<LinearLayout>(menuItem.id)

            // Check if menuLayout is not null
            menuLayout?.let {
                val icon = it.findViewById<ImageView>(R.id.menuIcon)
                val title = it.findViewById<TextView>(R.id.menuTitle)

                icon?.setImageResource(menuItem.iconResId) // Safely set the image
                title?.text = menuItem.title // Safely set the title

                // Optionally, set a click listener for each menu item
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
                // Navigate to your profile screen
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

    // Data class to hold menu item details
    data class MenuItem(
        val id: Int,           // The ID of the menu layout
        val title: String,     // The title of the menu item
        val iconResId: Int     // The icon resource ID for the menu item
    )
}
