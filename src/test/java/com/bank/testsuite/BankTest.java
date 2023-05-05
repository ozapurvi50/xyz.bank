package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import com.bank.utility.Utility;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankTest extends BaseTest {

    //Object creation for AccountPage
    AccountPage accPage = new AccountPage();

    //Object creation for AddCustomerPage
    AddCustomerPage addCustomerPage = new AddCustomerPage();

    //Object creation for BankManagerLoginPage
    BankManagerLoginPage managerLoginPage = new BankManagerLoginPage();

    //Object creation for CustomerLoginPage
    CustomerLoginPage customerLoginPage = new CustomerLoginPage();

    //Object creation for CustomerPage
    CustomerPage customerPage = new CustomerPage();

    //Object creation for omePage
    HomePage homePage = new HomePage();

    //Object creation for OpenAccountPage
    OpenAccountPage openAccountPage = new OpenAccountPage();

    //Object creation for Utility
    Utility utility = new Utility();

    @Test
    /** 1.bankManagerShouldAddCustomerSuccessfully.*/

    public void bankManagerShouldAddCustomerSuccessfully() {

        //* Click On "Bank Manager Login" Tab
        homePage.clickOnManagerLogin();
        //* Click On "Add Customer" Tab
        managerLoginPage.clickAddCustomer();
        //* Enter FirstName
        addCustomerPage.sendNameToElement("Primmmeee");
        //* Enter LastName
        addCustomerPage.sendLastNameToElement("Testinggg");
        //* Enter PostCode
        addCustomerPage.sendPostCodeToElement("DA12 4EP");
        //* Click On "Add Customer" Button
        addCustomerPage.clickAddCustomer();
        //* Popup display
        utility.switchToAlert();
        //* Verify message "Customer added successfully"
        utility.getTextFromAlert();
        Assert.assertEquals(getTextFromAlert(), "Customer added successfully with customer id :6");
        //* Click on "ok" button on popup.
        utility.acceptAlert();
    }

    @Test
    /**2. bankManagerShouldOpenAccountSuccessfully.*/

    public void bankManagerShouldOpenAccountSuccessfully() {

        //* Click On "Bank Manager Login" Tab
        homePage.clickOnManagerLogin();
        //* click On "Open Account" Tab
        managerLoginPage.clickOpenAccount();
        //* Search customer that created in first test
        openAccountPage.selectCustomer("Ron Weasly ");
        //* Select currency "Pound"
        openAccountPage.selectCurrency("Pound");
        //* Click on "process" button
        openAccountPage.clickProcess();
        //* Popup displayed
        utility.switchToAlert();
        //* Verify message "Account created successfully"
        utility.getTextFromAlert();
        Assert.assertEquals(getTextFromAlert(), "Account created successfully with account Number :1016");
        //* Click on "ok" button on popup.
        utility.acceptAlert();

    }

    @Test
    /**3. customerShouldLoginAndLogoutSuceessfully. */

    public void customerShouldLoginAndLogoutSuccessfully() {

        //* Click on "Customer Login" Tab
        homePage.clickOnCustomerLogin();
        //* Search customer that you created.
        customerPage.selectCustomer("Ron Weasly ");
        //* Click on "Login" Button
        customerPage.clickOnLogin();
        //* Verify "Your Name" text displayed.
        Assert.assertEquals(customerLoginPage.getMessage(), "Albus Dumbledore");
        //* Verify "Logout" Tab displayed.
        Assert.assertEquals(customerLoginPage.getMessage1(), "Logout");
        //* Click on "Logout"
        customerLoginPage.clickOnOut();
        //* Verify "Your Name" text displayed.
        Assert.assertEquals(customerLoginPage.getMessage2(), "Your Name :");
    }

    @Test
    /**4. customerShouldDepositMoneySuccessfully. */

    public void customerShouldDepositMoneysuccessfully() {

        //* Click on "Customer Login" Tab
        homePage.clickOnCustomerLogin();
        //* Search customer that you created.
        customerPage.selectCustomer("Ron Weasly");
        //* Click on "Login" Button
        customerPage.clickOnLogin();
        // * Click on "Deposit" Tab
        accPage.clickOnDeposit();
        // * Enter amount £200
        accPage.sendAmount("200");
        // * Click on "Deposit" Button
        accPage.submitButton();
        // * Verify message "Deposit Successful"
        Assert.assertEquals(customerLoginPage.getMessage3(), "Deposit Successful");
        //* Click on logout
        customerLoginPage.clickOnOut();
    }

    @Test
    /**  5. customerShouldWithdrawMoneySuccessfully */

    public void customerShouldWithdrawMoneySuccessfully() {

        //* Click on "Customer Login" Tab
        homePage.clickOnCustomerLogin();
        //* Search customer that you created.
        customerPage.selectCustomer("Ron Weasly ");
        //* Click on "Login" Button
        customerPage.clickOnLogin();
        //* Click on "Withdrawl" Tab
        accPage.clickOnWithdrawl();
        //* Enter amount £50
        accPage.sendAmount("50");
        //* Click on "Deposit" Button
        accPage.submitButton();
        //* Verify message "Transaction Successful"
        Assert.assertEquals(accPage.getMessage2(), "Transaction Failed. You can not withdraw amount more than the balance.");
        //* Click on logout
        customerLoginPage.clickOnOut();

    }


}
