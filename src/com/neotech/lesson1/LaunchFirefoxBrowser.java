package com.neotech.lesson1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.neotechacademy.com/");
		
		
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.neotechacademy.com/";
		
		if(actualUrl.equals(expectedUrl)) {
			System.out.println("Page Title --> " + driver.getTitle());
		} else {
			System.out.println("The URL is wrong!!!");
		}
		
		Thread.sleep(2000);
		
		
		
		driver.quit();
		
	}

	

}
