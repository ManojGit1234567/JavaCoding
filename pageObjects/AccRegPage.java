package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AccRegPage extends BasePage{
	public AccRegPage(WebDriver driver) {
		super(driver);
	}
@FindBy(xpath="//input[@id='input-username']")
WebElement txtUname;

@FindBy(xpath="//input[@name='firstname']")
WebElement txtFName;

@FindBy(xpath="//input[@name='lastname']")
WebElement txtLName;

@FindBy(xpath="//input[@name='email']")
WebElement txtEmail;

@FindBy(xpath="//select[@name='country_id']")
WebElement selectCountry;

@FindBy(xpath="//input[@name='password']")
WebElement txtPass;

@FindBy(xpath="//button[@class='btn btn-primary btn-lg hidden-xs']")
WebElement clickReg;

@FindBy(xpath="//h3[text()='Welcome to OpenCart, your account has been created']")
WebElement getMessage;

public void setUserName(String userName) {
	txtUname.sendKeys(userName);
}
public void setFirstName(String FName) {
	txtFName.sendKeys(FName);
}
public void setLastName(String LName) {
	txtLName.sendKeys(LName);
}
public void setEmail(String email) {
	txtEmail.sendKeys(email);
}
public void selectCountry(String country) {
	Select s=new Select(selectCountry);
	s.selectByVisibleText(country);
	}
public void setPass(String pass) {
	txtPass.sendKeys(pass);
}
public void clickOnReg() {
	clickReg.click();
}
public String validateMsg() {
	try {
	return(getMessage.getText());
	}
	catch(Exception e){
		return(e.getMessage());
	}
}


}
