package SeleniumLocatorsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

public class linkTextLocator {

    @Test
    public void test1() throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDiver("chrome");
        driver.manage().window().maximize();

        //step 1: navigate to http://practice.cybertekschool.com/dynamic_loading
        //step 2: Locate Example 1: Element on page that is hidden and become visible after trigger link and click
        //step 3: close browser

        //step1
        driver.get("http://practice.cybertekschool.com/dynamic_loading");

        //step2
        WebElement link1=driver.findElement(By.linkText("Example 1: Element on page that is hidden and become visible after trigger"));
        link1.click();

        //wait 3 seconds
        Thread.sleep(3000);

        //step3
        driver.quit();

    }
}
