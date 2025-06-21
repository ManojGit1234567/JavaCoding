package org.validation_condiotional;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex08_CheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //it will be applicable for all elements where sync issue occurs
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		
		//1st select all day checkboxes
		/*
		List<WebElement> ele=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		for(WebElement i:ele) {
			i.click();
		}
		//or with for loop
		Thread.sleep(5000);
		for (int i=0; i<ele.size(); i++) {
			ele.get(i).click();
		}
		*/
		
		//2nd select only last 3 checkbox

		List<WebElement> ele=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		int i=ele.size();
		int res=i-3;
		for(int j=res; j<i; j++) {  //indexing nusar select krto
			ele.get(j).click();
		}
		Thread.sleep(5000);
		//3rd now unselect only selected checkboxes
		for(WebElement k:ele) {
			if(k.isSelected()==true) {
				k.click();
			}
		}
	}

}
