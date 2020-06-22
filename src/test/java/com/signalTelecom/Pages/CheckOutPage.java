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
    public WebElement firstNameTextBox;
    @FindBy(linkText = "Click here to login")
    public WebElement loginText;
    @FindBy (id = "username")
    public WebElement userName;
    @FindBy(id = "password")
    public WebElement password;
    @FindBy(name = "login")
    public WebElement loginButton;
    @FindBy(xpath = "//ul[@class='woocommerce-error']")
    public WebElement errorMessage;
}
