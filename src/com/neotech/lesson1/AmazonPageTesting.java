package com.neotech.lesson1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPageTesting {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		
		String expectedTitle = driver.getTitle();
		String title = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		
		if(expectedTitle.equals(title)) {
			System.out.println("It is verified that the title is matching!");
		} else {
			System.out.println("The title is NOT matching! The title should be " + driver.getTitle());
		}
		
		Thread.sleep(5000);
		
		
		driver.quit();
		
		
		
	}

}
