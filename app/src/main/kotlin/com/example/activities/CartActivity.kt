package com.example.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.karibusoko.R

class CartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart) // Ensure this matches the XML filename

        // Title
        val tvTitle: TextView = findViewById(R.id.tvTitle)

        // Order Items
        val tvItemName1: TextView = findViewById(R.id.tvItemName1)
        val tvItemDetails1: TextView = findViewById(R.id.tvItemDetails1)
        val tvItemPrice1: TextView = findViewById(R.id.tvItemPrice1)
        val tvItemQuantity1: TextView = findViewById(R.id.tvItemQuantity1)

        val tvItemName2: TextView = findViewById(R.id.tvItemName2)
        val tvItemDetails2: TextView = findViewById(R.id.tvItemDetails2)
        val tvItemPrice2: TextView = findViewById(R.id.tvItemPrice2)
        val tvItemQuantity2: TextView = findViewById(R.id.tvItemQuantity2)

        // Summary Section
        val tvTotalItems: TextView = findViewById(R.id.tvTotalItems)
        val tvTotalItemsPrice: TextView = findViewById(R.id.tvTotalItemsPrice)
        val tvStandardDelivery: TextView = findViewById(R.id.tvStandardDelivery)
        val tvStandardDeliveryPrice: TextView = findViewById(R.id.tvStandardDeliveryPrice)
        val tvTotalPayment: TextView = findViewById(R.id.tvTotalPayment)
        val tvTotalPaymentPrice: TextView = findViewById(R.id.tvTotalPaymentPrice)

        // Checkout Button
        val btnCheckout: Button = findViewById(R.id.btnCheckout)

        // Set the data for the order items
        tvItemName1.text = "Brown Basket"
        tvItemDetails1.text = "Brown\nSize: Large"
        tvItemPrice1.text = "KSH. 2400"
        tvItemQuantity1.text = "1x"

        tvItemName2.text = "Brown Basket"
        tvItemDetails2.text = "Brown\nSize: Large"
        tvItemPrice2.text = "KSH. 2400"
        tvItemQuantity2.text = "1x"

        // Set the summary text
        tvTotalItems.text = "Total Items (2)"
        tvTotalItemsPrice.text = "KSH. 4800"
        tvStandardDelivery.text = "Standard Delivery"
        tvStandardDeliveryPrice.text = "KSH. 500.00"
        tvTotalPayment.text = "Total Payment"
        tvTotalPaymentPrice.text = "KSH. 5300.32"

        // Handle checkout button click
        btnCheckout.setOnClickListener {
            // Navigate to CheckoutActivity
            val intent = Intent(this, CheckoutActivity::class.java)
            startActivity(intent)
        }
    }
}
