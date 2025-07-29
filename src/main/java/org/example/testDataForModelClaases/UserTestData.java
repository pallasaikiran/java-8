package org.example.testDataForModelClaases;

import org.example.model.User;

import java.util.stream.Stream;

public class UserTestData {

    public static Stream<User> getUsersStream() {

        return Stream.of(new User("Alice", true),
                new User("Bob", false),
                new User("Carline", true),
                new User("David", false)
        );
    }
}
