package com.neotech.lesson2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//locate the e-mail textbox
		
		//create a web element object
		
		WebElement emailBox = driver.findElement(By.name("email"));
		//send email to the emailBox
		emailBox.sendKeys("neo@tech.com");
		
		Thread.sleep(3000);
		
		WebElement passwordBox = driver.findElement(By.name("pass"));
		
		passwordBox.sendKeys("pass123!");
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
	}

}
