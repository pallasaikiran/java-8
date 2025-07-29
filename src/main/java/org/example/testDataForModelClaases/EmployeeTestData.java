package org.example.testDataForModelClaases;

import org.example.model.Employee;

import java.util.stream.Stream;

public class EmployeeTestData {

    public static Stream<Employee> getEmployeeStream(){
        return Stream.of(
            new Employee("Rajesh", 35, "Engineering"),
            new Employee("", 28,"HR" ),
            new Employee("Vikram", 40, "Engineering"),
            new Employee("Meera", 25, "Sales")
        );
    }
}
