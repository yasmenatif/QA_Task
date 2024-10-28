package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cartPage {
    public cartPage() {
        PageFactory.initElements(Hooks.driver,this);

    }


    @FindBy(xpath = "//div//div[@class=\"cart-icon\"]//button[@class=\"cart-btn\"]")
    public WebElement goToCartPage;

    @FindBy(xpath = "//div//div[@class=\"cart-card-container\"][1]")
    public WebElement firstCartItem;

    @FindBy(xpath = "//div//div[@class=\"cart-card-container\"][2]")
    public WebElement secondCartItem;

    @FindBy(xpath = "//div//div[@class=\"cart-card-container\"][3]")
    public WebElement thirdCartItem;




}
