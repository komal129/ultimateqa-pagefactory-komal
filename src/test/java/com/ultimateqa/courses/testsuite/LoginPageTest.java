package com.ultimateqa.courses.testsuite;

import com.ultimateqa.courses.customlisteners.CustomListeners;
import com.ultimateqa.courses.pages.HomePage;
import com.ultimateqa.courses.pages.LoginPage;
import com.ultimateqa.courses.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class LoginPageTest extends BaseTest {
    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homePage = new HomePage();
        loginPage = new LoginPage();
    }

    @Test(groups = {"sanity", "regression"})
    public void userShouldNavigateToLoginPageSuccessfully(){

        homePage.clickOnSignInLink();
        String expectedText = "Welcome Back!";
        Assert.assertEquals(loginPage.getErrorMessage(), expectedText, "Welcome message is not displayed");
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyTheErrorMessage(){
        homePage.clickOnSignInLink();
        loginPage.enterEmailId("admin12349@example.com");
        loginPage.enterPassword("admin1234");
        loginPage.clickOnSigninButton();
        String expectedSigninText = "Invalid email or password.";
        Assert.assertEquals(loginPage.getSignInErrorMessage(), expectedSigninText, "Invalid email or password.");

    }
}
