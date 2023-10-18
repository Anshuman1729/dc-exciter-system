package com.practiceprojects.dexciter.controller;

import com.practiceprojects.dexciter.entities.OperationModule;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class BusinessLogicController {

    @GetMapping("/execute-business-logic")
    public String executeBusinessLogic() {
        OperationModule operationModule = new OperationModule();

//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Enter field current value: ");
//        double fieldCurrent = in.nextDouble();
//
//        System.out.print("Enter terminal voltage value: ");
//        double terminalVoltage = in.nextDouble();

        // Call the method to execute your business logic
        String result = operationModule.executeBusinessLogic();

        return result;
    }
}
