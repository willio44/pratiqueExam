package com.example.a533.pratiqueexamen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class activity3 extends AppCompatActivity {

    Button btn0;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity3);

       final CustomView customView = findViewById(R.id.customView);

       btn0 = findViewById(R.id.button_0);
       btn1 = findViewById(R.id.button_1);

    }




}
