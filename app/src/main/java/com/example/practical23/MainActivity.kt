package com.example.practical23

import android.graphics.Color
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()


    }

    private fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for the background
            /*
            R.id.box1 -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box2 -> view.setBackgroundColor(Color.GRAY)
            R.id.box3 -> view.setBackgroundColor(Color.BLUE)
            R.id.box4 -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box5 -> view.setBackgroundColor(Color.BLUE)
            else -> view.setBackgroundColor(Color.BLACK)
            */

            R.id.box1 -> view.setBackgroundResource(R.drawable.one)
            R.id.box2 -> view.setBackgroundResource(R.drawable.two)
            R.id.box3 -> view.setBackgroundResource(R.drawable.three)
            R.id.box4 -> view.setBackgroundResource(R.drawable.four)
            R.id.box5 -> view.setBackgroundResource(R.drawable.five)
            else -> view.setBackgroundResource(R.drawable.back)
        }
    }

    private fun setListeners() {
        val redButton: Button = findViewById(R.id.red)
        val blueButton: Button = findViewById(R.id.blue)
        val greenButton: Button = findViewById(R.id.green)

        val boxOneText = findViewById<TextView>(R.id.box1)
        val boxTwoText = findViewById<TextView>(R.id.box2)
        val boxThreeText = findViewById<TextView>(R.id.box3)
        val boxFourText = findViewById<TextView>(R.id.box4)
        val boxFiveText = findViewById<TextView>(R.id.box5)




        val rootConstraintLayout = findViewById<View>(R.id.constraintLayout)

        val clickableViews: List<View> =
            listOf(
                boxOneText, boxTwoText, boxThreeText,
                boxFourText, boxFiveText, rootConstraintLayout
            )

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }
}