package org.validation_condiotional;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex19_Day34AssignMent_DummyTickets {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //it will be applicable for all elements where sync issue occurs
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[text()='2,750']/parent::span/preceding-sibling::label/input")).click();
		driver.findElement(By.xpath("//input[@placeholder='first and middle name as on passport']")).sendKeys("Manoj");
		driver.findElement(By.xpath("//input[@placeholder='last name as on passport']")).sendKeys("Pandit");
		driver.findElement(By.xpath("//input[@name='dob']")).click();
		WebElement year=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		WebElement month=driver.findElement(By.xpath("//select[@aria-label='Select month']"));
		
		
		Select selectmonth=new Select(month);
		
		selectmonth.selectByVisibleText("Jun");
		
		Select selectyear=new Select(year);
		selectyear.selectByVisibleText("1999");
		List<WebElement> date= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
		for(WebElement d:date) {
			if(d.getText().equals("12")) {
				d.click();
				break;
			}
			//will continue this later
		}

	}

}
