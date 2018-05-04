package com.samapti.learning.seleniumtest.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistrationPage {
	
	WebDriver driver;
	
	public FacebookRegistrationPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@value='Log In']")
	private WebElement btnLogin;
	public void clickLogin(){
		btnLogin.click();
	}
	
	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement txtFirstName;
	
	public void setFirstName(String value){
		txtFirstName.sendKeys(value);
	}
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement txtLastName;
	
	public void setLastName(String value){
		txtLastName.sendKeys(value);
	}
	
	@FindBy(xpath="//input[@name='reg_email__']")
	private WebElement txtEmail;
	
	public void setEmail(String value){
		txtEmail.sendKeys(value);
	}
	
	@FindBy(xpath="//input[@name='reg_passwd__']")
	private WebElement txtPsw;
	
	public void setPassword(String value){
		txtPsw.sendKeys(value);
	}
	
	@FindBy(id="day")
	private WebElement dropDownDay;
	
	public void selectDayByIndex(int index){
		new Select(dropDownDay).selectByIndex(index);
	}
	
	@FindBy(id="month")
	private WebElement dropDownMonth;
	
	public void selectMonthByText(String text){
		new Select(dropDownMonth).selectByVisibleText(text);
	}
	
	@FindBy(id="year")
	private WebElement dropDownYear;
	
	public void selectYearByValue(String value){
		new Select(dropDownYear).selectByValue(value);
	}
	
	@FindBy(xpath="//input[@value='1']")
	private WebElement radioGenderFemale;
	
	public void chooseGender()
	{
		radioGenderFemale.click();
	}
	
	@FindBy(name="websubmit")
	private WebElement btnSubmit;
	
	public void clickSubmit()
	{
		btnSubmit.click();
	}
	

}
