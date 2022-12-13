package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility{

   // By signInLink = By.linkText("Sign In");
  // @FindBy(linkText = " Sign In ") //a[@href='/users/sign_in']
    @FindBy(xpath = "//a[@href='/users/sign_in']")
   WebElement signInLink;

   public void HomePage(){

   }

    public void clickOnSignInLink(){
      Reporter.log("User Clicks on SignIn Link" + signInLink.toString());
        clickOnElement(signInLink);
    }
}
