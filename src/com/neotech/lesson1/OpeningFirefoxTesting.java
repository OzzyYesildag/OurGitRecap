package com.neotech.lesson1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpeningFirefoxTesting {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.redfin.com/");
		
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.redfin.com/";
		
		if(actualUrl.equals(expectedUrl)) {
			
			System.out.println("You are able to navigate to the website");
		} else {
			System.out.println("You are NOT able to navigate to the website");
		}
		
		Thread.sleep(4000);
		
		driver.quit();
		
		
	}

}
