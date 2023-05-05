package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class BankManagerLoginPage extends Utility {

    By clickAddCustomer = By.xpath("//button[normalize-space()='Add Customer']");

    By openAccount = By.xpath("//button[normalize-space()='Open Account']");



    public void clickAddCustomer(){
        clickOnElement(clickAddCustomer);
    }

    public void clickOpenAccount(){
        clickOnElement(openAccount);
    }


}
