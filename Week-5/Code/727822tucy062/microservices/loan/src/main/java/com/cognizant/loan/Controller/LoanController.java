// File: loan/src/main/java/com/cognizant/loan/Controller/LoanController.java
package com.cognizant.loan.Controller; // Add this package

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.cognizant.loan.Model.Loan; // Add this import

@RestController
public class LoanController {

    @GetMapping("/loans/{number}")
    public Loan getLoanDetails(@PathVariable String number) {
        return new Loan("H00987987972342", "car", 400000, 3258, 18);
    }
}