package com.example.productservice.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class Product extends BaseModel {

    private Long id;
    private String title;
    private String description;
    private String price;
    private Category category;

   }
