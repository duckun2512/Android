package com.example.s.repositories;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.s.models.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ShopRepo {

    private MutableLiveData<List<Product>> mutableProductList;

    public LiveData<List<Product>> getProducts() {
        if (mutableProductList == null) {
            mutableProductList = new MutableLiveData<>();
            loadProducts();
        }
        return mutableProductList;
    }

    private void loadProducts() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(UUID.randomUUID().toString(), "Orange", 50000, true,
                "https://www.google.com/url?sa=i&url=https%3A%2F%2Fdacsancamvinh.net%2Fsuc-khoe-va-lam-dep%2Fnhung-tac-dung-tuyet-voi-cua-qua-cam%2" +
                        "F&psig=AOvVaw1DiXCIdes0zzajGYsCzxuS&ust=1651046469640000&source=images&cd=vfe&ved=0CAwQjRxqFwoTCKj098ShsfcCFQAAAAAdAAAAABAD"));
        productList.add(new Product(UUID.randomUUID().toString(), "Banana", 60000, true,
        "https://www.google.com/url?sa=i&url=https%3A%2F%2Fsoyte.namdinh.gov.vn%2Fhome%2Fhoat-dong-nganh%2Fgiao-duc-suc-khoe%2Fdieu-gi-xay-ra-voi-co-the-neu-an-2-qua-chuoi-moi-ngay-p1-2973&psig=AOvVaw1oK7o39P3j8l4eNNKlDBtf&ust=1651046596318000&source=images&cd=vfe&ved=0CAwQjRxqFwoTCOCc4oGisfcCFQAAAAAdAAAAABAQ"));
        productList.add(new Product(UUID.randomUUID().toString(), "Mango", 30000, false,
                "https://www.google.com/url?sa=i&url=http%3A%2F%2Fvietnamfruits.com.vn%2Fmango-ct1361&psig=AOvVaw21_VrGRxrWYyYlav4Ms-fL&ust=1651046679055000&source=images&cd=vfe&ved=0CAwQjRxqFwoTCOjb36misfcCFQAAAAAdAAAAABAD"));
        productList.add(new Product(UUID.randomUUID().toString(), "Durian", 100000, true,
                "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.freepik.com%2Fpremium-photo%2Fdurian-fruit-with-cut-half-leaves-isolated-white-surface_15644706.htm&psig=AOvVaw0j3Fa7skIf-oIlXpvpjQ6B&ust=1651046764808000&source=images&cd=vfe&ved=0CAwQjRxqFwoTCKibtdOisfcCFQAAAAAdAAAAABAZ"));
        productList.add(new Product(UUID.randomUUID().toString(), "Grape", 40000, false,
                "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.collinsdictionary.com%2Fko%2Fdictionary%2Fenglish%2Fgrape&psig=AOvVaw1qyE7xXoecS4jaugH9uePW&ust=1651046828802000&source=images&cd=vfe&ved=0CAwQjRxqFwoTCKCL_fCisfcCFQAAAAAdAAAAABAD"));

        mutableProductList.setValue(productList);
    }
}
