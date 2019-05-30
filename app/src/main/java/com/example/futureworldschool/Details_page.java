package com.example.futureworldschool;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;

public class Details_page extends AppCompatActivity {

    AppCompatButton proceeddetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_page);

        proceeddetails = findViewById(R.id.but_proceed_details);

        proceeddetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent gotofee = new Intent(Details_page.this,FeeStructure.class);
                startActivity(gotofee);
            }
        });
    }
}
