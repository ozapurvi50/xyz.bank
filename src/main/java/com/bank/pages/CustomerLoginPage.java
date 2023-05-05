package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class CustomerLoginPage extends Utility {

    By getMessageObj = By.xpath("//span[@class='fontBig ng-binding']");

    By clickOnOutObj = By.xpath("//button[@class='btn logout']");

    By getMessage2Obj = By.xpath("//label[normalize-space()='Your Name :']");

    By messageDeposit = By.xpath("//span[@class='error ng-binding']");


    public String getMessage(){
        return getTextFromElement(getMessageObj);
    }

    public String getMessage1(){
        return getTextFromElement( clickOnOutObj);
    }

    public void clickOnOut(){
        clickOnElement( clickOnOutObj);
    }

    public String getMessage2(){
        return getTextFromElement(getMessage2Obj);
    }

    public String getMessage3(){
        return getTextFromElement(messageDeposit);
    }

}
