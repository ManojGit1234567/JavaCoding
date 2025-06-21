package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
 WebDriver driver;
 public BasePage(WebDriver driver) {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
	 }
 // we will reuse this class in our every page object classes 
}
