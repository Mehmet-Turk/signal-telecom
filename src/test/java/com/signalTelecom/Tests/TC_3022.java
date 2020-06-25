package com.signalTelecom.Tests;

import com.signalTelecom.Utilities.AllPages;
import com.signalTelecom.Utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class TC_3022 extends TestBase {
    AllPages allPages = new AllPages();
    @Test
    public void pdfTest() {
        allPages.homePage().shopText.click();
        String price01 = allPages.shopPage().priceOfItemOnTheList.getText();
        allPages.shopPage().firstProduct.click();
        String price02 = allPages.shopPage().priceOfItemInItemPage.getText();
        Assert.assertTrue(price01.equals(price02));
    }
}
