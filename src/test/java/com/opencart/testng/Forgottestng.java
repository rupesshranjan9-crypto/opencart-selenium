package com.opencart.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Forgottestng {
	
	ChromeDriver driver;
	
	@Test()
	
	public void Forgot() {
	
	
	WebDriverManager.chromedriver().setup();//Browser 
	ChromeDriver driver= new ChromeDriver(); //Browser type
	
	driver.get("https://tutorialsninja.com/demo/");//website
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
	
	driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']")).click();
	driver.findElement(By.xpath("//div[@class='form-group']//a[normalize-space()='Forgotten Password']")).click();
	
driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("rupeshranjan49@gmail.com");

driver.findElement(By.xpath("//input[@value='Continue']")).click();

	//display message
	
	WebElement message = driver.findElement(By.xpath("//*[@id=\"account-login\"]/div[1]"));
	
	System.out.println(message.getText());//print An email with a confirmation link has been sent your email address.
	
}

}


