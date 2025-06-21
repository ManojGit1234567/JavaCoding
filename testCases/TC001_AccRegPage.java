package testCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.AccRegPage;
import pageObjects.HomePage;
import testBase.ReuseMethods;

public class TC001_AccRegPage extends ReuseMethods {



	@Test
	public void accRegistartion() throws InterruptedException {
		logger.info("** Starting testCase TC001_AccRegPage extends ReuseMethods**");
		HomePage hp=new HomePage(driver);
     try {
		hp.clickRegister();
		logger.info("**click on register link**");
		Thread.sleep(10000);		
		AccRegPage ap=new AccRegPage(driver);
		try{
			ap.setUserName("manoj.123");	
		}catch(Exception e) {
			Thread.sleep(20000);
			e.getMessage();
		}
       logger.info("**Providing data**");
		ap.setFirstName(randomString());
		ap.setLastName(randomString());
		ap.setEmail(randomString()+"@gmail.com");
		ap.selectCountry("India");
		ap.setPass(randomString()+"@"+ randomnumber());
		Thread.sleep(10000);
		ap.clickOnReg();
		String getMsg=ap.validateMsg();
		Assert.assertEquals(getMsg, "Welcome to OpenCart, your account has been created");
     }
     catch(Exception e) {
    	logger.error("Test case failed");
    	logger.debug("debug logs");
    	Assert.fail();
     }
	}

}
