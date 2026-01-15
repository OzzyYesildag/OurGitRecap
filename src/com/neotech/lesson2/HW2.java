package com.neotech.lesson2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class HW2 {
	/*HW2: Facebook sign up:
	Open chrome browser
	Go to "https://www.facebook.com/"
	Click on Sign Up link
	Enter first name
	Enter last name
	Enter email address
	Re-enter email address
	Click on Sign Up button*/

	public static void main(String[] args) throws InterruptedException{

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		Thread.sleep(4000);
		driver.manage().window().fullscreen();
		Thread.sleep(4000);
		
		driver.findElement(By.name("firstname")).sendKeys("ozzy");
		Thread.sleep(4000);
		
		driver.findElement(By.name("lastname")).sendKeys("ozozoz");
		Thread.sleep(4000);
		
		WebElement el = driver.findElement(By.name("birthday_month"));
		
		Select sel = new Select(el);
		
		sel.selectByVisibleText("Dec");
		
		Thread.sleep(4000);
		
        WebElement el1 = driver.findElement(By.id("day"));
		
		Select sel1 = new Select(el1);
		
		sel1.selectByVisibleText("11");
		
		Thread.sleep(4000);
		
		WebElement el2 = driver.findElement(By.id("year"));
			
		Select sel2 = new Select(el2);
			
		sel2.selectByVisibleText("2000");
		
		Thread.sleep(9000);
		
		driver.findElement(By.cssSelector("input[value='2']")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.name("reg_email__")).sendKeys("oz@gmail.com");
		
		Thread.sleep(4000);
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("123.");
		
		Thread.sleep(4000);
		
		driver.findElement(By.name("websubmit")).click();
		
		Thread.sleep(4000);
		
		driver.quit();
		
		
		
		

	
		
		
		
		
		
		
		
		
		
		
		
	}

}
