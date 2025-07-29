package org.example.testDataForModelClaases;

import org.example.model.Staff;

import java.math.BigDecimal;
import java.util.List;

public class StaffTestData {

    public static List<Staff> getListOfStaff(){
        return List.of(
                new Staff("Sai", 27, new BigDecimal(10000)),
                new Staff("Kiran", 30, new BigDecimal(20000)),
                new Staff("Balaji", 33, new BigDecimal(30000))
        );
    }
}
