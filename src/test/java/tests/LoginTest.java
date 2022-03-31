package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BookStorePageObjects;
import pages.LoginPageObjects;
import pages.BookStorePageObjects;

public class LoginTest extends BaseTests {

    @Test
    public void simpleLoginTest(){
        LoginPageObjects loginPageObjects = new LoginPageObjects(driver);
        loginPageObjects.setTextIntoLoginTextBox("olya");
        loginPageObjects.setTextIntoPasswordTextBox("Secret=Sauce9*");
        loginPageObjects.clickLoginButton();
        Assert.assertEquals(loginPageObjects.getActualUserName(), "olya");
    }

}
