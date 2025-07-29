package org.example;

import org.example.model.Product;
import org.example.model.User;
import org.example.testDataForModelClaases.ProductTestData;
import org.example.testDataForModelClaases.UserTestData;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        

        // filter active users
        Stream<User> activeUsers = UserTestData.getUsersStream().filter(User::isActive);
        activeUsers.forEach(System.out::println);

        // filter products priced over 1000 and available in stock
        Stream<Product> filteredProducts = ProductTestData.getProductssStream().filter(p -> p.getPrice() > 1000 && p.isInStock());
        filteredProducts.forEach(System.out::println);
    }
}