package com.neotech.lesson2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.zillow.com/");
		
		
		driver.navigate().to("https://www.zillow.com/"); //will maintain the browsing history
		
		Thread.sleep(4000);
		
		//maximize the window
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();  2nd way
		
		Thread.sleep(3000);
		
		
		driver.navigate().to("https://www.google.com/");
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		
		String url = driver.getCurrentUrl();
		if(url.contains("zillow")) {
			System.out.println("Test passed!");
		} else {
			System.out.println("Test failed!");
			System.out.println("Current url: " +url);
		}
		
		
		
	}

}
