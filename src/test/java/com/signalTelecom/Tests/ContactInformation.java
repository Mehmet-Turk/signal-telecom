package com.signalTelecom.Tests;
import com.signalTelecom.Utilities.AllPages;
import com.signalTelecom.Utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
public class ContactInformation extends TestBase {
    AllPages allPages = new AllPages();
    @Test
    public void contactInformationTest(){
        allPages.homePage().contactText.click();
        String ActualEmailAdress=allPages.contactPage().emailText.getText();
        String ExpectedEmailAddress= "sales@signal-telecom.com";
        Assert.assertEquals(ActualEmailAdress,ExpectedEmailAddress);
        String ActualPhoneNumber= allPages.contactPage().phoneNumberText.getText();
        String ExpectedPhoneNumber="+1-610-863-1530";
        Assert.assertEquals(ActualPhoneNumber,ExpectedPhoneNumber);
    }
}
