package org.validation_condiotional;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex11_SelectClassDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //it will be applicable for all elements where sync issue occurs
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='country']"));
		System.out.println(dropdown.isSelected());
		WebElement abc=driver.findElement(By.xpath("//option[@value='usa']"));
		System.out.println(abc.isSelected());   // correct
		Select drp=new Select(dropdown);
		drp.selectByVisibleText("Canada");
		Thread.sleep(2000);
		drp.selectByIndex(4);
		Thread.sleep(2000);
		drp.selectByValue("usa");
		Thread.sleep(2000);
		List<WebElement> ele=drp.getOptions();
		System.out.println("First way to get all options");
		for(int i=0; i<ele.size(); i++) {
			System.out.println(ele.get(i).getText());
		}
		System.out.println("2nd way to get all options");
		for(WebElement el:ele) {
			System.out.println(el.getText());
		}
		
		//2nd
		
		WebElement d2=driver.findElement(By.xpath("//select[@id='colors']"));
		Select s=new Select(d2);
		s.selectByVisibleText("Red");
		
		//do practice fro bootstrap and hidden dropdown
	}

}
