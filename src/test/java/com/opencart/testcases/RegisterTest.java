package com.opencart.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterTest {

    @Test(priority=1)
    
    
    	public void login()
    	{
    	
    	System.out.println("Login test");
    	
    	
    }
    @Test(priority=2)
    public void register() throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://tutorialsninja.com/demo/");
        driver.findElement(By.xpath("//span[normalize-space()='My Account']/..")).click();

        driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();

        System.out.println("Register Page Open Successfully");
        
        Thread.sleep(2000);

        driver.quit();
    }
}
