package com.signalTelecom.Tests;

import com.signalTelecom.Utilities.AllPages;
import com.signalTelecom.Utilities.ConfigReader;
import com.signalTelecom.Utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_444 extends TestBase {
    AllPages allPages = new AllPages();
    @Test(groups = "regression1")
    public void FillOutForm(){
        allPages.homePage().contactText.click();
        allPages.contactPage().yourEmailCheckbox.sendKeys("123@gmail");
        allPages.contactPage().sendButton.click();
        String Actual = allPages.contactPage().emailErrorMessage.getText();
        Assert.assertEquals(Actual, ConfigReader.getProperty("contactPage_error_message"));
    }
}
