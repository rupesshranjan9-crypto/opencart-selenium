package com.opencart.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Logintestng {
	
	
	ChromeDriver driver;
	@Test()
	
	
	public void login() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
	
	
	driver.get("https://tutorialsninja.com/demo/");//website
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();//click on account
	driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
	driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("rupeshranjan49@gmail.com");
	driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Rupesh@49");
	
	driver.findElement(By.xpath("//input[@value='Login']")).click();
	
	//Logout
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
	driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Logout']")).click();
	
	WebElement message = driver.findElement(By.xpath("//*[@id=\"content\"]/h1"));
	System.out.println(message.getText());//print successfully logout
	
	
	}


}
