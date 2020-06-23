package com.signalTelecom.Utilities;

import com.signalTelecom.Pages.*;

public class AllPages {

    protected HomePage homePage;
    protected ShopPage shopPage;
    protected CheckOutPage checkOutPage;
    protected  DistributorshipPage distributorshipPage;
    protected ContactPage contactPage;
    public ContactPage contactPage(){
        if (contactPage == null){
            contactPage = new ContactPage();
        }
        return contactPage;
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
