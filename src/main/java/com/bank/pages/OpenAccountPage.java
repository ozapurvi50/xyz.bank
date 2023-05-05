package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class OpenAccountPage extends Utility {

    By selectCustomer = By.cssSelector("#userSelect");

    By currency = By.cssSelector("#currency");

    By process = By.xpath("//button[@type='submit']");

    public void selectCustomer(String text) {
        selectByVisibleTextFromDropDown(selectCustomer, text);
    }

    public void selectCurrency(String text) {
        selectByVisibleTextFromDropDown(currency, text);
    }

    public void clickProcess() {
        clickOnElement(process);
    }


}