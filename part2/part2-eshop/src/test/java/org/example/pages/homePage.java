package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.stepDefs.Hooks.driver;

public class homePage {
    public homePage(){
        PageFactory.initElements(driver,this);

    }

    //Locators

    @FindBy(id = "home-button-1")
    public WebElement initialPage;

    @FindBy(xpath = "//div[@class=\"logo\"]")
    public WebElement goToHomePage;

    @FindBy(xpath = "//button[@class=\"onetrust-close-btn-handler banner-close-button ot-close-icon\"]")
    public WebElement closeCookiesSettings;

    @FindBy(xpath = "//button[@class=\"close-modal-desktop\"]")
    public WebElement closeOfferWindow;

    @FindBy(xpath = "//div[@id=\"Top Selling\"]//vf-product-box[@class=\"scrollItem\"][1]")
    public WebElement selectFirstItem;

    @FindBy(xpath = "//div[@id=\"Top Selling\"]//vf-product-box[@class=\"scrollItem\"][2]")
    public WebElement selectSecondItem;

    @FindBy(xpath = "//div//vf-product-box-featured[1]//div[@class=\"product-card-container\"]")
    public WebElement selectThirdItem;

    @FindBy(xpath = "//div[@class=\"categories-item-container vf-column-10\"]//button[4]")
    public WebElement searchBarTVChoice;



}
