package org.validation_condiotional;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex01_Conditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		WebElement colors=driver.findElement(By.xpath("//label[text()='Colors:']"));
		if(colors.isDisplayed()==true) {
			System.out.println("Colours label present on page");
		}else {
			System.out.println("Colours label not present on page");
		}
		driver.findElement(By.xpath("//input[@name='gender']")).click();
		boolean gender=driver.findElement(By.xpath("//input[@name='gender']")).isSelected();
		if(gender==true) {
			System.out.println(" selected");
		}else {
			System.out.println("not selected");
		}
		boolean countrySelected=driver.findElement(By.xpath("//select[@id='country']/child::option")).isSelected();
		if (countrySelected==true) {
			System.out.println("Country Bydefault Selected");
		}else {
			System.out.println("Country Bydefault not Selected");
		}
		boolean enablevalidation=driver.findElement(By.linkText("GUI Elements")).isEnabled();
		if(enablevalidation==true) {
			System.out.println("Enable");
		} else {
			System.out.println("Disable");
		}
		

	}

}
