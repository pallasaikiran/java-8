package org.example.testDataForModelClaases;

import org.example.model.Product;

import java.util.stream.Stream;

public class ProductTestData {

    public static Stream<Product> getProductssStream(){
        return Stream.of(
                new Product("Laptop", 60000, true),
                new Product("Mobile Phone",25000, true),
                new Product("headphones",4000,false),
                new Product("Monitor", 10000, true)
        );
    }
}
