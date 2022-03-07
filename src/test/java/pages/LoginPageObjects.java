package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import pages.BookStorePageObjects;

public class LoginPageObjects extends BasePageObjects{

    public LoginPageObjects(ChromeDriver driver){
        this.driver = driver;
    }

    By username_text_box = By.id("userName");

    By password_text_box = By.id("password");

    By login_button = By.id("login");
    By logout_button = By.id("submit");

    By username_value_label = By.id("userName-value");
    String actual_username_value_label;

    By invalid_value = By.id("name");
    String invalid_value_error;

    public void setTextIntoLoginTextBox(String text){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(username_text_box).sendKeys(text);
    }
    public void setTextIntoPasswordTextBox(String text){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(password_text_box).sendKeys(text);
    }
    public void clickLoginButton(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(login_button).click();
    }
    public void clickLogoutButton(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(logout_button).click();
    }

    public String getActualUserName(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        actual_username_value_label = driver.findElement(username_value_label).getText();
        return actual_username_value_label;
    }

    public String getActualErrorMessage(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        invalid_value_error = driver.findElement(invalid_value).getText();
        return invalid_value_error;
    }

    // BookStore objects
    By booksOfUser = By.id("see-book-Git Pocket Guide");
    String bookStoreValue;

    public void clickBookStoreButton() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(booksOfUser).click();
    }

    By bookstore = By.id("addNewRecordButton");
    public void goBackToBookStore(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(bookstore).click();
    }

    By deleteBook = By.id("delete-record-undefined");
    public void setDeleteBook(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(deleteBook).click();
    }
    By deleteButton = By.id("closeSmallModal-ok");
    public void clickDeleteButton(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(deleteButton).click();
    }
}
