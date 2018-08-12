package com.sysco.WebUIAutomationAssignment.functions;

import com.sysco.WebUIAutomationAssignment.common.Constants;
import com.sysco.WebUIAutomationAssignment.pages.LogintoAccountPage;
import com.sysco.WebUIAutomationAssignment.utils.DriverSetUpUtil;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by Rifad on 5/21/18.
 */
public class Login {

    // public static LoginPage ogmLoginPage = new LoginPage();
    public static LogintoAccountPage loginPage = new LogintoAccountPage();




    public static boolean loginVisibilty() {
        return loginPage.loginVisibilty();
    }

    public static void validationLoginCredentials(String username , String password){
        loginPage.validationLoginCredentials(username,password);
    }

    public static String getLoginUsernameValidationMessage(){
        return loginPage.getLoginUsernameValidationMessage();
    }

    public static String getWelcomeSubtitle (){
        return loginPage.getWelcomeSubtitle();
    }




    public static void quiteDriver() {
        loginPage.quitDriver();
    }

    public static void loginToFtr() {

    }
}
