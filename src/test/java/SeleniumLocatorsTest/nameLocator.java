package SeleniumLocatorsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

public class nameLocator {

    @Test
    public void test1() throws InterruptedException {

        //create chrome driver object
        WebDriver driver= WebDriverFactory.getDiver("chrome");

        //step1: navigate to
        //step2: locate full name and send Azat Bayram
        //step3: locate email and send example@gmail.com
        //step4: close chrome

        //step1
        driver.get("http://practice.cybertekschool.com/sign_up");

        //step2
        WebElement fullNameBox= driver.findElement(By.name("full_name"));
        fullNameBox.sendKeys("Azat Bayram");

        //step3
        WebElement emailBox= driver.findElement(By.name("email"));
        emailBox.sendKeys("example@gmail.com");

        //wait 3 seconds
        Thread.sleep(3000);

        //step4
        driver.quit();
    }
}
