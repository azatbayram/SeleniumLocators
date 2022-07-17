package SeleniumLocatorsTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class idLocator {

    @Test
    public void test1() throws InterruptedException {

        //this line setup the chrome driver
        WebDriverManager.chromedriver().setup();
        //this line create one chrome object
        WebDriver driver=new ChromeDriver();

        //step 1: open chrome browser and navigate to http://practice.cybertekschool.com/multiple_buttons
        //step 2: locate Don't Click button with is locator and click it
        //step 3: verify that Now it's gone! displayed on screen
        //step 4: close chrome

        //step1
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        //step2
        WebElement dontClickButton= driver.findElement(By.id("disappearing_button"));
        dontClickButton.click();

        //step3
        WebElement result=driver.findElement(By.id("result"));
        Assert.assertTrue(result.isDisplayed());

        //wait 3 seconds
        Thread.sleep(3000);

        //step4
        driver.quit();

    }

//    @Test
//    public void test2() throws InterruptedException {
//        //this line setup the chrome driver
//        WebDriverManager.chromedriver().setup();
//        //this line create one chrome object
//        WebDriver driver=new ChromeDriver();
//
//        //step 1: open chrome browser and navigate to http://practice.cybertekschool.com/multiple_buttons
//        //step 2: locate Button 3button with is locator and click it
//        //step 3: verify that Clicked on button three! displayed on screen
//        //step 4: close chrome
//
//        //step1
//        driver.get("http://practice.cybertekschool.com/multiple_buttons");
//
//        //step2
//        WebElement button3= driver.findElement(By.cssSelector("button[onclick='button3()']"));
//        button3.click();
//
//        //step3
//        WebElement result= driver.findElement(By.cssSelector("p#result"));
//        String actualResult= result.getText();
//        String expectedResult="Clicked on button three!";
//        Assert.assertEquals(actualResult,expectedResult);
//
//        //wait 3 seconds
//        Thread.sleep(3000);
//
//        //step4
//        driver.quit();
//    }


}
