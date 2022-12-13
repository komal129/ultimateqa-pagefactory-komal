package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility{


   // By errorMessage = By.xpath("//h1[@class='page__heading']");
    @CacheLookup
    @FindBy(xpath = "//body[1]/main[1]/div[1]/div[1]/article[1]/h2[1]")
    WebElement errorMessage;
   // By emailField = By.name("user[email]");
   @CacheLookup
    @FindBy(name = "user[email]")
    WebElement emailField;
 //   By passwordField = By.name("user[password]");
    @CacheLookup
    @FindBy(name = "user[password]")
    WebElement passwordField;
   // By signInButton = By.xpath("//body[1]/main[1]/div[1]/div[1]/article[1]/form[1]/div[5]/button[1]");
   @CacheLookup
    @FindBy(xpath = "//body[1]/main[1]/div[1]/div[1]/article[1]/form[1]/div[5]/button[1]")
    WebElement signInButton;

   // By signInErrorMessage = By.xpath("//li[contains(text(),'Invalid email or password.')]");
   @CacheLookup
    @FindBy(xpath = "//li[contains(text(),'Invalid email or password.')]")
    WebElement signInErrorMessage;



    public String getErrorMessage(){
        Reporter.log("Error message is displayed");
        return getTextFromElement(errorMessage);
    }

    public void enterEmailId(String email){
        Reporter.log("Enter email " + email + " to email field " + emailField.toString());
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password){
        Reporter.log("Enter password " + password + " to password field " + emailField.toString());
        sendTextToElement(passwordField, password);
    }

    public void clickOnSigninButton(){
        Reporter.log("User clicks on Sign In Button");
        clickOnElement(signInButton);
    }

    public String getSignInErrorMessage(){
        Reporter.log("User gets Sign In Error Message");
        return getTextFromElement(signInErrorMessage);
    }
}
