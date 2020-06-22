package com.signalTelecom.Tests;

import com.signalTelecom.Utilities.AllPages;
import com.signalTelecom.Utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginFunctionality extends TestBase {
    AllPages allPages = new AllPages();
    @Test
    public void loginNegativeTest(){
        allPages.homePage().shopText.click();
        allPages.shopPage().firstProduct.click();
        allPages.shopPage().addToCart.click();
        allPages.shopPage().checkOut.click();
        allPages.checkOutPage().loginText.click();
        allPages.checkOutPage().userName.sendKeys("Ali Said");
        allPages.checkOutPage().password.sendKeys("123abc456");
        allPages.checkOutPage().loginButton.click();
        Assert.assertTrue(allPages.checkOutPage().errorMessage.getText().contains("ERROR"));



    }
}
