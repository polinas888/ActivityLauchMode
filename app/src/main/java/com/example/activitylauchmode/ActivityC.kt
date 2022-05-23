package com.example.activitylauchmode

import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

const val PHOTO_INTENT_REQUEST_CODE = 1
class ActivityC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
//            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"))
//                .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
//            startActivity(browserIntent)
//            val intent = Intent(this, ActivityB::class.java)
//            startActivity(intent)
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivityForResult(intent, PHOTO_INTENT_REQUEST_CODE)
        }
    }
}

