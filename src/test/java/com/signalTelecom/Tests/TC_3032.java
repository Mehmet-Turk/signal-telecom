package com.signalTelecom.Tests;

import com.signalTelecom.Utilities.AllPages;
import com.signalTelecom.Utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_3032 extends TestBase {
    AllPages allPages = new AllPages();
    @Test
    public void pdfTest() throws InterruptedException {
        allPages.homePage().shopText.click();
        String name01 = allPages.shopPage().nameOfProduckInShopPage.getText();
        System.out.println(name01);
        allPages.shopPage().firstProduct.click();
        String name02 = allPages.shopPage().nameOfProductInItemPage.getText();
        System.out.println(name02);
        Assert.assertTrue(name01.equals(name02));
    }
}
