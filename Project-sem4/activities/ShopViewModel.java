package com.example.s.activities.demo;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.s.models.Product;
import com.example.s.repositories.ShopRepo;

import java.util.List;

public class ShopViewModel extends ViewModel {

    ShopRepo shopRepo = new ShopRepo();

    public LiveData<List<Product>> getProduct() {
        return shopRepo.getProducts();
    }
}
