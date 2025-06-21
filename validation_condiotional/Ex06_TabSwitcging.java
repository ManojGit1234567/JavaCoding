package org.validation_condiotional;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ex06_TabSwitcging {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //it will be applicable for all elements where sync issue occurs
		driver.get("https://testautomationpractice.blogspot.com");
		driver.findElement(By.xpath("//button[text()='New Tab']")).click();
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("cloudflare.com")));
		//Thread.sleep(5000);

		/*Approach1 for less tab
		Set <String> WindID=driver.getWindowHandles();
		List <String> WindList=new ArrayList(WindID); //we convert set into list bcoz set do not have indexing but lost has.
		String PrentID= WindList.get(0);
		String ChildID= WindList.get(1);
		driver.switchTo().window(ChildID); //controll on child window
		Thread.sleep(5000);
		driver.close(); //close child window
		driver.switchTo().window(PrentID);  //controll on parent window
		driver.close(); //close parent window
		System.out.println("Executed");  */

		//Approach2 for more than 2-3 tabs ad we have to close some tabs by using for each loop

		Set <String> id=driver.getWindowHandles();
		for(String i: id) {
			String Title=driver.switchTo().window(i).getTitle();
			if(Title.equals("demo.opencart.com | 522: Connection timed out")) {
				driver.close();
			}
		}

	}
	//we can do by using for loop as well

}
