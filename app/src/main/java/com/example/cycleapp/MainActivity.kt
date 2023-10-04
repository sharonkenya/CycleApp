package com.example.cycleapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
//import com.example.cycleapp.R
//import com.example.cycleapp.SignInActivity
//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the "Start Renting" button by its ID
        val startRentButton = findViewById<Button>(R.id.startRentButton)

        // Set an OnClickListener to handle button clicks
        startRentButton.setOnClickListener {
            // Define the action to perform when the button is clicked
            // Navigate to the SignInActivity
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }
    }
}

//package com.example.cycleapp
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import com.example.cycleapp.R
//
//class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//    }
//}