package com.signalTelecom.Tests;

import com.signalTelecom.Utilities.AllPages;
import com.signalTelecom.Utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_3031 extends TestBase {
    AllPages allPages = new AllPages();
    @Test
    public void pdfTest() throws InterruptedException {
        allPages.homePage().shopText.click();
        allPages.shopPage().firstProduct.click();
        actions.moveToElement(allPages.shopPage().image01).perform();
        Thread.sleep(1000);
        allPages.shopPage().quickView.click();
        Thread.sleep(3000);
        System.out.println(allPages.shopPage().addToCartInQuickView.getText());
        Assert.assertTrue(allPages.shopPage().addToCartInQuickView.isDisplayed());
    }
}
