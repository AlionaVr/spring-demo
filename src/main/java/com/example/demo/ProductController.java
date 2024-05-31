package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

// Controller which contains endpoints
@RestController
public class ProductController {

    // State of our server
    private Integer counter = 0;
    private List<ProductDto> productDtos = new ArrayList<>(
            List.of(new ProductDto("юбка", "14.2"),
                    new ProductDto("джинсы", "44.1"))
    );

    // Endpoint of our server
    @GetMapping("/products")
    public List<ProductDto> getProducts() {
        System.out.println("Я отдала в интернетик: " + productDtos);
        return productDtos;
    }

    // Endpoint of our server
    @GetMapping("/counter")
    public Integer getCounter() {
        System.out.println(counter);
        return ++counter;
    }

    // Endpoint of our server
    @PostMapping("/products")
    public boolean saveProduct(@RequestBody ProductDto productDto) {
        return productDtos.add(productDto);
    }

    @GetMapping("/carsDistance")
    public double findCarsDistance(@RequestParam double car1Speed,
                                   @RequestParam double car2Speed,
                                   @RequestParam double initialDistance,
                                   @RequestParam double time){
        return initialDistance + (car1Speed + car2Speed) * time;
    }
}
