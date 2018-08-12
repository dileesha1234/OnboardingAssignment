package com.sysco.WebUIAutomationAssignment.functions;

import com.sysco.WebUIAutomationAssignment.common.Constants;
import com.sysco.WebUIAutomationAssignment.pages.IdPage;
import com.sysco.WebUIAutomationAssignment.utils.DriverSetUpUtil;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by Dileesha on 5/21/18.
 */
public class Id {

   // public static LoginPage ogmLoginPage = new LoginPage();
    public static IdPage ogmIdPage = new IdPage();


    public static void ageAuthorization() {

        if (Constants.RUN_LOCALLY) {
            DriverSetUpUtil.setToRunLocally();
            DesiredCapabilities capabilities = null;
            ogmIdPage.ageAuthorization(capabilities, Constants.APP_URL);
        } else {
            ogmIdPage.ageAuthorization(DriverSetUpUtil.setToRunRemotely(Constants.APP_OS), Constants.APP_URL);
        }
    }

    public static void setBirthDate(String day , String month , String year) {
        ogmIdPage.setDay(day);
        ogmIdPage.setMonth(month);
        ogmIdPage.setYear(year);
        ogmIdPage.clickEnterbutton();
    }

    public static String  getLessthanEighteenError(){
        return ogmIdPage.getLessthanEighteenError();
    }

    public static void navigateToMyAccount() {
        ogmIdPage.navigateToMyAccount();
    }

    public static boolean loginVisibilty() {
        return ogmIdPage.loginVisibilty();
    }

    public static void validationLoginCredentials(String username , String password){
         ogmIdPage.validationLoginCredentials(username,password);
    }

    public static void clearDataInTextBox(){
        ogmIdPage.clearText();
    }

    public static String getLoginUsernameValidationMessage(){

        return ogmIdPage.getLoginUsernameValidationMessage();
    }

    public static String getWelcomeSubtitle (){
        return ogmIdPage.getWelcomeSubtitle();
    }




    public static void quiteDriver() {
        ogmIdPage.quitDriver();
    }

    public static void loginToFtr() {

    }
}
