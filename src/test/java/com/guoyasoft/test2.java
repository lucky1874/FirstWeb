package com.guoyasoft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:/software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("http://baidu.com");
		
		Thread.sleep(2000);
		
		boolean isSuccess=driver.getPageSource().contains("百度一下");
		System.out.println(isSuccess);
		
		WebElement kw=driver.findElement(By.id("kw"));
		kw.clear();
		kw.sendKeys("上海果芽软件");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("su"));
		
		Thread.sleep(2000);
		
		WebElement submit=driver.findElement(By.xpath("//a/em[text()='上海果芽软件']"));
		submit.click();
		
		Thread.sleep(2000);
		
		isSuccess=driver.getPageSource().contains("上海果芽软件");
		System.out.println(isSuccess);
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
