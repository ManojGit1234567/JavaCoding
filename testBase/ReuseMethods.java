package testBase;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.Logger; //for log4j
import org.apache.logging.log4j.LogManager; //for log4j
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class ReuseMethods {
	public WebDriver driver;
	public Logger logger;  //log4j step
	public String randomString() {
		return RandomStringUtils.randomAlphabetic(6);
	}
	public String randomnumber() {
		return RandomStringUtils.randomNumeric(5);
	}
	public String randomAlphaNumeric() {
		String numbers=RandomStringUtils.randomNumeric(4);
		String alphabets=RandomStringUtils.randomAlphabetic(5);
		return(numbers+alphabets);

	}
	@BeforeClass
	@Parameters({"os","browser"})
	public void setup(String os, String br) {
		
		logger=LogManager.getLogger(this.getClass()/*this method will get the paarticular class name and will generate the logs for this class*/);
		switch(br.toLowerCase())
		{
		case "chrome": driver=new ChromeDriver(); break;
		case "edge": driver=new EdgeDriver(); break;
		case "firefox": driver=new FirefoxDriver();
		default: System.out.println("Invalid browser name");  return;
		}
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.opencart.com/index.php?route=cms/demo#:~:text=You%20can%20try%20OpenCart%20without%20having%20to%20install,informed%20of%20new%20releases%20and%20other%20OpenCart%20events.");
		driver.manage().window().maximize();
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
