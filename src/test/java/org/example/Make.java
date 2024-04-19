package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Make {


    @Test

    public void testMakeAPP() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();
        WebElement app = driver.findElement(By.xpath("//a[contains(text(),'Make Appointment')]"));
        app.click();
        WebElement username = driver.findElement(By.id("txt-username"));
        username.sendKeys("John Doe");
        WebElement password = driver.findElement(By.id("txt-password"));
        password.sendKeys("ThisIsNotAPassword");
        WebElement submit= driver.findElement(By.id("btn-login"));
        submit.click();
        WebElement select=driver.findElement(By.id("combo_facility"));
        Select select1=new Select(select);
        select1.selectByIndex(0);
        WebElement click=driver.findElement(By.cssSelector("label[for='chk_hospotal_readmission']"));
        click.click();
        WebElement option=driver.findElement(By.xpath("//label[normalize-space()='None']"));
        option.click();
        WebElement cal=driver.findElement(By.id("txt_visit_date"));
        cal.sendKeys("20/12/2024");
        WebElement comment=driver.findElement(By.id("txt_comment"));
        comment.sendKeys(" Hello");
        WebElement submitbut= driver.findElement(By.id("btn-book-appointment"));
        submitbut.click();


    }
    }







