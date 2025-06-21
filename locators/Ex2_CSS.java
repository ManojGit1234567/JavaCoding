package org.locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Ex2_CSS {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		//tag id=tag#idValue
		driver.findElement(By.cssSelector("div#alert"));
		//tag.classname
		driver.findElement(By.cssSelector("div.container"));
		//tag[AttributeName=AttributValue]
		driver.findElement(By.cssSelector("input[name='search']"));
		//prefer old notes for more

	}

}
