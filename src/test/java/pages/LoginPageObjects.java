package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LoginPageObjects extends BasePageObjects{

    public LoginPageObjects(ChromeDriver driver){
        this.driver = driver;
    }

    By username_text_box = By.id("userName");

    By password_text_box = By.id("password");

    By login_button = By.id("login");

    By username_value_label = By.id("userName-value");
    String actual_username_value_label;

    By invalid_value = By.id("name");
    String invalid_value_error;

    public void setTextIntoLoginTextBox(String text){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(username_text_box).sendKeys(text);
    }
    public void setTextIntoPasswordTextBox(String text){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(password_text_box).sendKeys(text);
    }
    public void clickLoginButton(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(login_button).click();
    }

    public String getActualUserName(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        actual_username_value_label = driver.findElement(username_value_label).getText();
        return actual_username_value_label;
    }

    public String getActualErrorMessage(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        invalid_value_error = driver.findElement(invalid_value).getText();
        return invalid_value_error;
    }
}
