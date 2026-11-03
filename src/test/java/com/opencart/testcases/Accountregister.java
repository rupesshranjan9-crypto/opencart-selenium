package com.opencart.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Accountregister {

	@Test()
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();//Browser 
		ChromeDriver driver= new ChromeDriver(); //Browser type
        driver.manage().window().maximize();
//positive testing
        driver.get("https://tutorialsninja.com/demo/");
        driver.findElement(By.xpath("//span[normalize-space()='My Account']/..")).click();

        driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
        
        //Register account

        
        WebElement firstname = driver.findElement(By.xpath("//input[@id='input-firstname']"));
       WebElement lastname = driver.findElement(By.xpath("//input[@id='input-lastname']"));
        WebElement email = driver.findElement(By.xpath("//input[@id='input-email']"));
        WebElement telephone = driver.findElement(By.xpath("//input[@id='input-telephone']"));
        WebElement password = driver.findElement(By.xpath("//input[@id='input-password']"));
        WebElement confirmpassword = driver.findElement(By.xpath("//input[@id='input-confirm']"));
        
        //Registration details
        
        firstname.sendKeys("Rupessh");
        lastname.sendKeys("Kumar");
        email.sendKeys("rupeshranjjan1200134@gmail.com");
        telephone.sendKeys("1234567890");
        password.sendKeys("Rupesh@49");
        confirmpassword.sendKeys("Rupesh@49");
        //privaly policy
        driver.findElement(By.xpath("//input[@name='agree']")).click();
        
        driver.findElement(By.xpath("//input[@value='Continue']")).click();
        //confirmation message via website
        
        WebElement confirmation = driver.findElement(By.xpath("//div[@id='content']/h1"));

        String message = confirmation.getText();

        System.out.println("Postive testing:" + message);//your account has been created message display
        Thread.sleep(2000);
        
        //Negative testing //first name blank
        
        
        driver.manage().window().maximize();

        //driver.get("https://tutorialsninja.com/demo/");

        
        driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();

        driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Logout']")).click();
        driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
        driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Register']")).click();
        
        firstname = driver.findElement(By.xpath("//input[@id='input-firstname']"));
       lastname = driver.findElement(By.xpath("//input[@id='input-lastname']"));
        email = driver.findElement(By.xpath("//input[@id='input-email']"));
         telephone = driver.findElement(By.xpath("//input[@id='input-telephone']"));
         password = driver.findElement(By.xpath("//input[@id='input-password']"));
        confirmpassword = driver.findElement(By.xpath("//input[@id='input-confirm']"));
        
        //Registration details
       // firstname.sendKeys();
        lastname.sendKeys("Kumar");
        email.sendKeys("rupeshranjan120045134@gmail.com");
        telephone.sendKeys("1234567890");
        password.sendKeys("Rupesh@49");
        confirmpassword.sendKeys("Rupesh@49");
        //privaly policy
        driver.findElement(By.xpath("//input[@name='agree']")).click();
        
        driver.findElement(By.xpath("//input[@value='Continue']")).click();
        //confirmation message via website
        
        WebElement confirmation1 = driver.findElement(By.xpath("//input[@id='input-firstname']/following-sibling::div"));

        String errormessage = confirmation1.getText();

        System.out.println("Negative testing:" + errormessage);//:First Name must be between 1 and 32 characters!
        
        }
}
