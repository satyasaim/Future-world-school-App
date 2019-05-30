package com.example.futureworldschool;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Quarterly_year extends AppCompatActivity {

    Button button;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quarterly_year);

        button = findViewById(R.id.quar_proceed);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent gotopay= new Intent(Quarterly_year.this,PaymentInformation.class);
                startActivity(gotopay);
            }
        });

        back = findViewById(R.id.quater_back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goback= new Intent(Quarterly_year.this,FeeStructure.class);
                startActivity(goback);
            }
        });
    }
}
