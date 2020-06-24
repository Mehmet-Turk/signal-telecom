package com.signalTelecom.Pages;

import com.signalTelecom.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {
    public ContactPage(){ PageFactory.initElements(Driver.getDriver(),this); }
    @FindBy(xpath = "//h3[.='sales@signal-telecom.com']")
    public WebElement emailText;
    @FindBy (xpath = "//h3[.='+1-610-863-1530']")
    public WebElement phoneNumberText;
    @FindBy (xpath = "//input[@name='your-name']")
    public WebElement yourNameCheckbox;
    @FindBy (xpath = "//input[@name='your-email']")
    public WebElement yourEmailCheckbox;
    @FindBy(xpath = "//input[@name='your-subject']")
    public WebElement subjectCheckbox;
    @FindBy(xpath = "//textarea[@name='your-message']")
    public WebElement yourMessageArea;
    @FindBy(xpath = "//input[@value='Send']")
    public WebElement sendButton;
    @FindBy(xpath = "(//span[@class='wpcf7-not-valid-tip'])[2]")
    public WebElement emailErrorMessage;
    @FindBy (xpath = "//span[@role='alert']")
    public WebElement errorMessage;


}
