package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class CustomerPage extends Utility {
    By login = By.xpath("//button[@type='submit']");
    By selectCustomer = By.cssSelector("#userSelect");
    public void selectCustomer(String text) {

        selectByVisibleTextFromDropDown(selectCustomer, text);
    }
    public void clickOnLogin(){
        clickOnElement(login);
    }

}