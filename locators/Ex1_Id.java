package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_Id {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
        //By id 
		driver.get("https://demo.opencart.com/");
		Thread.sleep(10000);
		//tagname[@id='idvalue'] //but this is actually an xpath
		//driver.findElement(By.id("//div[@id='alert']")); No such element exception
		//this is the id locator
		driver.findElement(By.id("alert"));
		
		//By name
		driver.findElement(By.name("search"));
		//By class
		//driver.findElement(By.className("form-control form-control-lg"));
		
		//By LinkText
		driver.findElement(By.linkText("Desktops"));  //use full text of anchor tag
		//By PartialLinkText
		driver.findElement(By.partialLinkText("Laptops & Notebook"));//use partial text of anchor tag
		//By TagName
		driver.findElement(By.tagName("html"));
		
	}
}

