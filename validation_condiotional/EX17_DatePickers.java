package org.validation_condiotional;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EX17_DatePickers {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //it will be applicable for all elements where sync issue occurs
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		//String date1="start-date";
		//String date2="end-date";
		//Simple DatePicker
		String[] arr= new String[]{"start-date","end-date"};
		String startdate="120899";
		String enddate="130899";
		String[] date= new String[]{"120899","130899"};
		for (int i=0; i<arr.length; i++) {
			
		driver.findElement(By.xpath("//input[@id='"+arr[i]+"']")).sendKeys(date[i]);
		}
		
       //Complex DatePicker
		
		String Month="February";
		String Year="2020";
		String Date="12";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		//String CurrrentMonth=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-month']")).getText();
		//String CurrentYear=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-year']")).getText();
		while(true) {
			String CurrrentMonth=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-month']")).getText();
			String CurrentYear=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-year']")).getText();
		if(CurrrentMonth.equals(Month) && CurrentYear.equals(Year)) {
			break;
		}
		driver.findElement(By.xpath("//span[text()='Prev']")).click();
		}
		
		List<WebElement> AllDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
		for(WebElement a:AllDates) {
			if(a.getText().equals(Date)) {
				a.click();
				break;
			}
		}
		System.out.println("Programme Ends");
	}

}
