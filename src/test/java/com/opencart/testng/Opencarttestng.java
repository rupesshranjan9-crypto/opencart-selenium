package com.opencart.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Test;

public class Opencarttestng {

    ChromeDriver driver;

    @Test(priority = 1)
    
    public void positiveTesting() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://tutorialsninja.com/demo/");

        driver.findElement(By.xpath("//span[normalize-space()='My Account']/..")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();

        WebElement firstname = driver.findElement(By.xpath("//input[@id='input-firstname']"));
        WebElement lastname = driver.findElement(By.xpath("//input[@id='input-lastname']"));
        WebElement email = driver.findElement(By.xpath("//input[@id='input-email']"));
        WebElement telephone = driver.findElement(By.xpath("//input[@id='input-telephone']"));
        WebElement password = driver.findElement(By.xpath("//input[@id='input-password']"));
        WebElement confirmpassword = driver.findElement(By.xpath("//input[@id='input-confirm']"));

        firstname.sendKeys("Rupessh");
        lastname.sendKeys("Kumar");
        email.sendKeys("rupesh_test_positive_001@gmail.com");
        telephone.sendKeys("1234567890");
        password.sendKeys("Rupesh@49");
        confirmpassword.sendKeys("Rupesh@49");

        driver.findElement(By.xpath("//input[@name='agree']")).click();
        driver.findElement(By.xpath("//input[@value='Continue']")).click();

        WebElement confirmation = driver.findElement(By.xpath("//div[@id='content']/h1"));

        System.out.println("Positive Testing: " + confirmation.getText());

        driver.quit();
    }

    @Test(priority = 2)
    public void negativeTesting() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://tutorialsninja.com/demo/");

        driver.findElement(By.xpath("//span[normalize-space()='My Account']/..")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();

        WebElement lastname = driver.findElement(By.xpath("//input[@id='input-lastname']"));
        WebElement email = driver.findElement(By.xpath("//input[@id='input-email']"));
        WebElement telephone = driver.findElement(By.xpath("//input[@id='input-telephone']"));
        WebElement password = driver.findElement(By.xpath("//input[@id='input-password']"));
        WebElement confirmpassword = driver.findElement(By.xpath("//input[@id='input-confirm']"));

        // First name intentionally blank
        lastname.sendKeys("Kumar");
        email.sendKeys("rupesh_test_negative_001@gmail.com");
        telephone.sendKeys("1234567890");
        password.sendKeys("Rupesh@49");
        confirmpassword.sendKeys("Rupesh@49");

        driver.findElement(By.xpath("//input[@name='agree']")).click();
        driver.findElement(By.xpath("//input[@value='Continue']")).click();

        WebElement confirmation1 = driver.findElement(By.xpath("//input[@id='input-firstname']/following-sibling::div"));

        System.out.println("Negative Testing: " + confirmation1.getText());

        driver.quit();
    }
}