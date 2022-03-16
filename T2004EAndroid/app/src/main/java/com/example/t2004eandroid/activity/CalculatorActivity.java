package com.example.t2004eandroid.activity;

import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.t2004eandroid.R;

public class CalculatorActivity extends AppCompatActivity {

    private TextView txtName;
    private LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);

        linearLayout = findViewById(R.id.layout1);
        linearLayout = findViewById(R.id.layout2);
        linearLayout = findViewById(R.id.layout3);
        linearLayout = findViewById(R.id.layout4);
        linearLayout = findViewById(R.id.layout5);
        linearLayout = findViewById(R.id.layout6);

        txtName = findViewById(R.id.txtName);
        txtName = findViewById(R.id.txtName1);
        txtName = findViewById(R.id.txtName2);
        txtName = findViewById(R.id.txtName3);
        txtName = findViewById(R.id.txtName4);
        txtName = findViewById(R.id.txtName5);
        txtName = findViewById(R.id.txtName6);
        txtName = findViewById(R.id.txtName7);
        txtName = findViewById(R.id.txtName8);
        txtName = findViewById(R.id.txtName9);
        txtName = findViewById(R.id.txtName10);
        txtName = findViewById(R.id.txtName11);
        txtName = findViewById(R.id.txtName12);
        txtName = findViewById(R.id.txtName13);
        txtName = findViewById(R.id.txtName14);
        txtName = findViewById(R.id.txtName15);
        txtName = findViewById(R.id.txtName16);
        txtName = findViewById(R.id.txtName17);
        txtName = findViewById(R.id.txtName18);
        txtName = findViewById(R.id.txtName19);
        txtName = findViewById(R.id.txtName20);
    }
}