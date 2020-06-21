package com.signalTelecom.Utilities;

import com.signalTelecom.Pages.CheckOutPage;
import com.signalTelecom.Pages.HomePage;
import com.signalTelecom.Pages.ShopPage;

public class AllPages {

//    public EnablePage enablePage(){
//        if(enablePage==null){
//            enablePage = new EnablePage();
//        }return enablePage;
//    }
    protected HomePage homePage;
    protected ShopPage shopPage;
    protected CheckOutPage checkOutPage;



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



}
