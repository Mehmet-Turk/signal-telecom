package com.signalTelecom.Tests;

import com.signalTelecom.Utilities.AllPages;
import com.signalTelecom.Utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_3112 extends TestBase {
    AllPages allPages = new AllPages();
    @Test
    public void removeProduct() throws InterruptedException {
        allPages.homePage().shopText.click();
        allPages.shopPage().firstProduct.click();
        allPages.shopPage().addToCart.click();
        allPages.shopPage().ViewCart.click();
        allPages.cartPage().removeButton.click();
        // Thread.sleep(3000);
        //String verify = allPages.cartPage().removeVerify.getText();
        //Assert.assertEquals(verify.contains());
        Assert.assertTrue(allPages.cartPage().removeVerify.isDisplayed());

        System.out.println(allPages.cartPage().removeVerify.getText());

    }
}
