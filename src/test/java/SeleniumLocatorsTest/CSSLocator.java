package SeleniumLocatorsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

public class CSSLocator {

    WebDriver driver=null;
    @BeforeMethod
    public void setup(){
        driver= WebDriverFactory.getDiver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
    }

    @AfterMethod
    public void teardown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void idValue(){
        WebElement dontClickButton= driver.findElement(By.cssSelector("#disappearing_button"));
        dontClickButton.click();
    }

    @Test
    public void attributeValue(){
        WebElement button2= driver.findElement(By.cssSelector("button[name='button2']"));
        button2.click();
    }
}
