package com.example.lab8;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;

public class splashactivity extends AppCompatActivity{
    Handler handler;

    protected void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.splashscreen);

            handler=new Handler();
            handler.postDelayed(new Runnable(){
                                    @Override
                                    public void run() {
                                        Intent intent = new Intent(splashactivity.this, MainActivity.class);
                                        startActivity(intent);
                                        finish();
                                    }
                                },9000);


    }
}
