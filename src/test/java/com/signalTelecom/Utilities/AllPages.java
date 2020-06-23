package com.signalTelecom.Utilities;

import com.signalTelecom.Pages.*;

public class AllPages {

    protected HomePage homePage;
    protected ShopPage shopPage;
    protected CheckOutPage checkOutPage;
    protected  DistributorshipPage distributorshipPage;
    protected CartPage cartPage;


   public CartPage cartPage(){
       if(cartPage == null){
           cartPage = new CartPage();
       }
       return  cartPage;
   }
    public HomePage homePage(){
        if (homePage == null){
            homePage = new HomePage();
        }
        return homePage;
    }

    public ShopPage shopPage(){
        if (shopPage == null){
            shopPage = new ShopPage();
        }
        return shopPage;
    }

    public CheckOutPage checkOutPage(){
        if (checkOutPage == null){
            checkOutPage = new CheckOutPage();
        }
        return checkOutPage;
    }

    public DistributorshipPage distributorshipPage(){
        if (distributorshipPage == null ){
            distributorshipPage = new DistributorshipPage();
        }
        return distributorshipPage;
    }



}
