package com.example.parkminhyun.trackengine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button registerStudyBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        registerStudyBtn = (Button)findViewById(R.id.registerStudyBtn);
        registerStudyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerStudy = new Intent(MainActivity.this, RegisterStudyActivity.class);
                startActivity(registerStudy);
            }
        });

    }
}
