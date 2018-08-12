package com.sysco.WebUIAutomationAssignment.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;

/**
 * Created by Dileesha
 */

public class CheckoutPage extends IdPage  {
    //protected static SyscoLabUI syscoLabUIOgm;
    protected static Capabilities capabilities ;
    private By btnContinueBillingNShipping =By.id("delivery-address-button");
    private By btnContinueDeliveryOption =By.xpath("//button[@id=\"shipping-method-button\"]");
    private By btnCreditCard =By.xpath("//label[@for=\"p_method_braintree\"]");
    private By btnPurchaseMyOrder =By.id("payment-method-button");
    private By txtCreditCardRequiredValidation =By.id("advice-required-entry-braintree_cc_number");
    private By txtCVVRequiredValidationMessage =By.id("advice-required-entry-braintree_cc_cid");
    private By txtInvalidCreditCardNumberMessage =By.id("advice-validate-cc-number-braintree_cc_number");
    private By txtCreditCardNumber =By.id("braintree_cc_number");
    private By txtCVVNumber = By.xpath("//div[@class=\"v-fix ccv\"]/input[@title=\"Card Verification Number\"]");
    private By lblStayInTouch = By.xpath("//*[contains(text(),'STAY IN TOUCH')]");
    private By chkAgreeTerms= By.xpath("//input[@id=\"agreement-1\"]");


    public void clickContinueBillingNShipping (){
         syscoLabUIOgm.click(btnContinueBillingNShipping);
    }

    public void clickContinueDeliveryOption (){
        syscoLabUIOgm.waitTillElementLoaded(btnContinueDeliveryOption);
        syscoLabUIOgm.click(btnContinueDeliveryOption);
    }

    public void clickcreditCardOption (){
        syscoLabUIOgm.sleep(3);
        syscoLabUIOgm.click(btnCreditCard);
    }

    public void clickPurchaseMyOrder (){
        syscoLabUIOgm.sleep(3);
        syscoLabUIOgm.click(btnPurchaseMyOrder);
    }

    public String getCCRequiredValidationMessage (){
        //syscoLabUIOgm.sleep(2);
        return syscoLabUIOgm.getText(txtCreditCardRequiredValidation);
    }

    public String getCVVRequiredValidationMessage (){
        //syscoLabUIOgm.sleep(2);
        return syscoLabUIOgm.getText(txtCVVRequiredValidationMessage);
    }

    public String getInvalidCCNumberRequiredValidationMessage (){
        //syscoLabUIOgm.sleep(2);
        return syscoLabUIOgm.getText(txtInvalidCreditCardNumberMessage);
    }

    public void enterCreditCardNumber (String ccNumber){
        //syscoLabUIOgm.sleep(2);
        syscoLabUIOgm.sendKeys(txtCreditCardNumber,ccNumber);
    }

    public void enterCVVNumber (String cvvNumber){
        syscoLabUIOgm.sleep(2);
        syscoLabUIOgm.sendKeys(txtCVVNumber,cvvNumber);
    }

    public String getStayinTouchText (){
        //syscoLabUIOgm.sleep(2);
        return syscoLabUIOgm.getText(lblStayInTouch);
    }

    public void clickTermsAndConditions (){
        //syscoLabUIOgm.sleep(2);
         if(!syscoLabUIOgm.isSelected(chkAgreeTerms)){
             syscoLabUIOgm.click(chkAgreeTerms);
         }
    }




    public void quitDriver() {
        if (syscoLabUIOgm != null) {
            syscoLabUIOgm.quit();
        }
    }


}
