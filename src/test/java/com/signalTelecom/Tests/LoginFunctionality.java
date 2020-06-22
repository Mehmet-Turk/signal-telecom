package com.signalTelecom.Tests;

import com.signalTelecom.Utilities.AllPages;
import com.signalTelecom.Utilities.TestBase;
import org.testng.annotations.Test;

public class LoginFunctionality extends TestBase {
    AllPages allPages = new AllPages();
    @Test
    public void loginPositiveTest(){
        allPages.homePage().shopText.click();
        allPages.shopPage().firstProduct.click();
        allPages.shopPage().addToCart.click();
        allPages.shopPage().checkOut.click();
        allPages.checkOutPage().loginText.click();
        System.out.println("Mehmet");
        System.out.println("II Mehmet");
        System.out.println("I.Zafer");

    }
}
