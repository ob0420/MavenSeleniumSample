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


    @Test
    public void usersBooksPageTest(){
        LoginPageObjects loginPageObjects = new LoginPageObjects(driver);
        loginPageObjects.setTextIntoLoginTextBox("olya");
        loginPageObjects.setTextIntoPasswordTextBox("Secret=Sauce9*");
        loginPageObjects.clickLoginButton();
        loginPageObjects.clickBookStoreButton();
        //Assert.assertEquals(loginPageObjects.getActualErrorMessage(), "Invalid username or password!");
    }

    @Test
    public void goToBookStoreTest(){
        LoginPageObjects loginPageObjects = new LoginPageObjects(driver);
        loginPageObjects.setTextIntoLoginTextBox("olya");
        loginPageObjects.setTextIntoPasswordTextBox("Secret=Sauce9*");
        loginPageObjects.clickLoginButton();
        loginPageObjects.clickBookStoreButton();
        loginPageObjects.goBackToBookStore();
        //Assert.assertEquals(loginPageObjects.getActualErrorMessage(), "Invalid username or password!");
    }

    @Test
    public void logOutTest() {
        LoginPageObjects loginPageObjects = new LoginPageObjects(driver);
        loginPageObjects.setTextIntoLoginTextBox("olya");
        loginPageObjects.setTextIntoPasswordTextBox("Secret=Sauce9*");
        loginPageObjects.clickLoginButton();
        loginPageObjects.clickLogoutButton();
    }

    @Test
    public void deleteBookTest(){
        LoginPageObjects loginPageObjects = new LoginPageObjects(driver);
        loginPageObjects.setTextIntoLoginTextBox("olya");
        loginPageObjects.setTextIntoPasswordTextBox("Secret=Sauce9*");
        loginPageObjects.clickLoginButton();
        loginPageObjects.setDeleteBook();
        loginPageObjects.clickDeleteButton();
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
