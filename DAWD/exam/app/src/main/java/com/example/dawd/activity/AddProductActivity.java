package com.example.dawd.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.dawd.MainActivity;
import com.example.dawd.R;
import com.example.dawd.entity.Product;

public class AddProductActivity extends AppCompatActivity {

    Button btnAddProduct;
    private EditText etName, etQuantity;
    AppDatabase db;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_product);
        db = AppDatabase.getAppDatabase(this);
    }

    public void initData(){
        etName = (EditText) findViewById(R.id.etName1);
        etQuantity = (EditText) findViewById(R.id.etQuantity1);
        btnAddProduct = (Button) findViewById(R.id.btnAddProduct);
    }

    private void initListener() {
        btnAddProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String et1 = etName.getText().toString();
                String et2 = etQuantity.getText().toString();
                try {
                    System.out.println("--------------------------------------------------------");
                    Product product = new Product();
                    product.name = et1;
                    product.quantity = Integer.parseInt(et2);
                    db.productDao().insertProduct(product);
                    CharSequence charSequence = "Successfully !";
                    Toast toast = Toast.makeText(getApplicationContext(), charSequence, Toast.LENGTH_LONG);
                    toast.show();
                    ctx.startActivity(new Intent(ctx, MainActivity.class));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
