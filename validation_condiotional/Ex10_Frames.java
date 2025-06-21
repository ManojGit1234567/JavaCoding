package org.validation_condiotional;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex10_Frames {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		//now switch to the 5th frame
		System.out.println(driver.getTitle());
		WebElement fifth=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(fifth);
		String print=driver.findElement(By.xpath("//input[@name='mytext3']/parent::div")).getText();
		//String print2=driver.findElement(By.xpath("//input[@name='mytext3']")).getText(); not correct to get text
		System.out.println(print);
		//System.out.println(print2);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("abcd");
		WebElement innerframe=driver.findElement(By.xpath("//p[text()='iframe inside frame:']/following-sibling::iframe"));
		driver.switchTo().frame(innerframe);
		//input[@name='mytext3']
		String txt=driver.findElement(By.xpath("//div[@role='heading']/span")).getText();
		System.out.println(txt);
		driver.switchTo().defaultContent();
		System.out.println(driver.getTitle());
		driver.quit();
		
		//we can not switch one frame to another frame
		//But we can switch one frame to there inner frame
		//to switch one frame to aother frame we nned first switch the controll on he main page

	}

}
