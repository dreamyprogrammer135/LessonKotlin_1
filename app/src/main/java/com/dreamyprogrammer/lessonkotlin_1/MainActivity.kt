package com.dreamyprogrammer.lessonkotlin_1

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

//    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.button_java).setOnClickListener {
            startActivity(Intent(this, JavaActivity::class.java))
        }
        findViewById<View>(R.id.button_kotlin).setOnClickListener {
            startActivity(Intent(this, KotlinActivity::class.java))
        }



//        button = findViewById(R.id.button_hello)
//        button.setOnClickListener(this)
//        button?.setOnClickListener{
//            Toast.makeText(this, button?.text, Toast.LENGTH_SHORT).show()
//        }
    }
//    override fun onClick(v: View) {
//        Toast.makeText(this, button.text, Toast.LENGTH_SHORT).show()
//        startActivity(Intent(this, JavaActivity::class.java))
//    }


}