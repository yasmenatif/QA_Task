package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.cartPage;
import org.example.pages.homePage;
import org.example.pages.loginPage;
import org.example.pages.productDetailsPage;
import org.example.utils.ExtentManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class userShoppingTest {
//    WebDriver driver = ExtentReportListener.driver;

    cartPage cart = new cartPage();
    homePage home = new homePage();
    loginPage logIn = new loginPage();
    productDetailsPage prodDetails = new productDetailsPage();

    SoftAssert softAssert = new SoftAssert();

    WebDriver driver = Hooks.driver;


    @Given("I open the eShop website")
    public void openUrl(){

        driver.get("https://eshop.vodafone.com.eg/shop/home");
        home.initialPage.click();
        home.closeOfferWindow.click();

        home.closeCookiesSettings.click();

        ExtentManager.getTest().log(com.aventstack.extentreports.Status.INFO, "Navigated to eShop website");



    }

    @And("I login to my account")
    public void iLoginToMyAccount() throws InterruptedException {
        logIn.goToLoginPage.click();

        Thread.sleep(2000);

        logIn.mobileNoInput.clear();
        logIn.mobileNoInput.sendKeys("01099791462");
        logIn.passInput.clear();
        logIn.passInput.sendKeys("Asad@1959");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(logIn.goToYourAccount));


        logIn.goToYourAccount.click();

        ExtentManager.getTest().log(com.aventstack.extentreports.Status.INFO, "Signed in successfully");


    }


    @When("I select and add items to the cart")
    public void iSelectAndAddItemsToTheCart() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(home.selectFirstItem));
        scrollToElement(home.selectFirstItem);
        home.selectFirstItem.click();
        prodDetails.addToCart.click();

        driver.navigate().back();

        Thread.sleep(2000);

        wait.until(ExpectedConditions.elementToBeClickable(home.selectSecondItem));
        scrollToElement(home.selectSecondItem);
        home.selectSecondItem.click();

        wait.until(ExpectedConditions.elementToBeClickable(prodDetails.addToCart));

        prodDetails.addToCart.click();

        Thread.sleep(2000);

        wait.until(ExpectedConditions.elementToBeClickable(home.searchBarTVChoice));

        home.searchBarTVChoice.click();
        wait.until(ExpectedConditions.elementToBeClickable(home.selectThirdItem));

        home.selectThirdItem.click();

        wait.until(ExpectedConditions.elementToBeClickable(prodDetails.addToCart));

        prodDetails.addToCart.click();

        Thread.sleep(2000);


        ExtentManager.getTest().log(com.aventstack.extentreports.Status.INFO, "Added three items to cart");



    }

    @Then("I should see the items in my cart")
    public void iShouldSeeTheItemsInMyCart() throws InterruptedException {
        cart.goToCartPage.click();

//        driver.navigate().refresh();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement firstItem = cart.firstCartItem;
        WebElement secondItem = cart.secondCartItem;
        WebElement thirdItem = cart.thirdCartItem;


        softAssert.assertNotNull(firstItem, "First item is not present in the cart.");
        softAssert.assertNotNull(secondItem,"Second item is not present in the cart.");
        softAssert.assertNotNull(thirdItem, "Third item is not present in the cart.");

        softAssert.assertAll();

        ExtentManager.getTest().log(com.aventstack.extentreports.Status.INFO, "Verified items are in cart");

    }

    private void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        try {
            Thread.sleep(500); // Add a short delay to ensure the element is in view
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}