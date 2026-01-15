package com.neotech.lesson2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class HW1 {
	/*HW1:
		Open chrome browser
		Go to "https://demo.guru99.com/test/newtours/"
		Click on Register Link
		Fill out ALL required info
		Click Submit
		User successfully registered
		(Create the script using different locators)*/
	
	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/");
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.name("firstName")).sendKeys("Oguzhan");
		
		Thread.sleep(4000);
		
		driver.findElement(By.name("lastName")).sendKeys("Yesilda");
		
		Thread.sleep(4000);
		
		driver.findElement(By.name("phone")).sendKeys("555 555 55 55");
		
		Thread.sleep(4000);
		
		driver.findElement(By.id("userName")).sendKeys("oguz@gmail.com");
		
		Thread.sleep(4000);
		
		driver.findElement(By.name("address1")).sendKeys("Cincinnati");
		
		Thread.sleep(4000);
		
		driver.findElement(By.name("city")).sendKeys("Loveland");
		
		Thread.sleep(4000);
		
		driver.findElement(By.name("state")).sendKeys("Cincinnati");
		
		Thread.sleep(4000);
		
		driver.findElement(By.name("postalCode")).sendKeys("43311");
		
		Thread.sleep(4000);
		WebElement dropdownElement = driver.findElement(By.name("country"));
		Select countrySelect = new Select(dropdownElement);
		countrySelect.selectByVisibleText("UNITED STATES");
		
		Thread.sleep(4000);
		
		driver.findElement(By.id("email")).sendKeys("oguz@gmail.com");
		
		Thread.sleep(4000);
		
		driver.findElement(By.name("password")).sendKeys("1234.");
		
		Thread.sleep(4000);
		
		driver.findElement(By.name("confirmPassword")).sendKeys("1234.");
		
		Thread.sleep(4000);
		
		driver.findElement(By.name("submit")).click();
		
		Thread.sleep(4000);
		driver.quit();
		
		
		
		
		
		
	}

}
