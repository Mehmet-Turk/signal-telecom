package com.signalTelecom.Tests;

import com.signalTelecom.Utilities.AllPages;
import com.signalTelecom.Utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_433 extends TestBase {
    AllPages allPages = new AllPages();
    @Test
    public void FillOutForm(){
        allPages.homePage().contactText.click();
        allPages.contactPage().yourNameCheckbox.sendKeys("Ahmet Ozen");
        allPages.contactPage().yourEmailCheckbox.sendKeys("123@gmail.com");
        allPages.contactPage().subjectCheckbox.sendKeys("Price");
        allPages.contactPage().yourMessageArea.sendKeys("I want to take more information about price");
        allPages.contactPage().sendButton.click();
        Assert.assertTrue(allPages.contactPage().errorMessage.isDisplayed());
    }
}
