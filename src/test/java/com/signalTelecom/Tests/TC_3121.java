package com.signalTelecom.Tests;

import com.signalTelecom.Utilities.AllPages;
import com.signalTelecom.Utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_3121 extends TestBase {
    AllPages allPages = new AllPages();
    @Test
    public void emptyProduct(){
        allPages.homePage().shopText.click();
        allPages.shopPage().firstProduct.click();
        allPages.shopPage().addToCart.click();
        allPages.shopPage().ViewCart.click();
        allPages.cartPage().minusButton.click();
        allPages.cartPage().updateCart.click();

        Assert.assertTrue(allPages.cartPage().emptyCart.isDisplayed());
        System.out.println(allPages.cartPage().emptyCart.getText());
        System.out.println("Your cart is currently empty.");

    }


}
