package com.guoyasoft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testselenium {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:/software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("http://127.0.0.1:8081/FirstWeb/MyHtml.html");
		
		Thread.sleep(2000);
		
		boolean isSuccess=driver.getPageSource().contains("login");
		System.out.println(isSuccess);
		
		WebElement usernanme=driver.findElement(By.id("login"));
		usernanme.clear();
		usernanme.sendKeys("guoyasoft");
		
		Thread.sleep(2000);
		
		WebElement password=driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("123456");
		
		Thread.sleep(2000);
		
		WebElement submit=driver.findElement(By.xpath("//input[@type='submit']"));
		submit.click();
		
		Thread.sleep(2000);
		
		isSuccess=driver.getPageSource().contains("post success");
		System.out.println(isSuccess);
		
		driver.quit();
		
		
		
	}

}
