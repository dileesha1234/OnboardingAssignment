package com.sysco.WebUIAutomationAssignment.functions;

import com.sysco.WebUIAutomationAssignment.pages.CartPage;
import com.sysco.WebUIAutomationAssignment.pages.MyAccountpage;
import org.openqa.selenium.Capabilities;

/**
 * Created by Dileesha
 */
public class Cart {

   // public static LoginPage ogmLoginPage = new LoginPage();
    public static CartPage cartPage = new CartPage();
    public static MyAccountpage myAccountPage = new MyAccountpage();


    public static String getCartItemName (){
        return cartPage.getItemName();
    }

    public static String getFirstName (){

        return cartPage.getFirstName();
    }

    public static String getLastName (){
        return cartPage.getLastName();
    }

    public static void removeItems (){
        cartPage.clickCartButton();
        cartPage.clickCheckout();
        cartPage.clickemoveItem();

    }


    public static void ProceedToCheckout (){
        cartPage.clickProceedTOCheckout();
    }



}
