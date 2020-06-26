package com.signalTelecom.Pages;

import com.signalTelecom.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopPage {
    public ShopPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(linkText = "Quintum DX2016 2T1/E1 Multipatch Switch w/16 VoIP Channels")
    public WebElement firstProduct;
    @FindBy(name = "add-to-cart")
    public WebElement addToCart;
    @FindBy(xpath = "//a[@class='button checkout wc-forward']")
    public WebElement checkOut;
    @FindBy(xpath = "(//a[@class='button wc-forward'])[1]")
    public WebElement ViewCart;
    @FindBy(xpath = "//a[contains(text(),'DigitalDXuserguide.pdf')]")
    public WebElement pdfDoc;
    @FindBy(xpath = "(//span[@class='woocommerce-Price-amount amount'])[3]")
    public WebElement priceOfItemOnTheList;
    @FindBy(xpath = "(//span[@class='woocommerce-Price-amount amount'])[3]")
    public WebElement priceOfItemInItemPage;
    @FindBy (xpath = "(//img[@class='attachment-shop_catalog size-shop_catalog wp-post-image'])[1]")
    public WebElement image01;
    @FindBy (xpath = "(//a[@class='quick-view quick-view-added'])[1]")
    public WebElement quickView;
    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement addToCartInQuickView;
    @FindBy(xpath = "//a[contains(text(),'Quintum DX2016 2T1/E1 Multipatch Switch w/16 VoIP Channels')]")
    public WebElement nameOfProduckInShopPage;
    @FindBy(xpath = "(//h2)[1]")
    public WebElement nameOfProductInItemPage;

}
