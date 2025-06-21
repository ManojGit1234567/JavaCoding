package org.launchbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_Launch_GetMethods {
	 WebDriver driver=new ChromeDriver();
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		Thread.sleep(10000);
		String Title=driver.getTitle();
		System.out.println(Title);
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		String pageSource=driver.getPageSource();
		System.out.println(pageSource);
		String winID=driver.getWindowHandle();
		System.out.println(winID);
	}

}
