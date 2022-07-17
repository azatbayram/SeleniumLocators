package SeleniumLocatorsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

public class xPathLocator {

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
    public void knownAttributeAndValue(){

        WebElement button1= driver.findElement(By.xpath("//button[@onclick='button1()']"));
        button1.click();

    }

    @Test
    public void unknownAttributeAndValue(){

        WebElement button2= driver.findElement(By.xpath("//button[@*='button2()']"));
        button2.click();
    }

    @Test
    public void knownVisibleText(){

        WebElement button3= driver.findElement(By.xpath("//button[text()='Button 3']"));
        button3.click();

    }

}
