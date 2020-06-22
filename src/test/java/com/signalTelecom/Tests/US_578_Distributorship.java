package com.signalTelecom.Tests;

import com.signalTelecom.Utilities.AllPages;
import com.signalTelecom.Utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US_578_Distributorship extends TestBase {
    AllPages allPages = new AllPages();
    @Test
    public void numberOfDistributorship(){
        allPages.homePage().distributorship.click();
        Assert.assertEquals(allPages.distributorshipPage().distributorshipList.stream().count(), 5, "The Numbers is not same");
    }
    @Test
    public  void oneOfThem(){
        allPages.homePage().distributorship.click();
        Assert.assertTrue(allPages.distributorshipPage().distributorshipList.stream().anyMatch(t->t.getText().contains("Blackmagic Design")));
    }
}
