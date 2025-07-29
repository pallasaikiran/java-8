package org.example;

import org.example.model.User;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Stream<User> usersStream = Stream.of(new User("Alice", true),
                new User("Bob", false),
                new User("Carline", true),
                new User("David", false)
        );

        // filter active users
        Stream<User> activeUsers = usersStream.filter(User::isActive);
        activeUsers.forEach(System.out::println);

    }
}