package com.sysco.WebUIAutomationAssignment.pages;

import com.syscolab.qe.core.ui.SyscoLabUI;
import com.syscolab.qe.core.ui.web.SyscoLabWUI;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;

/**
 * Created by Dileesha
 */
public class LogintoAccountPage extends IdPage{
    //protected static SyscoLabUI syscoLabUIOgm;
    private By txtGoogleSearch = By.id("lst-ib");


    private static  By btnLogin = By.xpath("//*[@class=\"buttons-set\"]/button[@type=\"submit\"]");
    private static  By txtUsername = By.xpath("//*[@name=\"login[username]\"]");
    private static  By txtPassword = By.xpath("//*[@name=\"login[password]\"]");
    private static  By txtInvalidUserNameMessage = By.id("advice-validate-email-email");

    private static  By txtWelcomeSubtitle = By.xpath("//*[@class=\"welcome-msg\"]/h2");

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


    public String getLoginUsernameValidationMessage(){
        //syscoLabUIOgm.waitTillElementLoaded(txtLessThanEighteenAge);
        return syscoLabUIOgm.getText(txtInvalidUserNameMessage);
    }

    public boolean loginVisibilty(){
        return syscoLabUIOgm.isDisplayed(btnLogin);
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
