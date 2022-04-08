package com.example.dawd.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.dawd.MainActivity;
import com.example.dawd.R;
import com.example.dawd.entity.Product;
import com.example.dawd.repository.AppDatabase;

public class AddProductActivity extends AppCompatActivity {

    Button btnAddProduct, btnViewProduct;
    private EditText etName, etQuantity;
    AppDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int SDK_INT = android.os.Build.VERSION.SDK_INT;
        if (SDK_INT > 8)
        {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
                    .permitAll().build();
            StrictMode.setThreadPolicy(policy);
            //your codes here

        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_product);

        initView();

        initListener();
    }

    private void initListener() {
        btnAddProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String productName = etName.getText().toString();
                int productQuantity = Integer.parseInt(etQuantity.getText().toString());

                Product product = new Product();
                product.setName(productName);
                product.setQuantity(productQuantity);
                db.productDao().insertProduct(product);
            }
        });

        btnViewProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddProductActivity.this, MainActivity.class);
                AddProductActivity.this.startActivity(intent);
            }
        });
    }

    private void initView() {
        etName = (EditText) findViewById(R.id.etName1);
        etQuantity = (EditText) findViewById(R.id.etQuantity1);
        btnAddProduct = (Button) findViewById(R.id.btnAddProduct);
        btnViewProduct = (Button) findViewById(R.id.btnViewProduct);
        db = AppDatabase.getAppDatabase(this);
    }
}
