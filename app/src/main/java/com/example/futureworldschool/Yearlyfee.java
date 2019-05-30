package com.example.futureworldschool;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Yearlyfee extends AppCompatActivity {

    Button yearfeeproceed;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yearlyfee);

        yearfeeproceed = findViewById(R.id.but_year_pro);
        back = findViewById(R.id.back_half);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoback = new Intent(Yearlyfee.this,FeeStructure.class);
                startActivity(gotoback);
            }
        });

        yearfeeproceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoyear = new Intent(Yearlyfee.this,PaymentInformation.class);
                startActivity(gotoyear);
            }
        });
    }
}
