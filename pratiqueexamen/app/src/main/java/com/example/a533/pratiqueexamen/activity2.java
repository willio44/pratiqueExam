package com.example.a533.pratiqueexamen;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class activity2 extends AppCompatActivity {

    Button btnShowDialog;
    final Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);

        btnShowDialog = findViewById(R.id.button_dialog);

        setListener();
    }

    public void setListener(){

        btnShowDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                // custom dialog
                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.activity_dialog_layout);
                TextView textTitle = (TextView) dialog.findViewById(R.id.textView_title);

                textTitle.setText("Pleine puissance monsieur Sulu");

                Button captainbtn = (Button) dialog.findViewById(R.id.button_captain);
                captainbtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context,"Vroom",Toast.LENGTH_SHORT).show();
                        }});

                Button btnCancel = (Button) dialog.findViewById(R.id.button_cancel);
                btnCancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context,"It’s treason then",Toast.LENGTH_SHORT).show();
                    }
                });

                dialog.show();
            }
        });



    }

}
