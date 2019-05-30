package com.example.futureworldschool;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.futureworldschool.Adapter.CustomAdapter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Monthlyfee extends AppCompatActivity {

    RecyclerView recyclerView;
    Button button;
    ImageView back;

    // ArrayList for month names

    ArrayList months = new ArrayList<>(Arrays.asList("January","February","March","April","May","June","July","August","September","October","November","December"));
    ArrayList amount = new ArrayList<>(Arrays.asList("2,500","2,500","2,500","2,500","2,500","2,500","2,500","2,500","2,500","2,500","2,500","2,500"));



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monthlyfee);

        // get the reference of RecyclerView
        recyclerView = findViewById(R.id.recyclerView);


        // set a LinearLayoutManager with default vertical orientation
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        // call the constructor of CustomAdapter to send the reference and data to Adapter
        CustomAdapter customAdapter = new CustomAdapter(Monthlyfee.this, months,amount);
        recyclerView.setAdapter(customAdapter); // set the Adapter to RecyclerView


        button = findViewById(R.id.month_proceed);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent gotopay1= new Intent(Monthlyfee.this,PaymentInformation.class);
                startActivity(gotopay1);
            }
        });


        back = findViewById(R.id.month_back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goback= new Intent(Monthlyfee.this,FeeStructure.class);
                startActivity(goback);
            }
        });


    }
}
