package org.validation_condiotional;

import java.nio.file.spi.FileSystemProvider;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex14_StaticWebTables {
	// int total;
public static void main(String[] args) {
	Ex14_StaticWebTables obj=new Ex14_StaticWebTables();
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //it will be applicable for all elements where sync issue occurs
	driver.get("https://testautomationpractice.blogspot.com");
	driver.manage().window().maximize();
	//first finf total no. of rows in table
	List <WebElement> li=driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
	int totalrows=li.size();
	System.out.println("Total rowes in table="+ totalrows);
	//second find total number of column in table
	List <WebElement> li2=driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/th"));
	int totalCol=li2.size();
	System.out.println("Total columns in table="+ totalCol);
	//Read data from specific Row and Column
	System.out.println(driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[2]/td[1]")).getText());
	
	//Now Print all data from table
	for(int r=2; r<=totalrows; r++) {
		for(int c=1; c<=totalCol; c++) {
			String value=driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+r+"]/td["+c+"]")).getText();
			//System.out.println("Row"+"["+r+"]"+"col"+"["+c+"]=="+value);
			System.out.print(value+"\t");
		}
		System.out.println();
	}
	
	//Now just print data from 2nd column
	for(int r=2; r<=totalrows; r++) {
		String data=driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+r+"]/td[2]")).getText();
		System.out.println("data from 2nd column "+data);
	}
	
	//Now get total price of books
	for(int i=1; i<2; i++) {
		int total=0;
	for (int r=2;  r<=totalrows; r++ ) {
		String price=driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+r+"]/td[4]")).getText();
		int bookprice=Integer.parseInt(price);
		total=total+bookprice;
		
	}
	System.out.println(total);
	}
	//System.out.println("Total Price of All Books="+ total); // it is wrong totally
	
	
}
}
