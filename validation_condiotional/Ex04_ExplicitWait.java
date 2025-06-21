package org.validation_condiotional;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ex04_ExplicitWait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com");
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement txt=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("GUI Elements")));
		driver.findElement(By.xpath("//input[@class='wikipedia-search-input']")).sendKeys("sachin");
		driver.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();
		//WebElement sachin=mywait.until(ExpectedConditions.visibilityOf((WebElement) By.linkText("Sachin Tendulkar")));
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sachin Tendulkar")));
		//mywait.until(ExpectedConditions.elementToBeClickable(null));
		//mywait.until(ExpectedConditions.elementToBeSelected(null));
		//mywait.until(ExpectedConditions.attributeContains(null, null, null));
		driver.findElement(By.linkText("Sachin Tendulkar")).click();
		driver.manage().window().maximize();
  
	}

}
