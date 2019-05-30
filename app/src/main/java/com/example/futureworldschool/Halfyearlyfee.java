package com.example.futureworldschool;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Halfyearlyfee extends AppCompatActivity {

    Button half_proceed;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halfyearlyfee);

        half_proceed = findViewById(R.id.half_proceed);

        half_proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent gotopro= new Intent(Halfyearlyfee.this,PaymentInformation.class);
                startActivity(gotopro);
            }
        });

        back = findViewById(R.id.back_half);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goback= new Intent(Halfyearlyfee.this,FeeStructure.class);
                startActivity(goback);
            }
        });

    }
}
