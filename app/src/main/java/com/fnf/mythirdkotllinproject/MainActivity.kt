package com.fnf.mythirdkotllinproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    
    private var index = 0
    private var images = intArrayOf(R.drawable.face, R.drawable.five, R.drawable.four, R.drawable.image, R.drawable.image_one)
    private var imageView:ImageView? = null
    private var button:Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView = findViewById<ImageView>(R.id.imageView)
        button = findViewById<Button>(R.id.buttonChangeImage)
        button?.setOnClickListener {
            Log.d(TAG, "onCreate: buttonClicked")
            imageView?.setImageResource(images[index++])
            if(index == images.size) index = 0
        }

    }
}