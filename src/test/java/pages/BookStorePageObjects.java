package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BookStorePageObjects extends BasePageObjects{

    public BookStorePageObjects(ChromeDriver driver){ this.driver = driver; }

    By bookId = By.id("ISBN-label");
    String bookIdValue;
    By bookStore = By.id("gotoStore");
    String bookStoreValue;

    public void clickBookStoreButton(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(bookStore).click();
    }
     public String getBookId(){
        bookIdValue = driver.findElement(bookId).getText();
        return bookIdValue;
     }

}
