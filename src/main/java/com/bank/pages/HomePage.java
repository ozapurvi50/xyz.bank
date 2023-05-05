package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By managerLogin = By.xpath("//button[normalize-space()='Bank Manager Login']");

    By customerLogin = By.xpath("//button[normalize-space()='Customer Login']");


    public void clickOnManagerLogin() {
        clickOnElement(managerLogin);
    }


    public void clickOnCustomerLogin() {
        clickOnElement(customerLogin);
    }
}
