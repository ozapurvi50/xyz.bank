package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class AccountPage extends Utility {
    By deposit = By.xpath("//button[normalize-space()='Deposit']");
    By submit = By.xpath("//button[@type='submit']");
    By amount = By.xpath("//input[@placeholder='amount']");

    By withdrawl = By.xpath("//button[normalize-space()='Withdrawl']");
    By message = By.xpath("//span[@class='error ng-binding']");
    public void clickOnDeposit(){
        clickOnElement(deposit);
    }

    public void sendAmount(String text){
        sendTextToElement(amount, text);
    }

    public void submitButton(){
        clickOnElement(submit);
    }

    public void clickOnWithdrawl(){
        clickOnElement(withdrawl);
    }

    public String getMessage2(){
        return getTextFromElement(message);
    }
}
