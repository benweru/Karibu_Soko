package com.example.activities

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.karibusoko.R

class CheckoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkout) // Ensure this matches the XML filename

        // Title
        val tvCheckoutTitle: TextView = findViewById(R.id.tvCheckoutTitle)

        // Delivery Address Section
        val tvDeliveryAddressTitle: TextView = findViewById(R.id.tvDeliveryAddressTitle)
        val tvDeliveryAddress: TextView = findViewById(R.id.tvDeliveryAddress)
        val tvChangeAddress: TextView = findViewById(R.id.tvChangeAddress)

        // Delivery Time
        val tvDeliveryTime: TextView = findViewById(R.id.tvDeliveryTime)

        // Payment Method Icons
        val ivVisa: ImageView = findViewById(R.id.ivVisa)
        val ivMastercard: ImageView = findViewById(R.id.ivMastercard)
        val ivPaypal: ImageView = findViewById(R.id.ivPaypal)
        val ivMpesa: ImageView = findViewById(R.id.ivMpesa)

        // Add Voucher
        val tvAddVoucher: TextView = findViewById(R.id.tvAddVoucher)

        // Payment Note
        val tvPaymentNote: TextView = findViewById(R.id.tvPaymentNote)

        // Total Payment Summary
        val tvTotalItems: TextView = findViewById(R.id.tvTotalItems)
        val tvStandardDelivery: TextView = findViewById(R.id.tvStandardDelivery)
        val tvTotalPayment: TextView = findViewById(R.id.tvTotalPayment)

        // Pay Now Button
        val btnPayNow: Button = findViewById(R.id.btnPayNow)

        // Set data for views (sample data; replace with real data if needed)
        tvCheckoutTitle.text = "Checkout"
        tvDeliveryAddressTitle.text = "Delivery Address"
        tvDeliveryAddress.text = "25/3 WhiteHills Estate, Nairobi"
        tvDeliveryTime.text = "Delivered in next 7 days"
        tvTotalItems.text = "Total Items (2)"
        tvStandardDelivery.text = "Standard Delivery KSH. 500"
        tvTotalPayment.text = "Total Payment KSH. 5300.32"
        tvPaymentNote.text = "Note: Use your order id at the payment. Your id #154619. If you forget to put your order id we can’t confirm the payment."

        // Handle address change click
        tvChangeAddress.setOnClickListener {
            Toast.makeText(this, "Change address functionality is not implemented yet!", Toast.LENGTH_SHORT).show()
        }

        // Handle "Add Voucher" click
        tvAddVoucher.setOnClickListener {
            Toast.makeText(this, "Voucher functionality is not implemented yet!", Toast.LENGTH_SHORT).show()
        }

        // Handle Pay Now button click
        btnPayNow.setOnClickListener {
            Toast.makeText(this, "Payment functionality is not implemented yet!", Toast.LENGTH_SHORT).show()
        }
    }
}
