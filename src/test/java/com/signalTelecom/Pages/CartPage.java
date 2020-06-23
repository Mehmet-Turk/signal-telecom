package com.signalTelecom.Pages;

import com.signalTelecom.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
  public CartPage(){
      PageFactory.initElements(Driver.getDriver(),this);

  }
  @FindBy(linkText = "Quintum DX2016 2T1/E1 Multipatch Switch w/16 VoIP Channels")
    public WebElement productName;

}
