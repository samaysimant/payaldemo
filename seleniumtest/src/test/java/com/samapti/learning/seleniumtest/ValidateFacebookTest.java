package com.samapti.learning.seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.samapti.learning.seleniumtest.pageobjects.FacebookLoginPage;
import com.samapti.learning.seleniumtest.pageobjects.FacebookRegistrationPage;

import junit.framework.Assert;

public class ValidateFacebookTest extends BaseClass {
	FacebookLoginPage loginPage;
	FacebookRegistrationPage registrationPage;

	@Test(groups="smoke")
	public void validateGogle() {
		loginPage= new FacebookLoginPage(driver);
		registrationPage= new FacebookRegistrationPage(driver);
		
		driver.get("https://www.facebook.com");
		Assert.assertTrue(driver.getTitle().contains("Facebook"));
		
		//driver.findElement(By.xpath("//input[@value='Log In']")).click();
		registrationPage.clickLogin();
		
		/*Actions act = new Actions(driver);
		WebElement txtEmail = driver.findElement(By.xpath("//input[@id='email']"));
		act.moveToElement(txtEmail).build().perform();*/
		loginPage.mouseOverEmail();

		//String actText = driver
		//		.findElement(By.xpath("//div[@class='uiContextualLayer uiContextualLayerRight']/div/div")).getText();
		String actText=loginPage.getEmailText();
		Assert.assertTrue(actText.contains("doesn't match"));

	}
}
