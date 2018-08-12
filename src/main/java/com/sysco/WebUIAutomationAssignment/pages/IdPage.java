package com.sysco.WebUIAutomationAssignment.pages;

import com.syscolab.qe.core.ui.SyscoLabUI;
import com.syscolab.qe.core.ui.web.SyscoLabWUI;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;

/**
 * Created by Dileesha
 */
public class IdPage {
    protected static SyscoLabUI syscoLabUIOgm;
    private By txtGoogleSearch = By.id("lst-ib");
    private static  By btnEnterBirthDate = By.id("age_confirm_btn");
    private static  By ddBirthDay = By.id("age_select_day");
    private static  By ddBirthMonth = By.id("age_select_month");
    private static  By ddBirthYear = By.id("age_select_year");
    private static  By txtLessThanEighteenAge = By.xpath("//*[@id=\"age_missing_message\"]/span");
    private static  By lnkMyAccount = By.xpath("//*[@title=\"My Account\"]");

    private static  By btnLogin = By.xpath("//*[@class=\"buttons-set\"]/button[@type=\"submit\"]");
    private static  By txtUsername = By.xpath("//*[@name=\"login[username]\"]");
    private static  By txtPassword = By.xpath("//*[@name=\"login[password]\"]");
    private static  By txtInvalidUserNameMessage = By.id("advice-validate-email-email");

    private static  By txtWelcomeSubtitle = By.xpath("//*[@class=\"welcome-msg\"]/h2");

    public static void ageAuthorization(Capabilities capabilities, String url) {
        syscoLabUIOgm = new SyscoLabWUI(capabilities);
        syscoLabUIOgm.navigateTo(url);
        syscoLabUIOgm.driver.manage().window().maximize();
    }



    public void setDay(String day) {
        syscoLabUIOgm.select(ddBirthDay,day);
    }

    public void setMonth(String month) {
        syscoLabUIOgm.select(ddBirthMonth,month);
    }

    public void setYear(String year) {
        syscoLabUIOgm.select(ddBirthYear,year);
    }

    public void clickEnterbutton() {
        //syscoLabUIOgm.select(ddBirthYear);
        syscoLabUIOgm.click(btnEnterBirthDate);
    }



    public String getLessthanEighteenError(){
        syscoLabUIOgm.waitTillElementLoaded(txtLessThanEighteenAge);
        return syscoLabUIOgm.getText(txtLessThanEighteenAge);
    }



    public void navigateToMyAccount(){
        syscoLabUIOgm.waitTillElementLoaded(lnkMyAccount);
        syscoLabUIOgm.click(lnkMyAccount);
    }

    public boolean loginVisibilty(){
        return syscoLabUIOgm.isDisplayed(btnLogin);
    }

    public static void validationLoginCredentials(String username,String password){
        //syscoLabUIOgm.waitTillElementLoaded(txtUsername);
        //syscoLabUIOgm.waitTillElementLoaded(btnLogin);
        syscoLabUIOgm.sendKeys(txtUsername,username);
        syscoLabUIOgm.sleep(2);
        syscoLabUIOgm.sendKeys(txtPassword,password);
        syscoLabUIOgm.sleep(2);
        syscoLabUIOgm.click(btnLogin);
        syscoLabUIOgm.sleep(2);
    }

    public static void clearText(){
        //syscoLabUIOgm.waitTillElementLoaded(txtUsername);
        //syscoLabUIOgm.waitTillElementLoaded(btnLogin);
        syscoLabUIOgm.clear(txtUsername);
        syscoLabUIOgm.sleep(2);
        syscoLabUIOgm.clear(txtPassword);
        syscoLabUIOgm.sleep(2);

    }

    public String getLoginUsernameValidationMessage(){
        //syscoLabUIOgm.waitTillElementLoaded(txtLessThanEighteenAge);
        return syscoLabUIOgm.getText(txtInvalidUserNameMessage);
    }

    public String getWelcomeSubtitle (){
        return syscoLabUIOgm.getText(txtWelcomeSubtitle);
    }


    public void quitDriver() {
        if (syscoLabUIOgm != null) {
            syscoLabUIOgm.quit();
        }
    }


}
