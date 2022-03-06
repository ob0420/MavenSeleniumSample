package tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPageObjects;

public class LoginTest extends BaseTests {

    @Test
    public void simpleLoginTest(){
        LoginPageObjects loginPageObjects = new LoginPageObjects(driver);
        loginPageObjects.setTextIntoLoginTextBox("olya");
        loginPageObjects.setTextIntoPasswordTextBox("Secret=Sauce9*");
        loginPageObjects.clickLoginButton();
        Assert.assertEquals(loginPageObjects.getActualUserName(), "olya");
    }

    @Test
    public void invalidSimpleLoginTest(){
        LoginPageObjects loginPageObjects = new LoginPageObjects(driver);
        loginPageObjects.setTextIntoLoginTextBox("olya");
        loginPageObjects.setTextIntoPasswordTextBox("SecreSauce9*");
        loginPageObjects.clickLoginButton();
        Assert.assertEquals(loginPageObjects.getActualErrorMessage(), "Invalid username or password!");
    }
}
