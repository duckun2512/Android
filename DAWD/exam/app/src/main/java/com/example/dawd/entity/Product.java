package com.example.dawd.entity;

import androidx.room.Entity;

@Entity
public class Product {
    @GeneratedValue
    private int id;
    private String name;
    private int quantity;
}
