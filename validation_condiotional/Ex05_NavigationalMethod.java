package org.validation_condiotional;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex05_NavigationalMethod {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //it will be applicable for all elements where sync issue occurs
		driver.get("https://testautomationpractice.blogspot.com");
		String currenturl=driver.getCurrentUrl();
		URL urlnew=new URL(currenturl);
		driver.findElement(By.linkText("Apple")).click();
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.navigate().to(urlnew);
		System.out.println("Executed");
		driver.quit();
;
	}

}
