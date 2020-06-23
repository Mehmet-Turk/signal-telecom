package com.signalTelecom.Pages;
import com.signalTelecom.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ContactPage {
    public ContactPage(){ PageFactory.initElements(Driver.getDriver(),this); }
    @FindBy (xpath = "//h3[.='sales@signal-telecom.com']")
    public WebElement emailText;
}
