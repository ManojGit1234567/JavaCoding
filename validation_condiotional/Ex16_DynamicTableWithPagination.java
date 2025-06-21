package org.validation_condiotional;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex16_DynamicTableWithPagination {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //it will be applicable for all elements where sync issue occurs
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();

		List<WebElement> pages=driver.findElements(By.xpath("//ul[@class='pagination']/li/a"));
		int totalpages=pages.size();
		List<String> listdata=new ArrayList<String>();
		//List<WebElement> col=driver.findElements(By.xpath("//table[@id='productTable']/thead/tr/th"));
		//int totalCol=col.size();
		for(int p=2; p<=totalpages+1; p++) {
			List<WebElement> rows=driver.findElements(By.xpath("//table[@id='productTable']/tbody/tr"));
			int totalrows=rows.size();
			for(int r=1; r<=totalrows; r++) {
				driver.findElement(By.xpath("//table[@id='productTable']/tbody/tr["+r+"]/td[4]/input")).click();
			String Price=driver.findElement(By.xpath("//table[@id='productTable']/tbody/tr["+r+"]/td[3]")).getText();
			listdata.add(Price);
			}
			//Copy that array in new array
			List<String> Copylistdata=new ArrayList<String>(listdata);
			Collections.sort(Copylistdata);
			System.out.println(Copylistdata.getFirst());
			//now print sum of all prices
			/*float sum=0;
			for(String n:Copylistdata) {
			//	n.replaceFirst("$", "x");
				String dummyPrice="0";
				String n1=dummyPrice.concat(n);
				String arr[]=n1.split("\\$");
				for(String parts: arr) {
					parts.trim();
				float number=Float.parseFloat(parts);
				sum=sum+number;
				System.out.println(sum);
				}
			}*/
			if(p>totalpages) {
				break;
			}
			driver.findElement(By.xpath("//ul[@class='pagination']/li["+p+"]/a")).click();
		}
        
	}

}
