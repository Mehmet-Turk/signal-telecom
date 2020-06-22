package com.signalTelecom.Pages;

import com.signalTelecom.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DistributorshipPage {
    public DistributorshipPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//div[@class='box-text text-center']")
    public List<WebElement> distributorshipList;
}
