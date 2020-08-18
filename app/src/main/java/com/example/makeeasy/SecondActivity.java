package com.example.makeeasy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void next(View view) {
        /*EditText operand = (EditText) findViewById(R.id.numberSigned);
        EditText first_number = (EditText) findViewById(R.id.editTextNumber_first);
        EditText second_number = (EditText) findViewById(R.id.editTextNumber_second);

        if(operand.getText() == '+'){

        }*/
        Intent gotoThirt = new Intent();
        gotoThirt.setClass(this, ThirtActivity.class);
        startActivity(gotoThirt);
    }
}