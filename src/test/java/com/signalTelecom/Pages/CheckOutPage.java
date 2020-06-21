package com.signalTelecom.Pages;

import com.signalTelecom.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
    public CheckOutPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "billing_first_name")
    public WebElement firstNameText;
    @FindBy(linkText = "Click here to login")
    public WebElement loginText;
}
