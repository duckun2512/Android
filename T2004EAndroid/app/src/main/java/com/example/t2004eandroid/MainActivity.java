package com.example.t2004eandroid;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextClock;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button btnSubmit;
    private TextView labelName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // lấy các phần tử từ ngoài view theo id bằng hàm implicit findViewById();
        editText = findViewById(R.id.txtName);
        btnSubmit = findViewById(R.id.btnSubmit);
        labelName = findViewById(R.id.labelName);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = editText.getText().toString();
                labelName.setText(name);
            }
        });
    }
}