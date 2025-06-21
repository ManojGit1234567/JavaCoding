package org.validation_condiotional;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex13_BootStrapDropdown {

	public static void main(String[] args) throws InterruptedException {
		// This is an assignment for autosuggestion dropdown
		//this is not an bootstrap one
		//we need to find that driopdown first then do practice
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/search?q=mayank+agrwal+bio&rlz=1C1CHBF_enIN1126IN1126&oq=mayank+agrwal+bio&gs_lcrp=EgZjaHJvbWUyBggAEEUYOdIBCTE0NTQ2ajBqN6gCALACAQ&sourceid=chrome&ie=UTF-8&sei=HiSVZ_nZEcjF4-EP6OnNoQ8\r\n");
		driver.manage().window().maximize();
		Thread.sleep(20000);
		//driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border' and @role='presentation']")).click();
		driver.findElement(By.xpath("//textarea[starts-with(text(),'mayank agrwal')]")).click();
		driver.findElement(By.xpath("//span[text()='mayank']/child::b[text()=' agarwal century']")).click();
		
	}

}
