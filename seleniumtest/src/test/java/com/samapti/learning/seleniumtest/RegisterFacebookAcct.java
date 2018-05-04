package com.samapti.learning.seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.samapti.learning.seleniumtest.pageobjects.FacebookRegistrationPage;

import junit.framework.Assert;

public class RegisterFacebookAcct extends BaseClass {
	
	FacebookRegistrationPage registrationPage;

	@Test(groups="smoke")
	public void validatefb() {
		registrationPage= new FacebookRegistrationPage(driver);
		driver.get("https://www.facebook.com");
		Assert.assertTrue(driver.getTitle().contains("Facebook"));
		
		//driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("SamFN");
		registrationPage.setFirstName("samFN");
		
		//driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("SamLN");
		registrationPage.setLastName("samLN");
		
		//driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("7205227433");
		registrationPage.setEmail("7205227433");
		
		
		//driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Tapaswini@2505");
		registrationPage.setPassword("Tapaswini@2505");
		
		//new Select(driver.findElement(By.id("day"))).selectByIndex(8);;		
		registrationPage.selectDayByIndex(8);
		
		
		//new Select(driver.findElement(By.id("month"))).selectByVisibleText("Apr");
		registrationPage.selectMonthByText("Apr");
		
		//new Select(driver.findElement(By.id("year"))).selectByValue("1990");
		registrationPage.selectYearByValue("1990");
		
		//driver.findElement(By.xpath("//input[@value='1']")).click();
		registrationPage.chooseGender();
		
	//	driver.findElement(By.name("websubmit")).click();
		registrationPage.clickSubmit();
		
		
	}
}
