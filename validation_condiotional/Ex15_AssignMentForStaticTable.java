package org.validation_condiotional;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex15_AssignMentForStaticTable {

	public static void main(String[] args) {
		// https://blazedemo.com/
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //it will be applicable for all elements where sync issue occurs
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		WebElement loc=driver.findElement(By.xpath("//select[@name='fromPort']"));
		loc.click();
		Select opt=new Select(loc);
		opt.selectByVisibleText("Boston");

		WebElement loc2=driver.findElement(By.name("toPort"));
		loc2.click();
		Select opt2=new Select(loc2);
		opt2.selectByVisibleText("Rome");
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		List<String> prices=new ArrayList <String>();	
		List <WebElement> totalRows=	driver.findElements(By.xpath("//table[@class='table']/tbody/tr"));

		for(int r=1; r<=totalRows.size(); r++) {

			//get prices
			List<WebElement> list2=driver.findElements(By.xpath("//table[@class='table']/tbody/tr["+r+"]/td[6]"));
			// extract or add that prices in arrayList

			for(WebElement e: list2) {
				prices.add(e.getText());
			}

		}
		//now make a copy of that list means arraylist
		List <String> copy=new ArrayList<String>(prices);	

		//now sort the list
		Collections.sort(copy);
		System.out.println(copy.getFirst());
		String LowestPrice=copy.getFirst();
		//System.out.println(copy.get(0)); correct
		driver.findElement(By.xpath("//td[text()='"+LowestPrice+"']/parent::tr/td/input")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='First Last']")).sendKeys("Manoj Pandit");
		driver.findElement(By.xpath("//input[@placeholder='123 Main St.']")).sendKeys("ABCD");
		driver.findElement(By.xpath("//input[@placeholder='Anytown']")).sendKeys("Narvel");
		driver.findElement(By.xpath("//input[@placeholder='State']")).sendKeys("Maharashtra");
		driver.findElement(By.xpath("//input[@placeholder='12345']")).sendKeys("425396");
	WebElement drp=driver.findElement(By.xpath("//select[@name='cardType']"));
   Select obj=new Select(drp);
   obj.selectByVisibleText("American Express");
   driver.findElement(By.xpath("//input[@placeholder='Credit Card Number']")).sendKeys("123456789");
   
   driver.findElement(By.xpath("//input[@placeholder='Month']")).sendKeys("12");
   driver.findElement(By.xpath("//input[@placeholder='Year']")).sendKeys("2019");
   driver.findElement(By.xpath("//input[@placeholder='John Smith']")).sendKeys("PanditG");
   WebElement checkbox=driver.findElement(By.xpath("//input[@name='rememberMe']"));
   if(checkbox.isSelected()) {
   System.out.println("CheckBox allready selected");
   }else {
   checkbox.click();
   }
   driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
   WebElement successMsg=driver.findElement(By.xpath("//h1[text()='Thank you for your purchase today!']"));
   if(successMsg.isDisplayed()==true) {
	   System.out.println("Thank you for your purchase today!");
   }else {
   System.out.println("sorry for your inconvience");
   }
   
   //Now get all values from page
  List<WebElement> valuess= driver.findElements(By.xpath("//table[@class='table']/tbody/tr/td"));
  int totaltd=valuess.size();
  
  List<WebElement> RowCount= driver.findElements(By.xpath("//table[@class='table']/tbody/tr"));
  List<WebElement> ColCount= driver.findElements(By.xpath("//table[@class='table']/tbody/tr[1]/td"));
 // List<WebElement> variable= driver.findElements(By.xpath("//table[@class='table']/tbody/tr/td[1]"));
  for(int r=1; r<=RowCount.size(); r++) {
	for(int d=1; d<=ColCount.size(); d++) {
		WebElement variable= driver.findElement(By.xpath("//table[@class='table']/tbody/tr["+r+"]/td["+d+"]"));
		if(d==1) {
			System.out.print(variable.getText() + "== ");
		}else {
			System.out.println(variable.getText());
		}
  }
 
	  
 
   }
	}
	

}
