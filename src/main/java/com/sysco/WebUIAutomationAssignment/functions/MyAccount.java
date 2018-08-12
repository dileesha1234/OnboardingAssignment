package com.sysco.WebUIAutomationAssignment.functions;

import com.sysco.WebUIAutomationAssignment.common.Constants;
import com.sysco.WebUIAutomationAssignment.pages.MyAccountpage;
import com.sysco.WebUIAutomationAssignment.utils.DriverSetUpUtil;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by Rifad on 5/21/18.
 */
public class MyAccount{

   // public static LoginPage ogmLoginPage = new LoginPage();
    public static MyAccountpage myAccountPage = new MyAccountpage();


    public static void setCapability(){
        Capabilities capabilities = null;
        myAccountPage.setCapabiitly();
        //myAccountPage.clickBottleShopitem();
    }

    public static void selectCategory(){
        myAccountPage.clickProducts();
       // myAccountPage.clickBottleShopitem();
    }

    public static void selectItem(){
        myAccountPage.clickItem();
       // myAccountPage.clickBottleShopitem();
    }

    public static void addTOCArt(){
        myAccountPage.clickAddToCartBtn();
    }

    public static void chekout(){
        myAccountPage.clickCheckoutBtn();
    }
    public static String getWelcomeTitle(){
        return myAccountPage.getWelcomeSubtitle();
    }

    public static String getItemName (){
        return myAccountPage.getItemName();
    }

    public static void quiteDriver() {
        myAccountPage.quitDriver();
    }


}
