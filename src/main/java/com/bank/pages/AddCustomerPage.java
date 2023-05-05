package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class AddCustomerPage extends Utility {

    By name = By.xpath("//input[@placeholder='First Name']");
    By lastName = By.xpath("//input[@placeholder='Last Name']");

    By postcode = By.xpath("//input[@placeholder='Post Code']");
    By addCustomerButton = By.xpath("//button[@type='submit']");



    public void sendNameToElement(String text) {
        sendTextToElement(name, text);

    }

    public void sendLastNameToElement(String text) {
        sendTextToElement(lastName,text);

    }
    public void sendPostCodeToElement(String text) {
        sendTextToElement(postcode, text);
    }

    public void clickAddCustomer(){
        clickOnElement(addCustomerButton);
    }



}
