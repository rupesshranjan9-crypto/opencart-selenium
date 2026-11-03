package com.opencart.base;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();//Browser 
		ChromeDriver driver= new ChromeDriver(); //Browser type
		
		driver.get("https://tutorialsninja.com/demo/");//website
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();//Account
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();//click to Resigter
	}

}
