// File: account/src/main/java/com/cognizant/account/Controller/AccountController.java
package com.cognizant.account.Controller; // Changed

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.cognizant.account.Model.Account; // Added import

@RestController
public class AccountController {

    @GetMapping("/accounts/{number}")
    public Account getAccountDetails(@PathVariable String number) {
        return new Account("00987987973432", "savings", 234343);
    }
}