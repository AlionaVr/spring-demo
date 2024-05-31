package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


// Lombok which helps us to not write boilerplate code
@Getter
@Setter
@AllArgsConstructor
@ToString


// Data Transfer Object (DTO) or POJO (Plain Old Java Object)
public class ProductDto {
    private String name;
    private String price;


    // This is not needed anymore, because we are using Lombok !!!!
/*    @Override
    public String toString() {
        return "ProductDto{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public ProductDto(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }*/
}