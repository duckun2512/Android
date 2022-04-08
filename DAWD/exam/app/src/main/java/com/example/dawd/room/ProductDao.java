package com.example.dawd.room;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.dawd.entity.Product;

import java.util.List;

@Dao
public interface ProductDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertProduct(Product product);

    @Query("SELECT * FROM Product")
    List<Product> findAll();
}
