package com.example.analysisofdisabilityassistanceappsui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnBME;
        Button btnVE;

        btnBME = (Button)findViewById(R.id.btnBME);
        btnVE = (Button)findViewById(R.id.btnVE);


        btnBME.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //takePic으로 이동
                Intent intent = new Intent (getApplicationContext(), be_my_eyes_mainscreen.class);
                startActivity(intent);
            }
        });

        btnVE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //takePic으로 이동
                Intent intent = new Intent (getApplicationContext(), voiceeyemain.class);
                startActivity(intent);
            }
        });

    }
}