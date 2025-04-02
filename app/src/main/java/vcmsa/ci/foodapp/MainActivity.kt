package foodapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import vcmsa.ci.foodapp.R

class MainActivity : AppCompatActivity () {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Set layout for this activity. The layout file for this is defined in res/layout/activity_main.xml
        setContentView(R.layout.activity_main)

        // EditText for the user to enter the time of day
        val timeofday: EditText = findViewById(R.id.timeofDay)
        // When button is clicked it outputs the suggested meal
        val suggestionButton: Button = findViewById(R.id.suggestionButton)
        // When button is clicked it will clears the input and meal suggestions
        val resetButton: Button = findViewById(R.id.resetButton)
        // TextView displays the suggestion to the user
        val suggestion: TextView = findViewById(R.id.suggestionText)

        // Set a OnClickListener for the suggestion button
        suggestionButton.setOnClickListener {
            // Get the suggestion from the input box as a String
            val timeofdayInput = timeofday.text.toString()
            // Get suggestion input (or null if time of day box is empty)
            val suggest = suggestion.text.toString().toIntOrNull()

            val text: String = timeofday.text.toString()

            val timday = timeofday.text.toString()

            if (timday == "Morning") {
                suggestion.text = "Have eggs for breakfast"
            } else if (timday == "Mid-morning snack") {
                suggestion.text = "Have fruit as a light snack"
            } else if (timday == "Afternoon") {
                suggestion.text = "Have a sandwich for lunch"
            } else if (timday == "Afternoon snack" ) {
                suggestion.text = "Have a donut as a afternoon snack"
            } else if (timday == "Dinner") {
                suggestion.text = "Have pasta for dinner"
            } else if (timday == "After dinner snack") {
                suggestion.text = "Have ice-cream for desert"
            } else {
                // The user has asked all suggestions for the day

                // Title: Kotlin If ... Else
                // Author: w3schools
                // Date: 01 April 2025
                // Version: 1.0
                // Available: https://www.w3schools.com/kotlin/kotlin_conditions.php

                // Check if the Time of day input field is empty
                if (timday == null || suggestion == null) {
                    // If check fails, update the suggestion TextView to inform the user
                    suggestion.text = "Please enter the time of day"
                }

                // Set an OnClickListener for the reset button
                resetButton.setOnClickListener {
                    // Clear the text in the time of day field
                    timeofday.text.clear()
                    // Reset the suggestions to its default message
                    suggestion.text = "Suggestions will be shown here"
                }



            }
        }
    }
}




