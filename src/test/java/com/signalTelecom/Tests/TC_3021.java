package com.signalTelecom.Tests;

import com.signalTelecom.Utilities.AllPages;
import com.signalTelecom.Utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Set;

public class TC_3021 extends TestBase {
    AllPages allPages = new AllPages();
    @Test
    public void pdfTest() {
        allPages.homePage().shopText.click();
        allPages.shopPage().firstProduct.click();
        String pdfName = allPages.shopPage().pdfDoc.getText();
        allPages.shopPage().pdfDoc.click();
        Set<String> tabs = driver.getWindowHandles();
        driver.switchTo().window(tabs.toArray()[1].toString());
        Assert.assertTrue(driver.getCurrentUrl().contains(pdfName));
    }
}
