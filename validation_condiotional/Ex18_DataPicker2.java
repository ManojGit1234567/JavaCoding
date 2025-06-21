package org.validation_condiotional;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex18_DataPicker2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //it will be applicable for all elements where sync issue occurs
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='SelectedDate']")).click();
		WebElement Month=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select selectyear=new Select(Month);
		selectyear.selectByVisibleText("Aug");
	WebElement year=	driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
	Select selectmonth=new Select(year);
	selectmonth.selectByVisibleText("2016");
	
	List<WebElement> date=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
	for(WebElement d:date) {
		if(d.getText().equals("12")) {
			d.click();
			break;
		}
	}

	}

}
