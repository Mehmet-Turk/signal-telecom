package com.signalTelecom.Tests;

import com.signalTelecom.Utilities.AllPages;
import com.signalTelecom.Utilities.ConfigReader;
import com.signalTelecom.Utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_432 extends TestBase {
    AllPages allPages = new AllPages();
    @Test
    public void contactInformationTest(){
        allPages.homePage().contactText.click();
        String ActualEmailAddress=allPages.contactPage().emailText.getText();
        Assert.assertEquals(ActualEmailAddress, ConfigReader.getProperty("email"));
        String ActualPhoneNumber= allPages.contactPage().phoneNumberText.getText();
        Assert.assertEquals(ActualPhoneNumber,ConfigReader.getProperty("phone_number"));
    }

}
