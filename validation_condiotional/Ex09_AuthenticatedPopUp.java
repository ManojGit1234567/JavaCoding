package org.validation_condiotional;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Ex09_AuthenticatedPopUp {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://the-internet.herokuapp.com/basic-auth");
		driver.manage().window().maximize();
		
		//injection process for NC login
	//	http:un:pass//the-internet.herokuapp.com/basic-auth

	}

}
