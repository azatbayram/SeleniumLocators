package SeleniumLocatorsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

public class classNameLocator {

    @Test
    public void test1(){

        WebDriver driver= WebDriverFactory.getDiver("chrome");
        driver.manage().window().maximize();

        //Step 1: navigate to http://practice.cybertekschool.com/sign_up
        //step 2: locate Home and click it
        //step 3: verify that URL has changed
        //step 4: close browser

        //step 1
        driver.get("http://practice.cybertekschool.com/sign_up");

        //step 2
        String beforeURL= driver.getCurrentUrl();
        WebElement home= driver.findElement(By.className("nav-link"));
        home.click();

        //step 3
        String afterURL= driver.getCurrentUrl();

        Assert.assertFalse(beforeURL.equals(afterURL));

        System.out.println(beforeURL);
        System.out.println(afterURL);

        //step 4
        driver.quit();

    }
}
