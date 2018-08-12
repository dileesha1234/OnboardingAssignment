package com.sysco.WebUIAutomationAssignment.functions;

import com.sysco.WebUIAutomationAssignment.pages.CheckoutPage;
import org.openqa.selenium.Capabilities;

/**
 * Created by Dileesha .
 */
 public class Checkout {

   // public static LoginPage ogmLoginPage = new LoginPage();
    public static CheckoutPage checkoutPage = new CheckoutPage();


    public static void clickContinueBillingNShipping() {
        checkoutPage.clickContinueBillingNShipping();
    }

    public static void clickContinueDeliveryOption() {
        checkoutPage.clickContinueDeliveryOption();
    }

    public static void clickCreditCardOption() {
        checkoutPage.clickcreditCardOption();
    }

    public static void clickPurchaseMyOrder() {
        checkoutPage.clickPurchaseMyOrder();
    }

    public static String getCCRequiredValidationMessage () {
        return checkoutPage.getCCRequiredValidationMessage();
    }

    public static String getCVVRequiredValidationMessage () {
        return checkoutPage.getCVVRequiredValidationMessage();
    }

    public static String getInvalidCCNumberRequiredValidationMessage () {
        return checkoutPage.getInvalidCCNumberRequiredValidationMessage();
    }


    public static void enterCreditCardNumber (String ccNumber) {
         checkoutPage.enterCreditCardNumber(ccNumber);
    }

    public static void enterCVVNumber (String ccNumber) {
        checkoutPage.enterCVVNumber(ccNumber);
    }

    public static String getStayInTouchText () {
        return checkoutPage.getStayinTouchText();
    }
    public static void quiteDriver() {
        checkoutPage.quitDriver();
    }


 }
