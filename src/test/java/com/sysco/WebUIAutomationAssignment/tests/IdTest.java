package com.sysco.WebUIAutomationAssignment.tests;


import com.sysco.WebUIAutomationAssignment.data.IdData;
import com.sysco.WebUIAutomationAssignment.data.LoginData;
import com.sysco.WebUIAutomationAssignment.functions.Cart;
import com.sysco.WebUIAutomationAssignment.functions.MyAccount;
import com.sysco.WebUIAutomationAssignment.functions.Id;
import com.sysco.WebUIAutomationAssignment.functions.Login;
import com.sysco.WebUIAutomationAssignment.functions.Checkout;
import com.sysco.WebUIAutomationAssignment.utils.ExcelUtil;
import com.sysco.WebUIAutomationAssignment.utils.TestBase;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class IdTest extends TestBase {

    @BeforeClass
    public void init(ITestContext iTestContext) {
        iTestContext.setAttribute("feature", "Login - ValidLogin");
        Id.ageAuthorization();
    }


    @Test (priority=1) //(description = "Validate less than 18 message")
    public void testValidationMessageLessThanEighteen() throws Exception {
        String month = "January";
        String day = "24";
        String year = "2003";
        //Id.ageAuthorization();
        Id.setBirthDate(day,month,year);
        Assert.assertEquals(Id.getLessthanEighteenError(),IdData.lessThanEighteenError,"Less than 18 - Validation");
        Thread.sleep(6000);

    }

    @Test (priority=2) //(description = "Validate less than 18 message")
    public void testValidationMessageGreaterThanEighteen() throws Exception {
        String month = "January";
        String day = "24";
        String year = "1997";

       // Id.ageAuthorization();
        Id.setBirthDate(day,month,year);
        Thread.sleep(10000);
        Assert.assertEquals(Id.getLessthanEighteenError(),IdData.greaterThanEighteenError,"Greater than 18 - Validation");
        Thread.sleep(6000);
    }

    @Test (priority=3)
    public void testMyAccountNavigation() throws Exception {
        String month = "February";
        String day = "24";
        String year = "1987";
        Id.setBirthDate(day,month,year);
        Thread.sleep(6000);
        Id.navigateToMyAccount();
        boolean value = Id.loginVisibilty();
        Assert.assertEquals(value,true,"booleanLogin button visibility");
    }


    @Test (priority=4)//(description = "Email and password validation")
    public void testCredetentialValidation() throws Exception {
        Thread.sleep(6000);
        Login.validationLoginCredentials(LoginData.invalidUserName,"12345");
        Assert.assertEquals(Login.getLoginUsernameValidationMessage(),IdData.invalidUsername,"Invalid UserName");
    }


    @Test (priority=5)//(description = "Login ")
    public void testLogin() throws Exception {
        Thread.sleep(100);
        //Id.clearDataInTextBox();
        Id.validationLoginCredentials("williamjacob802@gmail.com","12345678");
        Thread.sleep(6000);
        String value = MyAccount.getWelcomeTitle();
        System.out.print(value);
        Assert.assertEquals(value,"HELLO, WILLIAM JACOB!","boolean");

    }
/*
   @Test (priority=6)//(description = "Login ")
    public void testRemoveItems() throws Exception {
        Thread.sleep(100);
        Cart.removeItems();
    }*/

    @Test (priority=6)//(description = "Select Item ")
    public void testAddITem() throws Exception {
        Thread.sleep(6000);
        MyAccount.selectCategory();

        MyAccount.selectItem();
       // MyAccount.setCapability();
        String value =  MyAccount.getItemName();
        MyAccount.addTOCArt();

        System.out.print(value);
        MyAccount.chekout();

        Assert.assertEquals(value,"BUNDABERG BLACK 700ML","Item - verification - account page");
    }

    @Test (priority=7)//(description = "Select Item ")
        public void testCartPageItemDetails() throws Exception {
        Thread.sleep(6000);
        String value = Cart.getCartItemName();

        Assert.assertEquals(value,"BUNDABERG BLACK 700ML","Item Verification - cart page");
    }


    @Test (priority=8)//(description = "Select Item ")
    public void testFirstAndLastName() throws Exception {
        Thread.sleep(6000);
        Cart.ProceedToCheckout();
        Thread.sleep(8000);
        String firstName = Cart.getFirstName();
        String lastName = Cart.getLastName();

        Assert.assertEquals(firstName,"william","FirstName Verification - Checkout page");
        Assert.assertEquals(lastName,"jacob","LastName Verification - Checkout page");
    }


    @Test (priority=9)//(description = "Select Item ")
    public void testCredtiCardRequiredFields() throws Exception {
        Thread.sleep(6000);
        Checkout.clickContinueBillingNShipping();
        Checkout.clickContinueDeliveryOption();
        Checkout.clickCreditCardOption();
        Checkout.clickPurchaseMyOrder();
        String ccRequiredMessage = Checkout.getCCRequiredValidationMessage();
        String cvvRequiredMessage = Checkout.getCVVRequiredValidationMessage();
        Assert.assertEquals(ccRequiredMessage,"This is a required field.","Credit Card field - required");
        Assert.assertEquals(cvvRequiredMessage,"This is a required field.","CVV field - required");

    }

    @Test (priority=10)//(description = "Select Item ")
    public void testInvalidCreditCard() throws Exception {
        Thread.sleep(6000);

        Checkout.enterCreditCardNumber("12333333");
        Checkout.clickPurchaseMyOrder();
        String invalidCCmessage = Checkout.getInvalidCCNumberRequiredValidationMessage();
        //String cvvRequiredMessage = Checkout.getCVVRequiredValidationMessage();
        Assert.assertEquals(invalidCCmessage,"Please enter a valid credit card number.","Credit Card field - required");
        //Assert.assertEquals(cvvRequiredMessage,"This is a required field.","CVV field - required");
    }

    @Test (priority=11)//(description = "Select Item ")
    public void testPurchaseOrder() throws Exception {
        Thread.sleep(6000);
        Checkout.enterCreditCardNumber("4222222222222");
        Checkout.enterCVVNumber("123");
        Checkout.clickPurchaseMyOrder();
       // String value = Checkout.getStayInTouchText();

    }


}