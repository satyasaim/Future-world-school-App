package com.example.futureworldschool;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Switch;

public class FeeStructure extends AppCompatActivity {

    Button feeproceed;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fee_structure);

        feeproceed = findViewById(R.id.but_pro_fee);
        spinner = findViewById(R.id.spinner_fee);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = null;
                switch(position){

//                    case 0:
//                        intent = new Intent(FeeStructure.this,Yearlyfee.class);
//                        startActivity(intent);
//                        break;
                    case 1:
                        intent = new Intent(FeeStructure.this,Halfyearlyfee.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(FeeStructure.this,Quarterly_year.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(FeeStructure.this,Monthlyfee.class);
                        startActivity(intent);
                        break;


                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner.setPrompt("Fee Structure");

        feeproceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent gotofeeyear = new Intent(FeeStructure.this,Yearlyfee.class);
                startActivity(gotofeeyear);
            }
        });
    }
}
