package com.neotech.lesson2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/");
		Thread.sleep(5000);
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("firstName")).sendKeys("Massinissa");
		Thread.sleep(5000);
		driver.findElement(By.name("lastName")).sendKeys("C.");
		Thread.sleep(5000);
		driver.findElement(By.name("phone")).sendKeys("384 728 338");
		Thread.sleep(5000);
		driver.findElement(By.id("userName")).sendKeys("me@neo.com");
		Thread.sleep(5000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(5000);
		driver.quit();
		
		
		
	}

}
