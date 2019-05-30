package com.example.futureworldschool;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatEditText;
import android.view.View;

public class Login_page extends AppCompatActivity {

    AppCompatEditText mobilenumber;
    AppCompatButton submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        mobilenumber = findViewById(R.id.et_mobilenum);
        submit = findViewById(R.id.but_submit);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent gotodeatils = new Intent(Login_page.this,Details_page.class);
                startActivity(gotodeatils);
            }
        });
    }
}
