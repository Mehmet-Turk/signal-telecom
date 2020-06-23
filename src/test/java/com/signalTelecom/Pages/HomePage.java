package com.signalTelecom.Pages;

import com.signalTelecom.Utilities.Driver;
import com.signalTelecom.Utilities.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public  HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//a[.='Shop'])[1]")
    public WebElement shopText;
    @FindBy(xpath = "(//a[.='Distributorship'])[1]")
    public WebElement distributorship;



}
