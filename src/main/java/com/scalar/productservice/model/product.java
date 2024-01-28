package com.scalar.productservice.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class product {
    private long id;
    private String title;
    private double price;
    private String discription;
    private String imageUrl;
    private category category;
}
