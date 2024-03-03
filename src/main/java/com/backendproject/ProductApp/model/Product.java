package com.backendproject.ProductApp.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product extends BaseModel {

    private String title;
    private String description;
    private Long price;
    private int quantity;
    private Category category;
    private int rating;
}
