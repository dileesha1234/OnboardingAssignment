package com.sysco.WebUIAutomationAssignment.pages;

import com.sysco.WebUIAutomationAssignment.functions.Id;
import com.syscolab.qe.core.ui.SyscoLabUI;
import com.syscolab.qe.core.ui.web.SyscoLabWUI;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;

/**
 * Created by Dileesha
 */

public class MyAccountpage extends IdPage  {
    //protected static SyscoLabUI syscoLabUIOgm;
    protected static Capabilities capabilities ;
    private By txtGoogleSearch = By.id("lst-ib");

    private static  By txtWelcomeSubtitle = By.xpath("//*[@class=\"welcome-msg\"]/h2");
    private static  By ddProdcuts = By.xpath("//a[contains(text(),'Products')]");
    private static  By ddBottleItem = By.xpath("/html/body/div[2]/div[3]/div[3]/div/div[2]/div[2]/div[2]/div[2]/div[1]/a/img");

    private static  By imgItem = By.xpath("/html/body/div[2]/div[3]/div[3]/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/a/img[1]");
          //  "//img[@class=\"product-tag-image product-tag-image-695\"]");
    private static  By txtItemName = By.xpath("//*[contains(text(),'Bundaberg Black 700ml ')]");
    private static  By btnAddtoCart = By.xpath("//button[@title=\"Add to Cart\"]");

    private static  By btnCheckout = By.xpath("//div[@class=\"actions\"]/button/span/span");

    public static void  setCapabiitly (){
         capabilities = null;
         syscoLabUIOgm = new SyscoLabWUI(capabilities);
         syscoLabUIOgm.getText(txtWelcomeSubtitle);
    }

    public String getWelcomeSubtitle (){
        return syscoLabUIOgm.getText(txtWelcomeSubtitle);
    }

    public void clickProducts (){
         syscoLabUIOgm.click(ddProdcuts);
    }
    public void clickBottleShopitem (){
        syscoLabUIOgm.click(ddBottleItem);
    }

    public void clickItem (){
        syscoLabUIOgm.click(imgItem);
    }

    public void clickAddToCartBtn (){
        syscoLabUIOgm.click(btnAddtoCart);
    }

    public void clickCheckoutBtn (){
        syscoLabUIOgm.waitTillElementLoaded(btnCheckout);
        syscoLabUIOgm.sleep(1);
        syscoLabUIOgm.click(btnCheckout);
    }
    public String getItemName (){
        return syscoLabUIOgm.getText(txtItemName);
    }

    public void quitDriver() {
        if (syscoLabUIOgm != null) {
            syscoLabUIOgm.quit();
        }
    }


}
