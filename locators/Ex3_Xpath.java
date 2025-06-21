package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3_Xpath {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");

		//Absolute xpath example
		driver.findElement(By.xpath("/html/head/title"));

		//relative Xpath example

		//   1 //tagName[@attName='attValue']
		driver.findElement(By.xpath("//input[@name='search']"));
		
		//   2 //*[@attName='attValue']
		driver.findElement(By.xpath("//*[@name='search']"));
		
		//  3 //tagName[@attName='attValue'][@attName='attValue']
		driver.findElement(By.xpath("//*[@name='search'][@type='text']"));
		
		//   Xpath With 'and' 'OR' operator
		// 4  //tagName[@attName='attValue' and @attName='attValue']    both should be correct
		driver.findElement(By.xpath("//*[@name='search' and @type='text']"));
		
		// 5   //tagName[@attName='attValue' or @attName='attValue']    atleast one must correct
		driver.findElement(By.xpath("//*[@name='search' or @type='text2']"));
		
		// Xpath with innerText (means label)
		//6  //tagName[text()='TextValue']
		driver.findElement(By.xpath("//a[text()='Desktops']"));
		
		//Xpath With Contains
		//7  //tagName[contain(@attName, 'Val']  //we can pass the partial value
		driver.findElement(By.xpath("//input[contains(@name,'earc')]"));
		
		//Xpath with starts with
		//8  //tagName[Starts-with(attName,'val')]
		driver.findElement(By.xpath("//input[starts-with(@name,'searc')]"));
		
		//9  chained xpath ,means combination of absolute and relative
		driver.findElement(By.xpath("//div[@class='col-md-5']/div/input"));
		driver.findElement(By.xpath("//div[contains(@class,'col-md-5')]/div/input"));
        
		//10 parent xpath
		driver.findElement(By.xpath("//div[@class='dropdown-menu']/parent::li"));
		driver.findElement(By.xpath("//div[@class='dropdown-menu']/parent::*"));
		
		//11 child xpath
		driver.findElement(By.xpath("//div[@id='search']/child::input"));
		
		//grand child xpath means descendant
		driver.findElement(By.xpath("//div[@class='col-md-5']/descendant::input"));
		
		//grand parent xpath means ancestor
		driver.findElement(By.xpath("//input[@name='search']/ancestor::div"));
		
		//following -- can be multiple
		driver.findElement(By.xpath("//div[@id='search']/following::input"));
		
		//sibling  -- can be multiple
		driver.findElement(By.xpath("//button[@class='btn btn-light btn-lg']/preceding::input"));
		
		//following-sibling  -- we can specify only one locator if other are not working
		driver.findElement(By.xpath("//li[@class='nav-item dropdown']/following-sibling::li[last()]"));//if multiple
		//driver.findElement(By.xpath("//a[text()='Laptops & Notebooks (5)']/following-sibling::a[contains(text(),'Software')]"));
		
		//preceding-sibling -- we can specify only one locator if other are not working
		driver.findElement(By.xpath("//li[@class='nav-item dropdown']/preceding-sibling::li[last()]"));//if multiple
		//driver.findElement(By.xpath("//a[text()='Laptops & Notebooks (5)']/preceding-sibling::a"));
		
		//Note-- instead of last() we can pass the number as well
		
	}

}
