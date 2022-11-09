package com.dreamyprogrammer.lessonkotlin_1

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener

class KotlinActivity : AppCompatActivity() {
    private lateinit var secondButton: Button
    private lateinit var stringEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        var title: String? = null
        stringEditText = findViewById(R.id.string_edit_text)

        val note = NoteEntity("","", "", 0L)


        stringEditText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                TODO("Not yet implemented")
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                TODO("Not yet implemented")
            }

            override fun afterTextChanged(p0: Editable?) {
                TODO("Not yet implemented")
            }

        })
        secondButton = findViewById(R.id.button_second)
        secondButton.setOnClickListener {
            showAlertDialog(stringEditText.text.toString(), title ?: "")
        }
    }

    private fun showAlertDialog(message: String?, title: String): Boolean {

//        val builder = AlertDialog.Builder(this)
//            .setPositiveButton("OK") { _,_ ->
//                Toast.makeText(this,"OlOlO", Toast.LENGTH_SHORT).show()
//            }
        AlertDialog.Builder(this).apply {
            setPositiveButton("OK") { _, _ ->
                Toast.makeText(this@KotlinActivity, "OlOlO", Toast.LENGTH_SHORT).show()
            }
            message?.let {
                setMessage(message)
            }
            setTitle(title)
            show()
//        if (message != null) {
//            builder.setMessage(message)
//        }
        }
        return true
    }
}