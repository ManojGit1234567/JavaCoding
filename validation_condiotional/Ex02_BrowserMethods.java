package org.validation_condiotional;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex02_BrowserMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//driver.get("https://testautomationpractice.blogspot.com");
		//driver.manage().window().maximize();
		//driver.findElement(By.xpath("//button[text()='New Tab']")).click();
		//Thread.sleep(10000);
		//driver.close(); //will close only targeted window
		//Thread.sleep(10000);
		//driver.close(); //we will get error such as no such window: target window already closed
		
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[text()='New Tab']")).click();
		Thread.sleep(5000);
		driver.quit(); //will close all window
		System.out.println("Executed");

	}

}
