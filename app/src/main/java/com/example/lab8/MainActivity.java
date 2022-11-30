package com.example.lab8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, menu.class);
        EditText editText = findViewById(R.id.editTextTextEmailAddress);
        String message = editText.getText().toString();
        intent.putExtra("message", message);
        startActivity(intent);
    }
    public void registration(View view) {
        Intent intent2 = new Intent(this, registration.class);
        startActivity(intent2);
    }




}