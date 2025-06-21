package org.validation_condiotional;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex07_AssignMent_TabSwitching {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //it will be applicable for all elements where sync issue occurs
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		driver.findElement(By.className("wikipedia-search-input")).sendKeys("Sachin");
		driver.findElement(By.className("wikipedia-search-button")).click();
		List<WebElement> ele=driver.findElements(By.xpath("//div[@class='wikipedia-search-results']/child::div"));
		int w=ele.size();
		//for(WebElement x:ele.size()) {
		for(int i=1; i<=w; i++) {
			driver.findElement(By.xpath("//div[@class='wikipedia-search-results']/child::div["+i+"]/a")).click();
			//w.click();
		//	ele.get(i).click(); //this is also correct
		}
		//}
		Set<String> WinId=driver.getWindowHandles();
		for(String i:WinId) {
			String Title=driver.switchTo().window(i).getTitle();
			if(Title.equalsIgnoreCase("Sachin Pilot - Wikipedia") || Title.equalsIgnoreCase("Sachin Pilgaonkar - Wikipedia")) {
				driver.close();
			}
		}
		System.out.println("completed");
	}

}
