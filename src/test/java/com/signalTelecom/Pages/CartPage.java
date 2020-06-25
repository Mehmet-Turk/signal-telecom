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
    @FindBy(xpath = "(//a[@class='remove'])[2]")
    public  WebElement removeButton;
    @FindBy (xpath = "//div[@class='woocommerce-message container']")
    public WebElement removeVerify;
    @FindBy(xpath = "(//input[@type='button'])[1]")
    public WebElement minusButton;
    @FindBy(xpath = "(//input[@type='button'])[2]")
    public WebElement plusButton;
    @FindBy (name = "update_cart")
    public WebElement updateCart;
    @FindBy (xpath = "//p[@class='cart-empty lead']")
    public WebElement emptyCart;
    @FindBy (xpath = "(//span[@class='woocommerce-Price-amount amount'])[1]")
    public WebElement totalPrice;



}
