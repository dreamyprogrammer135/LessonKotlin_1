package com.dreamyprogrammer.lessonkotlin_1;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class JavaActivity extends AppCompatActivity {
    private Button secondButton;
    private EditText stringEditText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        stringEditText = findViewById(R.id.string_edit_text);
        secondButton = findViewById(R.id.button_second);
        NoteEntity note = new NoteEntity("","", "", 0L);

        note.getTitle();

        secondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAlertDialog(stringEditText.getText().toString(), null);
            }
        });

    }

    private void showAlertDialog(String message, String title) {
        AlertDialog.Builder bilder = new AlertDialog.Builder(JavaActivity.this)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(JavaActivity.this, "OlOlO", Toast.LENGTH_SHORT).show();
                    }
                });
        if (message != null) {
            bilder.setMessage(message);
        }
        if (title != null) {
            bilder.setTitle(title);
        }

        bilder.show();
    }
}
