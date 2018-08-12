package com.sysco.WebUIAutomationAssignment.pages;

import com.syscolab.qe.core.ui.web.SyscoLabWUI;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;

/**
 * Created by Dileesha
 */

public class CartPage extends IdPage  {
    //protected static SyscoLabUI syscoLabUIOgm;
    protected static Capabilities capabilities ;
    private By txtItemName =By.xpath("//h2[@class=\"product-name\"]/a");
    private By btnProccedToCheckout = By.xpath("//div[@class=\"payment-types bottom\"]/ul/li[2]/button");
    private By txtFirstName = By.id("billing:firstname");
    private By txtLastName = By.id("billing:lastname");
    private By txtCartEmpty = By.id("//p[@class=\"cart-empty\"]");
    private By btnRemove = By.id("Remove item");
    private By btnCart = By.xpath("//span[@id=\"cartHeader\"]");
    private By btnCheckout = By.xpath("//button[@class=\"button\"]/span/span");



    public String getItemName (){
        return syscoLabUIOgm.getText(txtItemName);
    }

    public void clickProceedTOCheckout (){
         syscoLabUIOgm.click(btnProccedToCheckout);
    }

    public String getFirstName (){
        syscoLabUIOgm.sleep(5);
        return syscoLabUIOgm.getValue(txtFirstName);
    }

    public String getLastName (){
        return syscoLabUIOgm.getValue(txtLastName);
    }

    public void clickemoveItem (){
        if(syscoLabUIOgm.isDisplayed(btnRemove)){
            System.out.print("PPPPPP");
            syscoLabUIOgm.click(btnRemove);
            syscoLabUIOgm.sleep(5);
        }
    }

    public void clickCartButton (){
        syscoLabUIOgm.click(btnCart);
    }

    public void clickCheckout (){
        syscoLabUIOgm.click(btnCheckout);
    }


    public void quitDriver() {
        if (syscoLabUIOgm != null) {
            syscoLabUIOgm.quit();
        }
    }


}
