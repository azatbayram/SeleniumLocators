package SeleniumLocatorsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

public class tagNameLocator {

    @Test
    public void test1() throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDiver("chrome");

        //make browser fullscreen
        driver.manage().window().maximize();

        //step 1: navigate to http://practice.cybertekschool.com/sign_up
        //step 2: locate full name box and send Azat Bayram
        //step 3: locate email box and send example@gmail.com
        //step 4: close browser

        //step 1
        driver.get("http://practice.cybertekschool.com/sign_up");

        //step 2
        WebElement fullNameBox= driver.findElement(By.tagName("input"));
        fullNameBox.sendKeys("Azat Bayram");

        //step 3
        WebElement emailBox= driver.findElement(By.name("email"));
        emailBox.sendKeys("example@gmail.com");

        //wait 3 seconds
        Thread.sleep(3000);

        //step 4
        driver.quit();

    }
}
