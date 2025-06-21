package org.validation_condiotional;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex20_MouseAction {
  public static void main(String args[]) {
	  WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //it will be applicable for all elements where sync issue occurs
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		WebElement pointme=driver.findElement(By.xpath("//button[text()='Point Me']"));
		WebElement mob=driver.findElement(By.xpath("//a[text()='Mobiles']"));
		Actions act=new Actions(driver);   //object to perform mouse operation
		act.moveToElement(pointme).moveToElement(mob).build().perform();  //mouse hover
		act.moveToElement(pointme).moveToElement(mob).click().build().perform(); //click after mouse over
		//act.moveToElement(pointme).moveToElement(mob).build().perform();
		//System.out.println("ends");
		act.contextClick(pointme).build().perform(); //Right click
		
		//double click
	WebElement copytext=driver.findElement(By.xpath("//button[text()='Copy Text']"));
	String val=driver.findElement(By.xpath("//div[@class='widget-content']/input[@id='field1']")).getAttribute("value");
	System.out.println(val);
	act.doubleClick(copytext).build().perform();
	String val2=driver.findElement(By.xpath("//div[@class='widget-content']/input[@id='field2']")).getAttribute("value");
	if(val.equals(val2)) {
		System.out.println("Copied successfully");
	}else {
		System.out.println("not copied");
	}
	
	//drag and drop
	WebElement drag=driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
	WebElement drop=driver.findElement(By.xpath("//p[text()='Drop here']"));
	act.dragAndDrop(drag, drop).perform();
String s=	driver.findElement(By.xpath("//div[@id='droppable']")).getText();
if(s.equals("Dropped!")) {
	System.out.println("drag and dropped successfully");
}else {
	System.out.println("fail");
}


	
		
  }
}
