package org.validation_condiotional;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ex09_Alert_PopUp {

	public static void main(String[] args) {
		
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //it will be applicable for all elements where sync issue occurs
			driver.get("https://testautomationpractice.blogspot.com");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//button[text()='Simple Alert']")).click();
			Alert alt=driver.switchTo().alert();
			System.out.println(alt.getText());
			alt.accept();
			driver.findElement(By.xpath("//button[text()='Confirmation Alert']")).click();
			Alert alt2=driver.switchTo().alert();
			//alt2.accept();
			alt2.dismiss();
			driver.findElement(By.xpath("//button[text()='Prompt Alert']")).click();
			Alert alt3=driver.switchTo().alert();
			alt3.sendKeys("please accept");
			System.out.println(alt3.getText());
			alt3.accept();
			
			//now using without Alert class means using explicit wait
			driver.findElement(By.xpath("//button[text()='Prompt Alert']")).click();
			WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(10));
			Alert alt4=wt.until(ExpectedConditions.alertIsPresent());
			alt4.accept();
			
	}

}
