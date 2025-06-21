package org.validation_condiotional;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex03_ImplicitWait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //it will be applicable for all elements where sync issue occurs
		driver.get("https://testautomationpractice.blogspot.com");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();

	}

}
