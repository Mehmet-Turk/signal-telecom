package com.signalTelecom.Tests;

import com.signalTelecom.Utilities.AllPages;
import com.signalTelecom.Utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_3101 extends TestBase {
    AllPages allPages = new AllPages();
    @Test
    public void productNameVerify(){
        allPages.homePage().shopText.click();
        allPages.shopPage().firstProduct.click();
        allPages.shopPage().addToCart.click();
        allPages.shopPage().ViewCart.click();
        Assert.assertEquals(allPages.cartPage().productName.getText(),allPages.shopPage().firstProduct.getText());
        System.out.println(allPages.cartPage().productName.getText());
        System.out.println(allPages.shopPage().firstProduct.getText());

    }


}
