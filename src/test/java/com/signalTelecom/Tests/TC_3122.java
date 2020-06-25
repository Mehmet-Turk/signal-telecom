package com.signalTelecom.Tests;

import com.signalTelecom.Utilities.AllPages;
import com.signalTelecom.Utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_3122 extends TestBase{
    AllPages allPages = new AllPages();

    @Test
    public void totalprice(){
        allPages.homePage().shopText.click();
        allPages.shopPage().firstProduct.click();
        allPages.shopPage().addToCart.click();
        allPages.shopPage().ViewCart.click();
        allPages.cartPage().plusButton.click();
        allPages.cartPage().updateCart.click();

        //Assert.assertTrue(allPages.cartPage().totalPrice.isDisplayed());
        //System.out.println(allPages.cartPage().totalPrice.isDisplayed());
        Assert.assertEquals(allPages.cartPage().totalPrice.getText(),"$800.00");
    }

}
